package p220;

/* JADX INFO: renamed from: ˎᵢ.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3440 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC3440 f12209 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC3440 f12210 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC3440 f12211 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final /* synthetic */ EnumC3440[] f12212 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC3440 f12213 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC3440 f12214 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f12215;

    static {
        EnumC3440 r0 = new EnumC3440(0, "TLS_1_3", "TLSv1.3");
        f12213 = r0;
        EnumC3440 r1 = new EnumC3440(1, "TLS_1_2", "TLSv1.2");
        f12209 = r1;
        EnumC3440 r3 = new EnumC3440(2, "TLS_1_1", "TLSv1.1");
        f12210 = r3;
        EnumC3440 r5 = new EnumC3440(3, "TLS_1_0", "TLSv1");
        f12214 = r5;
        EnumC3440 r7 = new EnumC3440(4, "SSL_3_0", "SSLv3");
        f12211 = r7;
        f12212 = new EnumC3440[]{r0, r1, r3, r5, r7};
    }

    EnumC3440(int r1, String r2, String r3) {
        this.f12215 = r3;
    }

    public static EnumC3440 valueOf(String r1) {
        return (EnumC3440) Enum.valueOf(EnumC3440.class, r1);
    }

    public static EnumC3440[] values() {
        return (EnumC3440[]) f12212.clone();
    }
}
