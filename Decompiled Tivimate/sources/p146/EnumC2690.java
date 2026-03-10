package p146;

/* JADX INFO: renamed from: ˉʼ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2690 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC2690[] f9606 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC2690 f9607 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC2690 f9608 = null;

    static {
        EnumC2690 r0 = new EnumC2690("Synchronously", 0);
        f9607 = r0;
        EnumC2690 r1 = new EnumC2690("Asynchronously", 1);
        f9608 = r1;
        f9606 = new EnumC2690[]{r0, r1};
    }

    public static EnumC2690 valueOf(String r1) {
        return (EnumC2690) Enum.valueOf(EnumC2690.class, r1);
    }

    public static EnumC2690[] values() {
        return (EnumC2690[]) f9606.clone();
    }
}
