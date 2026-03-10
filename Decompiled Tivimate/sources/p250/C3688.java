package p250;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ˑٴ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3688 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f13198;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f13199;

    public C3688(Object r1, Object r2) {
        this.f13199 = r1;
        this.f13198 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3688) == true) goto L5;
        return false;
    L5:
        C3688 r42 = (C3688) r4;
        if (Objects.equals(r42.f13199, this.f13199) == true) goto L8;
    L11:
        return false;
    L8:
        if (Objects.equals(r42.f13198, this.f13198) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f13199;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        Object r2 = this.f13198;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r0 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "Pair{" + this.f13199 + " " + this.f13198 + "}";
    }
}
