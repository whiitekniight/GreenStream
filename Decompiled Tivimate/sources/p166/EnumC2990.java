package p166;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ˊʾ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2990 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2990[] f10475 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2990 f10476 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f10477;

    static {
        EnumC2990 r0 = new EnumC2990(1, "SMB2_NEGOTIATE_SIGNING_ENABLED", 0);
        f10476 = r0;
        f10475 = new EnumC2990[]{r0, new EnumC2990(2, "SMB2_NEGOTIATE_SIGNING_REQUIRED", 1)};
    }

    EnumC2990(long r1, String r3, int r4) {
        this.f10477 = r1;
    }

    public static EnumC2990 valueOf(String r1) {
        return (EnumC2990) Enum.valueOf(EnumC2990.class, r1);
    }

    public static EnumC2990[] values() {
        return (EnumC2990[]) f10475.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f10477;
    }
}
