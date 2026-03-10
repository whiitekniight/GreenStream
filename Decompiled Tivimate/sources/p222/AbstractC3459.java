package p222;

import com.google.android.gms.internal.play_billing.י;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import p047.AbstractC1703;
import p423.AbstractC5375;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ˎﹶ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3459 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int f12319 = 0;

    static {
        new C3460();
    }

    /* JADX INFO: renamed from: ʽ */
    public static byte[] m7213(InputStream r10) {
        r10.getClass();
        ArrayDeque r0 = new ArrayDeque(20);
        int r2 = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int r4 = 0;
    L4:
        if (r4 >= 2147483639) goto L18;
        int r6 = Math.min(r2, 2147483639 - r4);
        byte[] r7 = new byte[r6];
        r0.add(r7);
        int r8 = 0;
    L6:
        if (r8 >= r6) goto L13;
        int r9 = r10.read(r7, r8, r6 - r8);
        if (r9 == (-1)) goto L10;
        r8 = r8 + r9;
        r4 = r4 + r9;
        goto L6
    L10:
        return m7215(r0, r4);
    L13:
        if (r2 >= 4096) goto L15;
        int r5 = 4;
    L16:
        r2 = ˉˆ.ᴵˊ(((long) r2) * ((long) r5));
        goto L4
    L15:
        r5 = 2;
        goto L16
    L18:
        if (r10.read() != (-1)) goto L22;
        return m7215(r0, 2147483639);
    L22:
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m7214(C3458 r3, byte[] r4, int r5, int r6) {
        r4.getClass();
        if (r6 < 0) goto L15;
        י.ˆʾ(r5, r5 + r6, r4.length);
        int r0 = 0;
    L5:
        if (r0 >= r6) goto L10;
        int r1 = r3.read(r4, r5 + r0, r6 - r0);
        if (r1 == (-1)) goto L10;
        r0 = r0 + r1;
    L10:
        if (r0 != r6) goto L13;
        return;
    L13:
        throw new EOFException(AbstractC5375.m10396("reached end of stream after reading ", r0, " bytes; ", r6, " bytes expected"));
    L15:
        throw new IndexOutOfBoundsException(AbstractC1703.m4484(r6, "len (", ") cannot be negative"));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static byte[] m7215(ArrayDeque r6, int r7) {
        if (r6.isEmpty() == true) goto L5;
        byte[] r0 = (byte[]) r6.remove();
        if (r0.length != r7) goto L9;
        return r0;
    L9:
        int r2 = r7 - r0.length;
        byte[] r02 = Arrays.copyOf(r0, r7);
    L10:
        if (r2 <= 0) goto L12;
        byte[] r3 = (byte[]) r6.remove();
        int r4 = Math.min(r2, r3.length);
        System.arraycopy(r3, 0, r02, r7 - r2, r4);
        r2 = r2 - r4;
        goto L10
    L12:
        return r02;
    L5:
        return new byte[0];
    }
}
