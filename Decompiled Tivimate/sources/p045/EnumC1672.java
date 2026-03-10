package p045;

/* JADX INFO: renamed from: ʼﹳ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1672 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1672 f5554 = null;

    /* JADX INFO: renamed from: ˆﾞ */
    public static final EnumC1672 f5555 = null;

    /* JADX INFO: renamed from: ˈʿ */
    public static final EnumC1672 f5556 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC1672 f5557 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC1672 f5558 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC1672 f5559 = null;

    /* JADX INFO: renamed from: ˋᵔ */
    public static final /* synthetic */ EnumC1672[] f5560 = null;

    /* JADX INFO: renamed from: ˑٴ */
    public static final EnumC1672[] f5561 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final EnumC1672 f5562 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC1672 f5563 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1672 f5564 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC1672 f5565 = null;

    /* JADX INFO: renamed from: ᵎˊ */
    public static final EnumC1672 f5566 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final EnumC1672 f5567 = null;

    /* JADX INFO: renamed from: ᵔי */
    public static final EnumC1672 f5568 = null;

    /* JADX INFO: renamed from: ᵔٴ */
    public static final EnumC1672 f5569 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f5570;

    static {
        EnumC1672 r0 = new EnumC1672(0, 0, "SMB2_NEGOTIATE");
        f5564 = r0;
        EnumC1672 r2 = new EnumC1672(1, 1, "SMB2_SESSION_SETUP");
        f5554 = r2;
        EnumC1672 r4 = new EnumC1672(2, 2, "SMB2_LOGOFF");
        f5557 = r4;
        EnumC1672 r6 = new EnumC1672(3, 3, "SMB2_TREE_CONNECT");
        f5565 = r6;
        EnumC1672 r8 = new EnumC1672(4, 4, "SMB2_TREE_DISCONNECT");
        f5559 = r8;
        EnumC1672 r10 = new EnumC1672(5, 5, "SMB2_CREATE");
        f5563 = r10;
        EnumC1672 r12 = new EnumC1672(6, 6, "SMB2_CLOSE");
        f5558 = r12;
        EnumC1672 r14 = new EnumC1672(7, 7, "SMB2_FLUSH");
        EnumC1672 r1 = new EnumC1672(8, 8, "SMB2_READ");
        f5567 = r1;
        EnumC1672 r5 = new EnumC1672(9, 9, "SMB2_WRITE");
        f5562 = r5;
        EnumC1672 r7 = new EnumC1672(10, 10, "SMB2_LOCK");
        EnumC1672 r9 = new EnumC1672(11, 11, "SMB2_IOCTL");
        f5566 = r9;
        EnumC1672 r11 = new EnumC1672(12, 12, "SMB2_CANCEL");
        f5568 = r11;
        EnumC1672 r13 = new EnumC1672(13, 13, "SMB2_ECHO");
        EnumC1672 r15 = new EnumC1672(14, 14, "SMB2_QUERY_DIRECTORY");
        f5555 = r15;
        EnumC1672 r02 = new EnumC1672(15, 15, "SMB2_CHANGE_NOTIFY");
        EnumC1672 r16 = new EnumC1672(16, 16, "SMB2_QUERY_INFO");
        f5569 = r16;
        EnumC1672 r03 = new EnumC1672(17, 17, "SMB2_SET_INFO");
        f5556 = r03;
        f5560 = new EnumC1672[]{r0, r2, r4, r6, r8, r10, r12, r14, r1, r5, r7, r9, r11, r13, r15, r02, r16, r03, new EnumC1672(18, 18, "SMB2_OPLOCK_BREAK")};
        f5561 = new EnumC1672[19];
        EnumC1672[] r04 = values();
        int r17 = r04.length;
        int r22 = 0;
    L3:
        if (r22 >= r17) goto L5;
        EnumC1672 r3 = r04[r22];
        f5561[r3.f5570] = r3;
        r22 = r22 + 1;
        goto L3
    }

    EnumC1672(int r1, int r2, String r3) {
        this.f5570 = r2;
    }

    public static EnumC1672 valueOf(String r1) {
        return (EnumC1672) Enum.valueOf(EnumC1672.class, r1);
    }

    public static EnumC1672[] values() {
        return (EnumC1672[]) f5560.clone();
    }
}
