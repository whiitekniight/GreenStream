package p134;

import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ᴵˑ */
/* JADX INFO: loaded from: classes.dex */
public final class C2580 {

    /* JADX INFO: renamed from: ʽ */
    public String f9148;

    /* JADX INFO: renamed from: ˈ */
    public long f9149;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f9150;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f9151;

    /* JADX INFO: renamed from: ﹳٴ */
    public long f9152;

    /* JADX INFO: renamed from: ﾞᴵ */
    public byte f9153;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2547 m5793() {
        if (this.f9153 != 7) goto L9;
        String r5 = this.f9151;
        if (r5 == null) goto L9;
        return new C2547(this.f9152, r5, this.f9148, this.f9149, this.f9150);
    L9:
        StringBuilder r0 = new StringBuilder();
        if ((this.f9153 & 1) != 0) goto L13;
        r0.append(" pc");
    L13:
        if (this.f9151 != null) goto L16;
        r0.append(" symbol");
    L16:
        if ((this.f9153 & 2) != 0) goto L19;
        r0.append(" offset");
    L19:
        if ((this.f9153 & 4) != 0) goto L22;
        r0.append(" importance");
    L22:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r0));
    }
}
