package p459;

/* JADX INFO: renamed from: ﹶﾞ.ʾﾞ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5721 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5721 f20629 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC5721[] f20630 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5721 f20631 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final EnumC5824[] f20632;

    static {
        EnumC5721 r0 = new EnumC5721("STORAGE", 0, new EnumC5824[]{EnumC5824.f21266, EnumC5824.f21263});
        f20631 = r0;
        EnumC5721 r2 = new EnumC5721("DMA", 1, new EnumC5824[]{EnumC5824.f21264});
        f20629 = r2;
        f20630 = new EnumC5721[]{r0, r2};
    }

    EnumC5721(String r1, int r2, EnumC5824... r3) {
        this.f20632 = r3;
    }

    public static EnumC5721[] values() {
        return (EnumC5721[]) f20630.clone();
    }
}
