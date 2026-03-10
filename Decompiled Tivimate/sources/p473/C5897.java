package p473;

import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: ﾞᵢ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C5897 implements InterfaceC5898 {

    /* JADX INFO: renamed from: ʽ */
    public static final boolean[] f21621 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final int[] f21622 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f21623;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f21624;

    static {
        f21621 = new boolean[]{true, true, true, false, true, false, false, false};
        f21622 = new int[]{0, 1, 2, 2, 3, 3, 3, 3};
    }

    @Override // p473.InterfaceC5898
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo11563(byte[] r10, int r11, int r12) {
        int r0 = r11 - 1;
        int r122 = (r12 + r11) - 5;
        int r1 = r11;
    L3:
        int r2 = 0;
        if (r1 > r122) goto L36;
        if ((r10[r1] & 254) != 232) goto L34;
        int r02 = r1 - r0;
        int r4 = r02 & (-4);
        int[] r6 = f21622;
        if (r4 == 0) goto L11;
        this.f21623 = 0;
    L19:
        int r42 = r1 + 4;
        int r03 = r10[r42] & 255;
        if (r03 == 0) goto L25;
        if (r03 == 255) goto L25;
        this.f21623 = (this.f21623 << 1) | 1;
    L24:
        r0 = r1;
    L25:
        int r7 = r1 + 1;
        int r04 = ᵎ.ﾞʻ(r7, r10);
    L26:
        int r05 = r04 - ((this.f21624 + r1) - r11);
        int r22 = this.f21623;
        if (r22 == 0) goto L33;
        int r23 = r6[r22] * 8;
        int r8 = ((byte) (r05 >>> (24 - r23))) & 255;
        if (r8 == 0) goto L35;
        if (r8 != 255) goto L33;
    L35:
        r04 = r05 ^ ((1 << (32 - r23)) - 1);
    L33:
        ᵎ.ﹳᐧ(r10, r7, (r05 << 7) >> 7);
        r0 = r1;
        r1 = r42;
        goto L34
    L11:
        int r06 = (this.f21623 << (r02 - 1)) & 7;
        this.f21623 = r06;
        if (r06 == 0) goto L19;
        if (f21621[r06] == false) goto L18;
        int r24 = r10[(r1 + 4) - r6[r06]] & 255;
        if (r24 == 0) goto L18;
        if (r24 != 255) goto L19;
    L18:
        this.f21623 = (r06 << 1) | 1;
    L34:
        r1 = r1 + 1;
        goto L3
    L36:
        int r102 = r1 - r0;
        if ((r102 & (-4)) != 0) goto L40;
        r2 = this.f21623 << (r102 - 1);
    L40:
        this.f21623 = r2;
        int r13 = r1 - r11;
        this.f21624 += r13;
        return r13;
    }
}
