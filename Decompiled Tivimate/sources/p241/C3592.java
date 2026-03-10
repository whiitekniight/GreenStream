package p241;

import java.util.concurrent.atomic.AtomicReference;
import p254.AbstractC3718;

/* JADX INFO: renamed from: ˑʼ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C3592 extends AbstractC3718 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ AtomicReference f12783;

    public C3592(AtomicReference r1) {
        this.f12783 = r1;
    }

    @Override // p254.AbstractC3718
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7464(Object r2) {
        AbstractC3718 r0 = (AbstractC3718) this.f12783.get();
        if (r0 == null) goto L7;
        r0.mo7464(r2);
        return;
    L7:
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
