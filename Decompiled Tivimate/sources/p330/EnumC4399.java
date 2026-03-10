package p330;

/* JADX INFO: renamed from: ᴵˆ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4399 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4399 f16120 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4399 f16121 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC4399[] f16122 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4399 f16123 = null;

    static {
        EnumC4399 r0 = new EnumC4399("DEFAULT", 0);
        f16121 = r0;
        EnumC4399 r1 = new EnumC4399("VERY_LOW", 1);
        f16123 = r1;
        EnumC4399 r3 = new EnumC4399("HIGHEST", 2);
        f16120 = r3;
        f16122 = new EnumC4399[]{r0, r1, r3};
    }

    public static EnumC4399 valueOf(String r1) {
        return (EnumC4399) Enum.valueOf(EnumC4399.class, r1);
    }

    public static EnumC4399[] values() {
        return (EnumC4399[]) f16122.clone();
    }
}
