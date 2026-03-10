package p302;

/* JADX INFO: renamed from: ٴᐧ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4087 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4087 f15039 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4087 f15040 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC4087[] f15041 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4087 f15042 = null;

    static {
        EnumC4087 r0 = new EnumC4087("NETWORK_UNMETERED", 0);
        f15040 = r0;
        EnumC4087 r1 = new EnumC4087("DEVICE_IDLE", 1);
        f15042 = r1;
        EnumC4087 r3 = new EnumC4087("DEVICE_CHARGING", 2);
        f15039 = r3;
        f15041 = new EnumC4087[]{r0, r1, r3};
    }

    public static EnumC4087 valueOf(String r1) {
        return (EnumC4087) Enum.valueOf(EnumC4087.class, r1);
    }

    public static EnumC4087[] values() {
        return (EnumC4087[]) f15041.clone();
    }
}
