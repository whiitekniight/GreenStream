package p087;

import p355.InterfaceC4750;

/* JADX INFO: renamed from: ʾﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2137 implements InterfaceC4750 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final Object f7642 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public volatile InterfaceC2136 f7643;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile Object f7644;

    static {
        f7642 = new Object();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static InterfaceC4750 m5225(InterfaceC2136 r2) {
        if ((r2 instanceof C2137) == false) goto L5;
        return r2;
    L5:
        C2137 r0 = new C2137();
        r0.f7644 = f7642;
        r0.f7643 = r2;
        return r0;
    }

    @Override // p355.InterfaceC4750
    public final Object get() {
        Object r0 = this.f7644;
        Object r1 = f7642;
        if (r0 != r1) goto L20;
        monitor-enter(this);
        Object r02 = this.f7644;     // Catch: Throwable -> L14
        if (r02 != r1) goto L16;
        r02 = this.f7643.get();     // Catch: Throwable -> L14
        Object r2 = this.f7644;     // Catch: Throwable -> L14
        if (r2 == r1) goto L13;
        if (r2 == r02) goto L13;
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r2 + " & " + r02 + ". This is likely due to a circular dependency.");     // Catch: Throwable -> L14
    L13:
        this.f7644 = r02;     // Catch: Throwable -> L14
        this.f7643 = null;     // Catch: Throwable -> L14
    L16:
        monitor-exit(this);     // Catch: Throwable -> L14
        return r02;
    L14:
        th = move-exception;
        throw th;
    L20:
        return r0;
    }
}
