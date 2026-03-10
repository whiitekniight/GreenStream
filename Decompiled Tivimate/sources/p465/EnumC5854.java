package p465;

/* JADX INFO: renamed from: ﾞˉ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5854 extends Enum {

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC5854 f21394 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC5854 f21395 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final EnumC5854 f21396 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC5854 f21397 = null;

    /* JADX INFO: renamed from: ᵎˊ */
    public static final EnumC5854 f21398 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final EnumC5854 f21399 = null;

    /* JADX INFO: renamed from: ᵔי */
    public static final /* synthetic */ EnumC5854[] f21400 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final byte[] f21401;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f21402;

    /* JADX INFO: renamed from: ˈٴ */
    public final short f21403;

    /* JADX INFO: renamed from: ᴵˊ */
    public final String f21404;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final short f21405;

    static {
        EnumC5854 r0 = new EnumC5854(0, "WINREG_V1_0", "winreg interface", "338cd001-2244-31f1-aaaa-900038001003:v1.0");
        f21395 = r0;
        EnumC5854 r1 = new EnumC5854(1, "SRVSVC_V3_0", "srvsvc interface", "4b324fc8-1670-01d3-1278-5a47bf6ee188:v3.0");
        f21397 = r1;
        EnumC5854 r2 = new EnumC5854(2, "LSASVC_V0_0", "lsarpc interface", "12345778-1234-ABCD-EF00-0123456789AB:v0.0");
        f21394 = r2;
        EnumC5854 r4 = new EnumC5854(3, "SAMSVC_V1_0", "samr interface", "12345778-1234-ABCD-EF00-0123456789AC:v1.0");
        f21399 = r4;
        EnumC5854 r6 = new EnumC5854(4, "SVCCTL_V2_0", "svcctl_interface", "367abb81-9844-35f1-ad32-98f038001003:v2.0");
        f21396 = r6;
        EnumC5854 r8 = new EnumC5854(5, "NDR_32BIT_V2", "NDR transfer syntax identifier", "8a885d04-1ceb-11c9-9fe8-08002b104860:v2.0");
        f21398 = r8;
        f21400 = new EnumC5854[]{r0, r1, r2, r4, r6, r8};
    }

    EnumC5854(int r18, String r19, String r20, String r21) {
        this.f21401 = new byte[16];
        this.f21402 = r20;
        this.f21404 = r21;
        String[] r2 = r21.split(":", 2);
        int r3 = 0;
        String[] r5 = r2[0].split("-", 5);
        String[] r6 = {r5[0], r5[1], r5[2]};
        int r8 = 3;
        String[] r52 = {r5[3], r5[4]};
        int r9 = 0;
        int r11 = 0;
        int r12 = 4;
    L3:
        if (r9 >= r8) goto L16;
        String r13 = r6[r9];
        byte[] r14 = r13.getBytes();
        int r132 = r13.length() - 2;
    L5:
        if (r132 < 0) goto L15;
        int r15 = r132;
    L7:
        int r182 = r3;
        if (r15 >= (r132 + 2)) goto L14;
        byte r32 = r14[r15];
        byte[] r82 = this.f21401;
        r82[r11] = (byte) (r82[r11] | ((byte) (Character.digit(r32, 16) << r12)));
        if (r12 != 0) goto L12;
        r11 = r11 + 1;
        r12 = 4;
    L13:
        r15 = r15 + 1;
        r3 = r182;
        goto L7
    L12:
        r12 = r182;
        goto L13
    L14:
        r132 = r132 - 2;
        r3 = r182;
        goto L5
    L15:
        r9 = r9 + 1;
        r8 = 3;
        goto L3
    L16:
        int r183 = r3;
    L17:
        if (r3 >= 2) goto L26;
        byte[] r62 = r52[r3].getBytes();
        int r83 = r62.length;
        int r92 = r183;
    L19:
        if (r92 >= r83) goto L25;
        byte r133 = r62[r92];
        byte[] r142 = this.f21401;
        r142[r11] = (byte) (((byte) (Character.digit(r133, 16) << r12)) | r142[r11]);
        if (r12 != 0) goto L23;
        r11 = r11 + 1;
        r12 = 4;
    L24:
        r92 = r92 + 1;
        goto L19
    L23:
        r12 = r183;
        goto L24
    L25:
        r3 = r3 + 1;
        goto L17
    L26:
        String[] r1 = r2[1].split("\\.", 2);
        this.f21403 = Short.valueOf(r1[r183].substring(1)).shortValue();
        this.f21405 = Short.valueOf(r1[1]).shortValue();
    }

    public static EnumC5854 valueOf(String r1) {
        return (EnumC5854) Enum.valueOf(EnumC5854.class, r1);
    }

    public static EnumC5854[] values() {
        return (EnumC5854[]) f21400.clone();
    }
}
