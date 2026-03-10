package p092;

import p043.InterfaceC1624;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ʿʾ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2175 implements InterfaceC2193 {

    /* JADX INFO: renamed from: ʽʽ */
    public final InterfaceC2193 f7820;

    /* JADX INFO: renamed from: ʾˋ */
    public final boolean f7821;

    /* JADX INFO: renamed from: ˈٴ */
    public final InterfaceC2183 f7822;

    /* JADX INFO: renamed from: ˊʻ */
    public int f7823;

    /* JADX INFO: renamed from: ٴᵢ */
    public boolean f7824;

    /* JADX INFO: renamed from: ᴵˊ */
    public final boolean f7825;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final InterfaceC1624 f7826;

    public C2175(InterfaceC2193 r2, boolean r3, boolean r4, InterfaceC1624 r5, InterfaceC2183 r6) {
        AbstractC2234.m5422(r2, "Argument must not be null");
        this.f7820 = r2;
        this.f7821 = r3;
        this.f7825 = r4;
        this.f7826 = r5;
        AbstractC2234.m5422(r6, "Argument must not be null");
        this.f7822 = r6;
    }

    @Override // p092.InterfaceC2193
    public final Object get() {
        return this.f7820.get();
    }

    public final synchronized String toString() {
        monitor-enter(this);
        String r0 = "EngineResource{isMemoryCacheable=" + this.f7821 + ", listener=" + this.f7822 + ", key=" + this.f7826 + ", acquired=" + this.f7823 + ", isRecycled=" + this.f7824 + ", resource=" + this.f7820 + '}';     // Catch: Throwable -> L7
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ʽ */
    public final Class mo5114() {
        return this.f7820.mo5114();
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ˈ */
    public final synchronized void mo5115() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.f7823 > 0) goto L18;
        if (this.f7824 == true) goto L16;
        this.f7824 = true;     // Catch: Throwable -> L11
        if (this.f7825 == false) goto L13;
        this.f7820.mo5115();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L16:
        throw new IllegalStateException("Cannot recycle a resource that has already been recycled");     // Catch: Throwable -> L11
    L18:
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");     // Catch: Throwable -> L11
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m5322() {
        monitor-enter(this);
        int r0 = this.f7823;     // Catch: Throwable -> L13
        if (r0 <= 0) goto L16;
        boolean r1 = true;
        int r02 = r0 - 1;     // Catch: Throwable -> L13
        this.f7823 = r02;     // Catch: Throwable -> L13
        if (r02 == 0) goto L9;
        r1 = false;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L13
        if (r1 == false) goto L20;
        InterfaceC2183 r03 = this.f7822;
        C2181 r04 = (C2181) r03;
        r04.m5351(this.f7826, this);
        return;
    L20:
        return;
    L16:
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo5116() {
        return this.f7820.mo5116();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m5323() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f7824 == true) goto L11;
        this.f7823++;
        monitor-exit(this);
        return;
    L11:
        throw new IllegalStateException("Cannot acquire a recycled resource");     // Catch: Throwable -> L8
    }
}
