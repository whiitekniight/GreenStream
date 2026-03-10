package p267;

import java.util.Arrays;
import p231.AbstractC3507;

/* JADX INFO: renamed from: יـ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3852 {

    /* JADX INFO: renamed from: ʽ */
    public Object[] f14112;

    /* JADX INFO: renamed from: ˈ */
    public int f14113;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14114;

    /* JADX INFO: renamed from: ⁱˊ */
    public int[] f14115;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14116;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14117;

    public C3852(int r2) {
        this.f14116 = AbstractC3848.f14102;
        this.f14115 = AbstractC3845.f14094;
        this.f14112 = AbstractC3507.f12478;
        if (r2 < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        m7937(AbstractC3848.m7927(r2));
        return;
    L9:
        AbstractC3507.m7263("Capacity must be a positive value.");
        throw null;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7, types: [int] */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final boolean equals(Object r28) {
        boolean r2 = true;
        if (r28 != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((r28 instanceof C3852) == true) goto L8;
        return false;
    L8:
        C3852 r1 = (C3852) r28;
        if (r1.f14114 == this.f14114) goto L11;
        return false;
    L11:
        int[] r3 = this.f14115;
        Object[] r5 = this.f14112;
        long[] r6 = this.f14116;
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
        int r42 = r3[r17];
        char r282 = r13;
        Object r132 = r5[r17];
        if (r132 == null) goto L23;
        ?? r222 = r22 == true ? 1 : 0;
        Object[] r26 = r5;
        long[] r23 = r6;
        int r21 = r12;
        long r19 = r14;
        int[] r122 = r3;
        if (r132.equals(r1.m7940(r42)) == true) goto L46;
        return r18;
    L46:
        r9 = r9 >> r21;
        r13 = r282;
        r3 = r122;
        r4 = r18;
        r14 = r19;
        r12 = r21;
        r6 = r23;
        r5 = r26;
        r22 = r222 + 1;
        goto L17
    L23:
        if (r1.m7940(r42) != null) goto L41;
        int r133 = (-862048943) * r42;
        int r134 = r133 ^ (r133 << 16);
        r19 = r14;
        int r142 = r134 & 127;
        int r15 = r1.f14113;
        int r135 = (r134 >>> 7) & r15;
        r21 = r12;
        ?? r172 = r18;
        ?? r24 = r22;
    L25:
        long[] r123 = r1.f14116;
        int r223 = r135 >> 3;
        int r0 = (r135 & 7) << 3;
        long r232 = r123[r223] >>> r0;
        long r25 = r123[r223 + 1] << (64 - r0);
        r222 = r24;
        r122 = r3;
        long r27 = r232 | (r25 & ((-r0) >> 63));
        Object[] r02 = r5;
        r23 = r6;
        long r52 = (((long) r142) * 72340172838076673L) ^ r27;
        long r53 = ((r52 - 72340172838076673L) & (~r52)) & r19;
    L27:
        if (r53 == 0) goto L32;
        int r242 = (r135 + (Long.numberOfTrailingZeros(r53) >> 3)) & r15;
        r26 = r02;
        if (r1.f14115[r242] == r42) goto L35;
        r53 = r53 & (r53 - 1);
        r02 = r26;
    L35:
        if (r242 < 0) goto L37;
        boolean r03 = r16;
    L38:
        if (r03 == true) goto L46;
    L37:
        r03 = r18;
        goto L38
    L32:
        r26 = r02;
        if (((r27 & ((~r27) << 6)) & r19) != 0) goto L34;
        int r173 = r172 + 8;
        r135 = (r135 + r173) & r15;
        r3 = r122;
        r24 = r222 == true ? 1 : 0;
        r6 = r23;
        r5 = r26;
        r172 = r173;
        goto L25
    L34:
        r242 = -1;
    L41:
        return r18;
    L45:
        r222 = r22 == true ? 1 : 0;
        r18 = r4;
        r26 = r5;
        r23 = r6;
        r21 = r12;
        r282 = r13;
        r19 = r14;
        r122 = r3;
        goto L46
    L47:
        boolean r182 = r4;
        Object[] r262 = r5;
        long[] r233 = r6;
        int r04 = r12;
        int[] r124 = r3;
        if (r11 != r04) goto L67;
    L51:
        if (r8 == r7) goto L68;
        r8 = r8 + 1;
        r3 = r124;
        r2 = r16;
        r4 = r182;
        r6 = r233;
        r5 = r262;
        goto L14
    L68:
        return r16;
    L67:
        return r16;
    L50:
        r16 = r2;
        r124 = r3;
        r182 = r4;
        r262 = r5;
        r233 = r6;
        goto L51
    L54:
        return true;
    }

    public final int hashCode() {
        int[] r1 = this.f14115;
        Object[] r2 = this.f14112;
        long[] r3 = this.f14116;
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
        int r14 = r1[r13];
        Object r132 = r2[r13];
        if (r132 == null) goto L14;
        int r133 = r132.hashCode();
    L15:
        r7 = r7 + (r133 ^ r14);
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
        if (this.f14114 != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        int[] r2 = this.f14115;
        Object[] r3 = this.f14112;
        long[] r4 = this.f14116;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L25;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L22;
        if ((255 & r9) >= 128) goto L21;
        int r14 = (r7 << 3) + r13;
        int r15 = r2[r14];
        Object r142 = r3[r14];
        r1.append(r15);
        r1.append("=");
        if (r142 != this) goto L18;
        r142 = "(this)";
    L18:
        r1.append(r142);
        r8 = r8 + 1;
        if (r8 >= this.f14114) goto L21;
        r1.append(", ");
    L21:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L22:
        if (r11 != 8) goto L25;
    L23:
        if (r7 == r5) goto L25;
        r7 = r7 + 1;
    L25:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7937(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14113 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14116 = r0;
        int r1 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f14117 = AbstractC3848.m7929(this.f14113) - this.f14114;
        this.f14115 = new int[r102];
        this.f14112 = new Object[r102];
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
    public final Object m7938(int r14) {
        int r0 = (-862048943) * r14;
        int r02 = r0 ^ (r0 << 16);
        int r1 = r02 & 127;
        int r2 = this.f14113;
        int r03 = (r02 >>> 7) & r2;
        int r3 = 0;
    L3:
        long[] r4 = this.f14116;
        int r5 = r03 >> 3;
        int r6 = (r03 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r1) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r63 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r03) & r2;
        if (this.f14115[r10] == r14) goto L14;
        r63 = r63 & (r63 - 1);
    L14:
        if (r10 < 0) goto L17;
        this.f14114--;
        long[] r04 = this.f14116;
        int r12 = this.f14113;
        int r22 = r10 >> 3;
        int r32 = (r10 & 7) << 3;
        long r43 = (r04[r22] & (~(255 << r32))) | (254 << r32);
        r04[r22] = r43;
        r04[(((r10 - 7) & r12) + (r12 & 7)) >> 3] = r43;
        Object[] r05 = this.f14112;
        Object r13 = r05[r10];
        r05[r10] = null;
        return r13;
    L17:
        return null;
    L11:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r3 = r3 + 8;
        r03 = (r03 + r3) & r2;
        goto L3
    L12:
        r10 = -1;
        goto L14
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m7939(int r37, Object r38) {
        int r1 = r37;
        int r2 = -862048943;
        int r3 = r1 * (-862048943);
        int r32 = r3 ^ (r3 << 16);
        int r4 = r32 >>> 7;
        int r33 = r32 & 127;
        int r5 = this.f14113;
        int r6 = r4 & r5;
        int r8 = 0;
    L3:
        long[] r9 = this.f14116;
        int r10 = r6 >> 3;
        int r11 = (r6 & 7) << 3;
        int r14 = 1;
        int r16 = r8;
        int r15 = 0;
        long r7 = (((-r11) >> 63) & (r9[r10 + 1] << (64 - r11))) | (r9[r10] >>> r11);
        long r92 = r33;
        int r13 = r2;
        int r19 = r33;
        long r22 = r7 ^ (r92 * 72340172838076673L);
        long r23 = (~r22) & (r22 - 72340172838076673L);
        long r112 = -9187201950435737472L;
        long r24 = r23 & (-9187201950435737472L);
    L5:
        if (r24 == 0) goto L10;
        int r17 = (r6 + (Long.numberOfTrailingZeros(r24) >> 3)) & r5;
        long r20 = r112;
        if (this.f14115[r17] == r1) goto L58;
        r24 = r24 & (r24 - 1);
        r112 = r20;
    L58:
        this.f14115[r17] = r37;
        this.f14112[r17] = r38;
        return;
    L10:
        long r202 = r112;
        char r34 = '\b';
        if (((((~r7) << 6) & r7) & r202) != 0) goto L12;
        r8 = r16 + 8;
        r6 = (r6 + r8) & r5;
        r1 = r37;
        r33 = r19;
        r2 = r13;
        goto L3
    L12:
        int r25 = m7941(r4);
        long r113 = 255;
        if (this.f14117 == 0) goto L15;
    L16:
        long r222 = r92;
        long r28 = 255;
        int r26 = 1;
        long r162 = 128;
        int r12 = r25;
    L54:
        this.f14114++;
        int r27 = this.f14117;
        long[] r35 = this.f14116;
        int r42 = r12 >> 3;
        long r52 = r35[r42];
        int r72 = (r12 & 7) << 3;
        if (((r52 >> r72) & r28) != r162) goto L57;
        r15 = r26;
    L57:
        this.f14117 = r27 - r15;
        int r29 = this.f14113;
        long r53 = (r52 & (~(r28 << r72))) | (r222 << r72);
        r35[r42] = r53;
        r35[(((r12 - 7) & r29) + (r29 & 7)) >> 3] = r53;
        r17 = r12;
        goto L58
    L15:
        if (((this.f14116[r25 >> 3] >> ((r25 & 7) << 3)) & 255) == 254) goto L16;
        int r210 = this.f14113;
        if (r210 <= 8) goto L44;
        r162 = 128;
        r222 = r92;
        char r54 = 7;
        if (Long.compare((((long) this.f14114) * 32) ^ Long.MIN_VALUE, (((long) r210) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
        long[] r211 = this.f14116;
        int r62 = this.f14113;
        int[] r73 = this.f14115;
        Object[] r82 = this.f14112;
        int r93 = (r62 + 7) >> 3;
        int r102 = 0;
    L22:
        if (r102 >= r93) goto L24;
        long r282 = r113;
        long r114 = r211[r102] & r202;
        r211[r102] = (-72340172838076674L) & ((~r114) + (r114 >>> 7));
        r102 = r102 + 1;
        r14 = r14;
        r13 = r13;
        r113 = r282;
        goto L22
    L24:
        r28 = r113;
        int r272 = r13;
        r26 = r14;
        int r94 = r211.length;
        int r103 = r94 - 1;
        int r95 = r94 - 2;
        long r132 = 72057594037927935L;
        r211[r95] = (r211[r95] & 72057594037927935L) | (-72057594037927936L);
        r211[r103] = r211[0];
        int r96 = 0;
    L25:
        if (r96 == r62) goto L40;
        int r104 = r96 >> 3;
        int r203 = (r96 & 7) << 3;
        long r115 = (r211[r104] >> r203) & r28;
        if (r115 == 128) goto L28;
        if (r115 != 254) goto L28;
        int r116 = r73[r96] * r272;
        int r117 = r116 ^ (r116 << 16);
        int r122 = r117 >>> 7;
        int r21 = m7941(r122);
        int r123 = r122 & r62;
        char r31 = r34;
        if ((((r21 - r123) & r62) / 8) == (((r96 - r123) & r62) / 8)) goto L34;
        char r36 = r54;
        int r30 = r62;
        int r55 = r21 >> 3;
        long r322 = r211[r55];
        int r63 = (r21 & 7) << 3;
        if (((r322 >> r63) & r28) != 128) goto L38;
        long r342 = r132;
        r211[r55] = (((long) (r117 & 127)) << r63) | (r322 & (~(r28 << r63)));
        r211[r104] = (r211[r104] & (~(r28 << r203))) | (128 << r203);
        r73[r21] = r73[r96];
        r73[r96] = 0;
        r82[r21] = r82[r96];
        r82[r96] = null;
    L39:
        r211[r211.length - 1] = (r211[0] & r342) | Long.MIN_VALUE;
        r96 = r96 + 1;
        r54 = r36;
        r62 = r30;
        r34 = r31;
        r132 = r342;
        goto L25
    L38:
        r342 = r132;
        r211[r55] = (((long) (r117 & 127)) << r63) | (r322 & (~(r28 << r63)));
        int r56 = r73[r21];
        r73[r21] = r73[r96];
        r73[r96] = r56;
        Object r57 = r82[r21];
        r82[r21] = r82[r96];
        r82[r96] = r57;
        r96 = r96 - 1;
        goto L39
    L34:
        r211[r104] = (r211[r104] & (~(r28 << r203))) | ((r117 & 127) << r203);
        r211[r211.length - 1] = (r211[0] & r132) | Long.MIN_VALUE;
        r96 = r96 + 1;
        r54 = r54;
        r62 = r62;
        r34 = r31;
    L28:
        r96 = r96 + 1;
        goto L25
    L40:
        char r39 = r54;
        this.f14117 = AbstractC3848.m7929(this.f14113) - this.f14114;
    L52:
        r12 = m7941(r4);
        goto L54
    L42:
        r39 = 7;
    L43:
        r28 = 255;
        r26 = 1;
        int r212 = AbstractC3848.m7928(this.f14113);
        long[] r58 = this.f14116;
        int[] r64 = this.f14115;
        Object[] r74 = this.f14112;
        int r83 = this.f14113;
        m7937(r212);
        long[] r213 = this.f14116;
        int[] r97 = this.f14115;
        Object[] r105 = this.f14112;
        int r118 = this.f14113;
        int r124 = 0;
    L46:
        if (r124 >= r83) goto L52;
        if (((r58[r124 >> 3] >> ((r124 & 7) << 3)) & 255) >= r162) goto L50;
        int r133 = r64[r124];
        int r142 = r133 * r13;
        int r143 = r142 ^ (r142 << 16);
        char r18 = r39;
        int r310 = m7941(r143 >>> 7);
        long[] r192 = r213;
        long r110 = r143 & 127;
        int r144 = r310 >> 3;
        int r204 = (r310 & 7) << 3;
        long r111 = (r192[r144] & (~(255 << r204))) | (r110 << r204);
        r192[r144] = r111;
        r192[(((r310 - 7) & r118) + (r118 & 7)) >> 3] = r111;
        r97[r310] = r133;
        r105[r310] = r74[r124];
    L51:
        r124 = r124 + 1;
        r39 = r18;
        r213 = r192;
        goto L46
    L50:
        r192 = r213;
        r18 = r39;
        goto L51
    L44:
        r222 = r92;
        r39 = 7;
        r162 = 128;
        goto L43
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object m7940(int r14) {
        int r0 = (-862048943) * r14;
        int r02 = r0 ^ (r0 << 16);
        int r1 = r02 & 127;
        int r2 = this.f14113;
        int r03 = (r02 >>> 7) & r2;
        int r3 = 0;
    L3:
        long[] r4 = this.f14116;
        int r5 = r03 >> 3;
        int r6 = (r03 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r1) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r63 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r03) & r2;
        if (this.f14115[r10] == r14) goto L13;
        r63 = r63 & (r63 - 1);
    L13:
        if (r10 >= 0) goto L15;
        return null;
    L15:
        return this.f14112[r10];
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
    public final int m7941(int r10) {
        int r0 = this.f14113;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14116;
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
