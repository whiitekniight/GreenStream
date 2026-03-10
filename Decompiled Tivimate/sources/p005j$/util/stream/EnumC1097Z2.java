package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.Z2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1097Z2 extends Enum {
    public static final EnumC1097Z2 DOUBLE_VALUE = null;
    public static final EnumC1097Z2 INT_VALUE = null;
    public static final EnumC1097Z2 LONG_VALUE = null;
    public static final EnumC1097Z2 REFERENCE = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1097Z2[] f3858a = null;

    static {
        EnumC1097Z2 r0 = new EnumC1097Z2("REFERENCE", 0);
        REFERENCE = r0;
        EnumC1097Z2 r1 = new EnumC1097Z2("INT_VALUE", 1);
        INT_VALUE = r1;
        EnumC1097Z2 r3 = new EnumC1097Z2("LONG_VALUE", 2);
        LONG_VALUE = r3;
        EnumC1097Z2 r5 = new EnumC1097Z2("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r5;
        f3858a = new EnumC1097Z2[]{r0, r1, r3, r5};
    }

    public static EnumC1097Z2 valueOf(String r1) {
        return (EnumC1097Z2) Enum.valueOf(EnumC1097Z2.class, r1);
    }

    public static EnumC1097Z2[] values() {
        return (EnumC1097Z2[]) f3858a.clone();
    }
}
