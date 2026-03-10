package p134;

/* JADX INFO: renamed from: ˈˋ.ʿᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2537 extends AbstractC2520 {

    /* JADX INFO: renamed from: ʽ */
    public final int f8960;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f8961;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f8962;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f8963;

    public C2537(int r1, int r2, String r3, boolean r4) {
        this.f8963 = r3;
        this.f8962 = r1;
        this.f8960 = r2;
        this.f8961 = r4;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2520) == false) goto L16;
        C2537 r52 = (C2537) ((AbstractC2520) r5);
        String r1 = r52.f8963;
        if (this.f8963.equals(r1) == false) goto L16;
        if (this.f8962 != r52.f8962) goto L16;
        if (this.f8960 != r52.f8960) goto L16;
        if (this.f8961 != r52.f8961) goto L16;
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((this.f8963.hashCode() ^ 1000003) * 1000003) ^ this.f8962) * 1000003) ^ this.f8960) * 1000003;
        if (this.f8961 == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8963 + ", pid=" + this.f8962 + ", importance=" + this.f8960 + ", defaultProcess=" + this.f8961 + "}";
    }
}
