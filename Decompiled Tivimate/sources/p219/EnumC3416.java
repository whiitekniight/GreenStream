package p219;

/* JADX INFO: renamed from: ˎᵔ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3416 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC3416 f12038 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC3416 f12039 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC3416 f12040 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC3416[] f12041 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f12042;

    static {
        EnumC3416 r0 = new EnumC3416(0, 0, "UNIVERSAL");
        f12040 = r0;
        EnumC3416 r2 = new EnumC3416(1, 64, "APPLICATION");
        f12038 = r2;
        EnumC3416 r3 = new EnumC3416(2, 128, "CONTEXT_SPECIFIC");
        f12039 = r3;
        f12041 = new EnumC3416[]{r0, r2, r3, new EnumC3416(3, 192, "PRIVATE")};
    }

    EnumC3416(int r1, int r2, String r3) {
        this.f12042 = r2;
    }

    public static EnumC3416 valueOf(String r1) {
        return (EnumC3416) Enum.valueOf(EnumC3416.class, r1);
    }

    public static EnumC3416[] values() {
        return (EnumC3416[]) f12041.clone();
    }
}
