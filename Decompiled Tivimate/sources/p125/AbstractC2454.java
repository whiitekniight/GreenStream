package p125;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p164.AbstractC2927;
import p334.C4448;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ˆﹶ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String f8768 = null;

    static {
        f8768 = C4448.m8843("ProcessUtils");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final boolean m5668(Context r5) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        String r0 = AbstractC2460.m5674();
    L25:
        return AbstractC2927.m6273(r0, r5.getApplicationInfo().processName);
    L5:
        r0 = null;
        Method r1 = Class.forName("android.app.ActivityThread", false, ˊʻ.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);     // Catch: Throwable -> L10
        r1.setAccessible(true);     // Catch: Throwable -> L10
        Object r12 = r1.invoke(null, null);     // Catch: Throwable -> L10
        if ((r12 instanceof String) == false) goto L12;
        r0 = (String) r12;     // Catch: Throwable -> L10
    L12:
        int r13 = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> r2 = ((ActivityManager) r5.getSystemService("activity")).getRunningAppProcesses();
        if (r2 == null) goto L25;
        Iterator<T> r22 = r2.iterator();
    L16:
        if (r22.hasNext() == false) goto L20;
        Object r3 = r22.next();
        if (((ActivityManager.RunningAppProcessInfo) r3).pid != r13) goto L16;
    L21:
        ActivityManager.RunningAppProcessInfo r32 = (ActivityManager.RunningAppProcessInfo) r3;
        if (r32 == null) goto L25;
        r0 = r32.processName;
        goto L25
    L20:
        r3 = null;
    L10:
        th = move-exception;
        C4448.m8842().m8847(f8768, "Unable to check ActivityThread for processName", th);
        goto L12
    }
}
