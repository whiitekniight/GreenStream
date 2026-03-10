package p463;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ﾞʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5847 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5847 f21346 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5847 f21347 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC5847 f21348 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC5847 f21349 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC5847 f21350 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5847 f21351 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC5847 f21352 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC5847[] f21353 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f21354;

    static {
        EnumC5847 r0 = new EnumC5847(1, "FILE_READ_DATA", 0);
        EnumC5847 r3 = new EnumC5847(2, "FILE_WRITE_DATA", 1);
        EnumC5847 r7 = new EnumC5847(4, "FILE_APPEND_DATA", 2);
        EnumC5847 r11 = new EnumC5847(32, "FILE_EXECUTE", 3);
        EnumC5847 r15 = new EnumC5847(1, "FILE_LIST_DIRECTORY", 4);
        f21351 = r15;
        EnumC5847 r4 = new EnumC5847(2, "FILE_ADD_FILE", 5);
        EnumC5847 r8 = new EnumC5847(4, "FILE_ADD_SUBDIRECTORY", 6);
        EnumC5847 r6 = new EnumC5847(32, "FILE_TRAVERSE", 7);
        EnumC5847 r9 = new EnumC5847(64, "FILE_DELETE_CHILD", 8);
        EnumC5847 r5 = new EnumC5847(128, "FILE_READ_ATTRIBUTES", 9);
        f21346 = r5;
        EnumC5847 r10 = new EnumC5847(256, "FILE_WRITE_ATTRIBUTES", 10);
        EnumC5847 r62 = new EnumC5847(8, "FILE_READ_EA", 11);
        f21347 = r62;
        EnumC5847 r1 = new EnumC5847(16, "FILE_WRITE_EA", 12);
        EnumC5847 r14 = new EnumC5847(65536, "DELETE", 13);
        f21352 = r14;
        EnumC5847 r2 = new EnumC5847(131072, "READ_CONTROL", 14);
        EnumC5847 r12 = new EnumC5847(262144, "WRITE_DAC", 15);
        EnumC5847 r32 = new EnumC5847(524288, "WRITE_OWNER", 16);
        EnumC5847 r02 = new EnumC5847(1048576, "SYNCHRONIZE", 17);
        EnumC5847 r22 = new EnumC5847(16777216, "ACCESS_SYSTEM_SECURITY", 18);
        EnumC5847 r13 = new EnumC5847(33554432, "MAXIMUM_ALLOWED", 19);
        f21349 = r13;
        EnumC5847 r03 = new EnumC5847(268435456, "GENERIC_ALL", 20);
        EnumC5847 r23 = new EnumC5847(536870912, "GENERIC_EXECUTE", 21);
        EnumC5847 r16 = new EnumC5847(1073741824, "GENERIC_WRITE", 22);
        f21350 = r16;
        EnumC5847 r04 = new EnumC5847(2147483648L, "GENERIC_READ", 23);
        f21348 = r04;
        f21353 = new EnumC5847[]{r0, r3, r7, r11, r15, r4, r8, r6, r9, r5, r10, r62, r1, r14, r2, r12, r32, r02, r22, r13, r03, r23, r16, r04, new EnumC5847(256, "ADS_RIGHT_DS_CONTROL_ACCESS", 24), new EnumC5847(1, "ADS_RIGHT_DS_CREATE_CHILD", 25), new EnumC5847(2, "ADS_RIGHT_DS_DELETE_CHILD", 26), new EnumC5847(16, "ADS_RIGHT_DS_READ_PROP", 27), new EnumC5847(32, "ADS_RIGHT_DS_WRITE_PROP", 28), new EnumC5847(8, "ADS_RIGHT_DS_SELF", 29)};
    }

    EnumC5847(long r1, String r3, int r4) {
        this.f21354 = r1;
    }

    public static EnumC5847 valueOf(String r1) {
        return (EnumC5847) Enum.valueOf(EnumC5847.class, r1);
    }

    public static EnumC5847[] values() {
        return (EnumC5847[]) f21353.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f21354;
    }
}
