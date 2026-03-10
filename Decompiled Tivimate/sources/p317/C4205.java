package p317;

import android.os.SystemClock;

/* JADX INFO: renamed from: ᐧˎ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4205 {

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean f15439;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4204 f15440;

    public C4205() {
        this(C4204.f15438);
    }

    public C4205(C4204 r1) {
        this.f15440 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public final synchronized boolean m8532(long r5) {
        monitor-enter(this);
        if (r5 > 0) goto L10;
        boolean r52 = this.f15439;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r52;
    L10:
        this.f15440.getClass();     // Catch: Throwable -> L8
        long r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L8
        long r53 = r5 + r0;     // Catch: Throwable -> L8
        if (r53 >= r0) goto L13;
        m8535();     // Catch: Throwable -> L8
    L24:
        boolean r54 = this.f15439;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r54;
    L13:
        boolean r2 = false;
    L15:
        if (this.f15439 == true) goto L22;
        if (r0 >= r53) goto L22;
        this.f15440.getClass();     // Catch: Throwable -> L8 InterruptedException -> L20
        wait(r53 - r0);     // Catch: Throwable -> L8 InterruptedException -> L20
    L21:
        this.f15440.getClass();     // Catch: Throwable -> L8
        r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L8
    L20:
        r2 = true;
    L22:
        if (r2 == false) goto L24;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˈ */
    public final synchronized void m8533() {
        monitor-enter(this);
        this.f15439 = false;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final synchronized boolean m8534() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.f15439 == false) goto L9;
        monitor-exit(this);
        return false;
    L9:
        this.f15439 = true;     // Catch: Throwable -> L12
        notifyAll();     // Catch: Throwable -> L12
        monitor-exit(this);
        return true;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final synchronized void m8535() {
        monitor-enter(this);
        boolean r0 = false;
    L19:
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.f15439 == true) goto L11;
        this.f15440.getClass();     // Catch: Throwable -> L8 InterruptedException -> L10
        wait();     // Catch: Throwable -> L8 InterruptedException -> L10
    L10:
        r0 = true;
        goto L19
    L11:
        if (r0 == false) goto L13;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L8
    L13:
        monitor-exit(this);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m8536() {
        monitor-enter(this);
    L13:
        if (this.f15439 == true) goto L9;
        this.f15440.getClass();     // Catch: Throwable -> L7
        wait();     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
