package p447;

import p164.AbstractC2927;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ﹶˑ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5635 extends AbstractC5624 {
    /* JADX INFO: renamed from: ʿ */
    public static boolean m10860(String r0, String r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equalsIgnoreCase(r1);
    }

    /* JADX INFO: renamed from: ʿᵢ */
    public static String m10861(String r6, String r7, String r8, boolean r9) {
        int r0 = 0;
        int r1 = AbstractC5626.m10852(r6, r7, 0, r9);
        if (r1 >= 0) goto L5;
        return r6;
    L5:
        int r2 = r7.length();
        int r3 = 1;
        if (r2 < 1) goto L9;
        r3 = r2;
    L9:
        int r4 = r6.length() - r2;
        int r5 = r8.length() + r4;
        if (r5 < 0) goto L19;
        StringBuilder r42 = new StringBuilder(r5);
    L12:
        r42.append(r6, r0, r1);
        r42.append(r8);
        r0 = r1 + r2;
        if (r1 >= r6.length()) goto L16;
        r1 = AbstractC5626.m10852(r6, r7, r1 + r3, r9);
        if (r1 > 0) goto L12;
    L16:
        r42.append(r6, r0, r6.length());
        return r42.toString();
    L19:
        throw new OutOfMemoryError();
    }

    /* JADX INFO: renamed from: ˉـ */
    public static boolean m10862(String r7, String r8, boolean r9) {
        if (r9 == true) goto L6;
        return r7.endsWith(r8);
    L6:
        return r7.regionMatches(true, r7.length() - r8.length(), r8, 0, r8.length());
    }

    /* JADX INFO: renamed from: ᐧᴵ */
    public static Long m10863(String r19) {
        ⁱˊ.ʽ(10);
        int r2 = r19.length();
        if (r2 == 0) goto L32;
        int r3 = 0;
        char r4 = r19.charAt(0);
        long r6 = -9223372036854775807L;
        if (AbstractC2927.m6274(r4, 48) >= 0) goto L17;
        boolean r5 = true;
        if (r2 != 1) goto L11;
        return null;
    L11:
        if (r4 != '+') goto L13;
        r5 = false;
        r3 = 1;
    L18:
        long r10 = 0;
        long r12 = -256204778801521550L;
    L19:
        if (r3 >= r2) goto L35;
        int r42 = Character.digit(r19.charAt(r3), 10);
        if (r42 < 0) goto L47;
        if (r10 < r12) goto L26;
    L30:
        long r102 = r10 * ((long) 10);
        long r14 = r42;
        if (r102 < (r6 + r14)) goto L50;
        r10 = r102 - r14;
        r3 = r3 + 1;
        goto L19
    L50:
        return null;
    L26:
        if (r12 != (-256204778801521550L)) goto L48;
        r12 = r6 / ((long) 10);
        if (r10 >= r12) goto L30;
        return null;
    L48:
        return null;
    L47:
        return null;
    L35:
        if (r5 == false) goto L39;
        return Long.valueOf(r10);
    L39:
        return Long.valueOf(-r10);
    L13:
        if (r4 != '-') goto L46;
        r6 = Long.MIN_VALUE;
        r3 = 1;
        goto L18
    L46:
        return null;
    L17:
        r5 = false;
        goto L18
    L32:
        return null;
    }

    /* JADX INFO: renamed from: ᐧﾞ */
    public static Integer m10864(String r10) {
        ⁱˊ.ʽ(10);
        int r1 = r10.length();
        if (r1 == 0) goto L30;
        int r2 = 0;
        char r3 = r10.charAt(0);
        int r5 = -2147483647;
        if (AbstractC2927.m6274(r3, 48) >= 0) goto L17;
        int r4 = 1;
        if (r1 != 1) goto L11;
        return null;
    L11:
        if (r3 != '+') goto L13;
        boolean r32 = false;
    L18:
        int r7 = -59652323;
    L19:
        if (r4 >= r1) goto L33;
        int r8 = Character.digit(r10.charAt(r4), 10);
        if (r8 < 0) goto L45;
        if (r2 >= r7) goto L28;
        if (r7 != (-59652323)) goto L46;
        r7 = r5 / 10;
        if (r2 >= r7) goto L28;
        return null;
    L46:
        return null;
    L28:
        int r22 = r2 * 10;
        if (r22 < (r5 + r8)) goto L48;
        r2 = r22 - r8;
        r4 = r4 + 1;
        goto L19
    L48:
        return null;
    L45:
        return null;
    L33:
        if (r32 == false) goto L37;
        return Integer.valueOf(r2);
    L37:
        return Integer.valueOf(-r2);
    L13:
        if (r3 != '-') goto L44;
        r5 = Integer.MIN_VALUE;
        r32 = true;
        goto L18
    L44:
        return null;
    L17:
        r32 = false;
        r4 = 0;
        goto L18
    L30:
        return null;
    }

    /* JADX INFO: renamed from: ᵎᵔ */
    public static boolean m10865(String r6, String r7, boolean r8) {
        if (r8 == false) goto L4;
        int r5 = r7.length();
        if (r8 == true) goto L9;
        return r6.regionMatches(0, r7, 0, r5);
    L9:
        return r6.regionMatches(r8, 0, r7, 0, r5);
    L4:
        return r6.startsWith(r7);
    }
}
