package p342;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0696;

/* JADX INFO: renamed from: ᴵﹳ.ˈʿ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4614 extends Enum implements InterfaceC0696 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4614 f16508 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4614 f16509 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final EnumC4614 f16510 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4614 f16511 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC4614 f16512 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4614 f16513 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4614 f16514 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final /* synthetic */ EnumC4614[] f16515 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16516;

    static {
        EnumC4614 r0 = new EnumC4614(0, 0, "UNKNOWN_HASH");
        f16513 = r0;
        EnumC4614 r2 = new EnumC4614(1, 1, "SHA1");
        f16508 = r2;
        EnumC4614 r4 = new EnumC4614(2, 2, "SHA384");
        f16509 = r4;
        EnumC4614 r6 = new EnumC4614(3, 3, "SHA256");
        f16514 = r6;
        EnumC4614 r8 = new EnumC4614(4, 4, "SHA512");
        f16511 = r8;
        EnumC4614 r10 = new EnumC4614(5, 5, "SHA224");
        f16512 = r10;
        EnumC4614 r12 = new EnumC4614(6, -1, "UNRECOGNIZED");
        f16510 = r12;
        f16515 = new EnumC4614[]{r0, r2, r4, r6, r8, r10, r12};
    }

    EnumC4614(int r1, int r2, String r3) {
        this.f16516 = r2;
    }

    public static EnumC4614 valueOf(String r1) {
        return (EnumC4614) Enum.valueOf(EnumC4614.class, r1);
    }

    public static EnumC4614[] values() {
        return (EnumC4614[]) f16515.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m9127() {
        if (this == f16510) goto L7;
        return this.f16516;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
