package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0339 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int f2006 = 0;

    static {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r0 = 33554432;
    L6:
        f2006 = r0;
        return;
    L5:
        r0 = 0;
        goto L6
    }
}
