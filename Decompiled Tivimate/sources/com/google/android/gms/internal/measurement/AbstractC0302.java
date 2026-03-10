package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import p107.AbstractC2372;
import p107.C2359;
import p107.C2370;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʿˎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0302 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Object f1938 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static volatile AbstractC2372 f1939;

    static {
        f1939 = C2370.f8473;
        f1938 = new Object();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m1389(Context r5, Uri r6) {
        String r62 = r6.getAuthority();
        boolean r1 = false;
        if ("com.google.android.gms.phenotype".equals(r62) == true) goto L7;
        String.valueOf(r62).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
        return false;
    L7:
        if (f1939.mo5523() == true) goto L9;
        Object r63 = f1938;
        monitor-enter(r63);
    L17:
        th = move-exception;
        throw th;
    L13:
        if (f1939.mo5523() == false) goto L20;
        boolean r52 = ((Boolean) f1939.mo5524()).booleanValue();     // Catch: Throwable -> L17
        monitor-exit(r63);     // Catch: Throwable -> L17
        return r52;
    L20:
        if ("com.google.android.gms".equals(r5.getPackageName()) == true) goto L41;
        PackageManager r0 = r5.getPackageManager();     // Catch: Throwable -> L17
        if (Build.VERSION.SDK_INT >= 29) goto L24;
        int r3 = 0;
    L25:
        ProviderInfo r02 = r0.resolveContentProvider("com.google.android.gms.phenotype", r3);     // Catch: Throwable -> L17
        if (r02 != null) goto L28;
    L34:
        f1939 = new C2359(Boolean.valueOf(r1));     // Catch: Throwable -> L17
        monitor-exit(r63);     // Catch: Throwable -> L17
        return ((Boolean) f1939.mo5524()).booleanValue();
    L28:
        if ("com.google.android.gms".equals(r02.packageName) == false) goto L34;
    L24:
        r3 = 268435456;
    L41:
        if ((r5.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) goto L34;
        r1 = true;
        goto L34
    L9:
        return ((Boolean) f1939.mo5524()).booleanValue();
    }
}
