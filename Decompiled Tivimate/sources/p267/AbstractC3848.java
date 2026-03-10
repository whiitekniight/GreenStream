package p267;

/* JADX INFO: renamed from: יـ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3848 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final long[] f14102 = null;

    static {
        f14102 = new long[]{-9187201950435737345L, -1};
        new C3836(0);
    }

    /* JADX INFO: renamed from: ʽ */
    public static final int m7926(int r1) {
        if (r1 > 0) goto L4;
        return 0;
    L4:
        return (-1) >>> Integer.numberOfLeadingZeros(r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public static final int m7927(int r2) {
        if (r2 != 7) goto L7;
        return 8;
    L7:
        return ((r2 - 1) / 7) + r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static final int m7928(int r0) {
        if (r0 != 0) goto L6;
        return 6;
    L6:
        return (r0 * 2) + 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int m7929(int r1) {
        if (r1 != 7) goto L7;
        return 6;
    L7:
        return r1 - (r1 / 8);
    }
}
