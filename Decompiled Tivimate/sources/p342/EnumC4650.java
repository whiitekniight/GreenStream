package p342;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0696;

/* JADX INFO: renamed from: ᴵﹳ.ᴵˑ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4650 extends Enum implements InterfaceC0696 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4650 f16526 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4650 f16527 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final /* synthetic */ EnumC4650[] f16528 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4650 f16529 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC4650 f16530 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4650 f16531 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4650 f16532 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16533;

    static {
        EnumC4650 r0 = new EnumC4650(0, 0, "UNKNOWN_KEYMATERIAL");
        f16531 = r0;
        EnumC4650 r2 = new EnumC4650(1, 1, "SYMMETRIC");
        f16526 = r2;
        EnumC4650 r4 = new EnumC4650(2, 2, "ASYMMETRIC_PRIVATE");
        f16527 = r4;
        EnumC4650 r6 = new EnumC4650(3, 3, "ASYMMETRIC_PUBLIC");
        f16532 = r6;
        EnumC4650 r8 = new EnumC4650(4, 4, "REMOTE");
        f16529 = r8;
        EnumC4650 r10 = new EnumC4650(5, -1, "UNRECOGNIZED");
        f16530 = r10;
        f16528 = new EnumC4650[]{r0, r2, r4, r6, r8, r10};
    }

    EnumC4650(int r1, int r2, String r3) {
        this.f16533 = r2;
    }

    public static EnumC4650 valueOf(String r1) {
        return (EnumC4650) Enum.valueOf(EnumC4650.class, r1);
    }

    public static EnumC4650[] values() {
        return (EnumC4650[]) f16528.clone();
    }
}
