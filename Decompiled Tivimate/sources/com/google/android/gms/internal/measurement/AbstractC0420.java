package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0420 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Method f2172 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Method f2173 = null;

    static {
        Method r3 = null;
        if (Build.VERSION.SDK_INT >= 24) goto L19;
    L9:
        Method r0 = null;
    L10:
        f2173 = r0;
        if (Build.VERSION.SDK_INT >= 24) goto L21;
    L17:
        f2172 = r3;
        return;
    L21:
        r3 = UserHandle.class.getDeclaredMethod("myUserId", null);     // Catch: NoSuchMethodException -> L14
    L15:
        if (Log.isLoggable("JobSchedulerCompat", 6) == false) goto L17;
        goto L17
    L19:
        r0 = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});     // Catch: NoSuchMethodException -> L6
    L7:
        if (Log.isLoggable("JobSchedulerCompat", 6) == false) goto L9;
        goto L9
    }
}
