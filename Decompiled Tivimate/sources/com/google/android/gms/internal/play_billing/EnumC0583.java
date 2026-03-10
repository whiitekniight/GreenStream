package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˏⁱ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0583 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC0583 f2393 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC0583 f2394 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ EnumC0583[] f2395 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC0583 f2396 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC0583 f2397 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f2398;

    static {
        EnumC0583 r0 = new EnumC0583(0, 0, "BROADCAST_ACTION_UNSPECIFIED");
        f2396 = r0;
        EnumC0583 r2 = new EnumC0583(1, 1, "PURCHASES_UPDATED_ACTION");
        f2393 = r2;
        EnumC0583 r4 = new EnumC0583(2, 2, "LOCAL_PURCHASES_UPDATED_ACTION");
        f2394 = r4;
        EnumC0583 r6 = new EnumC0583(3, 3, "ALTERNATIVE_BILLING_ACTION");
        f2397 = r6;
        f2395 = new EnumC0583[]{r0, r2, r4, r6};
    }

    EnumC0583(int r1, int r2, String r3) {
        this.f2398 = r2;
    }

    public static EnumC0583[] values() {
        return (EnumC0583[]) f2395.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2398);
    }
}
