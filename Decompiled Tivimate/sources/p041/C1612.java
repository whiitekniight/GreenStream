package p041;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ʼᴵ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1612 implements InterfaceC1613 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final AtomicReference f5340;

    public C1612(C1607 r2) {
        this.f5340 = new AtomicReference(r2);
    }

    @Override // p041.InterfaceC1613
    public final Iterator iterator() {
        InterfaceC1613 r0 = (InterfaceC1613) this.f5340.getAndSet(null);
        if (r0 == null) goto L7;
        return r0.iterator();
    L7:
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
