package p092;

import p145.AbstractC2682;
import p145.C2683;
import p145.InterfaceC2684;
import ٴﾞ.ˆʾ;
import ᵢ.ﹳٴ;

/* JADX INFO: renamed from: ʿʾ.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C2170 implements InterfaceC2193, InterfaceC2684 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final ﹳٴ f7792 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f7793;

    /* JADX INFO: renamed from: ʾˋ */
    public final C2683 f7794;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f7795;

    /* JADX INFO: renamed from: ᴵˊ */
    public InterfaceC2193 f7796;

    static {
        f7792 = AbstractC2682.m5910(20, new ˆʾ(11));
    }

    public C2170() {
        this.f7794 = new C2683();
    }

    @Override // p092.InterfaceC2193
    public final Object get() {
        return this.f7796.get();
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ʽ */
    public final Class mo5114() {
        return this.f7796.mo5114();
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ˈ */
    public final synchronized void mo5115() {
        monitor-enter(this);
        this.f7794.m5911();     // Catch: Throwable -> L7
        this.f7795 = true;     // Catch: Throwable -> L7
        if (this.f7793 == true) goto L9;
        this.f7796.mo5115();     // Catch: Throwable -> L7
        this.f7796 = null;     // Catch: Throwable -> L7
        f7792.ˑﹳ(this);     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final synchronized void m5316() {
        monitor-enter(this);
        this.f7794.m5911();     // Catch: Throwable -> L9
        if (this.f7793 == false) goto L14;
        this.f7793 = false;     // Catch: Throwable -> L9
        if (this.f7795 == false) goto L11;
        mo5115();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L14:
        throw new IllegalStateException("Already unlocked");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo5116() {
        return this.f7796.mo5116();
    }

    @Override // p145.InterfaceC2684
    /* JADX INFO: renamed from: ﹳٴ */
    public final C2683 mo5217() {
        return this.f7794;
    }
}
