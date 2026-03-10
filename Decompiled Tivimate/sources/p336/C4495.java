package p336;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: ᴵי.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4495 implements InterfaceC4524 {

    /* JADX INFO: renamed from: ʾˋ */
    public final ScheduledFuture f16335;

    public C4495(ScheduledFuture r1) {
        this.f16335 = r1;
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f16335 + ']';
    }

    @Override // p336.InterfaceC4524
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5458() {
        this.f16335.cancel(false);
    }
}
