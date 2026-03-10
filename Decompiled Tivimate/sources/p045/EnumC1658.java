package p045;

/* JADX INFO: renamed from: ʼﹳ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1658 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1658 f5498 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC1658 f5499 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC1658 f5500 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC1658 f5501 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC1658 f5502 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1658 f5503 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC1658 f5504 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC1658[] f5505 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f5506;

    static {
        EnumC1658 r0 = new EnumC1658(0, 0, "UNKNOWN");
        f5503 = r0;
        EnumC1658 r2 = new EnumC1658(1, 514, "SMB_2_0_2");
        f5498 = r2;
        EnumC1658 r3 = new EnumC1658(2, 528, "SMB_2_1");
        f5499 = r3;
        EnumC1658 r5 = new EnumC1658(3, 767, "SMB_2XX");
        f5504 = r5;
        EnumC1658 r7 = new EnumC1658(4, 768, "SMB_3_0");
        f5501 = r7;
        EnumC1658 r9 = new EnumC1658(5, 770, "SMB_3_0_2");
        f5502 = r9;
        EnumC1658 r11 = new EnumC1658(6, 785, "SMB_3_1_1");
        f5500 = r11;
        f5505 = new EnumC1658[]{r0, r2, r3, r5, r7, r9, r11};
    }

    EnumC1658(int r1, int r2, String r3) {
        this.f5506 = r2;
    }

    public static EnumC1658 valueOf(String r1) {
        return (EnumC1658) Enum.valueOf(EnumC1658.class, r1);
    }

    public static EnumC1658[] values() {
        return (EnumC1658[]) f5505.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m4401() {
        if (this != f5501) goto L5;
        return true;
    L5:
        if (this != f5502) goto L7;
        return true;
    L7:
        if (this == f5500) goto L14;
        return false;
    L14:
        return true;
    }
}
