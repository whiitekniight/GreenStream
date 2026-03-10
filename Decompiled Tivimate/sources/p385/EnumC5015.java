package p385;

/* JADX INFO: renamed from: ᵢˎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5015 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC5015 f17902 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC5015[] f17903 = null;

    static {
        EnumC5015 r0 = new EnumC5015("COROUTINE_SUSPENDED", 0);
        f17902 = r0;
        f17903 = new EnumC5015[]{r0, new EnumC5015("UNDECIDED", 1), new EnumC5015("RESUMED", 2)};
    }

    public static EnumC5015 valueOf(String r1) {
        return (EnumC5015) Enum.valueOf(EnumC5015.class, r1);
    }

    public static EnumC5015[] values() {
        return (EnumC5015[]) f17903.clone();
    }
}
