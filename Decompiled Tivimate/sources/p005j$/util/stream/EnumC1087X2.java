package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.X2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1087X2 extends Enum {

    /* JADX INFO: renamed from: OP */
    public static final EnumC1087X2 f3824OP = null;
    public static final EnumC1087X2 SPLITERATOR = null;
    public static final EnumC1087X2 STREAM = null;
    public static final EnumC1087X2 TERMINAL_OP = null;
    public static final EnumC1087X2 UPSTREAM_TERMINAL_OP = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1087X2[] f3825a = null;

    static {
        EnumC1087X2 r0 = new EnumC1087X2("SPLITERATOR", 0);
        SPLITERATOR = r0;
        EnumC1087X2 r1 = new EnumC1087X2("STREAM", 1);
        STREAM = r1;
        EnumC1087X2 r3 = new EnumC1087X2("OP", 2);
        f3824OP = r3;
        EnumC1087X2 r5 = new EnumC1087X2("TERMINAL_OP", 3);
        TERMINAL_OP = r5;
        EnumC1087X2 r7 = new EnumC1087X2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r7;
        f3825a = new EnumC1087X2[]{r0, r1, r3, r5, r7};
    }

    public static EnumC1087X2 valueOf(String r1) {
        return (EnumC1087X2) Enum.valueOf(EnumC1087X2.class, r1);
    }

    public static EnumC1087X2[] values() {
        return (EnumC1087X2[]) f3825a.clone();
    }
}
