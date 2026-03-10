package p134;

import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C2539 {

    /* JADX INFO: renamed from: ʼˎ */
    public String f8977;

    /* JADX INFO: renamed from: ʽ */
    public int f8978;

    /* JADX INFO: renamed from: ˆʾ */
    public byte f8979;

    /* JADX INFO: renamed from: ˈ */
    public long f8980;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f8981;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f8982;

    /* JADX INFO: renamed from: ᵔᵢ */
    public String f8983;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f8984;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f8985;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f8986;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2590 m5786() {
        if (this.f8979 != 63) goto L13;
        String r4 = this.f8984;
        if (r4 == null) goto L13;
        String r12 = this.f8983;
        if (r12 == null) goto L13;
        String r13 = this.f8977;
        if (r13 == null) goto L13;
        return new C2590(this.f8985, r4, this.f8978, this.f8980, this.f8981, this.f8986, this.f8982, r12, r13);
    L13:
        StringBuilder r0 = new StringBuilder();
        if ((this.f8979 & 1) != 0) goto L17;
        r0.append(" arch");
    L17:
        if (this.f8984 != null) goto L20;
        r0.append(" model");
    L20:
        if ((this.f8979 & 2) != 0) goto L23;
        r0.append(" cores");
    L23:
        if ((this.f8979 & 4) != 0) goto L26;
        r0.append(" ram");
    L26:
        if ((this.f8979 & 8) != 0) goto L29;
        r0.append(" diskSpace");
    L29:
        if ((this.f8979 & 16) != 0) goto L32;
        r0.append(" simulator");
    L32:
        if ((this.f8979 & 32) != 0) goto L35;
        r0.append(" state");
    L35:
        if (this.f8983 != null) goto L38;
        r0.append(" manufacturer");
    L38:
        if (this.f8977 != null) goto L41;
        r0.append(" modelClass");
    L41:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r0));
    }
}
