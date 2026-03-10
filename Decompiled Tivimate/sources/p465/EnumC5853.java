package p465;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ﾞˉ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5853 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5853 f21389 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5853 f21390 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5853 f21391 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC5853[] f21392 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f21393;

    static {
        EnumC5853 r0 = new EnumC5853(0, 1, "FIRST_FRAGMENT");
        f21391 = r0;
        EnumC5853 r3 = new EnumC5853(1, 2, "LAST_FRAGMENT");
        f21389 = r3;
        EnumC5853 r5 = new EnumC5853(2, 4, "PENDING_CANCEL");
        EnumC5853 r7 = new EnumC5853(3, 16, "CONCURRENT_MULTIPLEXING");
        EnumC5853 r8 = new EnumC5853(4, 32, "DID_NOT_EXECUTE");
        EnumC5853 r10 = new EnumC5853(5, 64, "MAYBE");
        EnumC5853 r11 = new EnumC5853(6, 128, "OBJECT_UUID");
        f21390 = r11;
        f21392 = new EnumC5853[]{r0, r3, r5, r7, r8, r10, r11};
    }

    EnumC5853(int r1, int r2, String r3) {
        this.f21393 = r2;
    }

    public static EnumC5853 valueOf(String r1) {
        return (EnumC5853) Enum.valueOf(EnumC5853.class, r1);
    }

    public static EnumC5853[] values() {
        return (EnumC5853[]) f21392.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f21393;
    }
}
