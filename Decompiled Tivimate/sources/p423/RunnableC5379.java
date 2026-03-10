package p423;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ﹳˎ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5379 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f19207;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ Object f19208;

    public RunnableC5379(Runnable r2) {
        this.f19207 = 0;
        this.f19208 = r2;
    }

    public RunnableC5379(ExecutorService r2) {
        this.f19207 = 1;
        TimeUnit r0 = TimeUnit.SECONDS;
        this.f19208 = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch(this.f19207) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        ExecutorService r0 = (ExecutorService) this.f19208;
    L13:
        Locale r4 = Locale.US;
        if (Log.isLoggable("FirebaseCrashlytics", 3) == true) goto L16;
    L16:
        r0.shutdownNow();
        return;
    L6:
        if (Log.isLoggable("FirebaseCrashlytics", 3) == true) goto L7;
    L7:
        r0.shutdown();     // Catch: InterruptedException -> L13
        if (r0.awaitTermination(2, TimeUnit.SECONDS) == false) goto L10;
        return;
    L10:
        if (Log.isLoggable("FirebaseCrashlytics", 3) == true) goto L11;
    L11:
        r0.shutdownNow();     // Catch: InterruptedException -> L13
        return;
    L17:
        ((Runnable) this.f19208).run();
    }
}
