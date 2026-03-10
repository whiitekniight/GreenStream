package p459;

/* JADX INFO: renamed from: ﹶﾞ.ʽⁱ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5715 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5715 f20612 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5715 f20613 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ EnumC5715[] f20614 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5715 f20615 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC5715 f20616 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f20617;

    static {
        EnumC5715 r0 = new EnumC5715(0, "UNINITIALIZED", "uninitialized");
        f20615 = r0;
        EnumC5715 r2 = new EnumC5715(1, "POLICY", "eu_consent_policy");
        f20612 = r2;
        EnumC5715 r4 = new EnumC5715(2, "DENIED", "denied");
        f20613 = r4;
        EnumC5715 r6 = new EnumC5715(3, "GRANTED", "granted");
        f20616 = r6;
        f20614 = new EnumC5715[]{r0, r2, r4, r6};
    }

    EnumC5715(int r1, String r2, String r3) {
        this.f20617 = r3;
    }

    public static EnumC5715[] values() {
        return (EnumC5715[]) f20614.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20617;
    }
}
