package p134;

import java.util.List;
import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2528 {

    /* JADX INFO: renamed from: ʼˎ */
    public List f8928;

    /* JADX INFO: renamed from: ʽ */
    public int f8929;

    /* JADX INFO: renamed from: ˆʾ */
    public byte f8930;

    /* JADX INFO: renamed from: ˈ */
    public int f8931;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f8932;

    /* JADX INFO: renamed from: ᵎﹶ */
    public long f8933;

    /* JADX INFO: renamed from: ᵔᵢ */
    public String f8934;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f8935;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f8936;

    /* JADX INFO: renamed from: ﾞᴵ */
    public long f8937;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2543 m5783() {
        if (this.f8930 != 63) goto L9;
        String r4 = this.f8935;
        if (r4 == null) goto L9;
        return new C2543(this.f8936, r4, this.f8929, this.f8931, this.f8932, this.f8937, this.f8933, this.f8934, this.f8928);
    L9:
        StringBuilder r0 = new StringBuilder();
        if ((this.f8930 & 1) != 0) goto L13;
        r0.append(" pid");
    L13:
        if (this.f8935 != null) goto L16;
        r0.append(" processName");
    L16:
        if ((this.f8930 & 2) != 0) goto L19;
        r0.append(" reasonCode");
    L19:
        if ((this.f8930 & 4) != 0) goto L22;
        r0.append(" importance");
    L22:
        if ((this.f8930 & 8) != 0) goto L25;
        r0.append(" pss");
    L25:
        if ((this.f8930 & 16) != 0) goto L28;
        r0.append(" rss");
    L28:
        if ((this.f8930 & 32) != 0) goto L31;
        r0.append(" timestamp");
    L31:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r0));
    }
}
