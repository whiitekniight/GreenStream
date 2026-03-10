package p226;

import java.util.HashMap;

/* JADX INFO: renamed from: ˏʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3491 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final HashMap f12427 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC3491[] f12428 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC3491 f12429 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final short f12430;

    static {
        EnumC3491 r0 = new EnumC3491(0, 8, "NetrConnectionEnum");
        EnumC3491 r3 = new EnumC3491(1, 9, "NetrFileEnum");
        EnumC3491 r6 = new EnumC3491(2, 10, "NetrFileGetInfo");
        EnumC3491 r9 = new EnumC3491(3, 11, "NetrFileClose");
        EnumC3491 r12 = new EnumC3491(4, 12, "NetrSessionEnum");
        EnumC3491 r15 = new EnumC3491(5, 13, "NetrSessionDel");
        EnumC3491 r7 = new EnumC3491(6, 14, "NetrShareAdd");
        EnumC3491 r13 = new EnumC3491(7, 15, "NetrShareEnum");
        f12429 = r13;
        f12428 = new EnumC3491[]{r0, r3, r6, r9, r12, r15, r7, r13, new EnumC3491(8, 36, "NetrShareEnumSticky"), new EnumC3491(9, 16, "NetrShareGetInfo"), new EnumC3491(10, 17, "NetrShareSetInfo"), new EnumC3491(11, 18, "NetrShareDel"), new EnumC3491(12, 19, "NetrShareDelSticky"), new EnumC3491(13, 37, "NetrShareDelStart"), new EnumC3491(14, 38, "NetrShareDelCommit"), new EnumC3491(15, 20, "NetrShareCheck"), new EnumC3491(16, 21, "NetrServerGetInfo"), new EnumC3491(17, 22, "NetrServerSetInfo"), new EnumC3491(18, 23, "NetrServerDiskEnum"), new EnumC3491(19, 24, "NetrServerStatisticsGet"), new EnumC3491(20, 28, "NetrRemoteTOD"), new EnumC3491(21, 25, "NetrServerTransportAdd"), new EnumC3491(22, 41, "NetrServerTransportAddEx"), new EnumC3491(23, 26, "NetrServerTransportEnum"), new EnumC3491(24, 27, "NetrServerTransportDel"), new EnumC3491(25, 53, "NetrServerTransportDelEx"), new EnumC3491(26, 39, "NetrpGetFileSecurity"), new EnumC3491(27, 40, "NetrpSetFileSecurity"), new EnumC3491(28, 30, "NetprPathType"), new EnumC3491(29, 31, "NetprPathCanonicalize"), new EnumC3491(30, 32, "NetprPathCompare"), new EnumC3491(31, 33, "NetprNameValidate"), new EnumC3491(32, 34, "NetprNameCanonicalize"), new EnumC3491(33, 35, "NetprNameCompare"), new EnumC3491(34, 43, "NetrDfsGetVersion"), new EnumC3491(35, 44, "NetrDfsCreateLocalPartition"), new EnumC3491(36, 45, "NetrDfsDeleteLocalPartition"), new EnumC3491(37, 46, "NetrDfsSetLocalVolumeState"), new EnumC3491(38, 48, "NetrDfsCreateExitPoint"), new EnumC3491(39, 50, "NetrDfsModifyPrefix"), new EnumC3491(40, 49, "NetrDfsDeleteExitPoint"), new EnumC3491(41, 51, "NetrDfsFixLocalVolume"), new EnumC3491(42, 52, "NetrDfsManagerReportSiteInfo"), new EnumC3491(43, 54, "NetrServerAliasAdd"), new EnumC3491(44, 55, "NetrServerAliasEnum"), new EnumC3491(45, 56, "NetrServerAliasDel"), new EnumC3491(46, 57, "NetrShareDelEx")};
        f12427 = new HashMap();
        EnumC3491[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        EnumC3491 r32 = r02[r2];
        f12427.put(Short.valueOf(r32.f12430), r32);
        r2 = r2 + 1;
        goto L3
    }

    EnumC3491(int r1, int r2, String r3) {
        this.f12430 = (short) r2;
    }

    public static EnumC3491 valueOf(String r1) {
        return (EnumC3491) Enum.valueOf(EnumC3491.class, r1);
    }

    public static EnumC3491[] values() {
        return (EnumC3491[]) f12428.clone();
    }
}
