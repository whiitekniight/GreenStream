package p445;

import java.util.List;
import p059.AbstractC1840;
import p384.AbstractC5007;

/* JADX INFO: renamed from: ﹶˎ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5609 extends AbstractC5007 {

    /* JADX INFO: renamed from: ˈٴ */
    public final List f20269;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final long f20270;

    public C5609(long r5, List r7) {
        super(0, r7.size() - 1);
        this.f20270 = r5;
        this.f20269 = r7;
    }

    @Override // p384.InterfaceC5001
    /* JADX INFO: renamed from: ʽ */
    public final long mo7720() {
        m9814();
        int r0 = (int) this.f17883;
        long r02 = ((AbstractC1840) this.f20269.get(r0)).f6176;
        return this.f20270 + r02;
    }

    @Override // p384.InterfaceC5001
    /* JADX INFO: renamed from: ﹳٴ */
    public final long mo7721() {
        m9814();
        int r0 = (int) this.f17883;
        AbstractC1840 r02 = (AbstractC1840) this.f20269.get(r0);
        return (this.f20270 + r02.f6176) + r02.f6168;
    }
}
