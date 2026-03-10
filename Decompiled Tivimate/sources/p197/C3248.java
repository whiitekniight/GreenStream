package p197;

import java.security.MessageDigest;
import p043.InterfaceC1624;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ˋᵎ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3248 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f11468;

    public C3248(Object r2) {
        AbstractC2234.m5422(r2, "Argument must not be null");
        this.f11468 = r2;
    }

    @Override // p043.InterfaceC1624
    public final boolean equals(Object r2) {
        if ((r2 instanceof C3248) == true) goto L5;
        return false;
    L5:
        return this.f11468.equals(((C3248) r2).f11468);
    }

    @Override // p043.InterfaceC1624
    public final int hashCode() {
        return this.f11468.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f11468 + '}';
    }

    @Override // p043.InterfaceC1624
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4285(MessageDigest r3) {
        r3.update(this.f11468.toString().getBytes(InterfaceC1624.f5345));
    }
}
