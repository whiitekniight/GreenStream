package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˋ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0349 extends Enum implements InterfaceC0361 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC0349 f2015 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC0349 f2016 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC0349 f2017 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC0349 f2018 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final /* synthetic */ EnumC0349[] f2019 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC0349 f2020 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC0349 f2021 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC0349 f2022 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final EnumC0349 f2023 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f2024;

    static {
        EnumC0349 r0 = new EnumC0349(0, 0, "IAB_TCF_PURPOSE_UNKNOWN");
        EnumC0349 r2 = new EnumC0349(1, 1, "IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE");
        f2021 = r2;
        EnumC0349 r4 = new EnumC0349(2, 2, "IAB_TCF_PURPOSE_SELECT_BASIC_ADS");
        f2015 = r4;
        EnumC0349 r6 = new EnumC0349(3, 3, "IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE");
        f2016 = r6;
        EnumC0349 r8 = new EnumC0349(4, 4, "IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS");
        f2022 = r8;
        EnumC0349 r10 = new EnumC0349(5, 5, "IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE");
        EnumC0349 r12 = new EnumC0349(6, 6, "IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT");
        EnumC0349 r14 = new EnumC0349(7, 7, "IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE");
        f2018 = r14;
        EnumC0349 r1 = new EnumC0349(8, 8, "IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE");
        EnumC0349 r5 = new EnumC0349(9, 9, "IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS");
        f2020 = r5;
        EnumC0349 r7 = new EnumC0349(10, 10, "IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS");
        f2017 = r7;
        EnumC0349 r9 = new EnumC0349(11, 11, "IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT");
        EnumC0349 r11 = new EnumC0349(12, -1, "UNRECOGNIZED");
        f2023 = r11;
        f2019 = new EnumC0349[]{r0, r2, r4, r6, r8, r10, r12, r14, r1, r5, r7, r9, r11};
    }

    EnumC0349(int r1, int r2, String r3) {
        this.f2024 = r2;
    }

    public static EnumC0349[] values() {
        return (EnumC0349[]) f2019.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2024);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0361
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo1693() {
        if (this == f2023) goto L7;
        return this.f2024;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
