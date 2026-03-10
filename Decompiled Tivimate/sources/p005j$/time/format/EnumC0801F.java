package p005j$.time.format;

/* JADX INFO: renamed from: j$.time.format.F */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0801F extends Enum {
    public static final EnumC0801F ALWAYS = null;
    public static final EnumC0801F EXCEEDS_PAD = null;
    public static final EnumC0801F NEVER = null;
    public static final EnumC0801F NORMAL = null;
    public static final EnumC0801F NOT_NEGATIVE = null;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0801F[] f3238a = null;

    static {
        EnumC0801F r0 = new EnumC0801F("NORMAL", 0);
        NORMAL = r0;
        EnumC0801F r1 = new EnumC0801F("ALWAYS", 1);
        ALWAYS = r1;
        EnumC0801F r3 = new EnumC0801F("NEVER", 2);
        NEVER = r3;
        EnumC0801F r5 = new EnumC0801F("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r5;
        EnumC0801F r7 = new EnumC0801F("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r7;
        f3238a = new EnumC0801F[]{r0, r1, r3, r5, r7};
    }

    public static EnumC0801F valueOf(String r1) {
        return (EnumC0801F) Enum.valueOf(EnumC0801F.class, r1);
    }

    public static EnumC0801F[] values() {
        return (EnumC0801F[]) f3238a.clone();
    }
}
