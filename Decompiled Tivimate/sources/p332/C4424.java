package p332;

/* JADX INFO: renamed from: ᴵˉ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4424 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final byte[] f16180 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final char[] f16181 = null;

    static {
        f16181 = new char[117];
        f16180 = new byte[126];
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= 32) goto L6;
        r1 = r1 + 1;
        goto L4
    L6:
        m8829('b', 8);
        m8829('t', 9);
        m8829('n', 10);
        m8829('f', 12);
        m8829('r', 13);
        m8829('/', 47);
        m8829('\"', 34);
        m8829('\\', 92);
        byte[] r8 = f16180;
    L8:
        if (r0 >= 33) goto L10;
        r8[r0] = 127;
        r0 = r0 + 1;
        goto L8
    L10:
        r8[9] = 3;
        r8[10] = 3;
        r8[13] = 3;
        r8[32] = 3;
        r8[44] = 4;
        r8[58] = 5;
        r8[123(0x7b, float:1.72E-43)] = 6;
        r8[125(0x7d, float:1.75E-43)] = 7;
        r8[91] = 8;
        r8[93] = 9;
        r8[34] = 1;
        r8[92] = 2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m8829(char r1, int r2) {
        if (r1 == 'u') goto L6;
        f16181[r1] = (char) r2;
        return;
    }
}
