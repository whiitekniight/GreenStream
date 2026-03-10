package p043;

/* JADX INFO: renamed from: ʼᵔ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1629 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1629 f5352 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1629 f5353 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1629[] f5354 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1629 f5355 = null;

    static {
        EnumC1629 r0 = new EnumC1629("PREFER_ARGB_8888", 0);
        f5353 = r0;
        EnumC1629 r1 = new EnumC1629("PREFER_RGB_565", 1);
        f5355 = r1;
        f5354 = new EnumC1629[]{r0, r1};
        f5352 = r0;
    }

    public static EnumC1629 valueOf(String r1) {
        return (EnumC1629) Enum.valueOf(EnumC1629.class, r1);
    }

    public static EnumC1629[] values() {
        return (EnumC1629[]) f5354.clone();
    }
}
