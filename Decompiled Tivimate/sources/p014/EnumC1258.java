package p014;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʻʽ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1258 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1258[] f4152 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public long f4153;

    static {
        EnumC1258 r0 = new EnumC1258("NTLMSSP_REVISION_W2K3", 0);
        r0.f4153 = 15;
        f4152 = new EnumC1258[]{r0};
    }

    public static EnumC1258 valueOf(String r1) {
        return (EnumC1258) Enum.valueOf(EnumC1258.class, r1);
    }

    public static EnumC1258[] values() {
        return (EnumC1258[]) f4152.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f4153;
    }
}
