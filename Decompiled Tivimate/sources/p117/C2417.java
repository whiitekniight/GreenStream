package p117;

import p319.AbstractC4223;

/* JADX INFO: renamed from: ˆי.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2417 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f8635;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f8636;

    public C2417(int r3) {
        if (r3 < 1) goto L9;
        if (r3 > 256) goto L9;
        this.f8636 = r3;
        this.f8635 = new byte[r3];
        return;
    L9:
        throw new IllegalArgumentException(AbstractC4223.m8643(r3, "Invalid distance: "));
    }

    public C2417(int r1, byte[] r2) {
        this.f8635 = r2;
        this.f8636 = r1;
    }
}
