package p164;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ˊʼ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2927 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Object[] f10343 = null;

    static {
        f10343 = new Object[0];
    }

    /* JADX INFO: renamed from: ʽ */
    public static boolean m6273(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public static int m6274(int r0, int r1) {
        if (r0 >= r1) goto L5;
        return -1;
    L5:
        if (r0 != r1) goto L8;
        return 0;
    L8:
        return 1;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static int m6275(long r0, long r2) {
        if (r0 >= r2) goto L6;
        return -1;
    L6:
        if (r0 != r2) goto L9;
        return 0;
    L9:
        return 1;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final Object[] m6276(Collection r4) {
        int r0 = r4.size();
        if (r0 == 0) goto L8;
        Iterator r42 = r4.iterator();
        if (r42.hasNext() == false) goto L8;
        Object[] r02 = new Object[r0];
        int r1 = 0;
    L10:
        int r2 = r1 + 1;
        r02[r1] = r42.next();
        if (r2 < r02.length) goto L25;
        if (r42.hasNext() == false) goto L14;
        int r12 = ((r2 * 3) + 1) >>> 1;
        if (r12 > r2) goto L22;
        r12 = 2147483645;
        if (r2 < 2147483645) goto L22;
        throw new OutOfMemoryError();
    L22:
        r02 = Arrays.copyOf(r02, r12);
    L23:
        r1 = r2;
        goto L10
    L14:
        return r02;
    L25:
        if (r42.hasNext() == true) goto L23;
        return Arrays.copyOf(r02, r2);
    L8:
        return f10343;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final Object[] m6277(Collection r5, Object[] r6) {
        int r0 = r5.size();
        int r2 = 0;
        if (r0 == 0) goto L5;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == true) goto L15;
        if (r6.length <= 0) goto L13;
        r6[0] = null;
    L13:
        return r6;
    L15:
        if (r0 > r6.length) goto L17;
        Object[] r02 = r6;
    L18:
        int r3 = r2 + 1;
        r02[r2] = r52.next();
        if (r3 < r02.length) goto L33;
        if (r52.hasNext() == false) goto L22;
        int r22 = ((r3 * 3) + 1) >>> 1;
        if (r22 > r3) goto L30;
        r22 = 2147483645;
        if (r3 < 2147483645) goto L30;
        throw new OutOfMemoryError();
    L30:
        r02 = Arrays.copyOf(r02, r22);
    L31:
        r2 = r3;
        goto L18
    L22:
        return r02;
    L33:
        if (r52.hasNext() == true) goto L31;
        if (r02 != r6) goto L38;
        r6[r3] = null;
        return r6;
    L38:
        return Arrays.copyOf(r02, r3);
    L17:
        r02 = (Object[]) Array.newInstance(r6.getClass().getComponentType(), r0);
        goto L18
    L5:
        if (r6.length <= 0) goto L13;
        r6[0] = null;
        return r6;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m6278(Float r2, Float r3) {
        if (r2 != null) goto L7;
        if (r3 != null) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r3 != null) goto L9;
    L11:
        return false;
    L9:
        if (r2.floatValue() != r3.floatValue()) goto L11;
        return true;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m6279(Float r0, float r1) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.floatValue() != r1) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m6280(RuntimeException r5, String r6) {
        StackTraceElement[] r0 = r5.getStackTrace();
        int r1 = r0.length;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r6.equals(r0[r3].getClassName()) == false) goto L7;
        r2 = r3;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r0, r2 + 1, r1));
    }
}
