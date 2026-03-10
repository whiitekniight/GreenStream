package p191;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: ˋˋ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3231 implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f11427;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Handler f11428;

    public ExecutorC3231(int r2) {
        this.f11427 = r2;
        switch(r2) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.f11428 = new Handler(Looper.getMainLooper());
        return;
    L6:
        this.f11428 = new Handler(Looper.getMainLooper());
        return;
    L8:
        this.f11428 = new Handler(Looper.getMainLooper());
    }

    public ExecutorC3231(Handler r2) {
        this.f11427 = 3;
        this.f11428 = r2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        switch(this.f11427) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        r3.getClass();
        Handler r0 = this.f11428;
        if (r0.post(r3) == false) goto L8;
        return;
    L8:
        throw new RejectedExecutionException(r0 + " is shutting down");
    L9:
        this.f11428.post(r3);
        return;
    L11:
        this.f11428.post(r3);
        return;
    L13:
        this.f11428.post(r3);
    }
}
