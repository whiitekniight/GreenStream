package p092;

import java.security.MessageDigest;
import p043.InterfaceC1624;

/* JADX INFO: renamed from: ʿʾ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2198 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ʽ */
    public final InterfaceC1624 f7954;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC1624 f7955;

    public C2198(InterfaceC1624 r1, InterfaceC1624 r2) {
        this.f7955 = r1;
        this.f7954 = r2;
    }

    @Override // p043.InterfaceC1624
    public final boolean equals(Object r4) {
        if ((r4 instanceof C2198) == false) goto L10;
        C2198 r42 = (C2198) r4;
        if (this.f7955.equals(r42.f7955) == false) goto L10;
        if (this.f7954.equals(r42.f7954) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p043.InterfaceC1624
    public final int hashCode() {
        int r0 = this.f7955.hashCode() * 31;
        return this.f7954.hashCode() + r0;
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f7955 + ", signature=" + this.f7954 + '}';
    }

    @Override // p043.InterfaceC1624
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4285(MessageDigest r2) {
        this.f7955.mo4285(r2);
        this.f7954.mo4285(r2);
    }
}
