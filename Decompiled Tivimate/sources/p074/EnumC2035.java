package p074;

import p111.InterfaceC2389;

/* JADX INFO: renamed from: ʾˈ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2035 extends Enum implements InterfaceC2389 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2035[] f7032 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2035 f7033 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f7034;

    static {
        EnumC2035 r0 = new EnumC2035(0, 0, "EVENT_TYPE_UNKNOWN");
        EnumC2035 r2 = new EnumC2035(1, 1, "SESSION_START");
        f7033 = r2;
        f7032 = new EnumC2035[]{r0, r2};
    }

    EnumC2035(int r1, int r2, String r3) {
        this.f7034 = r2;
    }

    public static EnumC2035 valueOf(String r1) {
        return (EnumC2035) Enum.valueOf(EnumC2035.class, r1);
    }

    public static EnumC2035[] values() {
        return (EnumC2035[]) f7032.clone();
    }

    @Override // p111.InterfaceC2389
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo5056() {
        return this.f7034;
    }
}
