package p161;

import com.google.android.gms.internal.measurement.ˏʻ;
import p005j$.util.Objects;
import p229.AbstractC3496;
import p319.AbstractC4223;

/* JADX INFO: renamed from: ˉﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2898 extends ˏʻ {

    /* JADX INFO: renamed from: ʼˎ */
    public static final char[] f10282 = null;

    /* JADX INFO: renamed from: ˆʾ */
    public static final char[] f10283 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean f10284;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean[] f10285;

    static {
        f10282 = new char[]{'+'};
        f10283 = "0123456789ABCDEF".toCharArray();
    }

    public C2898(String r5, boolean r6) {
        if (r5.matches(".*[0-9A-Za-z].*") == true) goto L20;
        String r52 = r5.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (r6 == true) goto L7;
    L11:
        this.f10284 = r6;
        char[] r53 = r52.toCharArray();
        int r62 = r53.length;
        int r0 = -1;
        int r1 = 0;
        int r2 = 0;
    L12:
        if (r2 >= r62) goto L14;
        r0 = Math.max(r53[r2], r0);
        r2 = r2 + 1;
        goto L12
    L14:
        boolean[] r02 = new boolean[r0 + 1];
        int r22 = r53.length;
    L15:
        if (r1 >= r22) goto L17;
        r02[r53[r1]] = true;
        r1 = r1 + 1;
        goto L15
    L17:
        this.f10285 = r02;
        return;
    L7:
        if (r52.contains(" ") == false) goto L11;
        throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
    L20:
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    /* JADX INFO: renamed from: ʿᵢ */
    public final String m6229(String r26) {
        r26.getClass();
        int r2 = r26.length();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L117;
        char r5 = r26.charAt(r4);
        boolean[] r6 = this.f10285;
        if (r5 >= r6.length) goto L10;
        if (r6[r5] == false) goto L10;
        r4 = r4 + 1;
    L10:
        int r22 = r26.length();
        char[] r52 = (char[]) AbstractC3496.f12456.get();
        Objects.requireNonNull(r52);
        int r7 = 0;
        int r8 = 0;
    L12:
        if (r4 >= r22) goto L89;
        if (r4 >= r22) goto L88;
        int r10 = r4 + 1;
        char r11 = r26.charAt(r4);
        if (r11 >= '\ud800') goto L17;
    L18:
        int r16 = 0;
        int r112 = r11;
    L30:
        if (r112 < 0) goto L86;
        if (r112 < r6.length) goto L34;
    L37:
        if (r112 == 32) goto L39;
    L41:
        char[] r14 = f10283;
        int r17 = 1;
        if (r112 > 127) goto L45;
        char[] r3 = new char[3];
        r3[r16] = '%';
        r3[2] = r14[r112 & 15];
        r3[1] = r14[r112 >>> 4];
    L54:
        if (Character.isSupplementaryCodePoint(r112) == false) goto L56;
        int r102 = 2;
    L57:
        int r103 = r102 + r4;
        if (r3 == null) goto L75;
        int r113 = r4 - r7;
        int r12 = r8 + r113;
        int r13 = r3.length + r12;
        if (r52.length >= r13) goto L69;
        int r142 = ((r22 - r4) + r13) + 32;
        if (r142 < 0) goto L68;
        char[] r9 = new char[r142];
        if (r8 <= 0) goto L66;
        int r132 = r16;
        System.arraycopy(r52, r132, r9, r132, r8);
    L66:
        r52 = r9;
        goto L69
    L68:
        throw new AssertionError("Cannot increase internal buffer any further");
    L69:
        if (r113 <= 0) goto L72;
        r26.getChars(r7, r4, r52, r8);
        r8 = r12;
    L72:
        if (r3.length <= 0) goto L74;
        System.arraycopy(r3, 0, r52, r8, r3.length);
        r8 = r8 + r3.length;
    L74:
        r7 = r103;
    L75:
        r4 = r103;
    L76:
        if (r4 >= r22) goto L12;
        char r32 = r26.charAt(r4);
        if (r32 >= r6.length) goto L12;
        if (r6[r32] == false) goto L12;
        r4 = r4 + 1;
        goto L76
    L56:
        r102 = r17;
        goto L57
    L45:
        if (r112 > 2047) goto L48;
        r3 = new char[6];
        r3[r16] = '%';
        r3[3] = '%';
        r3[5] = r14[r112 & 15];
        r3[4] = r14[((r112 >>> 4) & 3) | 8];
        r3[2] = r14[(r112 >>> 6) & 15];
        r3[1] = r14[12 | (r112 >>> 10)];
        goto L54
    L48:
        if (r112 > 65535) goto L51;
        r3 = new char[9];
        r3[r16] = '%';
        r3[1] = 'E';
        r3[3] = '%';
        r3[6] = '%';
        r3[8] = r14[r112 & 15];
        r3[7] = r14[((r112 >>> 4) & 3) | 8];
        r3[5] = r14[(r112 >>> 6) & 15];
        r3[4] = r14[((r112 >>> 10) & 3) | 8];
        r3[2] = r14[r112 >>> 12];
        goto L54
    L51:
        if (r112 > 1114111) goto L84;
        r3 = new char[12];
        r3[r16] = '%';
        r3[1] = 'F';
        r3[3] = '%';
        r3[6] = '%';
        r3[9] = '%';
        r3[11] = r14[r112 & 15];
        r3[10] = r14[((r112 >>> 4) & 3) | 8];
        r3[8] = r14[(r112 >>> 6) & 15];
        r3[7] = r14[((r112 >>> 10) & 3) | 8];
        r3[5] = r14[(r112 >>> 12) & 15];
        r3[4] = r14[((r112 >>> 16) & 3) | 8];
        r3[2] = r14[(r112 >>> 18) & 7];
        goto L54
    L84:
        throw new IllegalArgumentException(AbstractC4223.m8643(r112, "Invalid unicode character value "));
    L39:
        if (this.f10284 == false) goto L41;
        r3 = f10282;
    L36:
        r17 = 1;
        goto L54
    L34:
        if (r6[r112] == false) goto L37;
        r3 = null;
        goto L36
    L86:
        throw new IllegalArgumentException("Trailing high surrogate at end of input");
    L17:
        if (r11 > '\udfff') goto L18;
        r16 = 0;
        if (r11 > '\udbff') goto L29;
        if (r10 != r22) goto L23;
        r112 = -r11;
        goto L30
    L23:
        char r122 = r26.charAt(r10);
        if (Character.isLowSurrogate(r122) == false) goto L27;
        r112 = Character.toCodePoint(r11, r122);
        goto L30
    L27:
        throw new IllegalArgumentException("Expected low surrogate but got char '" + r122 + "' with value " + r122 + " at index " + r10 + " in '" + r26 + "'");
    L29:
        throw new IllegalArgumentException("Unexpected low surrogate character '" + r11 + "' with value " + r11 + " at index " + r4 + " in '" + r26 + "'");
    L88:
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    L89:
        int r33 = r22 - r7;
        if (r33 <= 0) goto L102;
        int r34 = r33 + r8;
        if (r52.length >= r34) goto L100;
        if (r34 < 0) goto L99;
        char[] r42 = new char[r34];
        if (r8 <= 0) goto L97;
        System.arraycopy(r52, 0, r42, 0, r8);
    L97:
        r52 = r42;
        goto L100
    L99:
        throw new AssertionError("Cannot increase internal buffer any further");
    L100:
        r26.getChars(r7, r22, r52, r8);
        r8 = r34;
    L102:
        return new String(r52, 0, r8);
    L117:
        return r26;
    }
}
