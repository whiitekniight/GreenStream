package p163;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: ˊʻ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2908 {

    /* JADX INFO: renamed from: ʽ */
    public static final Field f10314 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final Method f10315 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final Method f10316 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final Handler f10317 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Field f10318 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Class f10319 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final Method f10320 = null;

    static {
        f10317 = new Handler(Looper.getMainLooper());
        Method r1 = null;
        Class<?> r2 = Class.forName("android.app.ActivityThread");     // Catch: Throwable -> L5
    L6:
        f10319 = r2;
        Field r3 = Activity.class.getDeclaredField("mMainThread");     // Catch: Throwable -> L9
        r3.setAccessible(true);     // Catch: Throwable -> L9
    L10:
        f10318 = r3;
        Field r0 = Activity.class.getDeclaredField("mToken");     // Catch: Throwable -> L13
        r0.setAccessible(true);     // Catch: Throwable -> L13
    L14:
        f10314 = r0;
        Class r02 = f10319;
        Class<?> r6 = Boolean.TYPE;
        if (r02 != null) goto L35;
    L16:
        Method r03 = null;
    L18:
        f10315 = r03;
        Class r04 = f10319;
        if (r04 != null) goto L45;
    L20:
        Method r05 = null;
    L22:
        f10316 = r05;
        Class r06 = f10319;
        int r8 = Build.VERSION.SDK_INT;
        if (r8 != 26) goto L25;
    L26:
        if (r06 != null) goto L41;
    L30:
        f10320 = r1;
        return;
    L41:
        Method r07 = r06.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, r6, Configuration.class, Configuration.class, r6, r6});     // Catch: Throwable -> L34
        r07.setAccessible(true);     // Catch: Throwable -> L34
        r1 = r07;
        goto L30
    L25:
        if (r8 != 27) goto L30;
    L45:
        r05 = r04.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, r6});     // Catch: Throwable -> L33
        r05.setAccessible(true);     // Catch: Throwable -> L33
    L35:
        r03 = r02.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, r6, String.class});     // Catch: Throwable -> L32
        r03.setAccessible(true);     // Catch: Throwable -> L32
    L13:
        r0 = null;
    L9:
        r3 = null;
    L5:
        r2 = null;
        goto L6
    }
}
