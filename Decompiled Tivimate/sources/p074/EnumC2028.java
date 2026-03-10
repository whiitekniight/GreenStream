package p074;

import p111.InterfaceC2389;

/* JADX INFO: renamed from: ʾˈ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2028 extends Enum implements InterfaceC2389 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC2028 f7011 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC2028 f7012 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2028 f7013 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC2028[] f7014 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f7015;

    static {
        EnumC2028 r0 = new EnumC2028(0, 0, "COLLECTION_UNKNOWN");
        EnumC2028 r2 = new EnumC2028(1, 1, "COLLECTION_SDK_NOT_INSTALLED");
        f7013 = r2;
        EnumC2028 r4 = new EnumC2028(2, 2, "COLLECTION_ENABLED");
        f7011 = r4;
        EnumC2028 r6 = new EnumC2028(3, 3, "COLLECTION_DISABLED");
        f7012 = r6;
        f7014 = new EnumC2028[]{r0, r2, r4, r6, new EnumC2028(4, 4, "COLLECTION_DISABLED_REMOTE"), new EnumC2028(5, 5, "COLLECTION_SAMPLED")};
    }

    EnumC2028(int r1, int r2, String r3) {
        this.f7015 = r2;
    }

    public static EnumC2028 valueOf(String r1) {
        return (EnumC2028) Enum.valueOf(EnumC2028.class, r1);
    }

    public static EnumC2028[] values() {
        return (EnumC2028[]) f7014.clone();
    }

    @Override // p111.InterfaceC2389
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo5056() {
        return this.f7015;
    }
}
