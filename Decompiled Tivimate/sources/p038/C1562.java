package p038;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ʼـ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 extends AbstractC1561 {
    public C1562() {
        this(C1564.f5177);
    }

    public C1562(AbstractC1561 r2) {
        LinkedHashMap r22 = r2.f5176;
        this.f5176.putAll(r22);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m4136(InterfaceC1563 r2, Object r3) {
        this.f5176.put(r2, r3);
    }

    @Override // p038.AbstractC1561
    /* JADX INFO: renamed from: ﹳٴ */
    public final Object mo4135(InterfaceC1563 r2) {
        return this.f5176.get(r2);
    }
}
