package p219;

/* JADX INFO: renamed from: ˎᵔ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3418 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC3418 f12044 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC3418[] f12045 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC3418 f12046 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f12047;

    static {
        EnumC3418 r0 = new EnumC3418(0, 0, "PRIMITIVE");
        f12046 = r0;
        EnumC3418 r2 = new EnumC3418(1, 32, "CONSTRUCTED");
        f12044 = r2;
        f12045 = new EnumC3418[]{r0, r2};
    }

    EnumC3418(int r1, int r2, String r3) {
        this.f12047 = r2;
    }

    public static EnumC3418 valueOf(String r1) {
        return (EnumC3418) Enum.valueOf(EnumC3418.class, r1);
    }

    public static EnumC3418[] values() {
        return (EnumC3418[]) f12045.clone();
    }
}
