package p257;

import p005j$.util.Objects;

/* JADX INFO: renamed from: יʻ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C3755 extends AbstractC3739 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3744 f13552;

    public C3755(C3744 r1) {
        this.f13552 = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C3755) == true) goto L6;
        return false;
    L6:
        if (((C3755) r3).f13552 != this.f13552) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{C3755.class, this.f13552});
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f13552 + ")";
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f13552 == C3744.f13486) goto L6;
        return true;
    L6:
        return false;
    }
}
