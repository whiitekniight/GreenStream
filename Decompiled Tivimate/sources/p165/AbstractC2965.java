package p165;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: ˊʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2965 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Method f10412 = null;

    static {
        Method r0 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});     // Catch: Throwable -> L4
    L5:
        f10412 = r0;
        return;
    L4:
        r0 = null;
        goto L5
    }
}
