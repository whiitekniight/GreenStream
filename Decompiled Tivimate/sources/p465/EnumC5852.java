package p465;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ﾞˉ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5852 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC5852 f21381 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC5852 f21382 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final /* synthetic */ EnumC5852[] f21383 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC5852 f21384 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC5852 f21385 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC5852 f21386 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC5852 f21387 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f21388;

    static {
        EnumC5852 r0 = new EnumC5852(0, 0, "REQUEST");
        f21386 = r0;
        EnumC5852 r2 = new EnumC5852(1, 1, "PING");
        EnumC5852 r4 = new EnumC5852(2, 2, "RESPONSE");
        f21381 = r4;
        EnumC5852 r6 = new EnumC5852(3, 3, "FAULT");
        f21382 = r6;
        EnumC5852 r8 = new EnumC5852(4, 4, "WORKING");
        EnumC5852 r10 = new EnumC5852(5, 5, "NOCALL");
        EnumC5852 r12 = new EnumC5852(6, 6, "REJECT");
        f21387 = r12;
        EnumC5852 r14 = new EnumC5852(7, 7, "ACK");
        EnumC5852 r1 = new EnumC5852(8, 8, "CL_CANCEL");
        EnumC5852 r5 = new EnumC5852(9, 9, "FACK");
        EnumC5852 r7 = new EnumC5852(10, 10, "CANCEL_ACK");
        EnumC5852 r9 = new EnumC5852(11, 11, "BIND");
        f21384 = r9;
        EnumC5852 r11 = new EnumC5852(12, 12, "BIND_ACK");
        f21385 = r11;
        f21383 = new EnumC5852[]{r0, r2, r4, r6, r8, r10, r12, r14, r1, r5, r7, r9, r11, new EnumC5852(13, 13, "BIND_NAK"), new EnumC5852(14, 14, "ALTER_CONTEXT"), new EnumC5852(15, 15, "ALTER_CONTEXT_RESP"), new EnumC5852(16, 17, "SHUTDOWN"), new EnumC5852(17, 18, "CO_CANCEL"), new EnumC5852(18, 19, "ORPHANED")};
    }

    EnumC5852(int r1, int r2, String r3) {
        this.f21388 = r2;
    }

    public static EnumC5852 valueOf(String r1) {
        return (EnumC5852) Enum.valueOf(EnumC5852.class, r1);
    }

    public static EnumC5852[] values() {
        return (EnumC5852[]) f21383.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f21388;
    }
}
