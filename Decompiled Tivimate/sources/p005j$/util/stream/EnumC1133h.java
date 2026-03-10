package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1133h extends Enum {
    public static final EnumC1133h CONCURRENT = null;
    public static final EnumC1133h IDENTITY_FINISH = null;
    public static final EnumC1133h UNORDERED = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1133h[] f3913a = null;

    static {
        EnumC1133h r0 = new EnumC1133h("CONCURRENT", 0);
        CONCURRENT = r0;
        EnumC1133h r1 = new EnumC1133h("UNORDERED", 1);
        UNORDERED = r1;
        EnumC1133h r3 = new EnumC1133h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r3;
        f3913a = new EnumC1133h[]{r0, r1, r3};
    }

    public static EnumC1133h valueOf(String r1) {
        return (EnumC1133h) Enum.valueOf(EnumC1133h.class, r1);
    }

    public static EnumC1133h[] values() {
        return (EnumC1133h[]) f3913a.clone();
    }
}
