package p014;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʻʽ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1253 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1253 f4120 = null;

    /* JADX INFO: renamed from: ˆﾞ */
    public static final EnumC1253 f4121 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC1253 f4122 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC1253 f4123 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC1253 f4124 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final EnumC1253 f4125 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC1253 f4126 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1253 f4127 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC1253 f4128 = null;

    /* JADX INFO: renamed from: ᵎˊ */
    public static final EnumC1253 f4129 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final EnumC1253 f4130 = null;

    /* JADX INFO: renamed from: ᵔי */
    public static final EnumC1253 f4131 = null;

    /* JADX INFO: renamed from: ᵔٴ */
    public static final /* synthetic */ EnumC1253[] f4132 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f4133;

    static {
        EnumC1253 r0 = new EnumC1253(2147483648L, "NTLMSSP_NEGOTIATE_56", 0);
        f4127 = r0;
        EnumC1253 r1 = new EnumC1253(1073741824, "NTLMSSP_NEGOTIATE_KEY_EXCH", 1);
        f4120 = r1;
        EnumC1253 r2 = new EnumC1253(536870912, "NTLMSSP_NEGOTIATE_128", 2);
        f4122 = r2;
        EnumC1253 r3 = new EnumC1253(33554432, "NTLMSSP_NEGOTIATE_VERSION", 3);
        f4128 = r3;
        EnumC1253 r7 = new EnumC1253(8388608, "NTLMSSP_NEGOTIATE_TARGET_INFO", 4);
        f4124 = r7;
        EnumC1253 r8 = new EnumC1253(4194304, "NTLMSSP_REQUEST_NON_NT_SESSION_KEY", 5);
        EnumC1253 r9 = new EnumC1253(1048576, "NTLMSSP_NEGOTIATE_IDENTIFY", 6);
        EnumC1253 r13 = new EnumC1253(524288, "NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY", 7);
        f4126 = r13;
        EnumC1253 r4 = new EnumC1253(131072, "NTLMSSP_TARGET_TYPE_SERVER", 8);
        EnumC1253 r5 = new EnumC1253(65536, "NTLMSSP_TARGET_TYPE_DOMAIN", 9);
        EnumC1253 r6 = new EnumC1253(32768, "NTLMSSP_NEGOTIATE_ALWAYS_SIGN", 10);
        f4123 = r6;
        EnumC1253 r10 = new EnumC1253(8192, "NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED", 11);
        EnumC1253 r11 = new EnumC1253(4096, "NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED", 12);
        EnumC1253 r12 = new EnumC1253(2048, "ANONYMOUS", 13);
        EnumC1253 r02 = new EnumC1253(512, "NTLMSSP_NEGOTIATE_NTLM", 14);
        f4130 = r02;
        EnumC1253 r14 = new EnumC1253(128, "NTLMSSP_NEGOTIATE_LM_KEY", 15);
        EnumC1253 r22 = new EnumC1253(64, "NTLMSSP_NEGOTIATE_DATAGRAM", 16);
        EnumC1253 r03 = new EnumC1253(32, "NTLMSSP_NEGOTIATE_SEAL", 17);
        f4125 = r03;
        EnumC1253 r15 = new EnumC1253(16, "NTLMSSP_NEGOTIATE_SIGN", 18);
        f4129 = r15;
        EnumC1253 r23 = new EnumC1253(4, "NTLMSSP_REQUEST_TARGET", 19);
        f4131 = r23;
        EnumC1253 r04 = new EnumC1253(2, "NTLM_NEGOTIATE_OEM", 20);
        EnumC1253 r16 = new EnumC1253(1, "NTLMSSP_NEGOTIATE_UNICODE", 21);
        f4121 = r16;
        f4132 = new EnumC1253[]{r0, r1, r2, r3, r7, r8, r9, r13, r4, r5, r6, r10, r11, r12, r02, r14, r22, r03, r15, r23, r04, r16};
    }

    EnumC1253(long r1, String r3, int r4) {
        this.f4133 = r1;
    }

    public static EnumC1253 valueOf(String r1) {
        return (EnumC1253) Enum.valueOf(EnumC1253.class, r1);
    }

    public static EnumC1253[] values() {
        return (EnumC1253[]) f4132.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f4133;
    }
}
