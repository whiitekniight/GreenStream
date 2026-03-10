package p320;

/* JADX INFO: renamed from: ᐧٴ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4256 extends AbstractC4232 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Integer f15595;

    public C4256(Integer r1) {
        this.f15595 = r1;
    }

    public final boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof AbstractC4232) == false) goto L15;
        Integer r1 = this.f15595;
        C4256 r42 = (C4256) ((AbstractC4232) r4);
        if (r1 != null) goto L14;
        if (r42.f15595 != null) goto L12;
        return true;
    L12:
        return false;
    L14:
        return r1.equals(r42.f15595);
    L15:
        return false;
    }

    public final int hashCode() {
        Integer r0 = this.f15595;
        if (r0 != null) goto L5;
        int r02 = 0;
    L7:
        return r02 ^ 1000003;
    L5:
        r02 = r0.hashCode();
        goto L7
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f15595 + "}";
    }
}
