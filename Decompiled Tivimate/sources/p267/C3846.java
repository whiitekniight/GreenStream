package p267;

import java.util.Arrays;
import p231.AbstractC3507;

/* JADX INFO: renamed from: יـ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C3846 {

    /* JADX INFO: renamed from: ʽ */
    public int f14095;

    /* JADX INFO: renamed from: ˈ */
    public int f14096;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14097;

    /* JADX INFO: renamed from: ⁱˊ */
    public long[] f14098;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14099;

    public /* synthetic */ C3846() {
        this(6);
    }

    public C3846(int r2) {
        this.f14099 = AbstractC3848.f14102;
        this.f14098 = AbstractC3847.f14100;
        if (r2 < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        m7925(AbstractC3848.m7927(r2));
        return;
    L9:
        AbstractC3507.m7263("Capacity must be a positive value.");
        throw null;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean equals(Object r18) {
        if (r18 != this) goto L6;
        return true;
    L6:
        if ((r18 instanceof C3846) == true) goto L8;
        return false;
    L8:
        C3846 r1 = (C3846) r18;
        if (r1.f14096 == this.f14096) goto L11;
        return false;
    L11:
        long[] r3 = this.f14098;
        long[] r5 = this.f14099;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L27;
        int r7 = 0;
    L14:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L17:
        if (r12 >= r10) goto L24;
        if ((255 & r8) >= 128) goto L23;
        if (r1.m7918(r3[(r7 << 3) + r12]) == true) goto L23;
        return false;
    L23:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L17
    L24:
        if (r10 != 8) goto L27;
    L25:
        if (r7 == r6) goto L27;
        r7 = r7 + 1;
    L27:
        return true;
    }

    public final int hashCode() {
        long[] r0 = this.f14098;
        long[] r1 = this.f14099;
        int r2 = r1.length - 2;
        if (r2 < 0) goto L19;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r1[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L13;
        if ((255 & r6) >= 128) goto L12;
        long r11 = r0[(r4 << 3) + r10];
        r5 = r5 + ((int) (r11 ^ (r11 >>> 32)));
    L12:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L13:
        if (r8 == 8) goto L16;
        return r5;
    L16:
        if (r4 == r2) goto L18;
        r4 = r4 + 1;
        goto L5
    L18:
        return r5;
    L19:
        return 0;
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        r1.append("[");
        long[] r2 = this.f14098;
        long[] r3 = this.f14099;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L21;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r3[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L18;
        if ((255 & r8) >= 128) goto L17;
        long r13 = r2[(r6 << 3) + r12];
        if (r7 == (-1)) goto L13;
        if (r7 == 0) goto L16;
        r1.append(", ");
    L16:
        r1.append(r13);
        r7 = r7 + 1;
        goto L17
    L13:
        r1.append("...");
    L23:
        return r1.toString();
    L17:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L18:
        if (r10 != 8) goto L21;
    L19:
        if (r6 == r4) goto L21;
        r6 = r6 + 1;
    L21:
        r1.append("]");
        goto L23
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m7917(int r9) {
        this.f14096--;
        long[] r0 = this.f14099;
        int r1 = this.f14095;
        int r2 = r9 >> 3;
        int r3 = (r9 & 7) << 3;
        long r4 = (r0[r2] & (~(255 << r3))) | (254 << r3);
        r0[r2] = r4;
        r0[(((r9 - 7) & r1) + (r1 & 7)) >> 3] = r4;
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m7918(long r18) {
        int r1 = ((int) (r18 ^ (r18 >>> 32))) * (-862048943);
        int r12 = r1 ^ (r1 << 16);
        int r2 = r12 & 127;
        int r3 = this.f14095;
        int r13 = (r12 >>> 7) & r3;
        int r5 = 0;
    L3:
        long[] r6 = this.f14099;
        int r7 = r13 >> 3;
        int r8 = (r13 & 7) << 3;
        long r62 = ((r6[r7 + 1] << (64 - r8)) & ((-r8) >> 63)) | (r6[r7] >>> r8);
        long r82 = (((long) r2) * 72340172838076673L) ^ r62;
        long r83 = ((~r82) & (r82 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r83 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r83) >> 3) + r13) & r3;
        if (this.f14098[r10] == r18) goto L13;
        r83 = r83 & (r83 - 1);
    L13:
        if (r10 < 0) goto L15;
        return true;
    L15:
        return false;
    L11:
        if (((r62 & ((~r62) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r5 = r5 + 8;
        r13 = (r13 + r5) & r3;
        goto L3
    L12:
        r10 = -1;
        goto L13
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m7919(long r37) {
        char r1 = ' ';
        int r3 = -862048943;
        int r2 = ((int) (r37 ^ (r37 >>> 32))) * (-862048943);
        int r22 = r2 ^ (r2 << 16);
        int r4 = r22 >>> 7;
        int r23 = r22 & 127;
        int r5 = this.f14095;
        int r6 = r4 & r5;
        int r8 = 0;
    L3:
        long[] r9 = this.f14099;
        int r10 = r6 >> 3;
        int r11 = (r6 & 7) << 3;
        int r14 = 1;
        int r16 = r8;
        int r15 = 0;
        long r7 = (((-r11) >> 63) & (r9[r10 + 1] << (64 - r11))) | (r9[r10] >>> r11);
        long r92 = r23;
        char r13 = r1;
        int r19 = r23;
        long r12 = r7 ^ (r92 * 72340172838076673L);
        long r17 = (~r12) & (r12 - 72340172838076673L);
        long r112 = -9187201950435737472L;
        long r18 = r17 & (-9187201950435737472L);
    L5:
        if (r18 == 0) goto L10;
        int r172 = (r6 + (Long.numberOfTrailingZeros(r18) >> 3)) & r5;
        int r20 = r3;
        if (this.f14098[r172] == r37) goto L8;
        r18 = r18 & (r18 - 1);
        r3 = r20;
        goto L5
    L8:
        return r172;
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
        int r110 = m7920(r4);
        long r72 = 255;
        if (this.f14097 == 0) goto L15;
    L16:
        long r29 = 255;
        int r27 = 1;
        long r372 = 128;
    L51:
        this.f14096++;
        int r24 = this.f14097;
        long[] r32 = this.f14099;
        int r42 = r110 >> 3;
        long r52 = r32[r42];
        int r73 = (r110 & 7) << 3;
        if (((r52 >> r73) & r29) != r372) goto L54;
        r15 = r27;
    L54:
        this.f14097 = r24 - r15;
        int r25 = this.f14095;
        long r53 = (r52 & (~(r29 << r73))) | (r92 << r73);
        r32[r42] = r53;
        r32[(((r110 - 7) & r25) + (r25 & 7)) >> 3] = r53;
        return r110;
    L15:
        if (((this.f14099[r110 >> 3] >> ((r110 & 7) << 3)) & 255) == 254) goto L16;
        int r111 = this.f14095;
        if (r111 <= 8) goto L42;
        r372 = 128;
        if (Long.compare((((long) this.f14096) * 32) ^ Long.MIN_VALUE, (((long) r111) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
        long[] r113 = this.f14099;
        int r26 = this.f14095;
        long[] r33 = this.f14098;
        int r54 = (r26 + 7) >> 3;
        int r62 = 0;
    L22:
        if (r62 >= r54) goto L24;
        long r292 = r72;
        long r74 = r113[r62] & r112;
        r113[r62] = (-72340172838076674L) & ((~r74) + (r74 >>> 7));
        r62 = r62 + 1;
        r72 = r292;
        r112 = -9187201950435737472L;
        goto L22
    L24:
        r29 = r72;
        int r55 = r113.length;
        int r63 = r55 - 1;
        int r56 = r55 - 2;
        long r114 = 72057594037927935L;
        r113[r56] = (r113[r56] & 72057594037927935L) | (-72057594037927936L);
        r113[r63] = r113[0];
        int r57 = 0;
    L25:
        if (r57 == r26) goto L40;
        int r64 = r57 >> 3;
        int r192 = (r57 & 7) << 3;
        long r75 = (r113[r64] >> r192) & r29;
        if (r75 == 128) goto L28;
        if (r75 != 254) goto L28;
        long r76 = r33[r57];
        int r77 = ((int) (r76 ^ (r76 >>> r13))) * r202;
        int r78 = r77 ^ (r77 << 16);
        int r82 = r78 >>> 7;
        int r222 = m7920(r82);
        int r83 = r82 & r26;
        long r31 = r114;
        if ((((r222 - r83) & r26) / 8) == (((r57 - r83) & r26) / 8)) goto L34;
        char r28 = r13;
        int r272 = r14;
        int r84 = r222 >> 3;
        long r115 = r113[r84];
        int r132 = (r222 & 7) << 3;
        if (((r115 >> r132) & r29) != 128) goto L38;
        int r142 = r26;
        long[] r332 = r33;
        r113[r84] = ((~(r29 << r132)) & r115) | (((long) (r78 & 127)) << r132);
        r113[r64] = (r113[r64] & (~(r29 << r192))) | (128 << r192);
        r332[r222] = r332[r57];
        r332[r57] = 0;
    L39:
        r113[r113.length - 1] = (r113[0] & r31) | Long.MIN_VALUE;
        r57 = r57 + 1;
        r26 = r142;
        r14 = r272;
        r13 = r28;
        r114 = r31;
        r33 = r332;
        goto L25
    L38:
        r142 = r26;
        r332 = r33;
        r113[r84] = (((long) (r78 & 127)) << r132) | ((~(r29 << r132)) & r115);
        long r210 = r332[r222];
        r332[r222] = r332[r57];
        r332[r57] = r210;
        r57 = r57 - 1;
        goto L39
    L34:
        r113[r64] = (((long) (r78 & 127)) << r192) | (r113[r64] & (~(r29 << r192)));
        r113[r113.length - 1] = (r113[0] & r31) | Long.MIN_VALUE;
        r57 = r57 + 1;
        r14 = r14;
        r13 = r13;
        r114 = r31;
    L28:
        r57 = r57 + 1;
        goto L25
    L40:
        r27 = r14;
        this.f14097 = AbstractC3848.m7929(this.f14095) - this.f14096;
    L50:
        r110 = m7920(r4);
    L41:
        r29 = 255;
        r27 = 1;
        int r116 = AbstractC3848.m7928(this.f14095);
        long[] r211 = this.f14099;
        long[] r34 = this.f14098;
        int r58 = this.f14095;
        m7925(r116);
        long[] r117 = this.f14099;
        long[] r65 = this.f14098;
        int r79 = this.f14095;
        int r85 = 0;
    L44:
        if (r85 >= r58) goto L50;
        if (((r211[r85 >> 3] >> ((r85 & 7) << 3)) & 255) >= r372) goto L48;
        long r118 = r34[r85];
        int r133 = ((int) ((r118 >>> r13) ^ r118)) * r202;
        int r134 = r133 ^ (r133 << 16);
        int r143 = m7920(r134 >>> 7);
        long[] r182 = r117;
        long[] r173 = r211;
        long r119 = r134 & 127;
        int r135 = r143 >> 3;
        int r193 = (r143 & 7) << 3;
        long r120 = (r182[r135] & (~(255 << r193))) | (r119 << r193);
        r182[r135] = r120;
        r182[(((r143 - 7) & r79) + (r79 & 7)) >> 3] = r120;
        r65[r143] = r118;
    L49:
        r85 = r85 + 1;
        r211 = r173;
        r117 = r182;
        goto L44
    L48:
        r182 = r117;
        r173 = r211;
        goto L49
    L42:
        r372 = 128;
        goto L41
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final int m7920(int r10) {
        int r0 = this.f14095;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14099;
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

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m7921(long r15) {
        int r0 = ((int) ((r15 >>> 32) ^ r15)) * (-862048943);
        int r02 = r0 ^ (r0 << 16);
        int r1 = r02 & 127;
        int r2 = this.f14095;
        int r03 = (r02 >>> 7) & r2;
        int r3 = 0;
    L3:
        long[] r4 = this.f14099;
        int r5 = r03 >> 3;
        int r6 = (r03 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r1) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r63 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r03) & r2;
        if (this.f14098[r10] == r15) goto L13;
        r63 = r63 & (r63 - 1);
    L13:
        if (r10 < 0) goto L20;
        m7917(r10);
        return;
    L20:
        return;
    L11:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r3 = r3 + 8;
        r03 = (r03 + r3) & r2;
        goto L3
    L12:
        r10 = -1;
        goto L13
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m7922(C3846 r28) {
        long[] r2 = r28.f14098;
        long[] r1 = r28.f14099;
        int r3 = r1.length - 2;
        if (r3 < 0) goto L33;
        int r5 = 0;
    L5:
        long r6 = r1[r5];
        char r10 = 7;
        long r11 = -9187201950435737472L;
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
        int r9 = 8;
        int r8 = 8 - ((~(r5 - r3)) >>> 31);
        int r13 = 0;
    L8:
        if (r13 >= r8) goto L27;
        if ((255 & r6) >= 128) goto L25;
        long r14 = r2[(r5 << 3) + r13];
        char r282 = r10;
        long r18 = r11;
        int r102 = ((int) (r14 ^ (r14 >>> 32))) * (-862048943);
        int r103 = r102 ^ (r102 << 16);
        int r112 = r103 & 127;
        int r12 = this.f14095;
        int r104 = (r103 >>> 7) & r12;
        int r16 = 0;
    L12:
        long[] r4 = this.f14099;
        int r20 = r104 >> 3;
        int r22 = r9;
        int r92 = (r104 & 7) << 3;
        long r23 = r4[r20] >>> r92;
        long r202 = r4[r20 + 1] << (64 - r92);
        long[] r25 = r1;
        long[] r42 = r2;
        long r15 = r23 | (r202 & ((-r92) >> 63));
        long r203 = r6;
        long r62 = (((long) r112) * 72340172838076673L) ^ r15;
        long r63 = ((r62 - 72340172838076673L) & (~r62)) & r18;
    L14:
        if (r63 == 0) goto L19;
        int r93 = ((Long.numberOfTrailingZeros(r63) >> 3) + r104) & r12;
        long[] r26 = r42;
        if (this.f14098[r93] == r14) goto L22;
        r63 = r63 & (r63 - 1);
        r42 = r26;
    L22:
        if (r93 < 0) goto L26;
        m7917(r93);
    L26:
        r6 = r203 >> r22;
        r13 = r13 + 1;
        r10 = r282;
        r11 = r18;
        r9 = r22;
        r1 = r25;
        r2 = r26;
        goto L8
    L19:
        r26 = r42;
        if (((r15 & ((~r15) << 6)) & r18) != 0) goto L21;
        r16 = r16 + 8;
        r104 = (r104 + r16) & r12;
        r6 = r203;
        r9 = r22;
        r1 = r25;
        r2 = r26;
        goto L12
    L21:
        r93 = -1;
        goto L22
    L25:
        r25 = r1;
        r26 = r2;
        r203 = r6;
        r22 = r9;
        r282 = r10;
        r18 = r11;
        goto L26
    L27:
        long[] r252 = r1;
        long[] r262 = r2;
        if (r8 != r9) goto L43;
    L31:
        if (r5 == r3) goto L44;
        r5 = r5 + 1;
        r1 = r252;
        r2 = r262;
        goto L5
    L44:
        return;
    L43:
        return;
    L30:
        r252 = r1;
        r262 = r2;
        goto L31
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7923(C3846 r14) {
        long[] r0 = r14.f14098;
        long[] r142 = r14.f14099;
        int r1 = r142.length - 2;
        if (r1 < 0) goto L16;
        int r3 = 0;
    L5:
        long r4 = r142[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L14;
        int r6 = 8 - ((~(r3 - r1)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L13;
        if ((255 & r4) >= 128) goto L12;
        long r9 = r0[(r3 << 3) + r8];
        this.f14098[m7919(r9)] = r9;
    L12:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L13:
        if (r6 == 8) goto L14;
        return;
    L14:
        if (r3 == r1) goto L23;
        r3 = r3 + 1;
        goto L5
    L23:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7924(long r3) {
        int r0 = m7919(r3);
        this.f14098[r0] = r3;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m7925(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14095 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14099 = r0;
        int r1 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f14097 = AbstractC3848.m7929(this.f14095) - this.f14096;
        this.f14098 = new long[r102];
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
}
