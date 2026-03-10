package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˑʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0377 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int f2050 = 0;

    static {
        if (AbstractC0504.f2283 == true) goto L5;
        return;
    L5:
        if (AbstractC0504.f2282 == false) goto L9;
        int r0 = AbstractC0242.f1739;
        return;
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m1779(String r8, byte[] r9, int r10, int r11) {
        int r0 = r8.length();
        int r1 = 0;
    L3:
        int r2 = r10 + r11;
        if (r1 >= r0) goto L10;
        int r4 = r1 + r10;
        if (r4 >= r2) goto L10;
        char r5 = r8.charAt(r1);
        if (r5 >= '\u0080') goto L10;
        r9[r4] = (byte) r5;
        r1 = r1 + 1;
    L10:
        if (r1 == r0) goto L12;
        int r102 = r10 + r1;
    L14:
        if (r1 >= r0) goto L51;
        char r112 = r8.charAt(r1);
        if (r112 >= '\u0080') goto L20;
        if (r102 >= r2) goto L20;
        r9[r102] = (byte) r112;
        r102 = r102 + 1;
    L37:
        r1 = r1 + 1;
    L20:
        if (r112 >= '\u0800') goto L25;
        if (r102 > (r2 - 2)) goto L25;
        r9[r102] = (byte) ((r112 >>> 6) | 960);
        r9[r102 + 1] = (byte) ((r112 & '?') | 128);
        r102 = r102 + 2;
    L25:
        if (r112 < '\ud800') goto L28;
        if (r112 > '\udfff') goto L28;
    L31:
        if (r102 > (r2 - 4)) goto L41;
        int r42 = r1 + 1;
        if (r42 == r8.length()) goto L40;
        char r12 = r8.charAt(r42);
        if (Character.isSurrogatePair(r112, r12) == false) goto L38;
        int r7 = r102 + 3;
        int r113 = Character.toCodePoint(r112, r12);
        r9[r102] = (byte) ((r113 >>> 18) | 240);
        r9[r102 + 1] = (byte) (((r113 >>> 12) & 63) | 128);
        r9[r102 + 2] = (byte) (((r113 >>> 6) & 63) | 128);
        r102 = r102 + 4;
        r9[r7] = (byte) ((r113 & 63) | 128);
        r1 = r42;
        goto L37
    L38:
        r1 = r42;
    L40:
        throw new C0301(r1 - 1, r0);
    L41:
        if (r112 < '\ud800') goto L49;
        if (r112 > '\udfff') goto L49;
        int r92 = r1 + 1;
        if (r92 == r8.length()) goto L48;
        if (Character.isSurrogatePair(r112, r8.charAt(r92)) == true) goto L49;
    L48:
        throw new C0301(r1, r0);
    L49:
        StringBuilder r13 = new StringBuilder((String.valueOf(r112).length() + 25) + String.valueOf(r102).length());
        r13.append("Failed writing ");
        r13.append(r112);
        r13.append(" at index ");
        r13.append(r102);
        throw new ArrayIndexOutOfBoundsException(r13.toString());
    L28:
        if (r102 > (r2 - 3)) goto L31;
        r9[r102] = (byte) ((r112 >>> '\f') | 480);
        r9[r102 + 1] = (byte) (((r112 >>> 6) & 63) | 128);
        r9[r102 + 2] = (byte) ((r112 & '?') | 128);
        r102 = r102 + 3;
        goto L37
    L51:
        return r102;
    L12:
        return r10 + r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public static /* synthetic */ int m1780(byte[] r5, int r6, int r7) {
        int r72 = r7 - r6;
        byte r0 = r5[r6 - 1];
        if (r72 != 0) goto L5;
        if (r0 > (-12)) goto L29;
        return r0;
    L29:
        return -1;
    L5:
        if (r72 != 1) goto L7;
        byte r52 = r5[r6];
        if (r0 > (-12)) goto L28;
        if (r52 <= (-65)) goto L22;
        return -1;
    L22:
        return (r52 << 8) ^ r0;
    L28:
        return -1;
    L7:
        if (r72 != 2) goto L16;
        byte r73 = r5[r6];
        byte r53 = r5[r6 + 1];
        if (r0 > (-12)) goto L25;
        if (r73 > (-65)) goto L27;
        if (r53 <= (-65)) goto L14;
        return -1;
    L14:
        return (r53 << 16) ^ ((r73 << 8) ^ r0);
    L27:
        return -1;
    L25:
        return -1;
    L16:
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m1781(String r8) {
        int r0 = r8.length();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        if (r8.charAt(r2) >= '\u0080') goto L7;
        r2 = r2 + 1;
    L7:
        int r3 = r0;
    L8:
        if (r2 >= r0) goto L28;
        char r4 = r8.charAt(r2);
        if (r4 >= '\u0800') goto L12;
        r3 = r3 + (('\u007f' - r4) >>> 31);
        r2 = r2 + 1;
        goto L8
    L12:
        int r42 = r8.length();
    L13:
        if (r2 >= r42) goto L27;
        char r6 = r8.charAt(r2);
        if (r6 >= '\u0800') goto L17;
        r1 = r1 + (('\u007f' - r6) >>> 31);
    L26:
        r2 = r2 + 1;
        goto L13
    L17:
        r1 = r1 + 2;
        if (r6 < '\ud800') goto L26;
        if (r6 > '\udfff') goto L26;
        if (Character.codePointAt(r8, r2) < 65536) goto L25;
        r2 = r2 + 1;
        goto L26
    L25:
        throw new C0301(r2, r42);
    L27:
        r3 = r3 + r1;
    L28:
        if (r3 < r0) goto L30;
        return r3;
    L30:
        long r02 = ((long) r3) + 4294967296L;
        StringBuilder r32 = new StringBuilder(String.valueOf(r02).length() + 34);
        r32.append("UTF-8 length does not fit in int: ");
        r32.append(r02);
        throw new IllegalArgumentException(r32.toString());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m1782(byte[] r6, int r7, int r8) {
    L2:
        if (r7 >= r8) goto L6;
        if (r6[r7] < 0) goto L6;
        r7 = r7 + 1;
    L6:
        if (r7 >= r8) goto L92;
    L8:
        if (r7 >= r8) goto L93;
        int r0 = r7 + 1;
        int r1 = r6[r7];
        if (r1 < 0) goto L12;
        r7 = r0;
        goto L8
    L12:
        if (r1 < (-32)) goto L13;
        if (r1 < (-16)) goto L23;
        if (r0 >= (r8 - 2)) goto L38;
        int r2 = r7 + 2;
        byte r02 = r6[r0];
        if (r02 > (-65)) goto L88;
        if ((((r02 + 112) + (r1 << 28)) >> 30) != 0) goto L89;
        int r03 = r7 + 3;
        if (r6[r2] > (-65)) goto L90;
        r7 = r7 + 4;
        if (r6[r03] <= (-65)) goto L8;
        return false;
    L90:
        return false;
    L89:
        return false;
    L88:
        return false;
    L38:
        r1 = m1780(r6, r0, r8);
    L39:
        if (r1 != 0) goto L50;
        return true;
    L50:
        return false;
    L23:
        if (r0 >= (r8 - 1)) goto L24;
        int r4 = r7 + 2;
        byte r04 = r6[r0];
        if (r04 > (-65)) goto L86;
        if (r1 != (-32)) goto L31;
        if (r04 >= (-96)) goto L31;
        return false;
    L31:
        if (r1 != (-19)) goto L33;
        if (r04 < (-96)) goto L33;
        return false;
    L33:
        r7 = r7 + 3;
        if (r6[r4] <= (-65)) goto L8;
        return false;
    L86:
        return false;
    L24:
        r1 = m1780(r6, r0, r8);
        goto L39
    L13:
        if (r0 >= r8) goto L39;
        if (r1 < (-62)) goto L82;
        r7 = r7 + 2;
        if (r6[r0] <= (-65)) goto L8;
        return false;
    L82:
        return false;
    L93:
        return true;
    L92:
        return true;
    }
}
