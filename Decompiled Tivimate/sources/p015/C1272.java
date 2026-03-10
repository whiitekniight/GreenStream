package p015;

import p005j$.util.Objects;
import p067.AbstractC1928;
import p432.C5470;

/* JADX INFO: renamed from: ʻʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1272 {

    /* JADX INFO: renamed from: ʼˎ */
    public final long f4220;

    /* JADX INFO: renamed from: ʽ */
    public final int f4221;

    /* JADX INFO: renamed from: ˆʾ */
    public final long f4222;

    /* JADX INFO: renamed from: ˈ */
    public final C5470 f4223;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f4224;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int f4225;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final C5470 f4226;

    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractC1928 f4227;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f4228;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final AbstractC1928 f4229;

    public C1272(long r1, AbstractC1928 r3, int r4, C5470 r5, long r6, AbstractC1928 r8, int r9, C5470 r10, long r11, long r13) {
        this.f4228 = r1;
        this.f4227 = r3;
        this.f4221 = r4;
        this.f4223 = r5;
        this.f4224 = r6;
        this.f4229 = r8;
        this.f4225 = r9;
        this.f4226 = r10;
        this.f4220 = r11;
        this.f4222 = r13;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L31:
        return false;
    L8:
        if (C1272.class != r7.getClass()) goto L31;
        C1272 r72 = (C1272) r7;
        if (this.f4228 != r72.f4228) goto L31;
        if (this.f4221 != r72.f4221) goto L31;
        if (this.f4224 != r72.f4224) goto L31;
        if (this.f4225 != r72.f4225) goto L31;
        if (this.f4220 != r72.f4220) goto L31;
        if (this.f4222 != r72.f4222) goto L31;
        if (Objects.equals(this.f4227, r72.f4227) == false) goto L31;
        if (Objects.equals(this.f4223, r72.f4223) == false) goto L31;
        if (Objects.equals(this.f4229, r72.f4229) == false) goto L31;
        if (Objects.equals(this.f4226, r72.f4226) == false) goto L31;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f4228), this.f4227, Integer.valueOf(this.f4221), this.f4223, Long.valueOf(this.f4224), this.f4229, Integer.valueOf(this.f4225), this.f4226, Long.valueOf(this.f4220), Long.valueOf(this.f4222)});
    }
}
