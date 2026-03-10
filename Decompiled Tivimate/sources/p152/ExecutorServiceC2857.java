package p152;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ˉˏ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC2857 implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: ʽʽ */
    public static volatile int f10109;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final long f10110 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final ThreadPoolExecutor f10111;

    static {
        f10110 = TimeUnit.SECONDS.toMillis(10);
    }

    public ExecutorServiceC2857(ThreadPoolExecutor r1) {
        this.f10111 = r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, TimeUnit r4) {
        return this.f10111.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC2859.m6161(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        this.f10111.execute(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r2) {
        return this.f10111.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r2, long r3, TimeUnit r5) {
        return this.f10111.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r2) {
        return this.f10111.invokeAny(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r2, long r3, TimeUnit r5) {
        return this.f10111.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f10111.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f10111.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f10111.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f10111.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r2) {
        return this.f10111.submit(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r2, Object r3) {
        return this.f10111.submit(r2, r3);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable r2) {
        return this.f10111.submit(r2);
    }

    public final String toString() {
        return this.f10111.toString();
    }
}
