package p292;

import p176.C3054;
import p447.AbstractC5637;

/* JADX INFO: renamed from: ٴʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4042 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C3054 f14855 = null;

    static {
        C3054 r0 = new C3054("xn--".getBytes(AbstractC5637.f20377));
        r0.f10708 = "xn--";
        f14855 = r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m8213(int r3) {
        if (r3 >= 26) goto L7;
        return r3 + 97;
    L7:
        if (r3 >= 36) goto L11;
        return r3 + 22;
    L11:
        throw new IllegalStateException(("unexpected digit: " + r3).toString());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m8214(int r0, int r1, boolean r2) {
        if (r2 == false) goto L4;
        int r02 = r0 / 700;
    L5:
        int r12 = (r02 / r1) + r02;
        int r03 = 0;
    L7:
        if (r12 <= 455) goto L10;
        r12 = r12 / 35;
        r03 = r03 + 36;
        goto L7
    L10:
        return ((r12 * 36) / (r12 + 38)) + r03;
    L4:
        r02 = r0 / 2;
        goto L5
    }
}
