package p041;

import java.util.Iterator;

/* JADX INFO: renamed from: ʼᴵ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C1604 implements InterfaceC1613 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f5320;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC1613 f5321;

    public C1604(InterfaceC1613 r2, int r3) {
        this.f5321 = r2;
        this.f5320 = r3;
        if (r3 < 0) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(("count must be non-negative, but was " + r3 + '.').toString());
    }

    @Override // p041.InterfaceC1613
    public final Iterator iterator() {
        return new C1611(this);
    }
}
