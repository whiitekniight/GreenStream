package p088;

import java.util.Arrays;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʾﾞ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2140 {

    /* JADX INFO: renamed from: ʻٴ */
    public int f7654;

    /* JADX INFO: renamed from: ʼˎ */
    public final short[] f7655;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f7656;

    /* JADX INFO: renamed from: ʽ */
    public final float f7657;

    /* JADX INFO: renamed from: ʽﹳ */
    public int f7658;

    /* JADX INFO: renamed from: ˆʾ */
    public short[] f7659;

    /* JADX INFO: renamed from: ˈ */
    public final float f7660;

    /* JADX INFO: renamed from: ˉʿ */
    public int f7661;

    /* JADX INFO: renamed from: ˉˆ */
    public int f7662;

    /* JADX INFO: renamed from: ˏי */
    public int f7663;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f7664;

    /* JADX INFO: renamed from: יـ */
    public int f7665;

    /* JADX INFO: renamed from: ـˆ */
    public double f7666;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f7667;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int f7668;

    /* JADX INFO: renamed from: ᵔʾ */
    public short[] f7669;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final int f7670;

    /* JADX INFO: renamed from: ᵔﹳ */
    public int f7671;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f7672;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f7673;

    /* JADX INFO: renamed from: ﹳᐧ */
    public int f7674;

    /* JADX INFO: renamed from: ﾞʻ */
    public short[] f7675;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f7676;

    public C2140(int r1, int r2, float r3, float r4, int r5) {
        this.f7673 = r1;
        this.f7672 = r2;
        this.f7657 = r3;
        this.f7660 = r4;
        this.f7664 = r1 / r5;
        this.f7676 = r1 / 400;
        int r12 = r1 / 65;
        this.f7668 = r12;
        int r13 = r12 * 2;
        this.f7670 = r13;
        this.f7655 = new short[r13];
        this.f7659 = new short[r13 * r2];
        this.f7675 = new short[r13 * r2];
        this.f7669 = new short[r13 * r2];
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m5236(int r8, int r9, short[] r10, int r11, short[] r12, int r13, short[] r14, int r15) {
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L8;
        int r2 = (r11 * r9) + r1;
        int r3 = (r15 * r9) + r1;
        int r4 = (r13 * r9) + r1;
        int r5 = 0;
    L5:
        if (r5 >= r8) goto L7;
        r10[r2] = (short) (((r14[r3] * r5) + ((r8 - r5) * r12[r4])) / r8);
        r2 = r2 + r9;
        r4 = r4 + r9;
        r3 = r3 + r9;
        r5 = r5 + 1;
        goto L5
    L7:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ʽ */
    public final short[] m5237(short[] r3, int r4, int r5) {
        int r0 = r3.length;
        int r1 = this.f7672;
        int r02 = r0 / r1;
        if ((r4 + r5) > r02) goto L6;
        return r3;
    L6:
        return Arrays.copyOf(r3, (((r02 * 3) / 2) + r5) * r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m5238(short[] r10, int r11, int r12, int r13) {
        int r112 = r11 * this.f7672;
        int r1 = 255;
        int r2 = 1;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r12 > r13) goto L14;
        int r5 = 0;
        int r6 = 0;
    L5:
        if (r5 >= r12) goto L8;
        r6 = r6 + Math.abs(r10[r112 + r5] - r10[(r112 + r12) + r5]);
        r5 = r5 + 1;
        goto L5
    L8:
        if ((r6 * r3) >= (r2 * r12)) goto L11;
        r3 = r12;
        r2 = r6;
    L11:
        if ((r6 * r1) <= (r4 * r12)) goto L13;
        r1 = r12;
        r4 = r6;
    L13:
        r12 = r12 + 1;
        goto L3
    L14:
        this.f7658 = r2 / r3;
        this.f7654 = r4 / r1;
        return r3;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m5239(short[] r7, int r8, int r9) {
        int r0 = this.f7670 / r9;
        int r1 = this.f7672;
        int r92 = r9 * r1;
        int r82 = r8 * r1;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        int r3 = 0;
        int r4 = 0;
    L5:
        if (r3 >= r92) goto L7;
        r4 = r4 + r7[((r2 * r92) + r82) + r3];
        r3 = r3 + 1;
        goto L5
    L7:
        this.f7655[r2] = (short) (r4 / r92);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m5240(short[] r4, int r5, int r6) {
        short[] r0 = m5237(this.f7675, this.f7661, r6);
        this.f7675 = r0;
        int r1 = this.f7672;
        System.arraycopy(r4, r5 * r1, r0, this.f7661 * r1, r1 * r6);
        this.f7661 += r6;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m5241() {
        int r1 = this.f7661;
        float r2 = this.f7657;
        float r3 = this.f7660;
        double r4 = r2 / r3;
        float r22 = this.f7664 * r3;
        int r6 = this.f7673;
        int r7 = 1;
        int r8 = this.f7672;
        int r9 = 0;
        if (r4 <= 1.0000100135803223d) goto L5;
    L9:
        int r32 = this.f7667;
        int r10 = this.f7670;
        if (r32 < r10) goto L8;
        int r11 = 0;
    L13:
        int r12 = this.f7674;
        if (r12 <= 0) goto L16;
        int r122 = Math.min(r10, r12);
        m5240(this.f7659, r11, r122);
        this.f7674 -= r122;
        r11 = r11 + r122;
        float r20 = r22;
        double r21 = r4;
        int r42 = r10;
    L61:
        if ((r11 + r42) > r32) goto L62;
        r9 = 0;
        r10 = r42;
        r7 = 1;
        r22 = r20;
        r4 = r21;
        goto L13
    L62:
        int r33 = this.f7667 - r11;
        short[] r43 = this.f7659;
        System.arraycopy(r43, r11 * r8, r43, 0, r33 * r8);
        this.f7667 = r33;
    L64:
        if (r20 != 1.0f) goto L66;
        return;
    L66:
        if (this.f7661 == r1) goto L111;
        long r34 = (long) (r6 / r20);
        long r5 = r6;
    L70:
        if (r34 == 0) goto L78;
        if (r5 == 0) goto L78;
        if ((r34 % 2) != 0) goto L78;
        if ((r5 % 2) != 0) goto L78;
        r34 = r34 / 2;
        r5 = r5 / 2;
    L78:
        int r72 = this.f7661 - r1;
        short[] r92 = m5237(this.f7669, this.f7662, r72);
        this.f7669 = r92;
        System.arraycopy(this.f7675, r1 * r8, r92, this.f7662 * r8, r72 * r8);
        this.f7661 = r1;
        this.f7662 += r72;
        int r13 = 0;
    L79:
        int r73 = this.f7662;
        int r93 = r73 - 1;
        if (r13 >= r93) goto L95;
    L81:
        int r74 = this.f7656 + 1;
        long r102 = r74;
        long r123 = r102 * r34;
        long r14 = this.f7671;
        if (r123 <= (r14 * r5)) goto L87;
        this.f7675 = m5237(this.f7675, this.f7661, 1);
        int r75 = 0;
    L84:
        if (r75 >= r8) goto L86;
        short[] r94 = this.f7675;
        int r103 = (this.f7661 * r8) + r75;
        short[] r112 = this.f7669;
        int r124 = (r13 * r8) + r75;
        short r132 = r112[r124];
        short r113 = r112[r124 + r8];
        long r142 = ((long) this.f7671) * r5;
        int r125 = this.f7656;
        long r17 = r34;
        int r44 = r13;
        long r15 = ((long) (r125 + 1)) * r17;
        long r143 = r15 - r142;
        long r16 = r15 - (((long) r125) * r17);
        long r126 = ((long) r132) * r143;
        r94[r103] = (short) ((((r16 - r143) * ((long) r113)) + r126) / r16);
        r75 = r75 + 1;
        r13 = r44;
        r34 = r17;
        goto L84
    L86:
        this.f7671++;
        this.f7661++;
        r13 = r13;
        r34 = r34;
        goto L81
    L87:
        long r172 = r34;
        int r45 = r13;
        this.f7656 = r74;
        if (r102 != r5) goto L94;
        this.f7656 = 0;
        if (r14 != r172) goto L92;
        boolean r18 = true;
    L93:
        AbstractC4214.m8568(r18);
        this.f7671 = 0;
        goto L94
    L92:
        r18 = false;
    L94:
        r13 = r45 + 1;
        r34 = r172;
        goto L79
    L95:
        if (r93 == 0) goto L112;
        short[] r19 = this.f7669;
        System.arraycopy(r19, r93 * r8, r19, 0, (r73 - r93) * r8);
        this.f7662 -= r93;
        return;
    L112:
        return;
    L111:
        return;
    L16:
        short[] r127 = this.f7659;
        if (r6 <= 4000) goto L19;
        int r133 = r6 / 4000;
    L20:
        int r144 = this.f7668;
        int r152 = this.f7676;
        if (r8 != r7) goto L24;
        if (r133 != r7) goto L24;
        int r128 = m5238(r127, r11, r152, r144);
        r20 = r22;
        r21 = r4;
    L37:
        int r23 = this.f7658;
        int r46 = this.f7654;
        if (r23 == 0) goto L47;
        int r52 = this.f7665;
        if (r52 == 0) goto L47;
        if (r46 > (r23 * 3)) goto L47;
        if ((r23 * 2) <= (this.f7663 * 3)) goto L47;
    L48:
        this.f7663 = r23;
        this.f7665 = r128;
        if (r21 <= 1.0d) goto L55;
        short[] r153 = this.f7659;
        if (r21 < 2.0d) goto L53;
        r42 = r10;
        double r129 = (((double) r52) / (r21 - 1.0d)) + this.f7666;
        int r76 = (int) Math.round(r129);
        this.f7666 = r129 - ((double) r76);
    L54:
        short[] r134 = m5237(this.f7675, this.f7661, r76);
        this.f7675 = r134;
        int r182 = r11 + r52;
        int r162 = r11;
        int r114 = r76;
        m5236(r114, this.f7672, r134, this.f7661, r153, r162, r153, r182);
        this.f7661 += r114;
        r11 = (r52 + r114) + r162;
        goto L61
    L53:
        r42 = r10;
        double r1210 = (((2.0d - r21) * ((double) r52)) / (r21 - 1.0d)) + this.f7666;
        int r77 = (int) Math.round(r1210);
        this.f7674 = r77;
        this.f7666 = r1210 - ((double) r77);
        r76 = r52;
        goto L54
    L55:
        r42 = r10;
        int r183 = r11;
        short[] r154 = this.f7659;
        if (r21 >= 0.5d) goto L58;
        double r95 = ((((double) r52) * r21) / (1.0d - r21)) + this.f7666;
        int r78 = (int) Math.round(r95);
        this.f7666 = r95 - ((double) r78);
        int r115 = r78;
    L59:
        int r104 = r52 + r115;
        short[] r79 = m5237(this.f7675, this.f7661, r104);
        this.f7675 = r79;
        System.arraycopy(r154, r183 * r8, r79, this.f7661 * r8, r52 * r8);
        m5236(r115, this.f7672, this.f7675, this.f7661 + r52, r154, r183 + r52, r154, r183);
        this.f7661 += r104;
        r11 = r183 + r115;
        goto L61
    L58:
        double r116 = ((((r21 * 2.0d) - 1.0d) * ((double) r52)) / (1.0d - r21)) + this.f7666;
        int r710 = (int) Math.round(r116);
        this.f7674 = r710;
        this.f7666 = r116 - ((double) r710);
        r115 = r52;
    L47:
        r52 = r128;
    L24:
        m5239(r127, r11, r133);
        r20 = r22;
        r21 = r4;
        short[] r47 = this.f7655;
        int r24 = m5238(r47, r9, r152 / r133, r144 / r133);
        if (r133 == 1) goto L36;
        int r25 = r24 * r133;
        int r135 = r133 * 4;
        int r53 = r25 - r135;
        int r26 = r25 + r135;
        if (r53 < r152) goto L30;
        r152 = r53;
    L30:
        if (r26 > r144) goto L33;
        r144 = r26;
    L33:
        if (r8 != 1) goto L35;
        r128 = m5238(r127, r11, r152, r144);
        goto L37
    L35:
        m5239(r127, r11, 1);
        r128 = m5238(r47, r9, r152, r144);
        goto L37
    L36:
        r128 = r24;
        goto L37
    L19:
        r133 = r7;
    L8:
        r20 = r22;
        goto L64
    L5:
        if (r4 < 0.9999899864196777d) goto L9;
        m5240(this.f7659, 0, this.f7667);
        this.f7667 = 0;
        goto L8
    }
}
