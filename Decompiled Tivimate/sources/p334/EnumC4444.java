package p334;

/* JADX INFO: renamed from: ᴵˋ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4444 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4444 f16215 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4444 f16216 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4444 f16217 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4444 f16218 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final /* synthetic */ EnumC4444[] f16219 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4444 f16220 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4444 f16221 = null;

    static {
        EnumC4444 r0 = new EnumC4444("ENQUEUED", 0);
        f16216 = r0;
        EnumC4444 r1 = new EnumC4444("RUNNING", 1);
        f16220 = r1;
        EnumC4444 r3 = new EnumC4444("SUCCEEDED", 2);
        f16215 = r3;
        EnumC4444 r5 = new EnumC4444("FAILED", 3);
        f16217 = r5;
        EnumC4444 r7 = new EnumC4444("BLOCKED", 4);
        f16221 = r7;
        EnumC4444 r9 = new EnumC4444("CANCELLED", 5);
        f16218 = r9;
        f16219 = new EnumC4444[]{r0, r1, r3, r5, r7, r9};
    }

    public static EnumC4444 valueOf(String r1) {
        return (EnumC4444) Enum.valueOf(EnumC4444.class, r1);
    }

    public static EnumC4444[] values() {
        return (EnumC4444[]) f16219.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m8841() {
        if (this != f16215) goto L5;
        return true;
    L5:
        if (this != f16217) goto L7;
        return true;
    L7:
        if (this == f16218) goto L14;
        return false;
    L14:
        return true;
    }
}
