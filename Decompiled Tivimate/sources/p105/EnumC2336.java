package p105;

/* JADX INFO: renamed from: ˆ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2336 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC2336 f8389 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC2336 f8390 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC2336 f8391 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC2336 f8392 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC2336 f8393 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2336 f8394 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC2336 f8395 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC2336[] f8396 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f8397;

    static {
        EnumC2336 r0 = new EnumC2336(0, 0, "REASON_UNKNOWN");
        f8394 = r0;
        EnumC2336 r2 = new EnumC2336(1, 1, "MESSAGE_TOO_OLD");
        f8389 = r2;
        EnumC2336 r4 = new EnumC2336(2, 2, "CACHE_FULL");
        f8390 = r4;
        EnumC2336 r6 = new EnumC2336(3, 3, "PAYLOAD_TOO_BIG");
        f8395 = r6;
        EnumC2336 r8 = new EnumC2336(4, 4, "MAX_RETRIES_REACHED");
        f8392 = r8;
        EnumC2336 r10 = new EnumC2336(5, 5, "INVALID_PAYLOD");
        f8393 = r10;
        EnumC2336 r12 = new EnumC2336(6, 6, "SERVER_ERROR");
        f8391 = r12;
        f8396 = new EnumC2336[]{r0, r2, r4, r6, r8, r10, r12};
    }

    EnumC2336(int r1, int r2, String r3) {
        this.f8397 = r2;
    }

    public static EnumC2336 valueOf(String r1) {
        return (EnumC2336) Enum.valueOf(EnumC2336.class, r1);
    }

    public static EnumC2336[] values() {
        return (EnumC2336[]) f8396.clone();
    }
}
