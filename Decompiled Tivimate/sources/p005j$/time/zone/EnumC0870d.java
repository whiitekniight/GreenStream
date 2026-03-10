package p005j$.time.zone;

/* JADX INFO: renamed from: j$.time.zone.d */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0870d extends Enum {
    public static final EnumC0870d STANDARD = null;
    public static final EnumC0870d UTC = null;
    public static final EnumC0870d WALL = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0870d[] f3423a = null;

    static {
        EnumC0870d r0 = new EnumC0870d("UTC", 0);
        UTC = r0;
        EnumC0870d r1 = new EnumC0870d("WALL", 1);
        WALL = r1;
        EnumC0870d r3 = new EnumC0870d("STANDARD", 2);
        STANDARD = r3;
        f3423a = new EnumC0870d[]{r0, r1, r3};
    }

    public static EnumC0870d valueOf(String r1) {
        return (EnumC0870d) Enum.valueOf(EnumC0870d.class, r1);
    }

    public static EnumC0870d[] values() {
        return (EnumC0870d[]) f3423a.clone();
    }
}
