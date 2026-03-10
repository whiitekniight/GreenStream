package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2549 extends AbstractC2529 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9040;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9041;

    public C2549(String r1, String r2) {
        this.f9041 = r1;
        this.f9040 = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2529) == false) goto L12;
        C2549 r52 = (C2549) ((AbstractC2529) r5);
        String r1 = r52.f9041;
        if (this.f9041.equals(r1) == false) goto L12;
        if (this.f9040.equals(r52.f9040) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f9041.hashCode() ^ 1000003) * 1000003) ^ this.f9040.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("CustomAttribute{key=");
        r0.append(this.f9041);
        r0.append(", value=");
        return AbstractC1703.m4486(r0, this.f9040, "}");
    }
}
