package p430;

import android.os.Trace;

/* JADX INFO: renamed from: ﹳᵎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5416 {
    /* JADX INFO: renamed from: ʽ */
    public static boolean m10447() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m10448(int r0, String r1) {
        Trace.endAsyncSection(r1, r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m10449(int r0, String r1) {
        Trace.beginAsyncSection(r1, r0);
    }
}
