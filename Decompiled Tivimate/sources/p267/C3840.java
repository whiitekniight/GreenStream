package p267;

import java.util.Arrays;
import p231.AbstractC3507;

/* JADX INFO: renamed from: יـ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C3840 {

    /* JADX INFO: renamed from: ʽ */
    public Object[] f14070;

    /* JADX INFO: renamed from: ˈ */
    public int f14071;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14072;

    /* JADX INFO: renamed from: ⁱˊ */
    public long[] f14073;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14074;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14075;

    public /* synthetic */ C3840() {
        this(6);
    }

    public C3840(int r2) {
        this.f14074 = AbstractC3848.f14102;
        this.f14073 = AbstractC3847.f14100;
        this.f14070 = AbstractC3507.f12478;
        if (r2 < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        m7895(AbstractC3848.m7927(r2));
        return;
    L9:
        AbstractC3507.m7263("Capacity must be a positive value.");
        throw null;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [int] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final boolean equals(Object r30) {
        boolean r2 = true;
        if (r30 != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((r30 instanceof C3840) == true) goto L8;
        return false;
    L8:
        C3840 r1 = (C3840) r30;
        if (r1.f14072 == this.f14072) goto L11;
        return false;
    L11:
        long[] r3 = this.f14073;
        Object[] r5 = this.f14070;
        long[] r6 = this.f14074;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L54;
        int r8 = 0;
    L14:
        long r9 = r6[r8];
        char r13 = 7;
        long r14 = -9187201950435737472L;
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L50;
        int r12 = 8;
        int r11 = 8 - ((~(r8 - r7)) >>> 31);
        boolean r16 = r2;
        ?? r22 = r4;
    L17:
        if (r22 >= r11) goto L47;
        if ((r9 & 255) >= 128) goto L45;
        int r17 = (r8 << 3) + (r22 == true ? 1 : 0);
        boolean r18 = r4;
        Object[] r19 = r5;
        long r42 = r3[r17];
        char r302 = r13;
        Object r132 = r19[r17];
        if (r132 == null) goto L23;
        ?? r21 = r22 == true ? 1 : 0;
        long r24 = r9;
        int r20 = r12;
        long r222 = r14;
        long[] r122 = r3;
        if (r132.equals(r1.m7898(r42)) == true) goto L46;
        return r18;
    L46:
        r9 = r24 >> r20;
        r13 = r302;
        r3 = r122;
        r4 = r18;
        r5 = r19;
        r12 = r20;
        r14 = r222;
        r22 = r21 + 1;
        goto L17
    L23:
        if (r1.m7898(r42) != null) goto L41;
        r222 = r14;
        int r133 = ((int) (r42 ^ (r42 >>> 32))) * (-862048943);
        int r134 = r133 ^ (r133 << 16);
        int r142 = r134 & 127;
        int r15 = r1.f14071;
        int r135 = (r134 >>> 7) & r15;
        r20 = r12;
        ?? r172 = r18;
        ?? r23 = r22;
    L25:
        long[] r123 = r1.f14074;
        int r212 = r135 >> 3;
        int r0 = (r135 & 7) << 3;
        long r242 = r123[r212] >>> r0;
        long r26 = r123[r212 + 1] << (64 - r0);
        r21 = r23;
        r122 = r3;
        long r25 = r242 | (r26 & ((-r0) >> 63));
        r24 = r9;
        long r92 = (((long) r142) * 72340172838076673L) ^ r25;
        long r93 = ((r92 - 72340172838076673L) & (~r92)) & r222;
    L27:
        if (r93 == 0) goto L33;
        int r02 = ((Long.numberOfTrailingZeros(r93) >> 3) + r135) & r15;
        if (r1.f14073[r02] == r42) goto L30;
        r93 = r93 & (r93 - 1);
        goto L27
    L30:
        int r03 = r02;
    L35:
        if (r03 < 0) goto L37;
        boolean r04 = r16;
    L38:
        if (r04 == true) goto L46;
    L37:
        r04 = r18;
        goto L38
    L33:
        if (((r25 & ((~r25) << 6)) & r222) != 0) goto L34;
        int r173 = r172 + 8;
        r135 = (r135 + r173) & r15;
        r3 = r122;
        r23 = r21 == true ? 1 : 0;
        r9 = r24;
        r172 = r173;
        goto L25
    L34:
        r03 = -1;
    L41:
        return r18;
    L45:
        r21 = r22 == true ? 1 : 0;
        r18 = r4;
        r19 = r5;
        r24 = r9;
        r20 = r12;
        r302 = r13;
        r222 = r14;
        r122 = r3;
        goto L46
    L47:
        boolean r182 = r4;
        Object[] r192 = r5;
        int r05 = r12;
        long[] r124 = r3;
        if (r11 != r05) goto L67;
    L51:
        if (r8 == r7) goto L68;
        r8 = r8 + 1;
        r3 = r124;
        r2 = r16;
        r4 = r182;
        r5 = r192;
        goto L14
    L68:
        return r16;
    L67:
        return r16;
    L50:
        r16 = r2;
        r124 = r3;
        r182 = r4;
        r192 = r5;
        goto L51
    L54:
        return true;
    }

    public final int hashCode() {
        long[] r1 = this.f14073;
        Object[] r2 = this.f14070;
        long[] r3 = this.f14074;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L23;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r3[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L17;
        if ((255 & r8) >= 128) goto L16;
        int r13 = (r6 << 3) + r12;
        long r14 = r1[r13];
        Object r132 = r2[r13];
        int r142 = (int) (r14 ^ (r14 >>> 32));
        if (r132 == null) goto L14;
        int r133 = r132.hashCode();
    L15:
        r7 = r7 + (r133 ^ r142);
        goto L16
    L14:
        r133 = 0;
    L16:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L17:
        if (r10 == 8) goto L20;
        return r7;
    L20:
        if (r6 == r4) goto L22;
        r6 = r6 + 1;
        goto L5
    L22:
        return r7;
    L23:
        return 0;
    }

    public final String toString() {
        if (this.f14072 != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        long[] r2 = this.f14073;
        Object[] r3 = this.f14070;
        long[] r4 = this.f14074;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L29;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L23;
        if ((255 & r9) >= 128) goto L21;
        int r14 = (r7 << 3) + r13;
        int r16 = r7;
        long r6 = r2[r14];
        Object r142 = r3[r14];
        r1.append(r6);
        r1.append("=");
        if (r142 != this) goto L18;
        r142 = "(this)";
    L18:
        r1.append(r142);
        r8 = r8 + 1;
        if (r8 >= this.f14072) goto L22;
        r1.append(", ");
    L22:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        r7 = r16;
        goto L12
    L21:
        r16 = r7;
        goto L22
    L23:
        int r162 = r7;
        if (r11 != 8) goto L29;
        int r62 = r162;
    L27:
        if (r62 == r5) goto L29;
        r7 = r62 + 1;
        goto L9
    L26:
        r62 = r7;
    L29:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7895(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14071 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14074 = r0;
        int r1 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f14075 = AbstractC3848.m7929(this.f14071) - this.f14072;
        this.f14073 = new long[r102];
        this.f14070 = new Object[r102];
        return;
    L9:
        int r12 = ((r102 + 15) & (-8)) >> 3;
        long[] r2 = new long[r12];
        Arrays.fill(r2, 0, r12, -9187201950435737472L);
        r0 = r2;
        goto L10
    L5:
        r102 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m7896(int r23) {
        C3840 r0 = this;
        long[] r1 = r0.f14074;
        long[] r2 = r0.f14073;
        Object[] r3 = r0.f14070;
        int r4 = r0.f14071;
        m7895(r23);
        long[] r5 = r0.f14074;
        long[] r6 = r0.f14073;
        Object[] r7 = r0.f14070;
        int r8 = r0.f14071;
        int r9 = 0;
    L3:
        if (r9 >= r4) goto L9;
        if (((r1[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L7;
        long r10 = r2[r9];
        int r14 = ((int) ((r10 >>> 32) ^ r10)) * (-862048943);
        int r142 = r14 ^ (r14 << 16);
        int r15 = r0.m7899(r142 >>> 7);
        long r12 = r142 & 127;
        int r143 = r15 >> 3;
        int r18 = (r15 & 7) << 3;
        long[] r21 = r1;
        long r02 = (r5[r143] & (~(255 << r18))) | (r12 << r18);
        r5[r143] = r02;
        r5[(((r15 - 7) & r8) + (r8 & 7)) >> 3] = r02;
        r6[r15] = r10;
        r7[r15] = r3[r9];
    L8:
        r9 = r9 + 1;
        r0 = this;
        r1 = r21;
        goto L3
    L7:
        r21 = r1;
        goto L8
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m7897(long r40, Object r42) {
        char r1 = ' ';
        int r3 = -862048943;
        int r2 = ((int) (r40 ^ (r40 >>> 32))) * (-862048943);
        int r22 = r2 ^ (r2 << 16);
        int r4 = r22 >>> 7;
        int r23 = r22 & 127;
        int r5 = this.f14071;
        int r6 = r4 & r5;
        int r8 = 0;
    L3:
        long[] r9 = this.f14074;
        int r10 = r6 >> 3;
        int r11 = (r6 & 7) << 3;
        int r14 = 1;
        int r16 = r8;
        long r7 = (((-r11) >> 63) & (r9[r10 + 1] << (64 - r11))) | (r9[r10] >>> r11);
        long r92 = r23;
        char r13 = r1;
        int r19 = r23;
        long r12 = r7 ^ (r92 * 72340172838076673L);
        long r15 = (~r12) & (r12 - 72340172838076673L);
        long r112 = -9187201950435737472L;
        long r17 = r15 & (-9187201950435737472L);
    L5:
        if (r17 == 0) goto L10;
        int r172 = (r6 + (Long.numberOfTrailingZeros(r17) >> 3)) & r5;
        int r20 = r3;
        if (this.f14073[r172] == r40) goto L50;
        r17 = r17 & (r17 - 1);
        r3 = r20;
    L50:
        this.f14073[r172] = r40;
        this.f14070[r172] = r42;
        return;
    L10:
        int r202 = r3;
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L12;
        r8 = r16 + 8;
        r6 = (r6 + r8) & r5;
        r23 = r19;
        r3 = r202;
        r1 = r13;
        goto L3
    L12:
        int r18 = m7899(r4);
        if (this.f14075 == 0) goto L15;
    L16:
        long r29 = 255;
        int r33 = 1;
        long r25 = 128;
    L45:
        r172 = r18;
        this.f14072++;
        int r110 = this.f14075;
        long[] r24 = this.f14074;
        int r32 = r172 >> 3;
        long r43 = r24[r32];
        int r62 = (r172 & 7) << 3;
        if (((r43 >> r62) & r29) != r25) goto L48;
        int r72 = r33;
    L49:
        this.f14075 = r110 - r72;
        int r111 = this.f14071;
        long r44 = (r43 & (~(r29 << r62))) | (r92 << r62);
        r24[r32] = r44;
        r24[(((r172 - 7) & r111) + (r111 & 7)) >> 3] = r44;
        goto L50
    L48:
        r72 = 0;
        goto L49
    L15:
        if (((this.f14074[r18 >> 3] >> ((r18 & 7) << 3)) & 255) == 254) goto L16;
        int r113 = this.f14071;
        if (r113 <= 8) goto L42;
        r25 = 128;
        if (Long.compare((((long) this.f14072) * 32) ^ Long.MIN_VALUE, (((long) r113) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
        long[] r114 = this.f14074;
        int r26 = this.f14071;
        long[] r34 = this.f14073;
        Object[] r52 = this.f14070;
        int r63 = (r26 + 7) >> 3;
        r29 = 255;
        int r73 = 0;
    L22:
        if (r73 >= r63) goto L24;
        long r332 = r112;
        long r115 = r114[r73] & r332;
        r114[r73] = (-72340172838076674L) & ((~r115) + (r115 >>> 7));
        r73 = r73 + 1;
        r14 = r14;
        r13 = r13;
        r112 = r332;
        goto L22
    L24:
        char r222 = r13;
        int r82 = r14;
        int r64 = r114.length;
        int r74 = r64 - 1;
        int r65 = r64 - 2;
        long r132 = 72057594037927935L;
        r114[r65] = (r114[r65] & 72057594037927935L) | (-72057594037927936L);
        r114[r74] = r114[0];
        int r66 = 0;
    L25:
        if (r66 == r26) goto L40;
        int r75 = r66 >> 3;
        int r192 = (r66 & 7) << 3;
        long r116 = (r114[r75] >> r192) & 255;
        if (r116 == 128) goto L28;
        if (r116 != 254) goto L28;
        long r117 = r34[r66];
        int r118 = ((int) (r117 ^ (r117 >>> r222))) * r202;
        int r119 = r118 ^ (r118 << 16);
        int r122 = r119 >>> 7;
        int r31 = m7899(r122);
        int r123 = r122 & r26;
        int r333 = r82;
        if ((((r31 - r123) & r26) / 8) == (((r66 - r123) & r26) / 8)) goto L34;
        long r342 = r132;
        int r83 = r31 >> 3;
        long r124 = r114[r83];
        int r142 = (r31 & 7) << 3;
        if (((r124 >> r142) & 255) != 128) goto L38;
        int r322 = r26;
        long[] r36 = r34;
        r114[r83] = ((~(255 << r142)) & r124) | (((long) (r119 & 127)) << r142);
        r114[r75] = (r114[r75] & (~(255 << r192))) | (128 << r192);
        r36[r31] = r36[r66];
        r36[r66] = 0;
        r52[r31] = r52[r66];
        r52[r66] = null;
    L39:
        r114[r114.length - 1] = (r114[0] & r342) | Long.MIN_VALUE;
        r66 = r66 + 1;
        r26 = r322;
        r82 = r333;
        r132 = r342;
        r34 = r36;
        goto L25
    L38:
        r322 = r26;
        r36 = r34;
        r114[r83] = ((~(255 << r142)) & r124) | ((r119 & 127) << r142);
        long r27 = r36[r31];
        r36[r31] = r36[r66];
        r36[r66] = r27;
        Object r28 = r52[r31];
        r52[r31] = r52[r66];
        r52[r66] = r28;
        r66 = r66 - 1;
        goto L39
    L34:
        long r343 = r132;
        r114[r75] = (((long) (r119 & 127)) << r192) | (r114[r75] & (~(255 << r192)));
        r114[r114.length - 1] = (r114[0] & r343) | Long.MIN_VALUE;
        r66 = r66 + 1;
        r82 = r333;
        r132 = r343;
    L28:
        r66 = r66 + 1;
        goto L25
    L40:
        r33 = r82;
        this.f14075 = AbstractC3848.m7929(this.f14071) - this.f14072;
    L44:
        r18 = m7899(r4);
    L41:
        r29 = 255;
        r33 = 1;
        m7896(AbstractC3848.m7928(this.f14071));
        goto L44
    L42:
        r25 = 128;
        goto L41
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object m7898(long r15) {
        int r0 = ((int) ((r15 >>> 32) ^ r15)) * (-862048943);
        int r02 = r0 ^ (r0 << 16);
        int r1 = r02 & 127;
        int r2 = this.f14071;
        int r03 = (r02 >>> 7) & r2;
        int r3 = 0;
    L3:
        long[] r4 = this.f14074;
        int r5 = r03 >> 3;
        int r6 = (r03 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r1) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r63 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r03) & r2;
        if (this.f14073[r10] == r15) goto L13;
        r63 = r63 & (r63 - 1);
    L13:
        if (r10 >= 0) goto L15;
        return null;
    L15:
        return this.f14070[r10];
    L11:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r3 = r3 + 8;
        r03 = (r03 + r3) & r2;
        goto L3
    L12:
        r10 = -1;
        goto L13
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7899(int r10) {
        int r0 = this.f14071;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14074;
        int r3 = r102 >> 3;
        int r4 = (r102 & 7) << 3;
        long r22 = ((r2[r3 + 1] << (64 - r4)) & ((-r4) >> 63)) | (r2[r3] >>> r4);
        long r23 = (r22 & ((~r22) << 7)) & (-9187201950435737472L);
        if (r23 != 0) goto L6;
        r1 = r1 + 8;
        r102 = (r102 + r1) & r0;
        goto L3
    L6:
        return (r102 + (Long.numberOfTrailingZeros(r23) >> 3)) & r0;
    }
}
