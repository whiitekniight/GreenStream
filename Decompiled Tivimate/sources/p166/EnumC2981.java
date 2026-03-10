package p166;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ˊʾ.יـ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2981 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC2981 f10458 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC2981 f10459 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2981 f10460 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC2981[] f10461 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f10462;

    static {
        EnumC2981 r0 = new EnumC2981(1, "SMB2_SESSION_FLAG_IS_GUEST", 0);
        f10460 = r0;
        EnumC2981 r1 = new EnumC2981(2, "SMB2_SESSION_FLAG_IS_NULL", 1);
        f10458 = r1;
        EnumC2981 r2 = new EnumC2981(4, "SMB2_SESSION_FLAG_ENCRYPT_DATA", 2);
        f10459 = r2;
        f10461 = new EnumC2981[]{r0, r1, r2};
    }

    EnumC2981(long r1, String r3, int r4) {
        this.f10462 = r1;
    }

    public static EnumC2981 valueOf(String r1) {
        return (EnumC2981) Enum.valueOf(EnumC2981.class, r1);
    }

    public static EnumC2981[] values() {
        return (EnumC2981[]) f10461.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f10462;
    }
}
