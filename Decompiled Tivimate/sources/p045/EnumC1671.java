package p045;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʼﹳ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1671 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC1671[] f5551 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1671 f5552 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f5553;

    static {
        EnumC1671 r0 = new EnumC1671(8, "SMB2_SHARE_CAP_DFS", 0);
        EnumC1671 r1 = new EnumC1671(16, "SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY", 1);
        EnumC1671 r2 = new EnumC1671(32, "SMB2_SHARE_CAP_SCALEOUT", 2);
        EnumC1671 r3 = new EnumC1671(64, "SMB2_SHARE_CAP_CLUSTER", 3);
        EnumC1671 r7 = new EnumC1671(128, "SMB2_SHARE_CAP_ASYMMETRIC", 4);
        f5552 = r7;
        f5551 = new EnumC1671[]{r0, r1, r2, r3, r7};
    }

    EnumC1671(long r1, String r3, int r4) {
        this.f5553 = r1;
    }

    public static EnumC1671 valueOf(String r1) {
        return (EnumC1671) Enum.valueOf(EnumC1671.class, r1);
    }

    public static EnumC1671[] values() {
        return (EnumC1671[]) f5551.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f5553;
    }
}
