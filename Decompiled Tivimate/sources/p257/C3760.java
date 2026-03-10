package p257;

import p005j$.util.Objects;

/* JADX INFO: renamed from: יʻ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C3760 extends AbstractC3739 {

    /* JADX INFO: renamed from: ʽ */
    public final C3744 f13573;

    /* JADX INFO: renamed from: ˈ */
    public final AbstractC3739 f13574;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f13575;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3744 f13576;

    public C3760(C3744 r1, String r2, C3744 r3, AbstractC3739 r4) {
        this.f13576 = r1;
        this.f13575 = r2;
        this.f13573 = r3;
        this.f13574 = r4;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3760) == true) goto L5;
        return false;
    L5:
        C3760 r42 = (C3760) r4;
        if (r42.f13573.equals(this.f13573) == true) goto L8;
    L15:
        return false;
    L8:
        if (r42.f13574.equals(this.f13574) == false) goto L15;
        if (r42.f13575.equals(this.f13575) == false) goto L15;
        if (r42.f13576.equals(this.f13576) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{C3760.class, this.f13575, this.f13573, this.f13574, this.f13576});
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f13575 + ", dekParsingStrategy: " + this.f13573 + ", dekParametersForNewKeys: " + this.f13574 + ", variant: " + this.f13576 + ")";
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f13576 == C3744.f13501) goto L6;
        return true;
    L6:
        return false;
    }
}
