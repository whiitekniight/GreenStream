package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˑٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0587 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static /* synthetic */ boolean m2236(Unsafe r1, Object r2, long r3, Object r5, Object r6) {
    L3:
        if (r1.compareAndSwapObject(r2, r3, r5, r6) == true) goto L4;
        if (r1.getObject(r2, r3) == r5) goto L3;
        return false;
    L4:
        return true;
    }
}
