package p231;

/* JADX INFO: renamed from: ˏי.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3507 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Object[] f12478 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int[] f12479 = null;

    static {
        f12479 = new int[0];
        f12478 = new Object[0];
    }

    /* JADX INFO: renamed from: ʽ */
    public static final void m7263(String r1) {
        throw new IllegalArgumentException(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static final int m7264(long[] r4, int r5, long r6) {
        int r52 = r5 - 1;
        int r0 = 0;
    L3:
        if (r0 > r52) goto L11;
        int r1 = (r0 + r52) >>> 1;
        long r2 = r4[r1];
        if (r2 < r6) goto L6;
        if (r2 <= r6) goto L9;
        r52 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int m7265(int[] r3, int r4, int r5) {
        int r42 = r4 - 1;
        int r0 = 0;
    L3:
        if (r0 > r42) goto L11;
        int r1 = (r0 + r42) >>> 1;
        int r2 = r3[r1];
        if (r2 < r5) goto L6;
        if (r2 <= r5) goto L9;
        r42 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }
}
