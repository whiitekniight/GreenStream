package p210;

/* JADX INFO: renamed from: ˎˆ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3386 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final byte[] f11883 = null;

    static {
        f11883 = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m7135(int r7, byte[] r8) {
        if ((r8.length - r7) < 8) goto L17;
        int r2 = 0;
    L6:
        if (r2 >= 16) goto L15;
        int r3 = 0;
    L8:
        if (r3 >= 8) goto L13;
        if (r8[r3 + r7] != f11883[(r2 * 8) + r3]) goto L11;
        r3 = r3 + 1;
        goto L8
    L11:
        r2 = r2 + 1;
        goto L6
    L13:
        return true;
    L15:
        return false;
    L17:
        throw new IllegalArgumentException("key material too short.");
    }
}
