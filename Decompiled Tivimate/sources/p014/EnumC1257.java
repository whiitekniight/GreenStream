package p014;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʻʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1257 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC1257 f4148 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC1257[] f4149 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC1257 f4150 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f4151;

    static {
        EnumC1257 r0 = new EnumC1257(0, "MsvAvEOL", 0);
        EnumC1257 r1 = new EnumC1257(1, "MsvAvNbComputerName", 1);
        f4150 = r1;
        EnumC1257 r2 = new EnumC1257(2, "MsvAvNdDomainName", 2);
        EnumC1257 r3 = new EnumC1257(3, "MsvAvDnsComputerName", 3);
        EnumC1257 r7 = new EnumC1257(4, "MsvAvDnsDomainName", 4);
        EnumC1257 r8 = new EnumC1257(5, "MsvAvDnsTreeName", 5);
        EnumC1257 r9 = new EnumC1257(6, "MsvAvFlags", 6);
        f4148 = r9;
        f4149 = new EnumC1257[]{r0, r1, r2, r3, r7, r8, r9, new EnumC1257(7, "MsvAvTimestamp", 7), new EnumC1257(8, "MsvAvSingleHost", 8), new EnumC1257(9, "MsvAvTargetName", 9), new EnumC1257(10, "MsvChannelBindings", 10)};
    }

    EnumC1257(long r1, String r3, int r4) {
        this.f4151 = r1;
    }

    public static EnumC1257 valueOf(String r1) {
        return (EnumC1257) Enum.valueOf(EnumC1257.class, r1);
    }

    public static EnumC1257[] values() {
        return (EnumC1257[]) f4149.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f4151;
    }
}
