package p132;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import p039.C1573;
import p176.C3062;
import ـˎ.ˈ;

/* JADX INFO: renamed from: ˈˆ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2494 extends Thread {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f8845;

    public /* synthetic */ C2494(Runnable r2) {
        this.f8845 = 1;
        super(r2);
    }

    public /* synthetic */ C2494(String r2) {
        this.f8845 = 2;
        super(r2);
    }

    public /* synthetic */ C2494(ThreadGroup r2, String r3) {
        this.f8845 = 0;
        super(r2, r3);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch(this.f8845) {
            case 0: goto L19;
            case 1: goto L17;
            default: goto L30;
        };
    L17:
        Process.setThreadPriority(9);
        super.run();
        return;
    L19:
        Process.setThreadPriority(19);
        monitor-enter(this);
    L31:
        wait();     // Catch: Throwable -> L23 InterruptedException -> L25
    L25:
        return;
    L23:
        th = move-exception;
        throw th;
    L30:
        C1573 r0 = C3062.f10734;     // Catch: InterruptedException -> L29
        ReentrantLock r02 = C3062.f10731;     // Catch: InterruptedException -> L29
        r02.lock();     // Catch: InterruptedException -> L29
        C3062 r1 = ˈ.ᵔʾ();     // Catch: Throwable -> L10
        if (r1 != C3062.f10730) goto L12;
        C3062.f10730 = null;     // Catch: Throwable -> L10
        goto L30
    L8:
        r02.unlock();     // Catch: InterruptedException -> L29
        return;
    L12:
        r02.unlock();     // Catch: InterruptedException -> L29
        if (r1 == null) goto L30;
        r1.mo6489();     // Catch: InterruptedException -> L29
    L10:
        th = move-exception;
        r02.unlock();     // Catch: InterruptedException -> L29
        throw th;     // Catch: InterruptedException -> L29
    }
}
