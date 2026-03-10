package p320;

/* JADX INFO: renamed from: ᐧٴ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C4240 extends AbstractC4234 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4260 f15562;

    public C4240(C4260 r2) {
        EnumC4257 r0 = EnumC4257.f15596;
        this.f15562 = r2;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L5;
        return true;
    L5:
        if ((r2 instanceof AbstractC4234) == false) goto L12;
        C4260 r22 = ((C4240) ((AbstractC4234) r2)).f15562;
        if (this.f15562.equals(r22) == false) goto L15;
        Object r23 = EnumC4257.f15596;
        if (r23.equals(r23) == false) goto L16;
        return true;
    L16:
        return false;
    L15:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f15562.hashCode() ^ 1000003) * 1000003) ^ EnumC4257.f15596.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f15562 + ", productIdOrigin=" + EnumC4257.f15596 + "}";
    }
}
