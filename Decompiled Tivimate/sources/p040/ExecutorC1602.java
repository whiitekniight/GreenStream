package p040;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ʼᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1602 implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f5317;

    public /* synthetic */ ExecutorC1602(int r1) {
        this.f5317 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    private final void m4258(Runnable r1) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        switch(this.f5317) {
            case 0: goto L7;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r2.run();
        return;
    L7:
        C1601.m4256().f5316.f5312.execute(r2);
    }
}
