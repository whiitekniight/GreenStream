package p043;

/* JADX INFO: renamed from: ʼᵔ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1620 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1620 f5342 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1620[] f5343 = null;

    static {
        EnumC1620 r0 = new EnumC1620("SRGB", 0);
        EnumC1620 r1 = new EnumC1620("DISPLAY_P3", 1);
        f5342 = r1;
        f5343 = new EnumC1620[]{r0, r1};
    }

    public static EnumC1620 valueOf(String r1) {
        return (EnumC1620) Enum.valueOf(EnumC1620.class, r1);
    }

    public static EnumC1620[] values() {
        return (EnumC1620[]) f5343.clone();
    }
}
