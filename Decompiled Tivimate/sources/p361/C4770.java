package p361;

import android.graphics.Path;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ᵎⁱ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4770 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final float[] f16813;

    /* JADX INFO: renamed from: ﹳٴ */
    public char f16814;

    public C4770(char r1, float[] r2) {
        this.f16814 = r1;
        this.f16813 = r2;
    }

    public C4770(C4770 r2) {
        this.f16814 = r2.f16814;
        float[] r22 = r2.f16813;
        this.f16813 = ˊʻ.ᵔᵢ(r22, r22.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ⁱˊ */
    public static void m9390(C4770[] r33, Path r34) {
        C4770[] r0 = r33;
        Path r1 = r34;
        float[] r12 = new float[6];
        int r13 = r0.length;
        int r15 = 0;
        int r8 = 0;
        char r2 = 'm';
    L3:
        if (r8 >= r13) goto L142;
        C4770 r9 = r0[r8];
        char r10 = r9.f16814;
        float[] r3 = r9.f16813;
        float r4 = r12[r15];
        float r5 = r12[1];
        float r6 = r12[2];
        float r7 = r12[3];
        float r11 = r12[4];
        int r21 = r15;
        float r152 = r12[5];
        switch(r10) {
            case 65: goto L11;
            case 67: goto L10;
            case 72: goto L9;
            case 81: goto L8;
            case 83: goto L8;
            case 86: goto L9;
            case 90: goto L7;
            case 97: goto L11;
            case 99: goto L10;
            case 104: goto L9;
            case 113: goto L8;
            case 115: goto L8;
            case 118: goto L9;
            case 122: goto L7;
            default: goto L6;
        };
    L6:
        int r22 = 2;
    L12:
        float r23 = r11;
        float r24 = r152;
        float r112 = r4;
        float r153 = r5;
        int r42 = r21;
    L14:
        if (r42 >= r3.length) goto L141;
        if (r10 != 'A') goto L18;
        float[] r25 = r3;
        int r30 = r42;
        C4770 r02 = r9;
        float r26 = r112;
        float r32 = r153;
        int r154 = r8;
        char r113 = r10;
        int r14 = r30 + 5;
        float r43 = r25[r14];
        int r27 = r30 + 6;
        float r52 = r25[r27];
        float r62 = r25[r30];
        float r72 = r25[r30 + 1];
        float r82 = r25[r30 + 2];
        if (r25[r30 + 3] == 0.0f) goto L133;
        boolean r92 = 1;
    L135:
        if (r25[r30 + 4] == 0.0f) goto L138;
        boolean r102 = 1;
    L139:
        m9391(r34, r26, r32, r43, r52, r62, r72, r82, r92, r102);
        r6 = r25[r14];
        float r35 = r25[r27];
        r7 = r35;
        float r28 = r6;
    L140:
        r42 = r30 + r22;
        r1 = r34;
        r9 = r02;
        r10 = r113;
        r8 = r154;
        r112 = r28;
        r153 = r35;
        r2 = r10;
        r3 = r25;
        goto L14
    L138:
        r102 = r21;
        goto L139
    L133:
        r92 = r21;
        goto L135
    L18:
        if (r10 != 'C') goto L20;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r113 = r10;
        int r83 = r30 + 2;
        int r93 = r30 + 3;
        int r103 = r30 + 4;
        int r142 = r30 + 5;
        r1.cubicTo(r25[r30], r25[r30 + 1], r25[r83], r25[r93], r25[r103], r25[r142]);
        float r16 = r25[r103];
        float r29 = r25[r142];
        r6 = r25[r83];
        r7 = r25[r93];
        r35 = r29;
        r28 = r16;
        goto L140
    L20:
        if (r10 != 'H') goto L22;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r113 = r10;
        r35 = r153;
        r154 = r8;
        r1.lineTo(r25[r30], r35);
        r28 = r25[r30];
        goto L140
    L22:
        if (r10 != 'Q') goto L24;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r113 = r10;
        int r44 = r30 + 1;
        int r53 = r30 + 2;
        int r73 = r30 + 3;
        r1.quadTo(r25[r30], r25[r44], r25[r53], r25[r73]);
        float r210 = r25[r30];
        float r36 = r25[r44];
        float r45 = r25[r53];
        float r54 = r25[r73];
        r6 = r210;
        r7 = r36;
        r28 = r45;
        r35 = r54;
        goto L140
    L24:
        if (r10 != 'V') goto L26;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r28 = r112;
        r113 = r10;
        r1.lineTo(r28, r25[r30]);
        r35 = r25[r30];
        goto L140
    L26:
        if (r10 != 'a') goto L28;
        r25 = r3;
        r30 = r42;
        int r143 = r30 + 5;
        float r46 = r25[r143] + r112;
        int r272 = r30 + 6;
        float r55 = r25[r272] + r153;
        float r63 = r25[r30];
        float r74 = r25[r30 + 1];
        float r17 = r25[r30 + 2];
        if (r25[r30 + 3] == 0.0f) goto L119;
        C4770 r211 = r9;
        boolean r94 = 1;
    L120:
        r02 = r211;
        float r212 = r112;
        r113 = r10;
        if (r25[r30 + 4] == 0.0f) goto L124;
        boolean r104 = 1;
    L123:
        float r37 = r153;
        r154 = r8;
        m9391(r34, r212, r37, r46, r55, r63, r74, r17, r94, r104);
        r28 = r212 + r25[r143];
        r35 = r37 + r25[r272];
        r6 = r28;
        r7 = r35;
        goto L140
    L124:
        r104 = r21;
        goto L123
    L119:
        r211 = r9;
        r94 = r21;
        goto L120
    L28:
        if (r10 != 'c') goto L30;
        r25 = r3;
        r30 = r42;
        int r144 = r30 + 2;
        int r262 = r30 + 3;
        int r273 = r30 + 4;
        int r282 = r30 + 5;
        r1.rCubicTo(r25[r30], r25[r30 + 1], r25[r144], r25[r262], r25[r273], r25[r282]);
        float r18 = r25[r144] + r112;
        float r213 = r25[r262] + r153;
        r112 = r112 + r25[r273];
        r153 = r153 + r25[r282];
        r6 = r18;
        r7 = r213;
    L78:
        r02 = r9;
        r28 = r112;
        r35 = r153;
    L52:
        r154 = r8;
    L53:
        r113 = r10;
        goto L140
    L30:
        if (r10 != 'h') goto L32;
        r25 = r3;
        r30 = r42;
        r1.rLineTo(r25[r30], 0.0f);
        r112 = r112 + r25[r30];
        goto L78
    L32:
        if (r10 != 'q') goto L34;
        r25 = r3;
        r30 = r42;
        int r47 = r30 + 1;
        int r56 = r30 + 2;
        int r75 = r30 + 3;
        r1.rQuadTo(r25[r30], r25[r47], r25[r56], r25[r75]);
        float r214 = r25[r30] + r112;
        float r38 = r25[r47] + r153;
        r112 = r112 + r25[r56];
        float r48 = r25[r75];
    L77:
        r153 = r153 + r48;
        r6 = r214;
        r7 = r38;
        goto L78
    L34:
        if (r10 != 'v') goto L36;
        r25 = r3;
        r30 = r42;
        r1.rLineTo(0.0f, r25[r30]);
        float r215 = r25[r30];
    L84:
        r153 = r153 + r215;
        goto L78
    L36:
        if (r10 != 'L') goto L38;
        r25 = r3;
        r30 = r42;
        int r49 = r30 + 1;
        r1.lineTo(r25[r30], r25[r49]);
        r28 = r25[r30];
        r35 = r25[r49];
    L106:
        r154 = r8;
        r02 = r9;
        goto L53
    L38:
        if (r10 != 'M') goto L40;
        r25 = r3;
        r30 = r42;
        r28 = r25[r30];
        r35 = r25[r30 + 1];
        if (r30 <= 0) goto L110;
        r1.lineTo(r28, r35);
        goto L106
    L110:
        r1.moveTo(r28, r35);
        r23 = r28;
        r24 = r35;
        goto L106
    L40:
        if (r10 != 'S') goto L42;
        r25 = r3;
        r30 = r42;
        if (r2 == 'c') goto L104;
        if (r2 == 's') goto L104;
        if (r2 == 'C') goto L104;
        if (r2 == 'S') goto L104;
    L103:
        float r216 = r112;
        float r39 = r153;
        int r114 = r30 + 1;
        int r145 = r30 + 2;
        int r155 = r30 + 3;
        r1.cubicTo(r216, r39, r25[r30], r25[r114], r25[r145], r25[r155]);
        float r217 = r25[r30];
        float r310 = r25[r114];
        r6 = r217;
        r7 = r310;
        r28 = r25[r145];
        r35 = r25[r155];
    L104:
        r112 = (r112 * 2.0f) - r6;
        r153 = (r153 * 2.0f) - r7;
        goto L103
    L42:
        if (r10 != 'T') goto L44;
        r25 = r3;
        r30 = r42;
        if (r2 != 'q') goto L88;
    L93:
        r112 = (r112 * 2.0f) - r6;
        r153 = (r153 * 2.0f) - r7;
    L94:
        int r410 = r30 + 1;
        r1.quadTo(r112, r153, r25[r30], r25[r410]);
        r28 = r25[r30];
        r35 = r25[r410];
        r02 = r9;
        r6 = r112;
        r7 = r153;
        goto L52
    L88:
        if (r2 == 't') goto L93;
        if (r2 == 'Q') goto L93;
        if (r2 != 'T') goto L94;
    L44:
        if (r10 != 'l') goto L46;
        r25 = r3;
        r30 = r42;
        int r411 = r30 + 1;
        r1.rLineTo(r25[r30], r25[r411]);
        r112 = r112 + r25[r30];
        r215 = r25[r411];
        goto L84
    L46:
        if (r10 == 'm') goto L79;
        if (r10 == 's') goto L66;
        if (r10 == 't') goto L55;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r28 = r112;
    L51:
        r35 = r153;
        goto L52
    L55:
        if (r2 == 'q') goto L63;
        if (r2 == 't') goto L63;
        if (r2 == 'Q') goto L63;
        if (r2 == 'T') goto L63;
        float r218 = 0.0f;
        float r146 = 0.0f;
    L64:
        int r64 = r42 + 1;
        r1.rQuadTo(r146, r218, r3[r42], r3[r64]);
        float r147 = r146 + r112;
        float r219 = r218 + r153;
        float r115 = r112 + r3[r42];
        r153 = r153 + r3[r64];
        r7 = r219;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r28 = r115;
        r6 = r147;
    L63:
        r146 = r112 - r6;
        r218 = r153 - r7;
        goto L64
    L66:
        if (r2 == 'c') goto L75;
        if (r2 == 's') goto L75;
        if (r2 == 'C') goto L75;
        if (r2 == 'S') goto L75;
        float r220 = 0.0f;
        float r148 = 0.0f;
    L74:
        int r57 = r42;
        int r263 = r57 + 1;
        int r274 = r57 + 2;
        int r283 = r57 + 3;
        r25 = r3;
        r30 = r57;
        r1.rCubicTo(r220, r148, r3[r57], r3[r263], r3[r274], r3[r283]);
        r214 = r25[r30] + r112;
        r38 = r25[r263] + r153;
        r112 = r112 + r25[r274];
        r48 = r25[r283];
    L75:
        r148 = r153 - r7;
        r220 = r112 - r6;
        goto L74
    L79:
        r25 = r3;
        r30 = r42;
        float r221 = r25[r30];
        r112 = r112 + r221;
        float r311 = r25[r30 + 1];
        r153 = r153 + r311;
        if (r30 <= 0) goto L82;
        r1.rLineTo(r221, r311);
        goto L78
    L82:
        r1.rMoveTo(r221, r311);
        r02 = r9;
        r28 = r112;
        r23 = r28;
        r35 = r153;
        r24 = r35;
        goto L52
    L141:
        r12[r21] = r112;
        r12[1] = r153;
        r12[2] = r6;
        r12[3] = r7;
        r12[4] = r23;
        r12[5] = r24;
        r2 = r9.f16814;
        r8 = r8 + 1;
        r0 = r33;
        r1 = r34;
        r15 = r21;
        goto L3
    L7:
        r1.close();
        r1.moveTo(r11, r152);
        r4 = r11;
        r6 = r4;
        r5 = r152;
        r7 = r5;
        goto L6
    L8:
        r22 = 4;
        goto L12
    L9:
        r22 = 1;
        goto L12
    L10:
        r22 = 6;
        goto L12
    L11:
        r22 = 7;
        goto L12
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m9391(Path r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, boolean r62, boolean r63) {
        double r4 = Math.toRadians(r61);
        double r8 = Math.cos(r4);
        double r10 = Math.sin(r4);
        double r12 = r55;
        double r42 = r56;
        double r14 = r59;
        double r18 = ((r42 * r10) + (r12 * r8)) / r14;
        double r0 = r60;
        double r20 = ((r42 * r8) + (((double) (-r55)) * r10)) / r0;
        double r1 = r58;
        double r26 = ((r1 * r10) + (((double) r57) * r8)) / r14;
        double r24 = ((r1 * r8) + (((double) (-r57)) * r10)) / r0;
        double r02 = r18 - r26;
        double r28 = r20 - r24;
        double r30 = (r18 + r26) / 2.0d;
        double r34 = (r20 + r24) / 2.0d;
        double r03 = (r28 * r28) + (r02 * r02);
        if (r03 == 0.0d) goto L5;
        double r422 = (1.0d / r03) - 0.25d;
        if (r422 >= 0.0d) goto L10;
        String r04 = "Points are too far apart " + r03;
        float r05 = (float) (Math.sqrt(r03) / 1.99999d);
        m9391(r54, r55, r56, r57, r58, r59 * r05, r05 * r60, r61, r62, r63);
        return;
    L10:
        double r13 = Math.sqrt(r422);
        double r6 = r13 * r02;
        double r15 = r13 * r28;
        if (r62 != r63) goto L13;
        double r302 = r30 - r15;
        double r342 = r34 + r6;
    L14:
        double r16 = Math.atan2(r20 - r342, r18 - r302);
        double r17 = Math.atan2(r24 - r342, r26 - r302) - r16;
        if (r17 < 0.0d) goto L17;
        boolean r7 = true;
    L18:
        if (r63 != r7) goto L20;
    L23:
        double r303 = r302 * r14;
        double r343 = r342 * r0;
        double r182 = (r303 * r8) - (r343 * r10);
        double r344 = (r343 * r8) + (r303 * r10);
        int r06 = (int) Math.ceil(Math.abs((r17 * 4.0d) / 3.141592653589793d));
        double r9 = Math.cos(r4);
        double r162 = Math.sin(r4);
        double r202 = Math.cos(r16);
        double r242 = Math.sin(r16);
        double r64 = -r14;
        double r262 = r64 * r9;
        double r304 = r0 * r162;
        double r282 = (r262 * r242) - (r304 * r202);
        double r65 = r64 * r162;
        double r22 = r0 * r9;
        double r19 = r17 / ((double) r06);
        double r243 = (r202 * r22) + (r242 * r65);
        double r203 = r12;
        double r11 = r42;
        int r5 = 0;
        double r3 = r16;
    L24:
        if (r5 >= r06) goto L26;
        double r36 = r3 + r19;
        double r40 = Math.sin(r36);
        double r423 = Math.cos(r36);
        int r82 = r06;
        double r07 = (((r14 * r9) * r423) + r182) - (r304 * r40);
        double r2 = (r22 * r40) + (((r14 * r162) * r423) + r344);
        double r44 = (r262 * r40) - (r304 * r423);
        double r402 = (r423 * r22) + (r40 * r65);
        double r424 = r36 - r3;
        double r46 = Math.tan(r424 / 2.0d);
        double r462 = ((Math.sqrt(((r46 * 3.0d) * r46) + 4.0d) - 1.0d) * Math.sin(r424)) / 3.0d;
        double r112 = (r243 * r462) + r11;
        double r244 = r65;
        r54.rLineTo(0.0f, 0.0f);
        r54.cubicTo((float) ((r282 * r462) + r203), (float) r112, (float) (r07 - (r462 * r44)), (float) (r2 - (r462 * r402)), (float) r07, (float) r2);
        r5 = r5 + 1;
        r11 = r2;
        r9 = r9;
        r65 = r244;
        r3 = r36;
        r243 = r402;
        r203 = r07;
        r06 = r82;
        r282 = r44;
        r19 = r19;
        goto L24
    L26:
        return;
    L20:
        if (r17 <= 0.0d) goto L22;
        r17 = r17 - 6.283185307179586d;
        goto L23
    L22:
        r17 = r17 + 6.283185307179586d;
        goto L23
    L17:
        r7 = false;
        goto L18
    L13:
        r302 = r30 + r15;
        r342 = r34 - r6;
        goto L14
    }
}
