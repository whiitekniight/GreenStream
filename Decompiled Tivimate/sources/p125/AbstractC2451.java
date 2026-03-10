package p125;

import android.content.Context;
import android.os.PowerManager;
import p334.C4448;

/* JADX INFO: renamed from: ˆﹶ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2451 {
    static {
        C4448.m8843("WakeLocks");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final PowerManager.WakeLock m5667(Context r3) {
        PowerManager r32 = (PowerManager) r3.getApplicationContext().getSystemService("power");
        String r0 = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock r33 = r32.newWakeLock(1, r0);
        C2456 r1 = C2456.f8770;
        monitor-enter(r1);
        String r02 = (String) C2456.f8769.put(r33, r0);     // Catch: Throwable -> L7
        monitor-exit(r1);
        return r33;
    L7:
        th = move-exception;
        throw th;
    }
}
