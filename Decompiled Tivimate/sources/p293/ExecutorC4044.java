package p293;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p287.C3990;

/* JADX INFO: renamed from: ٴʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4044 implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ Executor f14860;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C3990 f14861;

    public ExecutorC4044(ExecutorService r1, C3990 r2) {
        this.f14860 = r1;
        this.f14861 = r2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        this.f14860.execute(r2);
    }
}
