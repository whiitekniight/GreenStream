package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final ᵎ f2340 = null;

    static {
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L4
        C0528 r0 = new C0528(0);     // Catch: Throwable -> L4
    L5:
        f2340 = r0;
        return;
    L4:
        SystemClock.elapsedRealtime();
        r0 = new C0528(1);
        goto L5
    }
}
