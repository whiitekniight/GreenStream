package p308;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: renamed from: ٴﾞ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4142 {

    /* JADX INFO: renamed from: ʽ */
    public static int f15264;

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean f15265;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Object f15266 = null;

    static {
        f15266 = new Object();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static boolean m8390(Object r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
    L9:
        return false;
    L7:
        if (r2.equals(r3) == false) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m8391(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m8392(String r0, String r1) {
        if (TextUtils.isEmpty(r0) == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(r1);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m8393(String r2) {
        if (Looper.getMainLooper() == Looper.myLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static void m8394(Object r0, String r1) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r1);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static void m8395(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r0));
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m8396(Handler r4) {
        Looper r0 = Looper.myLooper();
        if (r0 == r4.getLooper()) goto L9;
        if (r0 == null) goto L6;
        String r02 = r0.getThread().getName();
    L8:
        throw new IllegalStateException("Must be called on " + r4.getLooper().getThread().getName() + " thread, but got " + r02 + ".");
    L6:
        r02 = "null current looper";
        goto L8
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m8397(boolean r0) {
        if (r0 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m8398(Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new NullPointerException("null reference");
    }
}
