package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.D3 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0989D3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f3668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f3669b;

    public RunnableC0989D3(Runnable r1, Runnable r2) {
        this.f3668a = r1;
        this.f3669b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3668a.run();     // Catch: Throwable -> L5
        this.f3669b.run();
        return;
    L5:
        th = move-exception;
        this.f3669b.run();     // Catch: Throwable -> L8
    L10:
        throw th;
    L8:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L11
        goto L10
    }
}
