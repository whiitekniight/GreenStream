package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C0528 extends ᵎ {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ int f2310;

    public /* synthetic */ C0528(int r1) {
        this.f2310 = r1;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final long m2096() {
        switch(this.f2310) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return SystemClock.elapsedRealtime() * 1000000;
    L7:
        return SystemClock.elapsedRealtimeNanos();
    }
}
