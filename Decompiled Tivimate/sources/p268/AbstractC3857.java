package p268;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: יٴ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3857 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int[] f14130 = null;

    static {
        f14130 = m7950(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m7948(int r2, int r3, int r4, int r5, int[] r6) {
        int r0 = r6[r2] + r6[r3];
        r6[r2] = r0;
        int r02 = r0 ^ r6[r5];
        int r1 = r02 << 16;
        int r03 = (r02 >>> (-16)) | r1;
        r6[r5] = r03;
        int r12 = r6[r4] + r03;
        r6[r4] = r12;
        int r04 = r6[r3] ^ r12;
        int r13 = r04 << 12;
        int r05 = (r04 >>> (-12)) | r13;
        r6[r3] = r05;
        int r14 = r6[r2] + r05;
        r6[r2] = r14;
        int r22 = r6[r5] ^ r14;
        int r06 = r22 << 8;
        int r23 = (r22 >>> (-8)) | r06;
        r6[r5] = r23;
        int r52 = r6[r4] + r23;
        r6[r4] = r52;
        int r24 = r6[r3] ^ r52;
        int r42 = r24 << 7;
        r6[r3] = (r24 >>> (-7)) | r42;
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m7949(int[] r16) {
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L6;
        m7948(0, 4, 8, 12, r16);
        m7948(1, 5, 9, 13, r16);
        m7948(2, 6, 10, 14, r16);
        m7948(3, 7, 11, 15, r16);
        m7948(0, 5, 10, 15, r16);
        m7948(1, 6, 11, 12, r16);
        m7948(2, 7, 8, 13, r16);
        m7948(3, 4, 9, 14, r16);
        r2 = r2 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static int[] m7950(byte[] r1) {
        if ((r1.length % 4) != 0) goto L7;
        IntBuffer r12 = ByteBuffer.wrap(r1).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r0 = new int[r12.remaining()];
        r12.get(r0);
        return r0;
    L7:
        throw new IllegalArgumentException("invalid input length");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int[] m7951(int[] r5, int[] r6) {
        int[] r0 = new int[16];
        int[] r1 = f14130;
        System.arraycopy(r1, 0, r0, 0, r1.length);
        System.arraycopy(r5, 0, r0, r1.length, 8);
        r0[12] = r6[0];
        r0[13] = r6[1];
        r0[14] = r6[2];
        r0[15] = r6[3];
        m7949(r0);
        r0[4] = r0[12];
        r0[5] = r0[13];
        r0[6] = r0[14];
        r0[7] = r0[15];
        return Arrays.copyOf(r0, 8);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static byte[] m7952(byte[] r1, byte[] r2) {
        int[] r12 = m7951(m7950(r1), m7950(r2));
        ByteBuffer r22 = ByteBuffer.allocate(r12.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        r22.asIntBuffer().put(r12);
        return r22.array();
    }
}
