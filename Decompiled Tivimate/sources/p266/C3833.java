package p266;

import java.util.Arrays;

/* JADX INFO: renamed from: יי.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3833 {

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final byte[] f14045 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f14046;

    /* JADX INFO: renamed from: ˈ */
    public int f14047;

    /* JADX INFO: renamed from: ˑﹳ */
    public byte[] f14048;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f14049;

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean f14050;

    static {
        f14045 = new byte[]{0, 0, 1};
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7876(byte[] r4, int r5, int r6) {
        if (this.f14050 == true) goto L5;
        return;
    L5:
        int r62 = r6 - r5;
        byte[] r0 = this.f14048;
        int r1 = r0.length;
        int r2 = this.f14046 + r62;
        if (r1 >= r2) goto L8;
        this.f14048 = Arrays.copyOf(r0, r2 * 2);
    L8:
        System.arraycopy(r4, r5, this.f14048, this.f14046, r62);
        this.f14046 += r62;
    }
}
