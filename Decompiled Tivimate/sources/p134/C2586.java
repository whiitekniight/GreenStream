package p134;

import java.util.List;
import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C2586 {

    /* JADX INFO: renamed from: ʼˎ */
    public AbstractC2567 f9170;

    /* JADX INFO: renamed from: ʽ */
    public String f9171;

    /* JADX INFO: renamed from: ˆʾ */
    public AbstractC2525 f9172;

    /* JADX INFO: renamed from: ˈ */
    public long f9173;

    /* JADX INFO: renamed from: ˉʿ */
    public byte f9174;

    /* JADX INFO: renamed from: ˑﹳ */
    public Long f9175;

    /* JADX INFO: renamed from: ٴﹶ */
    public List f9176;

    /* JADX INFO: renamed from: ᵎﹶ */
    public AbstractC2556 f9177;

    /* JADX INFO: renamed from: ᵔᵢ */
    public AbstractC2570 f9178;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f9179;

    /* JADX INFO: renamed from: ﹳٴ */
    public String f9180;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f9181;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f9182;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2569 m5795() {
        if (this.f9174 != 7) goto L13;
        String r4 = this.f9180;
        if (r4 == null) goto L13;
        String r5 = this.f9179;
        if (r5 == null) goto L13;
        AbstractC2556 r11 = this.f9177;
        if (r11 == null) goto L13;
        return new C2569(r4, r5, this.f9171, this.f9173, this.f9175, this.f9182, r11, this.f9178, this.f9170, this.f9172, this.f9176, this.f9181);
    L13:
        StringBuilder r1 = new StringBuilder();
        if (this.f9180 != null) goto L17;
        r1.append(" generator");
    L17:
        if (this.f9179 != null) goto L20;
        r1.append(" identifier");
    L20:
        if ((this.f9174 & 1) != 0) goto L23;
        r1.append(" startedAt");
    L23:
        if ((this.f9174 & 2) != 0) goto L26;
        r1.append(" crashed");
    L26:
        if (this.f9177 != null) goto L29;
        r1.append(" app");
    L29:
        if ((this.f9174 & 4) != 0) goto L32;
        r1.append(" generatorType");
    L32:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r1));
    }
}
