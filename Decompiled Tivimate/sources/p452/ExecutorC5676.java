package p452;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ﹶᴵ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5676 implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public static final ExecutorC5676 f20457 = null;

    static {
        f20457 = new ExecutorC5676();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }
}
