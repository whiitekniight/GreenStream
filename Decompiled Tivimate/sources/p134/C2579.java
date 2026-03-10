package p134;

/* JADX INFO: renamed from: ˈˋ.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2579 extends AbstractC2604 {

    /* JADX INFO: renamed from: ʼˎ */
    public final String f9136;

    /* JADX INFO: renamed from: ʽ */
    public final String f9137;

    /* JADX INFO: renamed from: ˆʾ */
    public final String f9138;

    /* JADX INFO: renamed from: ˈ */
    public final int f9139;

    /* JADX INFO: renamed from: ˉʿ */
    public final AbstractC2566 f9140;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f9141;

    /* JADX INFO: renamed from: ٴﹶ */
    public final AbstractC2597 f9142;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f9143;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final String f9144;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9145;

    /* JADX INFO: renamed from: ﾞʻ */
    public final AbstractC2560 f9146;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f9147;

    public C2579(String r1, String r2, int r3, String r4, String r5, String r6, String r7, String r8, String r9, AbstractC2597 r10, AbstractC2560 r11, AbstractC2566 r12) {
        this.f9145 = r1;
        this.f9137 = r2;
        this.f9139 = r3;
        this.f9141 = r4;
        this.f9147 = r5;
        this.f9143 = r6;
        this.f9144 = r7;
        this.f9136 = r8;
        this.f9138 = r9;
        this.f9142 = r10;
        this.f9146 = r11;
        this.f9140 = r12;
    }

    public final boolean equals(Object r11) {
        if (r11 != this) goto L6;
        return true;
    L6:
        if ((r11 instanceof AbstractC2604) == false) goto L56;
        C2579 r112 = (C2579) ((AbstractC2604) r11);
        AbstractC2566 r1 = r112.f9140;
        AbstractC2560 r3 = r112.f9146;
        AbstractC2597 r4 = r112.f9142;
        String r5 = r112.f9144;
        String r6 = r112.f9143;
        String r7 = r112.f9147;
        String r8 = r112.f9145;
        if (this.f9145.equals(r8) == false) goto L56;
        if (this.f9137.equals(r112.f9137) == false) goto L56;
        if (this.f9139 != r112.f9139) goto L56;
        if (this.f9141.equals(r112.f9141) == false) goto L56;
        String r82 = this.f9147;
        if (r82 != null) goto L20;
        if (r7 != null) goto L56;
    L21:
        String r72 = this.f9143;
        if (r72 != null) goto L26;
        if (r6 != null) goto L56;
    L27:
        String r62 = this.f9144;
        if (r62 != null) goto L32;
        if (r5 != null) goto L56;
    L34:
        if (this.f9136.equals(r112.f9136) == false) goto L56;
        if (this.f9138.equals(r112.f9138) == false) goto L56;
        AbstractC2597 r113 = this.f9142;
        if (r113 != null) goto L42;
        if (r4 != null) goto L56;
    L43:
        AbstractC2560 r114 = this.f9146;
        if (r114 != null) goto L48;
        if (r3 != null) goto L56;
    L49:
        AbstractC2566 r115 = this.f9140;
        if (r115 != null) goto L54;
        if (r1 != null) goto L56;
    L55:
        return true;
    L54:
        if (r115.equals(r1) == false) goto L56;
    L48:
        if (r114.equals(r3) == false) goto L56;
    L42:
        if (r113.equals(r4) == false) goto L56;
    L32:
        if (r62.equals(r5) == false) goto L56;
    L26:
        if (r72.equals(r6) == false) goto L56;
    L20:
        if (r82.equals(r7) == true) goto L21;
    L56:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((((this.f9145.hashCode() ^ 1000003) * 1000003) ^ this.f9137.hashCode()) * 1000003) ^ this.f9139) * 1000003) ^ this.f9141.hashCode()) * 1000003;
        int r2 = 0;
        String r3 = this.f9147;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r02 = (r0 ^ r32) * 1000003;
        String r33 = this.f9143;
        if (r33 != null) goto L9;
        int r34 = 0;
    L10:
        int r03 = (r02 ^ r34) * 1000003;
        String r35 = this.f9144;
        if (r35 != null) goto L13;
        int r36 = 0;
    L14:
        int r04 = (((((r03 ^ r36) * 1000003) ^ this.f9136.hashCode()) * 1000003) ^ this.f9138.hashCode()) * 1000003;
        AbstractC2597 r37 = this.f9142;
        if (r37 != null) goto L17;
        int r38 = 0;
    L18:
        int r05 = (r04 ^ r38) * 1000003;
        AbstractC2560 r39 = this.f9146;
        if (r39 != null) goto L21;
        int r310 = 0;
    L22:
        int r06 = (r05 ^ r310) * 1000003;
        AbstractC2566 r1 = this.f9140;
        if (r1 == null) goto L27;
        r2 = r1.hashCode();
    L27:
        return r06 ^ r2;
    L21:
        r310 = r39.hashCode();
        goto L22
    L17:
        r38 = r37.hashCode();
        goto L18
    L13:
        r36 = r35.hashCode();
        goto L14
    L9:
        r34 = r33.hashCode();
        goto L10
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f9145 + ", gmpAppId=" + this.f9137 + ", platform=" + this.f9139 + ", installationUuid=" + this.f9141 + ", firebaseInstallationId=" + this.f9147 + ", firebaseAuthenticationToken=" + this.f9143 + ", appQualitySessionId=" + this.f9144 + ", buildVersion=" + this.f9136 + ", displayVersion=" + this.f9138 + ", session=" + this.f9142 + ", ndkPayload=" + this.f9146 + ", appExitInfo=" + this.f9140 + "}";
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2532 m5792() {
        C2532 r0 = new C2532();
        r0.f8950 = this.f9145;
        r0.f8949 = this.f9137;
        r0.f8941 = this.f9139;
        r0.f8943 = this.f9141;
        r0.f8945 = this.f9147;
        r0.f8952 = this.f9143;
        r0.f8947 = this.f9144;
        r0.f8948 = this.f9136;
        r0.f8940 = this.f9138;
        r0.f8942 = this.f9142;
        r0.f8946 = this.f9146;
        r0.f8951 = this.f9140;
        r0.f8944 = 1;
        return r0;
    }
}
