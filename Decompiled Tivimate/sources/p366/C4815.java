package p366;

import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ᵔʿ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4815 extends AbstractC4817 {

    /* JADX INFO: renamed from: ᵔʾ */
    public static final int[] f17050 = null;

    /* JADX INFO: renamed from: ʼˎ */
    public int f17051;

    /* JADX INFO: renamed from: ˆʾ */
    public int f17052;

    /* JADX INFO: renamed from: ˈ */
    public int f17053;

    /* JADX INFO: renamed from: ˉʿ */
    public int f17054;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f17055;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f17056;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f17057;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f17058;

    /* JADX INFO: renamed from: ﾞʻ */
    public int[] f17059;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f17060;

    static {
        f17050 = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    }

    public C4815() {
        this.f17059 = new int[64];
        mo9477();
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static int m9486(int r3) {
        int r0 = ((r3 >>> 6) | (r3 << 26)) ^ ((r3 >>> 11) | (r3 << 21));
        int r1 = r3 >>> 25;
        return ((r3 << 7) | r1) ^ r0;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static int m9487(int r0, int r1, int r2) {
        int r12 = r1 & r0;
        return ((~r0) & r2) ^ r12;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static int m9488(int r3) {
        int r0 = ((r3 >>> 2) | (r3 << 30)) ^ ((r3 >>> 13) | (r3 << 19));
        int r1 = r3 >>> 22;
        return ((r3 << 10) | r1) ^ r0;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static int m9489(int r1, int r2, int r3) {
        int r0 = r1 & r2;
        return ((r1 & r3) ^ r0) ^ (r2 & r3);
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ʼˎ */
    public final void mo9477() {
        super.mo9477();
        this.f17053 = 1779033703;
        this.f17055 = -1150833019;
        this.f17060 = 1013904242;
        this.f17057 = -1521486534;
        this.f17058 = 1359893119;
        this.f17051 = -1694144372;
        this.f17052 = 528734635;
        this.f17056 = 1541459225;
        this.f17054 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.f17059;
        if (r1 == r2.length) goto L6;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ʽ */
    public final int mo9478(int r3, byte[] r4) {
        m9496();
        ٴﹶ.ᵢˏ(r4, this.f17053, r3);
        ٴﹶ.ᵢˏ(r4, this.f17055, r3 + 4);
        ٴﹶ.ᵢˏ(r4, this.f17060, r3 + 8);
        ٴﹶ.ᵢˏ(r4, this.f17057, r3 + 12);
        ٴﹶ.ᵢˏ(r4, this.f17058, r3 + 16);
        ٴﹶ.ᵢˏ(r4, this.f17051, r3 + 20);
        ٴﹶ.ᵢˏ(r4, this.f17052, r3 + 24);
        ٴﹶ.ᵢˏ(r4, this.f17056, r3 + 28);
        mo9477();
        return 32;
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo9479(AbstractC4817 r1) {
        m9490((C4815) r1);
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ˑﹳ */
    public final int mo9481() {
        return 32;
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo9482(long r5) {
        if (this.f17054 <= 14) goto L5;
        mo9485();
    L5:
        int[] r0 = this.f17059;
        r0[14] = (int) (r5 >>> 32);
        r0[15] = (int) r5;
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo9483(int r4, byte[] r5) {
        int r0 = ((r5[r4] << 24) | ((r5[r4 + 1] & 255) << 16)) | ((r5[r4 + 2] & 255) << 8);
        int r42 = (r5[r4 + 3] & 255) | r0;
        int[] r52 = this.f17059;
        int r02 = this.f17054;
        r52[r02] = r42;
        int r03 = r02 + 1;
        this.f17054 = r03;
        if (r03 != 16) goto L6;
        mo9485();
        return;
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final void m9490(C4815 r5) {
        m9498(r5);
        this.f17053 = r5.f17053;
        this.f17055 = r5.f17055;
        this.f17060 = r5.f17060;
        this.f17057 = r5.f17057;
        this.f17058 = r5.f17058;
        this.f17051 = r5.f17051;
        this.f17052 = r5.f17052;
        this.f17056 = r5.f17056;
        int[] r0 = r5.f17059;
        System.arraycopy(r0, 0, this.f17059, 0, r0.length);
        this.f17054 = r5.f17054;
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC4817 mo9484() {
        C4815 r0 = new C4815(this);
        r0.f17059 = new int[64];
        r0.m9490(this);
        return r0;
    }

    @Override // p366.AbstractC4817
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo9485() {
        int[] r1 = this.f17059;
        int r3 = 16;
    L4:
        if (r3 > 63) goto L6;
        int r4 = r1[r3 - 2];
        int r42 = ((r4 >>> 10) ^ (((r4 >>> 17) | (r4 << 15)) ^ ((r4 >>> 19) | (r4 << 13)))) + r1[r3 - 7];
        int r5 = r1[r3 - 15];
        r1[r3] = (r42 + ((r5 >>> 3) ^ (((r5 >>> 7) | (r5 << 25)) ^ ((r5 >>> 18) | (r5 << 14))))) + r1[r3 - 16];
        r3 = r3 + 1;
        goto L4
    L6:
        int r32 = this.f17053;
        int r43 = this.f17055;
        int r52 = this.f17060;
        int r6 = this.f17057;
        int r7 = this.f17058;
        int r8 = this.f17051;
        int r9 = this.f17052;
        int r10 = this.f17056;
        int r12 = 0;
        int r13 = 0;
    L8:
        if (r12 >= 8) goto L10;
        int r16 = m9487(r7, r8, r9) + m9486(r7);
        int[] r15 = f17050;
        int r162 = ((r16 + r15[r13]) + r1[r13]) + r10;
        int r62 = r6 + r162;
        int r102 = (m9489(r32, r43, r52) + m9488(r32)) + r162;
        int r163 = r13 + 1;
        int r18 = (((m9487(r62, r7, r8) + m9486(r62)) + r15[r163]) + r1[r163]) + r9;
        int r53 = r52 + r18;
        int r92 = (m9489(r102, r32, r43) + m9488(r102)) + r18;
        int r164 = r13 + 2;
        int r182 = (((m9487(r53, r62, r7) + m9486(r53)) + r15[r164]) + r1[r164]) + r8;
        int r44 = r43 + r182;
        int r82 = (m9489(r92, r102, r32) + m9488(r92)) + r182;
        int r165 = r13 + 3;
        int r183 = (((m9487(r44, r53, r62) + m9486(r44)) + r15[r165]) + r1[r165]) + r7;
        int r33 = r32 + r183;
        int r72 = (m9489(r82, r92, r102) + m9488(r82)) + r183;
        int r166 = r13 + 4;
        int r184 = (((m9487(r33, r44, r53) + m9486(r33)) + r15[r166]) + r1[r166]) + r62;
        r10 = r102 + r184;
        r6 = (m9489(r72, r82, r92) + m9488(r72)) + r184;
        int r167 = r13 + 5;
        int r185 = (((m9487(r10, r33, r44) + m9486(r10)) + r15[r167]) + r1[r167]) + r53;
        r9 = r92 + r185;
        r52 = (m9489(r6, r72, r82) + m9488(r6)) + r185;
        int r168 = r13 + 6;
        int r186 = (((m9487(r9, r10, r33) + m9486(r9)) + r15[r168]) + r1[r168]) + r44;
        r8 = r82 + r186;
        r43 = (m9489(r52, r6, r72) + m9488(r52)) + r186;
        int r169 = r13 + 7;
        int r187 = (((m9487(r8, r9, r10) + m9486(r8)) + r15[r169]) + r1[r169]) + r33;
        r7 = r72 + r187;
        r32 = (m9489(r43, r52, r6) + m9488(r43)) + r187;
        r13 = r13 + 8;
        r12 = r12 + 1;
        goto L8
    L10:
        this.f17053 += r32;
        this.f17055 += r43;
        this.f17060 += r52;
        this.f17057 += r6;
        this.f17058 += r7;
        this.f17051 += r8;
        this.f17052 += r9;
        this.f17056 += r10;
        this.f17054 = 0;
        int r34 = 0;
    L11:
        if (r34 >= 16) goto L13;
        r1[r34] = 0;
        r34 = r34 + 1;
        goto L11
    }
}
