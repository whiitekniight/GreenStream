package p267;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p164.AbstractC2927;

/* JADX INFO: renamed from: יـ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C3841 {

    /* JADX INFO: renamed from: ʽ */
    public long[] f14076;

    /* JADX INFO: renamed from: ˈ */
    public int f14077;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14078;

    /* JADX INFO: renamed from: ⁱˊ */
    public Object[] f14079;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14080;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14081;

    public final boolean equals(Object r19) {
        if (r19 != this) goto L6;
        return true;
    L6:
        if ((r19 instanceof C3841) == true) goto L8;
        return false;
    L8:
        C3841 r1 = (C3841) r19;
        if (r1.f14078 == this.f14078) goto L11;
        return false;
    L11:
        Object[] r3 = this.f14079;
        long[] r5 = this.f14076;
        long[] r6 = this.f14080;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L29;
        int r8 = 0;
    L14:
        long r9 = r6[r8];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r11 = 8 - ((~(r8 - r7)) >>> 31);
        int r13 = 0;
    L17:
        if (r13 >= r11) goto L26;
        if ((255 & r9) >= 128) goto L25;
        int r14 = (r8 << 3) + r13;
        Object r15 = r3[r14];
        long r16 = r5[r14];
        int r142 = r1.m7903(r15);
        if (r142 < 0) goto L24;
        if (r16 == r1.f14076[r142]) goto L25;
    L24:
        return false;
    L25:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L17
    L26:
        if (r11 != 8) goto L29;
    L27:
        if (r8 == r7) goto L29;
        r8 = r8 + 1;
    L29:
        return true;
    }

    public final int hashCode() {
        Object[] r1 = this.f14079;
        long[] r2 = this.f14076;
        long[] r3 = this.f14080;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L26;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r3[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L18;
        if ((255 & r8) >= 128) goto L16;
        int r13 = (r6 << 3) + r12;
        Object r14 = r1[r13];
        long r15 = r2[r13];
        if (r14 == null) goto L14;
        int r132 = r14.hashCode();
    L15:
        int r19 = r6;
        r7 = r7 + (((int) (r15 ^ (r15 >>> 32))) ^ r132);
    L17:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        r6 = r19;
        goto L8
    L14:
        r132 = 0;
        goto L15
    L16:
        r19 = r6;
        goto L17
    L18:
        int r192 = r6;
        if (r10 != 8) goto L21;
        int r5 = r192;
    L23:
        if (r5 == r4) goto L25;
        r6 = r5 + 1;
        goto L5
    L25:
        return r7;
    L21:
        return r7;
    L22:
        r5 = r6;
        goto L23
    L26:
        return 0;
    }

    public final String toString() {
        if (this.f14078 != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        Object[] r2 = this.f14079;
        long[] r3 = this.f14076;
        long[] r4 = this.f14080;
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
        Object r15 = r2[r14];
        int r17 = r7;
        long r6 = r3[r14];
        if (r15 != this) goto L18;
        r15 = "(this)";
    L18:
        r1.append(r15);
        r1.append("=");
        r1.append(r6);
        r8 = r8 + 1;
        if (r8 >= this.f14078) goto L22;
        r1.append(", ");
    L22:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        r7 = r17;
        goto L12
    L21:
        r17 = r7;
        goto L22
    L23:
        int r172 = r7;
        if (r11 != 8) goto L29;
        int r62 = r172;
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
    public final long m7900(String r3) {
        int r0 = m7903(r3);
        if (r0 < 0) goto L7;
        return this.f14076[r0];
    L7:
        throw new NoSuchElementException("There is no key " + r3 + " in the map");
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m7901() {
        return this.f14078;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m7902(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14077 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14080 = r0;
        int r1 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f14081 = AbstractC3848.m7929(this.f14077) - this.f14078;
        this.f14079 = new Object[r102];
        this.f14076 = new long[r102];
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

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m7903(Object r14) {
        int r0 = 0;
        if (r14 == null) goto L5;
        int r1 = r14.hashCode();
    L6:
        int r12 = r1 * (-862048943);
        int r13 = r12 ^ (r12 << 16);
        int r2 = r13 & 127;
        int r3 = this.f14077;
        int r15 = r13 >>> 7;
    L7:
        int r16 = r15 & r3;
        long[] r4 = this.f14080;
        int r5 = r16 >> 3;
        int r6 = (r16 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r2) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r63 == 0) goto L15;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r16) & r3;
        if (AbstractC2927.m6273(this.f14079[r10], r14) == true) goto L12;
        r63 = r63 & (r63 - 1);
        goto L9
    L12:
        return r10;
    L15:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r15 = r16 + r0;
        goto L7
    L16:
        return -1;
    L5:
        r1 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7904(int r10) {
        int r0 = this.f14077;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14080;
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

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m7905(String r40, long r41) {
        String r1 = r40;
        if (r1 == null) goto L5;
        int r3 = r1.hashCode();
    L6:
        int r4 = -862048943;
        int r32 = r3 * (-862048943);
        int r33 = r32 ^ (r32 << 16);
        int r5 = r33 >>> 7;
        int r34 = r33 & 127;
        int r6 = this.f14077;
        int r7 = r5 & r6;
        int r8 = 0;
    L7:
        long[] r9 = this.f14080;
        int r10 = r7 >> 3;
        int r11 = (r7 & 7) << 3;
        long r92 = ((r9[r10 + 1] << (64 - r11)) & ((-r11) >> 63)) | (r9[r10] >>> r11);
        long r112 = r34;
        int r19 = r34;
        int r15 = 0;
        long r2 = r92 ^ (r112 * 72340172838076673L);
        long r22 = (~r2) & (r2 - 72340172838076673L);
        long r13 = -9187201950435737472L;
        long r23 = r22 & (-9187201950435737472L);
    L9:
        if (r23 == 0) goto L14;
        int r17 = (r7 + (Long.numberOfTrailingZeros(r23) >> 3)) & r6;
        int r20 = r4;
        if (AbstractC2927.m6273(this.f14079[r17], r1) == true) goto L12;
        r23 = r23 & (r23 - 1);
        r4 = r20;
        goto L9
    L12:
        int r12 = r17;
    L68:
        if (r12 >= 0) goto L70;
        r12 = ~r12;
    L70:
        this.f14079[r12] = r40;
        this.f14076[r12] = r41;
        return;
    L14:
        int r202 = r4;
        if (((((~r92) << 6) & r92) & (-9187201950435737472L)) != 0) goto L16;
        r8 = r8 + 8;
        r7 = (r7 + r8) & r6;
        r1 = r40;
        r34 = r19;
        r4 = r202;
        goto L7
    L16:
        int r24 = m7904(r5);
        if (this.f14081 == 0) goto L19;
    L20:
        long r29 = 255;
        long r332 = r112;
        long r25 = 128;
    L64:
        this.f14078++;
        int r14 = this.f14081;
        long[] r35 = this.f14080;
        int r42 = r24 >> 3;
        long r52 = r35[r42];
        int r72 = (r24 & 7) << 3;
        if (((r52 >> r72) & r29) != r25) goto L67;
        r15 = 1;
    L67:
        this.f14081 = r14 - r15;
        int r16 = this.f14077;
        long r53 = (r52 & (~(r29 << r72))) | (r332 << r72);
        r35[r42] = r53;
        r35[(((r24 - 7) & r16) + (r16 & 7)) >> 3] = r53;
        r12 = ~r24;
        goto L68
    L19:
        if (((this.f14080[r24 >> 3] >> ((r24 & 7) << 3)) & 255) == 254) goto L20;
        int r26 = this.f14077;
        if (r26 <= 8) goto L51;
        r25 = 128;
        if (Long.compare((((long) this.f14078) * 32) ^ Long.MIN_VALUE, (((long) r26) * 25) ^ Long.MIN_VALUE) > 0) goto L50;
        long[] r27 = this.f14080;
        int r36 = this.f14077;
        Object[] r43 = this.f14079;
        long[] r62 = this.f14076;
        int r73 = (r36 + 7) >> 3;
        r29 = 255;
        int r82 = 0;
    L26:
        if (r82 >= r73) goto L28;
        long r102 = r27[r82] & r13;
        r27[r82] = (-72340172838076674L) & ((~r102) + (r102 >>> 7));
        r82 = r82 + 1;
        r112 = r112;
        r13 = -9187201950435737472L;
        goto L26
    L28:
        r332 = r112;
        char r93 = 7;
        int r74 = r27.length;
        int r83 = r74 - 1;
        int r75 = r74 - 2;
        long r122 = 72057594037927935L;
        r27[r75] = (r27[r75] & 72057594037927935L) | (-72057594037927936L);
        r27[r83] = r27[0];
        int r76 = 0;
    L29:
        if (r76 == r36) goto L49;
        int r84 = r76 >> 3;
        int r142 = (r76 & 7) << 3;
        long r103 = (r27[r84] >> r142) & 255;
        if (r103 == 128) goto L32;
        if (r103 != 254) goto L32;
        Object r104 = r43[r76];
        if (r104 == null) goto L39;
        int r105 = r104.hashCode();
    L40:
        int r106 = r105 * r202;
        int r107 = r106 ^ (r106 << 16);
        int r113 = r107 >>> 7;
        int r192 = m7904(r113);
        int r114 = r113 & r36;
        char r31 = r93;
        if ((((r192 - r114) & r36) / 8) != (((r76 - r114) & r36) / 8)) goto L44;
        long r37 = r122;
        r27[r84] = (((long) (r107 & 127)) << r142) | (r27[r84] & (~(255 << r142)));
        r27[r27.length - 1] = (r27[0] & r37) | Long.MIN_VALUE;
        r76 = r76 + 1;
        r93 = r31;
    L43:
        r122 = r37;
        goto L29
    L44:
        r37 = r122;
        int r94 = r192 >> 3;
        long r115 = r27[r94];
        int r132 = (r192 & 7) << 3;
        if (((r115 >> r132) & 255) != 128) goto L47;
        int r222 = r36;
        Object[] r322 = r43;
        r27[r94] = ((~(255 << r132)) & r115) | (((long) (r107 & 127)) << r132);
        r27[r84] = (r27[r84] & (~(255 << r142))) | (128 << r142);
        r322[r192] = r322[r76];
        r322[r76] = null;
        r62[r192] = r62[r76];
        r62[r76] = 0;
    L48:
        r27[r27.length - 1] = (r27[0] & r37) | Long.MIN_VALUE;
        r76 = r76 + 1;
        r36 = r222;
        r93 = r31;
        r43 = r322;
        goto L43
    L47:
        r222 = r36;
        r322 = r43;
        r27[r94] = ((~(255 << r132)) & r115) | ((r107 & 127) << r132);
        Object r38 = r322[r192];
        r322[r192] = r322[r76];
        r322[r76] = r38;
        long r39 = r62[r192];
        r62[r192] = r62[r76];
        r62[r76] = r39;
        r76 = r76 - 1;
        goto L48
    L39:
        r105 = 0;
    L32:
        r76 = r76 + 1;
        goto L29
    L49:
        this.f14081 = AbstractC3848.m7929(this.f14077) - this.f14078;
    L63:
        r24 = m7904(r5);
    L50:
        r29 = 255;
        r332 = r112;
        int r28 = AbstractC3848.m7928(this.f14077);
        long[] r310 = this.f14080;
        Object[] r44 = this.f14079;
        long[] r63 = this.f14076;
        int r77 = this.f14077;
        m7902(r28);
        long[] r210 = this.f14080;
        Object[] r85 = this.f14079;
        long[] r95 = this.f14076;
        int r108 = this.f14077;
        int r116 = 0;
    L53:
        if (r116 >= r77) goto L63;
        if (((r310[r116 >> 3] >> ((r116 & 7) << 3)) & 255) >= r25) goto L61;
        Object r123 = r44[r116];
        if (r123 == null) goto L59;
        int r133 = r123.hashCode();
    L60:
        int r134 = r133 * r202;
        int r135 = r134 ^ (r134 << 16);
        int r143 = m7904(r135 >>> 7);
        long[] r172 = r210;
        long r18 = r135 & 127;
        int r136 = r143 >> 3;
        int r182 = (r143 & 7) << 3;
        long r110 = (r172[r136] & (~(255 << r182))) | (r18 << r182);
        r172[r136] = r110;
        r172[(((r143 - 7) & r108) + (r108 & 7)) >> 3] = r110;
        r85[r143] = r123;
        r95[r143] = r63[r116];
    L62:
        r116 = r116 + 1;
        r210 = r172;
        goto L53
    L59:
        r133 = 0;
        goto L60
    L61:
        r172 = r210;
        goto L62
    L51:
        r25 = 128;
        goto L50
    L5:
        r3 = 0;
        goto L6
    }
}
