package p045;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʼﹳ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1661 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1661 f5511 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1661[] f5512 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1661 f5513 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f5514;

    static {
        EnumC1661 r0 = new EnumC1661(1, "SMB2_FLAGS_SERVER_TO_REDIR", 0);
        EnumC1661 r1 = new EnumC1661(2, "SMB2_FLAGS_ASYNC_COMMAND", 1);
        f5513 = r1;
        EnumC1661 r2 = new EnumC1661(4, "SMB2_FLAGS_RELATED_OPERATIONS", 2);
        EnumC1661 r3 = new EnumC1661(8, "SMB2_FLAGS_SIGNED", 3);
        f5511 = r3;
        f5512 = new EnumC1661[]{r0, r1, r2, r3, new EnumC1661(112, "SMB2_FLAGS_PRIORITY_MASK", 4), new EnumC1661(268435456, "SMB2_FLAGS_DFS_OPERATIONS", 5), new EnumC1661(536870912, "SMB2_FLAGS_REPLAY_OPERATION", 6)};
    }

    EnumC1661(long r1, String r3, int r4) {
        this.f5514 = r1;
    }

    public static EnumC1661 valueOf(String r1) {
        return (EnumC1661) Enum.valueOf(EnumC1661.class, r1);
    }

    public static EnumC1661[] values() {
        return (EnumC1661[]) f5512.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f5514;
    }
}
