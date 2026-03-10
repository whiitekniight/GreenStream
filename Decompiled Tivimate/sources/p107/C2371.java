package p107;

import java.io.Serializable;

/* JADX INFO: renamed from: ˆʽ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2371 implements InterfaceC2365, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public volatile transient boolean f8474;

    /* JADX INFO: renamed from: ʾˋ */
    public final transient Object f8475;

    /* JADX INFO: renamed from: ˈٴ */
    public transient Object f8476;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC2365 f8477;

    public C2371(InterfaceC2365 r2) {
        this.f8475 = new Object();
        this.f8477 = r2;
    }

    @Override // p107.InterfaceC2365
    public final Object get() {
        if (this.f8474 == true) goto L18;
        Object r0 = this.f8475;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (this.f8474 == true) goto L13;
        Object r1 = this.f8477.get();     // Catch: Throwable -> L11
        this.f8476 = r1;     // Catch: Throwable -> L11
        this.f8474 = true;     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r1;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
    L18:
        return this.f8476;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Suppliers.memoize(");
        if (this.f8474 == false) goto L5;
        Object r1 = "<supplier that returned " + this.f8476 + ">";
    L6:
        r0.append(r1);
        r0.append(")");
        return r0.toString();
    L5:
        r1 = this.f8477;
        goto L6
    }
}
