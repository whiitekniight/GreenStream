package p099;

import ʿʿ.ﹳٴ;

/* JADX INFO: renamed from: ʿٴ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2234 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final ﹳٴ f8056 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final ﹳٴ f8057 = null;

    static {
        f8057 = new ﹳٴ(2);
        f8056 = new ﹳٴ(3);
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m5422(Object r0, String r1) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m5423(Object r1) {
        m5422(r1, "Argument must not be null");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m5424(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r0);
    }
}
