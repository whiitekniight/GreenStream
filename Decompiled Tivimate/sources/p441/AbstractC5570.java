package p441;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: ﹶˆ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5570 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Charset f20118 = null;

    static {
        f20118 = Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static byte[] m10706(byte[] r11) {
        int r0 = r11.length;
        byte[] r1 = AbstractC5567.f20113;
        int r2 = (r0 / 3) * 4;
        if ((r0 % 3) <= 0) goto L5;
        r2 = r2 + 4;
    L5:
        byte[] r22 = new byte[r2];
        int r3 = 0;
        int r5 = 0;
        int r6 = -1;
    L6:
        int r7 = r3 + 3;
        if (r7 > r0) goto L14;
        int r32 = (r11[r3 + 2] & 255) | (((r11[r3] & 255) << 16) | ((r11[r3 + 1] & 255) << 8));
        r22[r5] = r1[(r32 >> 18) & 63];
        r22[r5 + 1] = r1[(r32 >> 12) & 63];
        r22[r5 + 2] = r1[(r32 >> 6) & 63];
        r22[r5 + 3] = r1[r32 & 63];
        int r33 = r5 + 4;
        r6 = r6 - 1;
        if (r6 != 0) goto L12;
        r5 = r5 + 5;
        r22[r33] = 10;
        r6 = 19;
    L11:
        r3 = r7;
        goto L6
    L12:
        r5 = r33;
        goto L11
    L14:
        if (r3 != (r0 - 1)) goto L18;
        int r112 = (r11[r3] & 255) << 4;
        r22[r5] = r1[(r112 >> 6) & 63];
        r22[r5 + 1] = r1[r112 & 63];
        r22[r5 + 2] = 61;
        r22[r5 + 3] = 61;
        return r22;
    L18:
        if (r3 != (r0 - 2)) goto L20;
        int r02 = r3 + 1;
        int r113 = ((r11[r02] & 255) << 2) | ((r11[r3] & 255) << 10);
        r22[r5] = r1[(r113 >> 12) & 63];
        r22[r5 + 1] = r1[(r113 >> 6) & 63];
        r22[r5 + 2] = r1[r113 & 63];
        r22[r5 + 3] = 61;
    L20:
        return r22;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static byte[] m10707(String r15) {
        byte[] r152 = r15.getBytes(f20118);
        int r0 = r152.length;
        int r1 = (r0 * 3) / 4;
        byte[] r3 = new byte[r1];
        int[] r4 = AbstractC5567.f20112;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
    L4:
        if (r6 >= r0) goto L51;
        if (r7 != 0) goto L13;
    L6:
        int r13 = r6 + 4;
        if (r13 > r0) goto L11;
        r8 = (((r4[r152[r6] & 255] << 18) | (r4[r152[r6 + 1] & 255] << 12)) | (r4[r152[r6 + 2] & 255] << 6)) | r4[r152[r6 + 3] & 255];
        if (r8 < 0) goto L11;
        r3[r9 + 2] = (byte) r8;
        r3[r9 + 1] = (byte) (r8 >> 8);
        r3[r9] = (byte) (r8 >> 16);
        r9 = r9 + 3;
        r6 = r13;
    L11:
        if (r6 >= r0) goto L51;
    L13:
        int r132 = r6 + 1;
        int r62 = r4[r152[r6] & 255];
        if (r7 == 0) goto L47;
        if (r7 != 1) goto L17;
        if (r62 >= 0) goto L37;
        if (r62 == (-1)) goto L50;
    L63:
        throw new IllegalArgumentException("bad base-64");
    L50:
        r6 = r132;
    L37:
        r62 = r62 | (r8 << 6);
    L38:
        r7 = r7 + 1;
    L31:
        r8 = r62;
        goto L50
    L17:
        if (r7 != 2) goto L19;
        if (r62 >= 0) goto L37;
        if (r62 != (-2)) goto L41;
        r3[r9] = (byte) (r8 >> 4);
        r7 = 4;
        r9 = r9 + 1;
        goto L50
    L41:
        if (r62 != (-1)) goto L63;
    L19:
        if (r7 == 3) goto L29;
        if (r7 == 4) goto L25;
        if (r7 != 5) goto L50;
        if (r62 != (-1)) goto L63;
    L25:
        if (r62 != (-2)) goto L27;
        r7 = r7 + 1;
        goto L50
    L27:
        if (r62 != (-1)) goto L63;
    L29:
        if (r62 < 0) goto L32;
        r62 = r62 | (r8 << 6);
        r3[r9 + 2] = (byte) r62;
        r3[r9 + 1] = (byte) (r62 >> 8);
        r3[r9] = (byte) (r62 >> 16);
        r9 = r9 + 3;
        r7 = 0;
        goto L31
    L32:
        if (r62 != (-2)) goto L34;
        r3[r9 + 1] = (byte) (r8 >> 2);
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r7 = 5;
        goto L50
    L34:
        if (r62 != (-1)) goto L63;
    L47:
        if (r62 >= 0) goto L38;
        if (r62 != (-1)) goto L63;
    L51:
        if (r7 == 1) goto L63;
        if (r7 == 2) goto L57;
        if (r7 == 3) goto L56;
        if (r7 == 4) goto L63;
    L58:
        if (r9 != r1) goto L60;
        return r3;
    L60:
        byte[] r153 = new byte[r9];
        System.arraycopy(r3, 0, r153, 0, r9);
        return r153;
    L56:
        int r154 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r3[r154] = (byte) (r8 >> 2);
        goto L58
    L57:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
        goto L58
    }
}
