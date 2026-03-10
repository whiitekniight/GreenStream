package p005j$.time.format;

/* JADX INFO: renamed from: j$.time.format.E */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0800E extends Enum {
    public static final EnumC0800E LENIENT = null;
    public static final EnumC0800E SMART = null;
    public static final EnumC0800E STRICT = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0800E[] f3237a = null;

    static {
        EnumC0800E r0 = new EnumC0800E("STRICT", 0);
        STRICT = r0;
        EnumC0800E r1 = new EnumC0800E("SMART", 1);
        SMART = r1;
        EnumC0800E r3 = new EnumC0800E("LENIENT", 2);
        LENIENT = r3;
        f3237a = new EnumC0800E[]{r0, r1, r3};
    }

    public static EnumC0800E valueOf(String r1) {
        return (EnumC0800E) Enum.valueOf(EnumC0800E.class, r1);
    }

    public static EnumC0800E[] values() {
        return (EnumC0800E[]) f3237a.clone();
    }
}
