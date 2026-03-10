package p025;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ʻᵢ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1400 implements InterfaceC1391, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final AtomicReferenceFieldUpdater f4781 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public volatile InterfaceC4587 f4782;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile Object f4783;

    static {
        f4781 = AtomicReferenceFieldUpdater.newUpdater(C1400.class, Object.class, "\u1d35\u02ca");
    }

    @Override // p025.InterfaceC1391
    public final Object getValue() {
        Object r0 = this.f4783;
        C1399 r1 = C1399.f4780;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        InterfaceC4587 r02 = this.f4782;
        if (r02 == null) goto L15;
        Object r03 = r02.mo716();
        AtomicReferenceFieldUpdater r2 = f4781;
    L9:
        if (r2.compareAndSet(this, r1, r03) == true) goto L10;
        if (r2.get(this) == r1) goto L9;
    L10:
        this.f4782 = null;
        return r03;
    L15:
        return this.f4783;
    }

    public final String toString() {
        if (this.f4783 != C1399.f4780) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
