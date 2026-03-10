package p047;

/* JADX INFO: renamed from: ʼﾞ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1705 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1705 f5670 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1705 f5671 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1705[] f5672 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1705 f5673 = null;

    static {
        EnumC1705 r0 = new EnumC1705("NO_OP", 0);
        f5671 = r0;
        EnumC1705 r1 = new EnumC1705("ADD", 1);
        f5673 = r1;
        EnumC1705 r3 = new EnumC1705("REMOVE", 2);
        f5670 = r3;
        f5672 = new EnumC1705[]{r0, r1, r3};
    }

    public static EnumC1705 valueOf(String r1) {
        return (EnumC1705) Enum.valueOf(EnumC1705.class, r1);
    }

    public static EnumC1705[] values() {
        return (EnumC1705[]) f5672.clone();
    }
}
