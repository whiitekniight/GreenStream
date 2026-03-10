package p166;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ˊʾ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2983 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2983[] f10465 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2983 f10466 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f10467;

    static {
        EnumC2983 r0 = new EnumC2983(1, "SMB2_RESTART_SCANS", 0);
        f10466 = r0;
        f10465 = new EnumC2983[]{r0, new EnumC2983(2, "SMB2_RETURN_SINGLE_ENTRY", 1), new EnumC2983(4, "SMB2_INDEX_SPECIFIED", 2), new EnumC2983(16, "SMB2_REOPEN", 3)};
    }

    EnumC2983(long r1, String r3, int r4) {
        this.f10467 = r1;
    }

    public static EnumC2983 valueOf(String r1) {
        return (EnumC2983) Enum.valueOf(EnumC2983.class, r1);
    }

    public static EnumC2983[] values() {
        return (EnumC2983[]) f10465.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f10467;
    }
}
