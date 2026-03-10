package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.z3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1227z3 extends Enum {
    public static final EnumC1227z3 MAYBE_MORE = null;
    public static final EnumC1227z3 NO_MORE = null;
    public static final EnumC1227z3 UNLIMITED = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1227z3[] f4040a = null;

    static {
        EnumC1227z3 r0 = new EnumC1227z3("NO_MORE", 0);
        NO_MORE = r0;
        EnumC1227z3 r1 = new EnumC1227z3("MAYBE_MORE", 1);
        MAYBE_MORE = r1;
        EnumC1227z3 r3 = new EnumC1227z3("UNLIMITED", 2);
        UNLIMITED = r3;
        f4040a = new EnumC1227z3[]{r0, r1, r3};
    }

    public static EnumC1227z3 valueOf(String r1) {
        return (EnumC1227z3) Enum.valueOf(EnumC1227z3.class, r1);
    }

    public static EnumC1227z3[] values() {
        return (EnumC1227z3[]) f4040a.clone();
    }
}
