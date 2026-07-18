plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.ksp)
}

import java.util.Properties

val keystoreProperties = Properties()
val keystorePropertiesFile = rootProject.file("keystore.properties")
if (keystorePropertiesFile.exists()) {
    keystorePropertiesFile.inputStream().use { keystoreProperties.load(it) }
}

fun signingProperty(name: String): String? =
    keystoreProperties.getProperty(name)
        ?: providers.gradleProperty(name).orNull
        ?: System.getenv(name)

val hasPlaySigningConfig = listOf(
    "storeFile",
    "storePassword",
    "keyAlias",
    "keyPassword"
).all { !signingProperty(it).isNullOrBlank() }

gradle.taskGraph.whenReady {
    val releaseBuildRequested = allTasks.any { task ->
        task.name.contains("Release", ignoreCase = false) &&
            (task.name.startsWith("assemble") || task.name.startsWith("bundle"))
    }
    if (releaseBuildRequested && !hasPlaySigningConfig) {
        throw GradleException("Release builds must use the shared GreenStreem signing config. Check keystore.properties or Gradle signing properties.")
    }
}

android {
    namespace = "com.example.greenstreem"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.greenstreem"
        minSdk = 23
        targetSdk = 36
        versionCode = 63
        versionName = "1.9.27"
    }

    flavorDimensions += "distribution"
    productFlavors {
        create("sideload") {
            dimension = "distribution"
            applicationId = "com.example.greenstreem"
            buildConfigField("boolean", "PLAY_STORE_BUILD", "false")
            buildConfigField("boolean", "SIDELOAD_PRO_UNLOCKED", "true")
            buildConfigField("boolean", "BRANDED_SERVER_LOCKED", "false")
            buildConfigField("String", "BRANDED_SERVER_URL", "\"\"")
        }
        create("brandedSideload") {
            dimension = "distribution"
            applicationId = "com.example.greenstreem"
            buildConfigField("boolean", "PLAY_STORE_BUILD", "false")
            buildConfigField("boolean", "SIDELOAD_PRO_UNLOCKED", "true")
            buildConfigField("boolean", "BRANDED_SERVER_LOCKED", "true")
            buildConfigField("String", "BRANDED_SERVER_URL", "\"https://kennye71.trustissues.life\"")
        }
        create("play") {
            dimension = "distribution"
            applicationId = "com.greenstreem.tv"
            buildConfigField("boolean", "PLAY_STORE_BUILD", "true")
            buildConfigField("boolean", "SIDELOAD_PRO_UNLOCKED", "false")
            buildConfigField("boolean", "BRANDED_SERVER_LOCKED", "false")
            buildConfigField("String", "BRANDED_SERVER_URL", "\"\"")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    signingConfigs {
        if (hasPlaySigningConfig) {
            create("playUpload") {
                storeFile = rootProject.file(signingProperty("storeFile")!!)
                storePassword = signingProperty("storePassword")
                keyAlias = signingProperty("keyAlias")
                keyPassword = signingProperty("keyPassword")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            if (hasPlaySigningConfig) {
                signingConfig = signingConfigs.getByName("playUpload")
            }
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

val appVersionName = android.defaultConfig.versionName ?: "0.0"

val renameDebugApk = tasks.register<Copy>("renameDebugApk") {
    dependsOn(
        "packageBrandedSideloadDebug",
        "packagePlayDebug",
        "packageSideloadDebug"
    )
    from(layout.buildDirectory.dir("outputs/apk/brandedSideload/debug")) { include("*.apk") }
    from(layout.buildDirectory.dir("outputs/apk/play/debug")) { include("*.apk") }
    from(layout.buildDirectory.dir("outputs/apk/sideload/debug")) { include("*.apk") }
    into(layout.buildDirectory.dir("outputs/renamed_apk/debug"))
    includeEmptyDirs = false
    rename { name -> "GreenStreem-v${appVersionName}-$name" }
}

val renameReleaseApk = tasks.register<Copy>("renameReleaseApk") {
    dependsOn(
        "packageBrandedSideloadRelease",
        "packagePlayRelease",
        "packageSideloadRelease"
    )
    from(layout.buildDirectory.dir("outputs/apk/brandedSideload/release")) { include("*.apk") }
    from(layout.buildDirectory.dir("outputs/apk/play/release")) { include("*.apk") }
    from(layout.buildDirectory.dir("outputs/apk/sideload/release")) { include("*.apk") }
    into(layout.buildDirectory.dir("outputs/renamed_apk/release"))
    includeEmptyDirs = false
    rename { name -> "GreenStreem-v${appVersionName}-$name" }
}

tasks.configureEach {
    when (name) {
        "assembleDebug" -> finalizedBy(renameDebugApk)
        "assembleRelease" -> finalizedBy(renameReleaseApk)
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.leanback)
    implementation(libs.glide)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.exoplayer.hls)
    implementation(libs.jellyfin.media3.ffmpeg.decoder)
    implementation(libs.androidx.media3.ui)
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp.logging)
    implementation(libs.play.billing.ktx)
    implementation(libs.jcifs.ng)
    
    // Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
}
