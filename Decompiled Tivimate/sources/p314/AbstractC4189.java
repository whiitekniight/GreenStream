package p314;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import p170.AbstractC3024;
import p334.C4448;

/* JADX INFO: renamed from: ᐧˉ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4189 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String f15398 = null;

    static {
        f15398 = C4448.m8843("SystemJobScheduler");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final JobScheduler m8453(Context r2) {
        JobScheduler r22 = (JobScheduler) r2.getSystemService("jobscheduler");
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return r22;
    L5:
        return AbstractC3024.m6403(r22);
    }
}
