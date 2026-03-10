package p101;

import p138.InterfaceC2619;
import p138.InterfaceC2622;
import p328.InterfaceC4386;

/* JADX INFO: renamed from: ʿᵔ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C2253 implements InterfaceC2619, InterfaceC4386 {

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC2619 f8099;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC2622 f8100;

    public C2253(InterfaceC2619 r1, InterfaceC2622 r2) {
        this.f8099 = r1;
        this.f8100 = r2;
    }

    @Override // p328.InterfaceC4386
    /* JADX INFO: renamed from: ˈ */
    public final InterfaceC4386 mo5436() {
        InterfaceC2619 r0 = this.f8099;
        if ((r0 instanceof InterfaceC4386) == true) goto L5;
        return null;
    L5:
        return (InterfaceC4386) r0;
    }

    @Override // p138.InterfaceC2619
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4260(Object r2) {
        this.f8099.mo4260(r2);
    }

    @Override // p138.InterfaceC2619
    /* JADX INFO: renamed from: ﾞᴵ */
    public final InterfaceC2622 mo4262() {
        return this.f8100;
    }
}
