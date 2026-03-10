package p342;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0696;

/* JADX INFO: renamed from: ᴵﹳ.ʿ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4609 extends Enum implements InterfaceC0696 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4609 f16501 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4609 f16502 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4609 f16503 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final /* synthetic */ EnumC4609[] f16504 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4609 f16505 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4609 f16506 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16507;

    static {
        EnumC4609 r0 = new EnumC4609(0, 0, "UNKNOWN_STATUS");
        f16505 = r0;
        EnumC4609 r2 = new EnumC4609(1, 1, "ENABLED");
        f16501 = r2;
        EnumC4609 r4 = new EnumC4609(2, 2, "DISABLED");
        f16502 = r4;
        EnumC4609 r6 = new EnumC4609(3, 3, "DESTROYED");
        f16506 = r6;
        EnumC4609 r8 = new EnumC4609(4, -1, "UNRECOGNIZED");
        f16503 = r8;
        f16504 = new EnumC4609[]{r0, r2, r4, r6, r8};
    }

    EnumC4609(int r1, int r2, String r3) {
        this.f16507 = r2;
    }

    public static EnumC4609 valueOf(String r1) {
        return (EnumC4609) Enum.valueOf(EnumC4609.class, r1);
    }

    public static EnumC4609[] values() {
        return (EnumC4609[]) f16504.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m9111() {
        if (this == f16503) goto L7;
        return this.f16507;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
