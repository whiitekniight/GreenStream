package p074;

import p111.InterfaceC2389;

/* JADX INFO: renamed from: ʾˈ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2025 extends Enum implements InterfaceC2389 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2025[] f7002 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2025 f7003 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f7004;

    static {
        EnumC2025 r0 = new EnumC2025(0, 0, "LOG_ENVIRONMENT_UNKNOWN");
        EnumC2025 r2 = new EnumC2025(1, 1, "LOG_ENVIRONMENT_AUTOPUSH");
        EnumC2025 r4 = new EnumC2025(2, 2, "LOG_ENVIRONMENT_STAGING");
        EnumC2025 r6 = new EnumC2025(3, 3, "LOG_ENVIRONMENT_PROD");
        f7003 = r6;
        f7002 = new EnumC2025[]{r0, r2, r4, r6};
    }

    EnumC2025(int r1, int r2, String r3) {
        this.f7004 = r2;
    }

    public static EnumC2025 valueOf(String r1) {
        return (EnumC2025) Enum.valueOf(EnumC2025.class, r1);
    }

    public static EnumC2025[] values() {
        return (EnumC2025[]) f7002.clone();
    }

    @Override // p111.InterfaceC2389
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo5056() {
        return this.f7004;
    }
}
