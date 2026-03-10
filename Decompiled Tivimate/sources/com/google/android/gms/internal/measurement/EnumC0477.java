package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ᵢᵎ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0477 extends Enum implements InterfaceC0361 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC0477 f2244 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC0477 f2245 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC0477 f2246 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final /* synthetic */ EnumC0477[] f2247 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC0477 f2248 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC0477 f2249 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f2250;

    static {
        EnumC0477 r0 = new EnumC0477(0, 0, "PURPOSE_RESTRICTION_NOT_ALLOWED");
        f2248 = r0;
        EnumC0477 r2 = new EnumC0477(1, 1, "PURPOSE_RESTRICTION_REQUIRE_CONSENT");
        f2244 = r2;
        EnumC0477 r4 = new EnumC0477(2, 2, "PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST");
        f2245 = r4;
        EnumC0477 r6 = new EnumC0477(3, 3, "PURPOSE_RESTRICTION_UNDEFINED");
        f2249 = r6;
        EnumC0477 r8 = new EnumC0477(4, -1, "UNRECOGNIZED");
        f2246 = r8;
        f2247 = new EnumC0477[]{r0, r2, r4, r6, r8};
    }

    EnumC0477(int r1, int r2, String r3) {
        this.f2250 = r2;
    }

    public static EnumC0477[] values() {
        return (EnumC0477[]) f2247.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2250);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0361
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo1693() {
        if (this == f2246) goto L7;
        return this.f2250;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
