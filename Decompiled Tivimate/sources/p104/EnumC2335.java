package p104;

/* JADX INFO: renamed from: ʿﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2335 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC2335 f8384 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC2335 f8385 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2335 f8386 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC2335[] f8387 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final byte f8388;

    static {
        EnumC2335 r0 = new EnumC2335("ONE", 0, (byte) 1);
        f8386 = r0;
        EnumC2335 r1 = new EnumC2335("TWO", 1, (byte) 2);
        f8384 = r1;
        EnumC2335 r4 = new EnumC2335("FOUR", 2, (byte) 4);
        f8385 = r4;
        f8387 = new EnumC2335[]{r0, r1, r4, new EnumC2335("EIGHT", 3, (byte) 8)};
    }

    EnumC2335(String r1, int r2, byte r3) {
        this.f8388 = (byte) (r3 - 1);
    }

    public static EnumC2335 valueOf(String r1) {
        return (EnumC2335) Enum.valueOf(EnumC2335.class, r1);
    }

    public static EnumC2335[] values() {
        return (EnumC2335[]) f8387.clone();
    }
}
