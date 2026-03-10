package p255;

import p183.InterfaceC3105;

/* JADX INFO: renamed from: ˑﹶ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3727 {

    /* JADX INFO: renamed from: ˈ */
    public static final long[] f13429 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f13430;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f13431;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f13432;

    static {
        f13429 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public C3727() {
        this.f13432 = new byte[8];
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static long m7785(int r7, boolean r8, byte[] r9) {
        long r0 = ((long) r9[0]) & 255;
        if (r8 == false) goto L5;
        r0 = r0 & (~f13429[r7 - 1]);
    L5:
        int r82 = 1;
    L6:
        if (r82 >= r7) goto L8;
        r0 = (r0 << 8) | (((long) r9[r82]) & 255);
        r82 = r82 + 1;
        goto L6
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final long m7786(InterfaceC3105 r11, boolean r12, boolean r13, int r14) {
        int r0 = this.f13431;
        byte[] r2 = this.f13432;
        if (r0 == 0) goto L5;
    L21:
        int r122 = this.f13430;
        if (r122 <= r14) goto L25;
        this.f13431 = 0;
        return -2;
    L25:
        if (r122 == 1) goto L27;
        r11.readFully(r2, 1, r122 - 1);
    L27:
        this.f13431 = 0;
        return m7785(this.f13430, r13, r2);
    L5:
        if (r11.mo5312(r2, 0, 1, r12) == true) goto L8;
        return -1;
    L8:
        int r123 = r2[0] & 255;
        int r02 = 0;
    L10:
        if (r02 >= 8) goto L15;
        if ((f13429[r02] & ((long) r123)) != 0) goto L13;
        r02 = r02 + 1;
        goto L10
    L13:
        int r03 = r02 + 1;
    L16:
        this.f13430 = r03;
        if (r03 == (-1)) goto L20;
        this.f13431 = 1;
        goto L21
    L20:
        throw new IllegalStateException("No valid varint length mask found");
    L15:
        r03 = -1;
        goto L16
    }
}
