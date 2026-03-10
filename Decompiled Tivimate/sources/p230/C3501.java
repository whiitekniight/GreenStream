package p230;

import p005j$.util.Objects;
import p047.AbstractC1703;
import p289.AbstractC4011;
import p469.C5867;

/* JADX INFO: renamed from: ˏˑ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3501 extends AbstractC4011 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3500 f12468;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f12469;

    public C3501(int r1, C3500 r2) {
        this.f12469 = r1;
        this.f12468 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C5867 m7256() {
        C5867 r0 = new C5867();
        r0.f21448 = null;
        r0.f21447 = C3500.f12465;
        return r0;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3501) == true) goto L5;
        return false;
    L5:
        C3501 r42 = (C3501) r4;
        if (r42.f12469 == this.f12469) goto L8;
    L11:
        return false;
    L8:
        if (r42.f12468 != this.f12468) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{C3501.class, Integer.valueOf(this.f12469), this.f12468});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AesSiv Parameters (variant: ");
        r0.append(this.f12468);
        r0.append(", ");
        return AbstractC1703.m4493(r0, this.f12469, "-byte key)");
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f12468 == C3500.f12465) goto L6;
        return true;
    L6:
        return false;
    }
}
