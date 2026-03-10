package p134;

/* JADX INFO: renamed from: ˈˋ.ˈˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C2542 extends AbstractC2567 {

    /* JADX INFO: renamed from: ʽ */
    public final String f9007;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f9008;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9009;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f9010;

    public C2542(int r1, String r2, String r3, boolean r4) {
        this.f9010 = r1;
        this.f9009 = r2;
        this.f9007 = r3;
        this.f9008 = r4;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2567) == false) goto L16;
        C2542 r52 = (C2542) ((AbstractC2567) r5);
        int r1 = r52.f9010;
        if (this.f9010 != r1) goto L16;
        if (this.f9009.equals(r52.f9009) == false) goto L16;
        if (this.f9007.equals(r52.f9007) == false) goto L16;
        if (this.f9008 != r52.f9008) goto L16;
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((this.f9010 ^ 1000003) * 1000003) ^ this.f9009.hashCode()) * 1000003) ^ this.f9007.hashCode()) * 1000003;
        if (this.f9008 == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f9010 + ", version=" + this.f9009 + ", buildVersion=" + this.f9007 + ", jailbroken=" + this.f9008 + "}";
    }
}
