package p156;

/* JADX INFO: renamed from: ˉᴵ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2880 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2880[] f10201 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC2880 f10202 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2880 f10203 = null;

    static {
        EnumC2880 r0 = new EnumC2880("CRASHLYTICS", 0);
        f10202 = r0;
        EnumC2880 r1 = new EnumC2880("PERFORMANCE", 1);
        f10203 = r1;
        f10201 = new EnumC2880[]{r0, r1, new EnumC2880("MATT_SAYS_HI", 2)};
    }

    public static EnumC2880 valueOf(String r1) {
        return (EnumC2880) Enum.valueOf(EnumC2880.class, r1);
    }

    public static EnumC2880[] values() {
        return (EnumC2880[]) f10201.clone();
    }
}
