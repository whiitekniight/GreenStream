package p233;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ˊⁱ.ˑﹳ;

/* JADX INFO: renamed from: ˏᐧ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3524 implements InterfaceC3528 {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ Runnable f12517;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f12518;

    /* JADX INFO: renamed from: ˈٴ */
    public final /* synthetic */ long f12519;

    /* JADX INFO: renamed from: ˊʻ */
    public final /* synthetic */ TimeUnit f12520;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ ScheduledExecutorServiceC3527 f12521;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ long f12522;

    public /* synthetic */ C3524(ScheduledExecutorServiceC3527 r1, Runnable r2, long r3, long r5, TimeUnit r7, int r8) {
        this.f12518 = r8;
        this.f12521 = r1;
        this.f12517 = r2;
        this.f12519 = r3;
        this.f12522 = r5;
        this.f12520 = r7;
    }

    @Override // p233.InterfaceC3528
    /* JADX INFO: renamed from: ﹳٴ */
    public final ScheduledFuture mo7291(ˑﹳ r9) {
        switch(this.f12518) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ScheduledExecutorServiceC3527 r0 = this.f12521;
        return r0.f12531.scheduleWithFixedDelay(new RunnableC3525(r0, this.f12517, r9, 2), this.f12519, this.f12522, this.f12520);
    L6:
        ScheduledExecutorServiceC3527 r02 = this.f12521;
        return r02.f12531.scheduleAtFixedRate(new RunnableC3525(r02, this.f12517, r9, 0), this.f12519, this.f12522, this.f12520);
    }
}
