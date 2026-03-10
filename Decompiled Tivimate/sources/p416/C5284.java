package p416;

import p005j$.util.Objects;
import p083.C2114;

/* JADX INFO: renamed from: ﹳʽ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C5284 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2114 f19001;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f19002;

    public C5284(Class r1, C2114 r2) {
        this.f19002 = r1;
        this.f19001 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C5284) == true) goto L5;
        return false;
    L5:
        C5284 r42 = (C5284) r4;
        if (r42.f19002.equals(this.f19002) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f19001.equals(this.f19001) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f19002, this.f19001});
    }

    public final String toString() {
        return this.f19002.getSimpleName() + ", object identifier: " + this.f19001;
    }
}
