package p266;

import java.util.Arrays;

/* JADX INFO: renamed from: יי.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C3811 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final byte[] f13815 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f13816;

    /* JADX INFO: renamed from: ˈ */
    public byte[] f13817;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f13818;

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean f13819;

    static {
        f13815 = new byte[]{0, 0, 1};
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7862(byte[] r4, int r5, int r6) {
        if (this.f13819 == true) goto L5;
        return;
    L5:
        int r62 = r6 - r5;
        byte[] r0 = this.f13817;
        int r1 = r0.length;
        int r2 = this.f13818 + r62;
        if (r1 >= r2) goto L8;
        this.f13817 = Arrays.copyOf(r0, r2 * 2);
    L8:
        System.arraycopy(r4, r5, this.f13817, this.f13818, r62);
        this.f13818 += r62;
    }
}
