package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʽᐧ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0277 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static volatile boolean f1798;

    /* JADX INFO: renamed from: ﹳٴ */
    public static UserManager f1799;

    static {
        f1798 = !m1345();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m1344(Context r7) {
        if (f1798 == false) goto L6;
        return true;
    L6:
        monitor-enter(AbstractC0277.class);
    L11:
        th = move-exception;
        throw th;
    L8:
        if (f1798 == false) goto L13;
        monitor-exit(AbstractC0277.class);     // Catch: Throwable -> L11
        return true;
    L13:
        int r2 = 1;
    L14:
        boolean r5 = false;
        if (r2 > 2) goto L29;
        if (f1799 != null) goto L19;
        f1799 = (UserManager) r7.getSystemService(UserManager.class);     // Catch: Throwable -> L11
    L19:
        UserManager r3 = f1799;     // Catch: Throwable -> L11
        if (r3 == null) goto L21;
        if (r3.isUserUnlocked() == true) goto L26;
        goto L28
    L25:
        if (r3.isUserRunning(Process.myUserHandle()) == true) goto L29;
    L26:
        r5 = true;
    L28:
        f1799 = null;     // Catch: Throwable -> L11
        r2 = r2 + 1;     // Catch: Throwable -> L11
        goto L14
    L21:
        r5 = true;
    L31:
        if (r5 == false) goto L33;
        f1798 = true;     // Catch: Throwable -> L11
    L33:
        monitor-exit(AbstractC0277.class);     // Catch: Throwable -> L11
        return r5;
    L29:
        if (r5 == false) goto L31;
        f1799 = null;     // Catch: Throwable -> L11
        goto L31
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m1345() {
        if (Build.VERSION.SDK_INT < 24) goto L6;
        return true;
    L6:
        return false;
    }
}
