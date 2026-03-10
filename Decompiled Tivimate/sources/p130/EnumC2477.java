package p130;

/* JADX INFO: renamed from: ˈʾ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2477 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC2477 f8794 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC2477[] f8795 = null;

    static {
        EnumC2477 r0 = new EnumC2477("DEFAULT", 0);
        f8794 = r0;
        f8795 = new EnumC2477[]{r0, new EnumC2477("SIGNED", 1), new EnumC2477("FIXED", 2)};
    }

    public static EnumC2477 valueOf(String r1) {
        return (EnumC2477) Enum.valueOf(EnumC2477.class, r1);
    }

    public static EnumC2477[] values() {
        return (EnumC2477[]) f8795.clone();
    }
}
