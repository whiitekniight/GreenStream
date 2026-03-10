package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0198 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC0198 f1100 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC0198 f1101 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC0198 f1102 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ EnumC0198[] f1103 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC0198 f1104 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC0198 f1105 = null;

    static {
        EnumC0198 r0 = new EnumC0198("DESTROYED", 0);
        f1101 = r0;
        EnumC0198 r1 = new EnumC0198("INITIALIZED", 1);
        f1104 = r1;
        EnumC0198 r3 = new EnumC0198("CREATED", 2);
        f1100 = r3;
        EnumC0198 r5 = new EnumC0198("STARTED", 3);
        f1102 = r5;
        EnumC0198 r7 = new EnumC0198("RESUMED", 4);
        f1105 = r7;
        f1103 = new EnumC0198[]{r0, r1, r3, r5, r7};
    }

    public static EnumC0198 valueOf(String r1) {
        return (EnumC0198) Enum.valueOf(EnumC0198.class, r1);
    }

    public static EnumC0198[] values() {
        return (EnumC0198[]) f1103.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m733(EnumC0198 r1) {
        if (compareTo(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }
}
