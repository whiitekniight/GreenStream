package p320;

/* JADX INFO: renamed from: ᐧٴ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4227 extends AbstractC4252 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final EnumC4248 f15531;

    /* JADX INFO: renamed from: ﹳٴ */
    public final EnumC4241 f15532;

    public C4227(EnumC4241 r1, EnumC4248 r2) {
        this.f15532 = r1;
        this.f15531 = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC4252) == false) goto L22;
        AbstractC4252 r52 = (AbstractC4252) r5;
        EnumC4241 r1 = this.f15532;
        if (r1 != null) goto L13;
        if (((C4227) r52).f15532 != null) goto L22;
    L14:
        EnumC4248 r12 = this.f15531;
        if (r12 != null) goto L20;
        if (((C4227) r52).f15531 != null) goto L22;
    L21:
        return true;
    L20:
        if (r12.equals(((C4227) r52).f15531) == false) goto L22;
    L13:
        if (r1.equals(((C4227) r52).f15532) == true) goto L14;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        EnumC4241 r1 = this.f15532;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (r12 ^ 1000003) * 1000003;
        EnumC4248 r2 = this.f15531;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r0 ^ r13;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15532 + ", mobileSubtype=" + this.f15531 + "}";
    }
}
