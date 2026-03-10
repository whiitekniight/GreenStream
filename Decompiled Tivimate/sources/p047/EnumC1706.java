package p047;

/* JADX INFO: renamed from: ʼﾞ.ˑٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1706 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC1706[] f5674 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1706 f5675 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1706 f5676 = null;

    static {
        EnumC1706 r0 = new EnumC1706("DEFERRED", 0);
        f5675 = r0;
        EnumC1706 r1 = new EnumC1706("IMMEDIATE", 1);
        f5676 = r1;
        f5674 = new EnumC1706[]{r0, r1, new EnumC1706("EXCLUSIVE", 2)};
    }

    public static EnumC1706 valueOf(String r1) {
        return (EnumC1706) Enum.valueOf(EnumC1706.class, r1);
    }

    public static EnumC1706[] values() {
        return (EnumC1706[]) f5674.clone();
    }
}
