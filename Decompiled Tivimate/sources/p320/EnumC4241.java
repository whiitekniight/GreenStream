package p320;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᐧٴ.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4241 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final SparseArray f15563 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC4241[] f15564 = null;

    static {
        EnumC4241 r0 = new EnumC4241("MOBILE", 0);
        EnumC4241 r1 = new EnumC4241("WIFI", 1);
        EnumC4241 r3 = new EnumC4241("MOBILE_MMS", 2);
        EnumC4241 r5 = new EnumC4241("MOBILE_SUPL", 3);
        EnumC4241 r7 = new EnumC4241("MOBILE_DUN", 4);
        EnumC4241 r9 = new EnumC4241("MOBILE_HIPRI", 5);
        EnumC4241 r11 = new EnumC4241("WIMAX", 6);
        EnumC4241 r13 = new EnumC4241("BLUETOOTH", 7);
        EnumC4241 r15 = new EnumC4241("DUMMY", 8);
        EnumC4241 r14 = new EnumC4241("ETHERNET", 9);
        EnumC4241 r12 = new EnumC4241("MOBILE_FOTA", 10);
        EnumC4241 r10 = new EnumC4241("MOBILE_IMS", 11);
        EnumC4241 r8 = new EnumC4241("MOBILE_CBS", 12);
        EnumC4241 r6 = new EnumC4241("WIFI_P2P", 13);
        EnumC4241 r4 = new EnumC4241("MOBILE_IA", 14);
        EnumC4241 r2 = new EnumC4241("MOBILE_EMERGENCY", 15);
        EnumC4241 r62 = new EnumC4241("PROXY", 16);
        EnumC4241 r42 = new EnumC4241("VPN", 17);
        EnumC4241 r22 = new EnumC4241("NONE", 18);
        f15564 = new EnumC4241[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6, r4, r2, r62, r42, r22};
        SparseArray r43 = new SparseArray();
        f15563 = r43;
        r43.put(0, r0);
        r43.put(1, r1);
        r43.put(2, r3);
        r43.put(3, r5);
        r43.put(4, r7);
        r43.put(5, r9);
        r43.put(6, r11);
        r43.put(7, r13);
        r43.put(8, r15);
        r43.put(9, r14);
        r43.put(10, r12);
        r43.put(11, r10);
        r43.put(12, r8);
        r43.put(13, r6);
        r43.put(14, r4);
        r43.put(15, r2);
        r43.put(16, r62);
        r43.put(17, r42);
        r43.put(-1, r22);
    }

    public static EnumC4241 valueOf(String r1) {
        return (EnumC4241) Enum.valueOf(EnumC4241.class, r1);
    }

    public static EnumC4241[] values() {
        return (EnumC4241[]) f15564.clone();
    }
}
