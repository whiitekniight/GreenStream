package p455;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ﹶᵢ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5681 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC5681[] f20478 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f20479;

    static {
        f20478 = new EnumC5681[]{new EnumC5681(1, "FILE_ACTION_ADDED", 0), new EnumC5681(2, "FILE_ACTION_REMOVED", 1), new EnumC5681(3, "FILE_ACTION_MODIFIED", 2), new EnumC5681(4, "FILE_ACTION_RENAMED_OLD_NAME", 3), new EnumC5681(5, "FILE_ACTION_RENAMED_NEW_NAME", 4), new EnumC5681(6, "FILE_ACTION_ADDED_STREAM", 5), new EnumC5681(7, "FILE_ACTION_REMOVED_STREAM", 6), new EnumC5681(8, "FILE_ACTION_MODIFIED_STREAM", 7), new EnumC5681(9, "FILE_ACTION_REMOVED_BY_DELETE", 8), new EnumC5681(10, "FILE_ACTION_ID_NOT_TUNNELLED", 9), new EnumC5681(11, "FILE_ACTION_TUNNELLED_ID_COLLISION", 10)};
    }

    EnumC5681(long r1, String r3, int r4) {
        this.f20479 = r1;
    }

    public static EnumC5681 valueOf(String r1) {
        return (EnumC5681) Enum.valueOf(EnumC5681.class, r1);
    }

    public static EnumC5681[] values() {
        return (EnumC5681[]) f20478.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f20479;
    }
}
