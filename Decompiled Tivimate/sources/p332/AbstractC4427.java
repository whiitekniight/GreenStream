package p332;

/* JADX INFO: renamed from: ᴵˉ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4427 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final byte[] f16183 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String[] f16184 = null;

    static {
        String[] r1 = new String[93];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 32) goto L6;
        r1[r3] = "\\u" + m8837(r3 >> 12) + m8837(r3 >> 8) + m8837(r3 >> 4) + m8837(r3);
        r3 = r3 + 1;
        goto L4
    L6:
        r1[34] = "\\\"";
        r1[92] = "\\\\";
        r1[9] = "\\t";
        r1[8] = "\\b";
        r1[10] = "\\n";
        r1[13] = "\\r";
        r1[12] = "\\f";
        f16184 = r1;
        byte[] r0 = new byte[93];
    L7:
        if (r2 >= 32) goto L9;
        r0[r2] = 1;
        r2 = r2 + 1;
        goto L7
    L9:
        r0[34] = 34;
        r0[92] = 92;
        r0[9] = 116;
        r0[8] = 98;
        r0[10] = 110;
        r0[13] = 114;
        r0[12] = 102;
        f16183 = r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final char m8837(int r1) {
        int r12 = r1 & 15;
        if (r12 >= 10) goto L7;
        int r13 = r12 + 48;
    L6:
        return (char) r13;
    L7:
        r13 = r12 + 87;
        goto L6
    }
}
