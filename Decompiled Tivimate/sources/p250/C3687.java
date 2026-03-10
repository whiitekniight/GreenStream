package p250;

import p022.C1326;

/* JADX INFO: renamed from: ˑٴ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3687 extends C1326 {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f13197;

    public C3687(int r1) {
        super(r1);
        this.f13197 = new Object();
    }

    @Override // p022.C1326, p250.InterfaceC3686
    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean mo3725(Object r2) {
        Object r0 = this.f13197;
        monitor-enter(r0);
        boolean r22 = super.mo3725(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p022.C1326, p250.InterfaceC3686
    /* JADX INFO: renamed from: ﾞᴵ */
    public final Object mo3727() {
        Object r0 = this.f13197;
        monitor-enter(r0);
        Object r1 = super.mo3727();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
