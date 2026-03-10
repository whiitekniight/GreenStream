package p183;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˊﾞ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C3130 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3124 f10976;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3124 f10977;

    public C3130(C3124 r1, C3124 r2) {
        this.f10977 = r1;
        this.f10976 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C3130.class != r5.getClass()) goto L15;
        C3130 r52 = (C3130) r5;
        if (this.f10977.equals(r52.f10977) == false) goto L15;
        if (this.f10976.equals(r52.f10976) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f10977.hashCode() * 31;
        return this.f10976.hashCode() + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        C3124 r1 = this.f10977;
        r0.append(r1);
        C3124 r2 = this.f10976;
        if (r1.equals(r2) == false) goto L5;
        String r12 = "";
    L7:
        return AbstractC1703.m4486(r0, r12, "]");
    L5:
        r12 = ", " + r2;
        goto L7
    }
}
