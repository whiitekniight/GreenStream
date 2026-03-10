package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC0337 extends Handler {
    public HandlerC0337(Looper r1, int r2) {
        switch(r2) {
            case 2: goto L7;
            case 3: goto L5;
            default: goto L3;
        };
    L3:
        super(r1);
        Looper.getMainLooper();
        return;
    L5:
        super(r1);
        Looper.getMainLooper();
        return;
    L7:
        super(r1);
        Looper.getMainLooper();
    }
}
