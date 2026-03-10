package p267;

import java.util.Arrays;
import p164.AbstractC2927;
import p231.AbstractC3507;

/* JADX INFO: renamed from: יـ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C3836 {

    /* JADX INFO: renamed from: ʽ */
    public Object[] f14057;

    /* JADX INFO: renamed from: ˈ */
    public int f14058;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14059;

    /* JADX INFO: renamed from: ⁱˊ */
    public Object[] f14060;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14061;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14062;

    public /* synthetic */ C3836() {
        this(6);
    }

    public C3836(int r2) {
        this.f14061 = AbstractC3848.f14102;
        Object[] r0 = AbstractC3507.f12478;
        this.f14060 = r0;
        this.f14057 = r0;
        if (r2 < 0) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L9;
        m7889(AbstractC3848.m7927(r2));
        return;
    L9:
        AbstractC3507.m7263("Capacity must be a positive value.");
        throw null;
    L5:
        r02 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8, types: [int] */
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
        if ((r28 instanceof C3836) == true) goto L8;
        return false;
    L8:
        C3836 r1 = (C3836) r28;
        if (r1.f14059 == this.f14059) goto L11;
        return false;
    L11:
        Object[] r3 = this.f14060;
        Object[] r5 = this.f14057;
        long[] r6 = this.f14061;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L57;
        int r8 = 0;
    L14:
        long r9 = r6[r8];
        char r13 = 7;
        long r14 = -9187201950435737472L;
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L53;
        int r12 = 8;
        int r11 = 8 - ((~(r8 - r7)) >>> 31);
        boolean r16 = r2;
        ?? r22 = r4;
    L17:
        if (r22 >= r11) goto L50;
        if ((r9 & 255) >= 128) goto L48;
        int r17 = (r8 << 3) + (r22 == true ? 1 : 0);
        boolean r18 = r4;
        Object r42 = r3[r17];
        char r282 = r13;
        Object r132 = r5[r17];
        if (r132 == null) goto L23;
        ?? r222 = r22 == true ? 1 : 0;
        Object[] r26 = r5;
        long[] r23 = r6;
        int r21 = r12;
        long r19 = r14;
        Object[] r122 = r3;
        if (r132.equals(r1.m7892(r42)) == true) goto L49;
        return r18;
    L49:
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
        if (r1.m7892(r42) != null) goto L44;
        if (r42 == null) goto L26;
        ?? r133 = r42.hashCode();
    L27:
        int r134 = r133 * (-862048943);
        int r135 = r134 ^ (r134 << 16);
        r19 = r14;
        int r142 = r135 & 127;
        int r15 = r1.f14058;
        int r136 = (r135 >>> 7) & r15;
        r21 = r12;
        ?? r172 = r18;
        ?? r24 = r22;
    L28:
        long[] r123 = r1.f14061;
        int r223 = r136 >> 3;
        int r0 = (r136 & 7) << 3;
        long r232 = r123[r223] >>> r0;
        long r25 = r123[r223 + 1] << (64 - r0);
        r222 = r24;
        r122 = r3;
        long r27 = r232 | (r25 & ((-r0) >> 63));
        Object[] r02 = r5;
        r23 = r6;
        long r52 = (((long) r142) * 72340172838076673L) ^ r27;
        long r53 = ((r52 - 72340172838076673L) & (~r52)) & r19;
    L30:
        if (r53 == 0) goto L35;
        int r242 = (r136 + (Long.numberOfTrailingZeros(r53) >> 3)) & r15;
        r26 = r02;
        if (AbstractC2927.m6273(r1.f14060[r242], r42) == true) goto L38;
        r53 = r53 & (r53 - 1);
        r02 = r26;
    L38:
        if (r242 < 0) goto L40;
        boolean r03 = r16;
    L41:
        if (r03 == true) goto L49;
    L40:
        r03 = r18;
        goto L41
    L35:
        r26 = r02;
        if (((r27 & ((~r27) << 6)) & r19) != 0) goto L37;
        int r173 = r172 + 8;
        r136 = (r136 + r173) & r15;
        r3 = r122;
        r24 = r222 == true ? 1 : 0;
        r6 = r23;
        r5 = r26;
        r172 = r173;
        goto L28
    L37:
        r242 = -1;
        goto L38
    L26:
        r133 = r18;
    L44:
        return r18;
    L48:
        r222 = r22 == true ? 1 : 0;
        r18 = r4;
        r26 = r5;
        r23 = r6;
        r21 = r12;
        r282 = r13;
        r19 = r14;
        r122 = r3;
        goto L49
    L50:
        boolean r182 = r4;
        Object[] r262 = r5;
        long[] r233 = r6;
        int r04 = r12;
        Object[] r124 = r3;
        if (r11 != r04) goto L70;
    L54:
        if (r8 == r7) goto L71;
        r8 = r8 + 1;
        r3 = r124;
        r2 = r16;
        r4 = r182;
        r6 = r233;
        r5 = r262;
        goto L14
    L71:
        return r16;
    L70:
        return r16;
    L53:
        r16 = r2;
        r124 = r3;
        r182 = r4;
        r262 = r5;
        r233 = r6;
        goto L54
    L57:
        return true;
    }

    public final int hashCode() {
        Object[] r1 = this.f14060;
        Object[] r2 = this.f14057;
        long[] r3 = this.f14061;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L26;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r3[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L20;
        if ((255 & r8) >= 128) goto L19;
        int r13 = (r6 << 3) + r12;
        Object r14 = r1[r13];
        Object r132 = r2[r13];
        if (r14 == null) goto L14;
        int r142 = r14.hashCode();
    L15:
        if (r132 == null) goto L17;
        int r133 = r132.hashCode();
    L18:
        r7 = r7 + (r133 ^ r142);
        goto L19
    L17:
        r133 = 0;
        goto L18
    L14:
        r142 = 0;
    L19:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L20:
        if (r10 == 8) goto L23;
        return r7;
    L23:
        if (r6 == r4) goto L25;
        r6 = r6 + 1;
        goto L5
    L25:
        return r7;
    L26:
        return 0;
    }

    public final String toString() {
        if (this.f14059 != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        Object[] r2 = this.f14060;
        Object[] r3 = this.f14057;
        long[] r4 = this.f14061;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L28;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L25;
        if ((255 & r9) >= 128) goto L24;
        int r14 = (r7 << 3) + r13;
        Object r15 = r2[r14];
        Object r142 = r3[r14];
        if (r15 != this) goto L18;
        r15 = "(this)";
    L18:
        r1.append(r15);
        r1.append("=");
        if (r142 != this) goto L21;
        r142 = "(this)";
    L21:
        r1.append(r142);
        r8 = r8 + 1;
        if (r8 >= this.f14059) goto L24;
        r1.append(", ");
    L24:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L25:
        if (r11 != 8) goto L28;
    L26:
        if (r7 == r5) goto L28;
        r7 = r7 + 1;
    L28:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7889(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14058 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14061 = r0;
        this.f14062 = AbstractC3848.m7929(this.f14058) - this.f14059;
        Object[] r02 = AbstractC3507.f12478;
        if (r102 != 0) goto L13;
        Object[] r1 = r02;
    L14:
        this.f14060 = r1;
        if (r102 == 0) goto L18;
        r02 = new Object[r102];
    L18:
        this.f14057 = r02;
        return;
    L13:
        r1 = new Object[r102];
        goto L14
    L9:
        int r12 = ((r102 + 15) & (-8)) >> 3;
        long[] r2 = new long[r12];
        Arrays.fill(r2, 0, r12, -9187201950435737472L);
        int r03 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r2[r03] = (r2[r03] & (~r5)) | r5;
        r0 = r2;
        goto L10
    L5:
        r102 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ˈ */
    public final Object m7890(String r14) {
        int r0 = 0;
        if (r14 == null) goto L5;
        int r1 = r14.hashCode();
    L6:
        int r12 = r1 * (-862048943);
        int r13 = r12 ^ (r12 << 16);
        int r2 = r13 & 127;
        int r3 = this.f14058;
        int r15 = r13 >>> 7;
    L7:
        int r16 = r15 & r3;
        long[] r4 = this.f14061;
        int r5 = r16 >> 3;
        int r6 = (r16 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r2) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r63 == 0) goto L15;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r16) & r3;
        if (AbstractC2927.m6273(this.f14060[r10], r14) == true) goto L18;
        r63 = r63 & (r63 - 1);
    L18:
        if (r10 < 0) goto L21;
        this.f14059--;
        long[] r02 = this.f14061;
        int r17 = this.f14058;
        int r22 = r10 >> 3;
        int r32 = (r10 & 7) << 3;
        long r43 = (r02[r22] & (~(255 << r32))) | (254 << r32);
        r02[r22] = r43;
        r02[(((r10 - 7) & r17) + (r17 & 7)) >> 3] = r43;
        this.f14060[r10] = null;
        Object[] r03 = this.f14057;
        Object r18 = r03[r10];
        r03[r10] = null;
        return r18;
    L21:
        return null;
    L15:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r15 = r16 + r0;
        goto L7
    L16:
        r10 = -1;
        goto L18
    L5:
        r1 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m7891(Object r34, Object r35) {
        Object r1 = r34;
        if (r1 == null) goto L5;
        int r3 = r1.hashCode();
    L6:
        int r4 = -862048943;
        int r32 = r3 * (-862048943);
        int r33 = r32 ^ (r32 << 16);
        int r5 = r33 >>> 7;
        int r36 = r33 & 127;
        int r6 = this.f14058;
        int r7 = r5 & r6;
        int r8 = 0;
    L7:
        long[] r9 = this.f14061;
        int r10 = r7 >> 3;
        int r11 = (r7 & 7) << 3;
        long r92 = ((r9[r10 + 1] << (64 - r11)) & ((-r11) >> 63)) | (r9[r10] >>> r11);
        long r112 = r36;
        int r19 = r36;
        int r15 = 0;
        long r2 = r92 ^ (r112 * 72340172838076673L);
        long r22 = (~r2) & (r2 - 72340172838076673L);
        long r13 = -9187201950435737472L;
        long r23 = r22 & (-9187201950435737472L);
    L9:
        if (r23 == 0) goto L14;
        int r17 = (r7 + (Long.numberOfTrailingZeros(r23) >> 3)) & r6;
        int r20 = r4;
        if (AbstractC2927.m6273(this.f14060[r17], r1) == true) goto L12;
        r23 = r23 & (r23 - 1);
        r4 = r20;
        goto L9
    L12:
        int r12 = r17;
    L67:
        if (r12 >= 0) goto L69;
        r12 = ~r12;
    L69:
        this.f14060[r12] = r34;
        this.f14057[r12] = r35;
        return;
    L14:
        int r202 = r4;
        if (((((~r92) << 6) & r92) & (-9187201950435737472L)) != 0) goto L16;
        r8 = r8 + 8;
        r7 = (r7 + r8) & r6;
        r1 = r34;
        r36 = r19;
        r4 = r202;
        goto L7
    L16:
        int r24 = m7893(r5);
        if (this.f14062 == 0) goto L19;
    L20:
        long r232 = 255;
        long r27 = r112;
        long r18 = 128;
    L63:
        this.f14059++;
        int r14 = this.f14062;
        long[] r37 = this.f14061;
        int r42 = r24 >> 3;
        long r52 = r37[r42];
        int r72 = (r24 & 7) << 3;
        if (((r52 >> r72) & r232) != r18) goto L66;
        r15 = 1;
    L66:
        this.f14062 = r14 - r15;
        int r16 = this.f14058;
        long r53 = (r52 & (~(r232 << r72))) | (r27 << r72);
        r37[r42] = r53;
        r37[(((r24 - 7) & r16) + (r16 & 7)) >> 3] = r53;
        r12 = ~r24;
        goto L67
    L19:
        if (((this.f14061[r24 >> 3] >> ((r24 & 7) << 3)) & 255) == 254) goto L20;
        int r25 = this.f14058;
        if (r25 <= 8) goto L50;
        r18 = 128;
        if (Long.compare((((long) this.f14059) * 32) ^ Long.MIN_VALUE, (((long) r25) * 25) ^ Long.MIN_VALUE) > 0) goto L49;
        long[] r26 = this.f14061;
        int r38 = this.f14058;
        Object[] r43 = this.f14060;
        Object[] r62 = this.f14057;
        int r73 = (r38 + 7) >> 3;
        r232 = 255;
        int r82 = 0;
    L26:
        if (r82 >= r73) goto L28;
        long r102 = r26[r82] & r13;
        r26[r82] = (-72340172838076674L) & ((~r102) + (r102 >>> 7));
        r82 = r82 + 1;
        r112 = r112;
        r13 = -9187201950435737472L;
        goto L26
    L28:
        r27 = r112;
        char r93 = 7;
        int r74 = r26.length;
        int r83 = r74 - 1;
        int r75 = r74 - 2;
        r26[r75] = (r26[r75] & 72057594037927935L) | (-72057594037927936L);
        r26[r83] = r26[0];
        int r76 = 0;
    L29:
        if (r76 == r38) goto L48;
        int r84 = r76 >> 3;
        int r122 = (r76 & 7) << 3;
        long r103 = (r26[r84] >> r122) & 255;
        if (r103 == 128) goto L32;
        if (r103 != 254) goto L32;
        Object r104 = r43[r76];
        if (r104 == null) goto L39;
        int r105 = r104.hashCode();
    L40:
        int r106 = r105 * r202;
        int r107 = r106 ^ (r106 << 16);
        int r113 = r107 >>> 7;
        int r132 = m7893(r113);
        int r114 = r113 & r38;
        if ((((r132 - r114) & r38) / 8) == (((r76 - r114) & r38) / 8)) goto L42;
        char r252 = r93;
        int r94 = r132 >> 3;
        long r29 = r26[r94];
        int r115 = (r132 & 7) << 3;
        if (((r29 >> r115) & 255) != 128) goto L46;
        int r142 = r38;
        Object[] r262 = r43;
        r26[r94] = (r29 & (~(255 << r115))) | (((long) (r107 & 127)) << r115);
        r26[r84] = (r26[r84] & (~(255 << r122))) | (128 << r122);
        r262[r132] = r262[r76];
        r262[r76] = null;
        r62[r132] = r62[r76];
        r62[r76] = null;
    L47:
        r26[r26.length - 1] = r26[0];
        r76 = r76 + 1;
        r38 = r142;
        r93 = r252;
        r43 = r262;
        goto L29
    L46:
        r142 = r38;
        r262 = r43;
        r26[r94] = (r29 & (~(255 << r115))) | ((r107 & 127) << r115);
        Object r39 = r262[r132];
        r262[r132] = r262[r76];
        r262[r76] = r39;
        Object r310 = r62[r132];
        r62[r132] = r62[r76];
        r62[r76] = r310;
        r76 = r76 - 1;
        goto L47
    L42:
        r26[r84] = ((~(255 << r122)) & r26[r84]) | (((long) (r107 & 127)) << r122);
        r26[r26.length - 1] = r26[0];
        r76 = r76 + 1;
        r93 = r93;
        goto L29
    L39:
        r105 = 0;
    L32:
        r76 = r76 + 1;
        goto L29
    L48:
        this.f14062 = AbstractC3848.m7929(this.f14058) - this.f14059;
    L62:
        r24 = m7893(r5);
    L49:
        r232 = 255;
        r27 = r112;
        int r28 = AbstractC3848.m7928(this.f14058);
        long[] r311 = this.f14061;
        Object[] r44 = this.f14060;
        Object[] r63 = this.f14057;
        int r77 = this.f14058;
        m7889(r28);
        long[] r210 = this.f14061;
        Object[] r85 = this.f14060;
        Object[] r95 = this.f14057;
        int r108 = this.f14058;
        int r116 = 0;
    L52:
        if (r116 >= r77) goto L62;
        if (((r311[r116 >> 3] >> ((r116 & 7) << 3)) & 255) >= r18) goto L60;
        Object r123 = r44[r116];
        if (r123 == null) goto L58;
        int r133 = r123.hashCode();
    L59:
        int r134 = r133 * r202;
        int r135 = r134 ^ (r134 << 16);
        int r143 = m7893(r135 >>> 7);
        long[] r172 = r210;
        long r110 = r135 & 127;
        int r136 = r143 >> 3;
        int r21 = (r143 & 7) << 3;
        long r111 = (r172[r136] & (~(255 << r21))) | (r110 << r21);
        r172[r136] = r111;
        r172[(((r143 - 7) & r108) + (r108 & 7)) >> 3] = r111;
        r85[r143] = r123;
        r95[r143] = r63[r116];
    L61:
        r116 = r116 + 1;
        r210 = r172;
        goto L52
    L58:
        r133 = 0;
        goto L59
    L60:
        r172 = r210;
        goto L61
    L50:
        r18 = 128;
        goto L49
    L5:
        r3 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object m7892(Object r14) {
        int r0 = 0;
        if (r14 == null) goto L5;
        int r1 = r14.hashCode();
    L6:
        int r12 = r1 * (-862048943);
        int r13 = r12 ^ (r12 << 16);
        int r2 = r13 & 127;
        int r3 = this.f14058;
        int r15 = r13 >>> 7;
    L7:
        int r16 = r15 & r3;
        long[] r4 = this.f14061;
        int r5 = r16 >> 3;
        int r6 = (r16 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r2) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L9:
        if (r63 == 0) goto L15;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r16) & r3;
        if (AbstractC2927.m6273(this.f14060[r10], r14) == true) goto L17;
        r63 = r63 & (r63 - 1);
    L17:
        if (r10 >= 0) goto L19;
        return null;
    L19:
        return this.f14057[r10];
    L15:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L16;
        r0 = r0 + 8;
        r15 = r16 + r0;
        goto L7
    L16:
        r10 = -1;
        goto L17
    L5:
        r1 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7893(int r10) {
        int r0 = this.f14058;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14061;
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
