package p220;

/* JADX INFO: renamed from: ˎᵢ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3439 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC3439 f12200 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC3439 f12201 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC3439 f12202 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC3439 f12203 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC3439 f12204 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC3439 f12205 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC3439 f12206 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC3439[] f12207 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f12208;

    static {
        EnumC3439 r0 = new EnumC3439(0, "HTTP_1_0", "http/1.0");
        f12205 = r0;
        EnumC3439 r1 = new EnumC3439(1, "HTTP_1_1", "http/1.1");
        f12200 = r1;
        EnumC3439 r3 = new EnumC3439(2, "SPDY_3", "spdy/3.1");
        f12201 = r3;
        EnumC3439 r5 = new EnumC3439(3, "HTTP_2", "h2");
        f12206 = r5;
        EnumC3439 r7 = new EnumC3439(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        f12203 = r7;
        EnumC3439 r9 = new EnumC3439(5, "QUIC", "quic");
        f12204 = r9;
        EnumC3439 r11 = new EnumC3439(6, "HTTP_3", "h3");
        f12202 = r11;
        f12207 = new EnumC3439[]{r0, r1, r3, r5, r7, r9, r11};
    }

    EnumC3439(int r1, String r2, String r3) {
        this.f12208 = r3;
    }

    public static EnumC3439 valueOf(String r1) {
        return (EnumC3439) Enum.valueOf(EnumC3439.class, r1);
    }

    public static EnumC3439[] values() {
        return (EnumC3439[]) f12207.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12208;
    }
}
