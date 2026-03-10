package p473;

import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: ﾞᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5899 implements InterfaceC5898 {

    /* JADX INFO: renamed from: ʽ */
    public static final int[] f21625 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f21626;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f21627;

    static {
        f21625 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    }

    public /* synthetic */ C5899(int r1) {
        this.f21627 = r1;
    }

    @Override // p473.InterfaceC5898
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo11563(byte[] r23, int r24, int r25) {
        switch(this.f21627) {
            case 0: goto L84;
            case 1: goto L70;
            case 2: goto L62;
            case 3: goto L52;
            case 4: goto L42;
            case 5: goto L18;
            default: goto L4;
        };
    L4:
        int r2 = (r24 + r25) - 4;
        int r3 = r24;
    L5:
        if (r3 > r2) goto L16;
        byte r4 = r23[r3];
        if (r4 != 64) goto L11;
        if ((r23[r3 + 1] & 192) != 0) goto L11;
    L14:
        ᵎ.ᵔﹳ(r23, r3, ((((ᵎ.ٴﹶ(r3, r23) + (-(((this.f21626 + r3) - r24) >>> 2))) << 9) >> 9) & 1073741823) | 1073741824);
    L15:
        r3 = r3 + 4;
    L11:
        if (r4 != 127) goto L15;
        if ((r23[r3 + 1] & 192) != 192) goto L15;
    L16:
        int r32 = r3 - r24;
        this.f21626 += r32;
        return r32;
    L18:
        int r22 = (r24 + r25) - 8;
        int r33 = r24;
    L19:
        if (r33 > r22) goto L40;
        int r42 = r23[r33];
        int r5 = r42 & 255;
        if (r5 != 239) goto L27;
        int r43 = r33 + 1;
        int r52 = r23[r43];
        if ((r52 & 13) != 0) goto L39;
        int r6 = r33 + 2;
        int r7 = r23[r6] & 255;
        int r8 = r33 + 3;
        int r9 = r23[r8] & 255;
        int r34 = ((((r52 & 240) << 13) | (r7 << 9)) | (r9 << 1)) - ((this.f21626 + r33) - r24);
        r23[r43] = (byte) ((r52 & 15) | ((r34 >>> 8) & 240));
        r23[r6] = (byte) ((((r34 >>> 16) & 15) | ((r34 >>> 7) & 16)) | ((r34 << 4) & 224));
        r23[r8] = (byte) (((r34 >>> 13) & 128) | ((r34 >>> 4) & 127));
        r33 = r6;
    L39:
        r33 = r33 + 2;
        goto L19
    L27:
        if ((r42 & 127) != 23) goto L39;
        int r44 = ((r23[r33 + 1] & 255) << 8) | r5;
        int r53 = r33 + 2;
        int r45 = (r44 | ((r23[r53] & 255) << 16)) | ((r23[r33 + 3] & 255) << 24);
        if ((r45 & 3712) == 0) goto L34;
        r53 = r33 + 4;
        int r62 = ᵎ.ﾞʻ(r53, r23);
        if ((((r45 << 8) ^ r62) & 1015811) == 3) goto L33;
    L32:
        r33 = r53;
        goto L39
    L33:
        int r46 = (r45 & (-4096)) + (r62 >>> 20);
        int r54 = (r62 << 12) | 279;
    L38:
        ᵎ.ﹳᐧ(r23, r33, r54);
        ᵎ.ﹳᐧ(r23, r33 + 4, r46);
        r33 = r33 + 6;
        goto L39
    L34:
        int r72 = r45 >>> 27;
        if (((r45 - 12544) & 16256) >= (r72 & 29)) goto L32;
        int r55 = ᵎ.ٴﹶ(r33 + 4, r23) - ((this.f21626 + r33) - r24);
        r46 = (r45 >>> 12) | (r55 << 20);
        r54 = ((r55 + 2048) & (-4096)) | (23 | (r72 << 7));
        goto L38
    L40:
        int r35 = r33 - r24;
        this.f21626 += r35;
        return r35;
    L42:
        int r26 = (r24 + r25) - 4;
        int r36 = r24;
    L43:
        if (r36 > r26) goto L50;
        if ((r23[r36] & 252) != 72) goto L49;
        if ((r23[r36 + 3] & 3) != 1) goto L49;
        ᵎ.ᵔﹳ(r23, r36, ((ᵎ.ٴﹶ(r36, r23) + (-((this.f21626 + r36) - r24))) & 67108860) | 1207959553);
    L49:
        r36 = r36 + 4;
        goto L43
    L50:
        int r37 = r36 - r24;
        this.f21626 += r37;
        return r37;
    L52:
        int r27 = (r24 + r25) - 4;
        int r38 = r24;
    L53:
        if (r38 > r27) goto L60;
        int r47 = r38 + 1;
        int r56 = r23[r47];
        if ((r56 & 248) != 240) goto L59;
        int r63 = r38 + 3;
        int r82 = r23[r63];
        if ((r82 & 248) != 248) goto L59;
        int r57 = (((r56 & 7) << 19) | ((r23[r38] & 255) << 11)) | ((r82 & 7) << 8);
        int r83 = r38 + 2;
        int r58 = ((r57 | (r23[r83] & 255)) << 1) - ((this.f21626 + r38) - r24);
        r23[r47] = (byte) (240 | ((r58 >>> 20) & 7));
        r23[r38] = (byte) (r58 >>> 12);
        r23[r63] = (byte) (((r58 >>> 9) & 7) | 248);
        r23[r83] = (byte) (r58 >>> 1);
        r38 = r83;
    L59:
        r38 = r38 + 2;
        goto L53
    L60:
        int r39 = r38 - r24;
        this.f21626 += r39;
        return r39;
    L62:
        int r28 = (r24 + r25) - 4;
        int r310 = r24;
    L63:
        if (r310 > r28) goto L68;
        if ((r23[r310 + 3] & 255) != 235) goto L67;
        int r48 = r310 + 2;
        int r64 = r310 + 1;
        int r59 = (((((r23[r48] & 255) << 16) | ((r23[r64] & 255) << 8)) | (r23[r310] & 255)) << 2) - ((this.f21626 + r310) - r24);
        r23[r48] = (byte) (r59 >>> 18);
        r23[r64] = (byte) (r59 >>> 10);
        r23[r310] = (byte) (r59 >>> 2);
    L67:
        r310 = r310 + 4;
        goto L63
    L68:
        int r311 = r310 - r24;
        this.f21626 += r311;
        return r311;
    L70:
        int r29 = (r24 + r25) - 4;
        int r312 = r24;
    L71:
        if (r312 > r29) goto L82;
        byte r49 = r23[r312 + 3];
        if ((r49 & 252) != 148) goto L76;
        ᵎ.ﹳᐧ(r23, r312, ((ᵎ.ﾞʻ(r312, r23) + (-(((this.f21626 + r312) - r24) >>> 2))) & 67108863) | (-1811939328));
    L81:
        r312 = r312 + 4;
        goto L71
    L76:
        if ((r49 & 159) != 144) goto L81;
        int r410 = ᵎ.ﾞʻ(r312, r23);
        int r510 = ((r410 >>> 29) & 3) | ((r410 >>> 3) & 2097148);
        if (((r510 + 131072) & 1835008) != 0) goto L81;
        int r511 = r510 + (-(((this.f21626 + r312) - r24) >>> 12));
        ᵎ.ﹳᐧ(r23, r312, (((r410 & (-1879048161)) | ((r511 & 3) << 29)) | ((262140 & r511) << 3)) | ((-(r511 & 131072)) & 14680064));
        goto L81
    L82:
        int r313 = r312 - r24;
        this.f21626 += r313;
        return r313;
    L84:
        char r314 = 16;
        int r210 = (r24 + r25) - 16;
        int r411 = r24;
    L85:
        if (r411 > r210) goto L106;
        int r512 = f21625[r23[r411] & 31];
        int r73 = 5;
        int r84 = 0;
    L88:
        if (r84 >= 3) goto L105;
        if (((r512 >>> r84) & 1) != 0) goto L92;
        char r252 = r314;
        int r17 = r73;
    L104:
        r84 = r84 + 1;
        r73 = r17 + 41;
        r314 = r252;
        goto L88
    L92:
        int r92 = r73 >>> 3;
        int r11 = r73 & 7;
        r252 = r314;
        long r15 = 0;
        int r14 = 0;
    L94:
        if (r14 >= 6) goto L96;
        r15 = r15 | ((((long) r23[(r411 + r92) + r14]) & 255) << (r14 * 8));
        r14 = r14 + 1;
        r73 = r73;
        goto L94
    L96:
        r17 = r73;
        long r65 = r15 >>> r11;
        if (((r65 >>> 37) & 15) != 5) goto L104;
        if (((r65 >>> 9) & 7) != 0) goto L104;
        long r10 = (((((((int) (r65 >>> 36)) & 1) << 20) | ((int) ((r65 >>> 13) & 1048575))) << 4) - ((this.f21626 + r411) - r24)) >>> 4;
        long r66 = ((((r65 & (-77309403137L)) | ((r10 & 1048575) << 13)) | ((r10 & 1048576) << r252)) << r11) | (((long) ((1 << r11) - 1)) & r15);
        int r102 = 0;
    L102:
        if (r102 >= 6) goto L104;
        r23[(r411 + r92) + r102] = (byte) (r66 >>> (r102 * 8));
        r102 = r102 + 1;
        goto L102
    L105:
        r411 = r411 + 16;
        goto L85
    L106:
        int r412 = r411 - r24;
        this.f21626 += r412;
        return r412;
    }
}
