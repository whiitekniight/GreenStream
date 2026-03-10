package p474;

/* JADX INFO: renamed from: ﾞﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5902 implements InterfaceC5900 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final Object f21628 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public volatile InterfaceC5901 f21629;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile Object f21630;

    static {
        f21628 = new Object();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static InterfaceC5900 m11564(InterfaceC5901 r2) {
        if ((r2 instanceof C5902) == false) goto L5;
        return r2;
    L5:
        C5902 r0 = new C5902();
        r0.f21630 = f21628;
        r0.f21629 = r2;
        return r0;
    }

    @Override // p355.InterfaceC4750
    public final Object get() {
        Object r0 = this.f21630;
        Object r1 = f21628;
        if (r0 != r1) goto L20;
        monitor-enter(this);
        Object r02 = this.f21630;     // Catch: Throwable -> L14
        if (r02 != r1) goto L16;
        r02 = this.f21629.get();     // Catch: Throwable -> L14
        Object r2 = this.f21630;     // Catch: Throwable -> L14
        if (r2 == r1) goto L13;
        if (r2 == r02) goto L13;
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r2 + " & " + r02 + ". This is likely due to a circular dependency.");     // Catch: Throwable -> L14
    L13:
        this.f21630 = r02;     // Catch: Throwable -> L14
        this.f21629 = null;     // Catch: Throwable -> L14
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
