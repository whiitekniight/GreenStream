package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ٴﹳ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0043 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final C0067 f436 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final C0066 f437 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ EnumC0043[] f438 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final C0003 f439 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final EnumC0051 f440;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f441;

    static {
        EnumC0043 r0 = new EnumC0043("DOUBLE", 0, EnumC0051.f457, 1);
        EnumC0043 r1 = new EnumC0043("FLOAT", 1, EnumC0051.f455, 5);
        EnumC0051 r5 = EnumC0051.f462;
        EnumC0043 r2 = new EnumC0043("INT64", 2, r5, 0);
        EnumC0043 r7 = new EnumC0043("UINT64", 3, r5, 0);
        EnumC0051 r11 = EnumC0051.f456;
        EnumC0043 r9 = new EnumC0043("INT32", 4, r11, 0);
        EnumC0043 r12 = new EnumC0043("FIXED64", 5, r5, 1);
        EnumC0043 r14 = new EnumC0043("FIXED32", 6, r11, 5);
        EnumC0043 r15 = new EnumC0043("BOOL", 7, EnumC0051.f463, 0);
        C0067 r4 = new C0067("STRING", 8, EnumC0051.f459, 2);
        f436 = r4;
        EnumC0051 r13 = EnumC0051.f464;
        C0066 r6 = new C0066("GROUP", 9, r13, 3);
        f437 = r6;
        C0003 r3 = new C0003("MESSAGE", 10, r13, 2);
        f439 = r3;
        f438 = new EnumC0043[]{r0, r1, r2, r7, r9, r12, r14, r15, r4, r6, r3, new C0034("BYTES", 11, EnumC0051.f461, 2), new EnumC0043("UINT32", 12, r11, 0), new EnumC0043("ENUM", 13, EnumC0051.f458, 0), new EnumC0043("SFIXED32", 14, r11, 5), new EnumC0043("SFIXED64", 15, r5, 1), new EnumC0043("SINT32", 16, r11, 0), new EnumC0043("SINT64", 17, r5, 0)};
    }

    EnumC0043(String r1, int r2, EnumC0051 r3, int r4) {
        this.f440 = r3;
        this.f441 = r4;
    }

    public static EnumC0043 valueOf(String r1) {
        return (EnumC0043) Enum.valueOf(EnumC0043.class, r1);
    }

    public static EnumC0043[] values() {
        return (EnumC0043[]) f438.clone();
    }
}
