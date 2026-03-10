package p367;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ᵔˆ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC4822 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable r3) {
        monitor-enter(this);
        Thread r0 = new Thread(r3, "glide-disk-lru-cache-thread");     // Catch: Throwable -> L6
        r0.setPriority(1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
