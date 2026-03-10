package p416;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ﹳʽ.ٴʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C5278 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Class f18984;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f18985;

    public C5278(Class r1, Class r2) {
        this.f18985 = r1;
        this.f18984 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C5278) == true) goto L5;
        return false;
    L5:
        C5278 r42 = (C5278) r4;
        if (r42.f18985.equals(this.f18985) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f18984.equals(this.f18984) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f18985, this.f18984});
    }

    public final String toString() {
        return this.f18985.getSimpleName() + " with serialization type: " + this.f18984.getSimpleName();
    }
}
