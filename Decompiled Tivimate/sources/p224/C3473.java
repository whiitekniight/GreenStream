package p224;

import p086.InterfaceC2133;

/* JADX INFO: renamed from: ˏ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3473 implements InterfaceC2133 {

    /* JADX INFO: renamed from: ʽ */
    public static final Object f12349 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public volatile InterfaceC2133 f12350;

    /* JADX INFO: renamed from: ﹳٴ */
    public volatile Object f12351;

    static {
        f12349 = new Object();
    }

    public C3473(InterfaceC2133 r2) {
        this.f12351 = f12349;
        this.f12350 = r2;
    }

    @Override // p086.InterfaceC2133
    public final Object get() {
        Object r0 = this.f12351;
        Object r1 = f12349;
        if (r0 != r1) goto L14;
        monitor-enter(this);
        Object r02 = this.f12351;     // Catch: Throwable -> L8
        if (r02 != r1) goto L10;
        r02 = this.f12350.get();     // Catch: Throwable -> L8
        this.f12351 = r02;     // Catch: Throwable -> L8
        this.f12350 = null;     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
        return r02;
    L8:
        th = move-exception;
        throw th;
    L14:
        return r0;
    }
}
