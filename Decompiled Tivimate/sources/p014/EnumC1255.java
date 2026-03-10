package p014;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʻʽ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1255 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1255[] f4136 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f4137;

    static {
        f4136 = new EnumC1255[]{new EnumC1255(0, 0, "WINDOWS_MINOR_VERSION_0"), new EnumC1255(1, 1, "WINDOWS_MINOR_VERSION_1"), new EnumC1255(2, 2, "WINDOWS_MINOR_VERSION_2"), new EnumC1255(3, 3, "WINDOWS_MINOR_VERSION_3")};
    }

    EnumC1255(int r1, int r2, String r3) {
        this.f4137 = r2;
    }

    public static EnumC1255 valueOf(String r1) {
        return (EnumC1255) Enum.valueOf(EnumC1255.class, r1);
    }

    public static EnumC1255[] values() {
        return (EnumC1255[]) f4136.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f4137;
    }
}
