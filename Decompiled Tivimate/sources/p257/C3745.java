package p257;

import p005j$.util.Objects;

/* JADX INFO: renamed from: יʻ.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C3745 extends AbstractC3739 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3744 f13523;

    public C3745(C3744 r1) {
        this.f13523 = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C3745) == true) goto L6;
        return false;
    L6:
        if (((C3745) r3).f13523 != this.f13523) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{C3745.class, this.f13523});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f13523 + ")";
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f13523 == C3744.f13511) goto L6;
        return true;
    L6:
        return false;
    }
}
