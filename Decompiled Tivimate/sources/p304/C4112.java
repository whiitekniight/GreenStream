package p304;

import p164.AbstractC2927;

/* JADX INFO: renamed from: ٴᵎ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4112 {

    /* JADX INFO: renamed from: ʽ */
    public final Throwable f15138;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC4126 f15139;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC4126 f15140;

    public /* synthetic */ C4112(InterfaceC4126 r2, Throwable r3, int r4) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r2, null, r3);
    }

    public C4112(InterfaceC4126 r1, C4124 r2, Throwable r3) {
        this.f15140 = r1;
        this.f15139 = r2;
        this.f15138 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4112) == true) goto L8;
        return false;
    L8:
        C4112 r52 = (C4112) r5;
        if (AbstractC2927.m6273(this.f15140, r52.f15140) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f15139, r52.f15139) == true) goto L15;
        return false;
    L15:
        if (AbstractC2927.m6273(this.f15138, r52.f15138) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f15140.hashCode() * 31;
        int r1 = 0;
        InterfaceC4126 r2 = this.f15139;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r02 = (r0 + r22) * 31;
        Throwable r23 = this.f15138;
        if (r23 == null) goto L11;
        r1 = r23.hashCode();
    L11:
        return r02 + r1;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f15140 + ", nextPlan=" + this.f15139 + ", throwable=" + this.f15138 + ')';
    }
}
