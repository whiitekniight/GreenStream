package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ʻᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2521 extends AbstractC2601 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8900;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f8901;

    public C2521(String r1, String r2) {
        this.f8901 = r1;
        this.f8900 = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2601) == false) goto L12;
        C2521 r52 = (C2521) ((AbstractC2601) r5);
        String r1 = r52.f8901;
        if (this.f8901.equals(r1) == false) goto L12;
        if (this.f8900.equals(r52.f8900) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f8901.hashCode() ^ 1000003) * 1000003) ^ this.f8900.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("RolloutVariant{rolloutId=");
        r0.append(this.f8901);
        r0.append(", variantId=");
        return AbstractC1703.m4486(r0, this.f8900, "}");
    }
}
