package p099;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ʿٴ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229 {

    /* JADX INFO: renamed from: ʽ */
    public static volatile Handler f8045;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final char[] f8046 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final char[] f8047 = null;

    static {
        f8047 = "0123456789abcdef".toCharArray();
        f8046 = new char[64];
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static boolean m5408(int r1, int r2) {
        if (r1 > 0) goto L5;
        if (r1 == Integer.MIN_VALUE) goto L5;
        return false;
    L5:
        if (r2 > 0) goto L10;
        if (r2 == Integer.MIN_VALUE) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m5409(Bitmap r3) {
        if (r3.isRecycled() == true) goto L9;
        return r3.getAllocationByteCount();
    L7:
        return r3.getRowBytes() * r3.getHeight();
    L9:
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + r3 + "[" + r3.getWidth() + "x" + r3.getHeight() + "] " + r3.getConfig());
    }

    /* JADX INFO: renamed from: ˈ */
    public static int m5410(Bitmap.Config r2) {
        if (r2 != null) goto L4;
        r2 = Bitmap.Config.ARGB_8888;
    L4:
        int r22 = AbstractC2225.f8040[r2.ordinal()];
        int r0 = 1;
        if (r22 == 1) goto L15;
        r0 = 2;
        if (r22 == 2) goto L15;
        if (r22 == 3) goto L15;
        if (r22 == 4) goto L13;
        return 4;
    L13:
        return 8;
    L15:
        return r0;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static ArrayList m5411(Collection r2) {
        ArrayList r0 = new ArrayList(r2.size());
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        Object r1 = r22.next();
        if (r1 == null) goto L4;
        r0.add(r1);
        goto L4
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static int m5412(int r0, int r1) {
        return (r1 * 31) + r0;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static int m5413(int r0, Object r1) {
        if (r1 != null) goto L4;
        int r12 = 0;
    L6:
        return m5412(r12, r0);
    L4:
        r12 = r1.hashCode();
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m5414(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m5415() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static Handler m5416() {
        if (f8045 != null) goto L16;
        monitor-enter(AbstractC2229.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f8045 != null) goto L11;
        f8045 = new Handler(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(AbstractC2229.class);     // Catch: Throwable -> L9
    L16:
        return f8045;
    }
}
