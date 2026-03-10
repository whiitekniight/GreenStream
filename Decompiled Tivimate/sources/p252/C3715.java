package p252;

import p047.AbstractC1703;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ˑᵎ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3715 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f13287;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f13288;

    public C3715(int r1, String r2) {
        this.f13288 = r2;
        this.f13287 = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3715) == true) goto L8;
        return false;
    L8:
        C3715 r52 = (C3715) r5;
        if (AbstractC2927.m6273(this.f13288, r52.f13288) == true) goto L12;
        return false;
    L12:
        if (this.f13287 == r52.f13287) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        return (this.f13288.hashCode() * 31) + this.f13287;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("WorkGenerationalId(workSpecId=");
        r0.append(this.f13288);
        r0.append(", generation=");
        return AbstractC1703.m4495(r0, this.f13287, ')');
    }
}
