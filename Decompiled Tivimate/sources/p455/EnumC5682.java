package p455;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ﹶᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5682 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5682 f20480 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5682 f20481 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5682 f20482 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC5682[] f20483 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f20484;

    static {
        EnumC5682 r0 = new EnumC5682(32, "FILE_ATTRIBUTE_ARCHIVE", 0);
        EnumC5682 r1 = new EnumC5682(2048, "FILE_ATTRIBUTE_COMPRESSED", 1);
        EnumC5682 r2 = new EnumC5682(16, "FILE_ATTRIBUTE_DIRECTORY", 2);
        f20482 = r2;
        EnumC5682 r3 = new EnumC5682(16384, "FILE_ATTRIBUTE_ENCRYPTED", 3);
        EnumC5682 r7 = new EnumC5682(2, "FILE_ATTRIBUTE_HIDDEN", 4);
        f20480 = r7;
        EnumC5682 r8 = new EnumC5682(128, "FILE_ATTRIBUTE_NORMAL", 5);
        f20481 = r8;
        f20483 = new EnumC5682[]{r0, r1, r2, r3, r7, r8, new EnumC5682(8192, "FILE_ATTRIBUTE_NOT_CONTENT_INDEXED", 6), new EnumC5682(4096, "FILE_ATTRIBUTE_OFFLINE", 7), new EnumC5682(1, "FILE_ATTRIBUTE_READONLY", 8), new EnumC5682(1024, "FILE_ATTRIBUTE_REPARSE_POINT", 9), new EnumC5682(512, "FILE_ATTRIBUTE_SPARSE_FILE", 10), new EnumC5682(4, "FILE_ATTRIBUTE_SYSTEM", 11), new EnumC5682(256, "FILE_ATTRIBUTE_TEMPORARY", 12), new EnumC5682(32768, "FILE_ATTRIBUTE_INTEGRITY_STREAM", 13), new EnumC5682(131072, "FILE_ATTRIBUTE_NO_SCRUB_DATA", 14)};
    }

    EnumC5682(long r1, String r3, int r4) {
        this.f20484 = r1;
    }

    public static EnumC5682 valueOf(String r1) {
        return (EnumC5682) Enum.valueOf(EnumC5682.class, r1);
    }

    public static EnumC5682[] values() {
        return (EnumC5682[]) f20483.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f20484;
    }
}
