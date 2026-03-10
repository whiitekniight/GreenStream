package p005j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public enum TextStyle extends Enum<TextStyle> {
    public static final TextStyle FULL = null;
    public static final TextStyle FULL_STANDALONE = null;
    public static final TextStyle NARROW = null;
    public static final TextStyle NARROW_STANDALONE = null;
    public static final TextStyle SHORT = null;
    public static final TextStyle SHORT_STANDALONE = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ TextStyle[] f3246b = null;

    /* JADX INFO: renamed from: a */
    public final int f3247a;

    static {
        TextStyle r0 = new TextStyle("FULL", 0, 0);
        FULL = r0;
        TextStyle r1 = new TextStyle("FULL_STANDALONE", 1, 0);
        FULL_STANDALONE = r1;
        TextStyle r3 = new TextStyle("SHORT", 2, 1);
        SHORT = r3;
        TextStyle r5 = new TextStyle("SHORT_STANDALONE", 3, 1);
        SHORT_STANDALONE = r5;
        TextStyle r7 = new TextStyle("NARROW", 4, 1);
        NARROW = r7;
        TextStyle r9 = new TextStyle("NARROW_STANDALONE", 5, 1);
        NARROW_STANDALONE = r9;
        f3246b = new TextStyle[]{r0, r1, r3, r5, r7, r9};
    }

    TextStyle(String r1, int r2, int r3) {
        this.f3247a = r3;
    }

    public static TextStyle valueOf(String r1) {
        return (TextStyle) Enum.valueOf(TextStyle.class, r1);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) f3246b.clone();
    }
}
