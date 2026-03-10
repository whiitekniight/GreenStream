package p257;

import p005j$.util.Objects;

/* JADX INFO: renamed from: יʻ.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3759 extends AbstractC3739 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3744 f13571;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f13572;

    public C3759(String r1, C3744 r2) {
        this.f13572 = r1;
        this.f13571 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3759) == true) goto L5;
        return false;
    L5:
        C3759 r42 = (C3759) r4;
        if (r42.f13572.equals(this.f13572) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f13571.equals(this.f13571) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{C3759.class, this.f13572, this.f13571});
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f13572 + ", variant: " + this.f13571 + ")";
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f13571 == C3744.f13494) goto L6;
        return true;
    L6:
        return false;
    }
}
