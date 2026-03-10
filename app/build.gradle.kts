plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.ksp)
}


android {
    namespace = "com.example.greenstreem"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.greenstreem"
        minSdk = 23
        targetSdk = 36
        versionCode = 5
        versionName = "1.5"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    from(layout.buildDirectory.file("outputs/apk/debug/app-debug.apk"))
    into(layout.buildDirectory.dir("outputs/renamed_apk/debug"))
    rename { "GreenStreem-v${appVersionName}-debug.apk" }
}

val renameReleaseApk = tasks.register<Copy>("renameReleaseApk") {
    from(layout.buildDirectory.file("outputs/apk/release/app-release.apk"))
    into(layout.buildDirectory.dir("outputs/renamed_apk/release"))
    rename { "GreenStreem-v${appVersionName}-release.apk" }
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
    implementation(libs.androidx.media3.ui)
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp.logging)
    
    // Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
}
