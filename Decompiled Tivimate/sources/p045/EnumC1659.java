package p045;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʼﹳ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1659 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1659 f5507 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1659[] f5508 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1659 f5509 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f5510;

    static {
        EnumC1659 r0 = new EnumC1659(1, "SMB2_GLOBAL_CAP_DFS", 0);
        f5509 = r0;
        EnumC1659 r1 = new EnumC1659(2, "SMB2_GLOBAL_CAP_LEASING", 1);
        EnumC1659 r2 = new EnumC1659(4, "SMB2_GLOBAL_CAP_LARGE_MTU", 2);
        f5507 = r2;
        f5508 = new EnumC1659[]{r0, r1, r2, new EnumC1659(8, "SMB2_GLOBAL_CAP_MULTI_CHANNEL", 3), new EnumC1659(16, "SMB2_GLOBAL_CAP_PERSISTENT_HANDLES", 4), new EnumC1659(32, "SMB2_GLOBAL_CAP_DIRECTORY_LEASING", 5), new EnumC1659(64, "SMB2_GLOBAL_CAP_ENCRYPTION", 6)};
    }

    EnumC1659(long r1, String r3, int r4) {
        this.f5510 = r1;
    }

    public static EnumC1659 valueOf(String r1) {
        return (EnumC1659) Enum.valueOf(EnumC1659.class, r1);
    }

    public static EnumC1659[] values() {
        return (EnumC1659[]) f5508.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f5510;
    }
}
