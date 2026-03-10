package p416;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ﹳʽ.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5281 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Class f18989;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f18990;

    public C5281(Class r1, Class r2) {
        this.f18990 = r1;
        this.f18989 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C5281) == true) goto L5;
        return false;
    L5:
        C5281 r42 = (C5281) r4;
        if (r42.f18990.equals(this.f18990) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f18989.equals(this.f18989) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f18990, this.f18989});
    }

    public final String toString() {
        return this.f18990.getSimpleName() + " with primitive type: " + this.f18989.getSimpleName();
    }
}
