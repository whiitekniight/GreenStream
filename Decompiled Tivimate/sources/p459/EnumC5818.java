package p459;

/* JADX INFO: renamed from: ﹶﾞ.ᵢˋ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5818 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5818 f21205 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5818 f21206 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ EnumC5818[] f21207 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5818 f21208 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC5818 f21209 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f21210;

    static {
        EnumC5818 r0 = new EnumC5818(0, 0, "UNKNOWN");
        f21208 = r0;
        EnumC5818 r2 = new EnumC5818(1, 1, "SUCCESS");
        f21205 = r2;
        EnumC5818 r4 = new EnumC5818(2, 2, "FAILURE");
        f21206 = r4;
        EnumC5818 r6 = new EnumC5818(3, 3, "BACKOFF");
        f21209 = r6;
        f21207 = new EnumC5818[]{r0, r2, r4, r6};
    }

    EnumC5818(int r1, int r2, String r3) {
        this.f21210 = r2;
    }

    public static EnumC5818[] values() {
        return (EnumC5818[]) f21207.clone();
    }
}
