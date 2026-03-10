package p134;

import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ᵎᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C2585 {

    /* JADX INFO: renamed from: ʽ */
    public boolean f9163;

    /* JADX INFO: renamed from: ˈ */
    public int f9164;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f9165;

    /* JADX INFO: renamed from: ᵎﹶ */
    public byte f9166;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f9167;

    /* JADX INFO: renamed from: ﹳٴ */
    public Double f9168;

    /* JADX INFO: renamed from: ﾞᴵ */
    public long f9169;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2577 m5794() {
        if (this.f9166 == 31) goto L22;
        StringBuilder r0 = new StringBuilder();
        if ((this.f9166 & 1) != 0) goto L8;
        r0.append(" batteryVelocity");
    L8:
        if ((this.f9166 & 2) != 0) goto L11;
        r0.append(" proximityOn");
    L11:
        if ((this.f9166 & 4) != 0) goto L14;
        r0.append(" orientation");
    L14:
        if ((this.f9166 & 8) != 0) goto L17;
        r0.append(" ramUsed");
    L17:
        if ((this.f9166 & 16) != 0) goto L20;
        r0.append(" diskUsed");
    L20:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r0));
    L22:
        return new C2577(this.f9168, this.f9167, this.f9163, this.f9164, this.f9165, this.f9169);
    }
}
