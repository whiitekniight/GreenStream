package p233;

import java.util.concurrent.ExecutorService;
import ˊⁱ.ˑﹳ;

/* JADX INFO: renamed from: ˏᐧ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3525 implements Runnable {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ Runnable f12523;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f12524;

    /* JADX INFO: renamed from: ˈٴ */
    public final /* synthetic */ ˑﹳ f12525;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ ScheduledExecutorServiceC3527 f12526;

    public /* synthetic */ RunnableC3525(ScheduledExecutorServiceC3527 r1, Runnable r2, ˑﹳ r3, int r4) {
        this.f12524 = r4;
        this.f12526 = r1;
        this.f12523 = r2;
        this.f12525 = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f12524) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ExecutorService r0 = this.f12526.f12530;
        final int r2 = 1;
        final Runnable r3 = this.f12523;
        final ˑﹳ r4 = this.f12525;
        r0.execute(new RunnableC3529(r3, r4, r2));
        return;
    L6:
        ExecutorService r02 = this.f12526.f12530;
        final int r22 = 2;
        final Runnable r32 = this.f12523;
        final ˑﹳ r42 = this.f12525;
        r02.execute(new RunnableC3529(r32, r42, r22));
        return;
    L8:
        ExecutorService r03 = this.f12526.f12530;
        final int r23 = 0;
        final Runnable r33 = this.f12523;
        final ˑﹳ r43 = this.f12525;
        r03.execute(new RunnableC3529(r33, r43, r23));
    }
}
