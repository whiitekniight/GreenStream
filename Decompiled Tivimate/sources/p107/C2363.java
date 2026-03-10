package p107;

import p015.C1267;

/* JADX INFO: renamed from: ˆʽ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C2363 implements InterfaceC2365 {

    /* JADX INFO: renamed from: ˈٴ */
    public static final C1267 f8467 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public Object f8468;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f8469;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile InterfaceC2365 f8470;

    static {
        f8467 = new C1267(1);
    }

    public C2363(InterfaceC2365 r2) {
        this.f8469 = new Object();
        this.f8470 = r2;
    }

    @Override // p107.InterfaceC2365
    public final Object get() {
        InterfaceC2365 r0 = this.f8470;
        C1267 r1 = f8467;
        if (r0 == r1) goto L18;
        Object r02 = this.f8469;
        monitor-enter(r02);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (this.f8470 == r1) goto L13;
        Object r2 = this.f8470.get();     // Catch: Throwable -> L11
        this.f8468 = r2;     // Catch: Throwable -> L11
        this.f8470 = r1;     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r2;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L11
    L18:
        return this.f8468;
    }

    public final String toString() {
        Object r0 = this.f8470;
        StringBuilder r1 = new StringBuilder("Suppliers.memoize(");
        if (r0 != f8467) goto L5;
        r0 = "<supplier that returned " + this.f8468 + ">";
    L5:
        r1.append(r0);
        r1.append(")");
        return r1.toString();
    }
}
