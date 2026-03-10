package p045;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʼﹳ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1669 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1669 f5545 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1669[] f5546 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1669 f5547 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f5548;

    static {
        EnumC1669 r0 = new EnumC1669(1, "FILE_DIRECTORY_FILE", 0);
        f5547 = r0;
        EnumC1669 r1 = new EnumC1669(2, "FILE_WRITE_THROUGH", 1);
        EnumC1669 r2 = new EnumC1669(4, "FILE_SEQUENTIAL_ONLY", 2);
        EnumC1669 r3 = new EnumC1669(8, "FILE_NO_INTERMEDIATE_BUFFERING", 3);
        EnumC1669 r7 = new EnumC1669(16, "FILE_SYNCHRONOUS_IO_ALERT", 4);
        EnumC1669 r8 = new EnumC1669(32, "FILE_SYNCHRONOUS_IO_NONALERT", 5);
        EnumC1669 r9 = new EnumC1669(64, "FILE_NON_DIRECTORY_FILE", 6);
        f5545 = r9;
        f5546 = new EnumC1669[]{r0, r1, r2, r3, r7, r8, r9, new EnumC1669(256, "FILE_COMPLETE_IF_OPLOCKED", 7), new EnumC1669(512, "FILE_NO_EA_KNOWLEDGE", 8), new EnumC1669(2048, "FILE_RANDOM_ACCESS", 9), new EnumC1669(4096, "FILE_DELETE_ON_CLOSE", 10), new EnumC1669(8192, "FILE_OPEN_BY_FILE_ID", 11), new EnumC1669(16384, "FILE_OPEN_FOR_BACKUP_INTENT", 12), new EnumC1669(32768, "FILE_NO_COMPRESSION", 13), new EnumC1669(1024, "FILE_OPEN_REMOTE_INSTANCE", 14), new EnumC1669(65536, "FILE_OPEN_REQUIRING_OPLOCK", 15), new EnumC1669(131072, "FILE_DISALLOW_EXCLUSIVE", 16), new EnumC1669(1048576, "FILE_RESERVE_OPFILTER", 17), new EnumC1669(2097152, "FILE_OPEN_REPARSE_POINT", 18), new EnumC1669(4194304, "FILE_OPEN_NO_RECALL", 19), new EnumC1669(8388608, "FILE_OPEN_FOR_FREE_SPACE_QUERY", 20)};
    }

    EnumC1669(long r1, String r3, int r4) {
        this.f5548 = r1;
    }

    public static EnumC1669 valueOf(String r1) {
        return (EnumC1669) Enum.valueOf(EnumC1669.class, r1);
    }

    public static EnumC1669[] values() {
        return (EnumC1669[]) f5546.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f5548;
    }
}
