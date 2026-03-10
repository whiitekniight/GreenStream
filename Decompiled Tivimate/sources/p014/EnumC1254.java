package p014;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʻʽ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1254 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1254[] f4134 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f4135;

    static {
        f4134 = new EnumC1254[]{new EnumC1254(0, 5, "WINDOWS_MAJOR_VERSION_5"), new EnumC1254(1, 6, "WINDOWS_MAJOR_VERSION_6"), new EnumC1254(2, 10, "WINDOWS_MAJOR_VERSION_10")};
    }

    EnumC1254(int r1, int r2, String r3) {
        this.f4135 = r2;
    }

    public static EnumC1254 valueOf(String r1) {
        return (EnumC1254) Enum.valueOf(EnumC1254.class, r1);
    }

    public static EnumC1254[] values() {
        return (EnumC1254[]) f4134.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f4135;
    }
}
