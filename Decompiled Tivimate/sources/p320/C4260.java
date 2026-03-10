package p320;

/* JADX INFO: renamed from: ᐧٴ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4260 extends AbstractC4238 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4256 f15611;

    public C4260(C4256 r1) {
        this.f15611 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC4238) == false) goto L9;
        C4256 r22 = ((C4260) ((AbstractC4238) r2)).f15611;
        return this.f15611.equals(r22);
    L9:
        return false;
    }

    public final int hashCode() {
        return this.f15611.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f15611 + "}";
    }
}
