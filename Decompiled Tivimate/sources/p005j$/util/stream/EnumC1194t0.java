package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1194t0 extends Enum {
    public static final EnumC1194t0 ALL = null;
    public static final EnumC1194t0 ANY = null;
    public static final EnumC1194t0 NONE = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC1194t0[] f3986c = null;

    /* JADX INFO: renamed from: a */
    public final boolean f3987a;

    /* JADX INFO: renamed from: b */
    public final boolean f3988b;

    static {
        EnumC1194t0 r0 = new EnumC1194t0("ANY", 0, true, true);
        ANY = r0;
        EnumC1194t0 r1 = new EnumC1194t0("ALL", 1, false, false);
        ALL = r1;
        EnumC1194t0 r4 = new EnumC1194t0("NONE", 2, true, false);
        NONE = r4;
        f3986c = new EnumC1194t0[]{r0, r1, r4};
    }

    EnumC1194t0(String r1, int r2, boolean r3, boolean r4) {
        this.f3987a = r3;
        this.f3988b = r4;
    }

    public static EnumC1194t0 valueOf(String r1) {
        return (EnumC1194t0) Enum.valueOf(EnumC1194t0.class, r1);
    }

    public static EnumC1194t0[] values() {
        return (EnumC1194t0[]) f3986c.clone();
    }
}
