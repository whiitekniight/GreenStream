package p342;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0696;

/* JADX INFO: renamed from: ᴵﹳ.י */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4633 extends Enum implements InterfaceC0696 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4633 f16517 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4633 f16518 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC4633 f16519 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4633 f16520 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC4633 f16521 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4633 f16522 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4633 f16523 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC4633[] f16524 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16525;

    static {
        EnumC4633 r0 = new EnumC4633(0, 0, "UNKNOWN_PREFIX");
        f16522 = r0;
        EnumC4633 r2 = new EnumC4633(1, 1, "TINK");
        f16517 = r2;
        EnumC4633 r4 = new EnumC4633(2, 2, "LEGACY");
        f16518 = r4;
        EnumC4633 r6 = new EnumC4633(3, 3, "RAW");
        f16523 = r6;
        EnumC4633 r8 = new EnumC4633(4, 4, "CRUNCHY");
        f16520 = r8;
        EnumC4633 r10 = new EnumC4633(5, 5, "WITH_ID_REQUIREMENT");
        f16521 = r10;
        EnumC4633 r12 = new EnumC4633(6, -1, "UNRECOGNIZED");
        f16519 = r12;
        f16524 = new EnumC4633[]{r0, r2, r4, r6, r8, r10, r12};
    }

    EnumC4633(int r1, int r2, String r3) {
        this.f16525 = r2;
    }

    public static EnumC4633 valueOf(String r1) {
        return (EnumC4633) Enum.valueOf(EnumC4633.class, r1);
    }

    public static EnumC4633[] values() {
        return (EnumC4633[]) f16524.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static EnumC4633 m9172(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return f16521;
    L18:
        return f16520;
    L20:
        return f16523;
    L22:
        return f16518;
    L24:
        return f16517;
    L26:
        return f16522;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m9173() {
        if (this == f16519) goto L7;
        return this.f16525;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
