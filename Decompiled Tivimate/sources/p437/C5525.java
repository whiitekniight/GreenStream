package p437;

import java.nio.ByteBuffer;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ﹶ.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5525 {

    /* JADX INFO: renamed from: ˈ */
    public static final byte[] f19905 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final byte[] f19906 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f19907;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f19908;

    /* JADX INFO: renamed from: ﹳٴ */
    public ByteBuffer f19909;

    static {
        f19905 = new byte[]{79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
        f19906 = new byte[]{79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m10666(ByteBuffer r1, long r2, int r4, int r5, boolean r6) {
        r1.put((byte) 79);
        r1.put((byte) 103);
        r1.put((byte) 103);
        r1.put((byte) 83);
        r1.put((byte) 0);
        if (r6 == false) goto L5;
        byte r62 = 2;
    L6:
        r1.put(r62);
        r1.putLong(r2);
        r1.putInt(0);
        r1.putInt(r4);
        r1.putInt(0);
        r1.put(ⁱˊ.ˈ(r5));
        return;
    L5:
        r62 = 0;
        goto L6
    }
}
