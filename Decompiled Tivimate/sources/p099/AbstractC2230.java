package p099;

import android.os.SystemClock;

/* JADX INFO: renamed from: ʿٴ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2230 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ int f8048 = 0;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final double f8049 = 0.0d;

    static {
        f8049 = 1.0d / Math.pow(10.0d, 6.0d);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static double m5417(long r2) {
        return (SystemClock.elapsedRealtimeNanos() - r2) * f8049;
    }
}
