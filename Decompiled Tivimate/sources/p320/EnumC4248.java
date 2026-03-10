package p320;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᐧٴ.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4248 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final SparseArray f15585 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC4248[] f15586 = null;

    static {
        EnumC4248 r0 = new EnumC4248("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC4248 r1 = new EnumC4248("GPRS", 1);
        EnumC4248 r3 = new EnumC4248("EDGE", 2);
        EnumC4248 r5 = new EnumC4248("UMTS", 3);
        EnumC4248 r7 = new EnumC4248("CDMA", 4);
        EnumC4248 r9 = new EnumC4248("EVDO_0", 5);
        EnumC4248 r11 = new EnumC4248("EVDO_A", 6);
        EnumC4248 r13 = new EnumC4248("RTT", 7);
        EnumC4248 r15 = new EnumC4248("HSDPA", 8);
        EnumC4248 r14 = new EnumC4248("HSUPA", 9);
        EnumC4248 r12 = new EnumC4248("HSPA", 10);
        EnumC4248 r10 = new EnumC4248("IDEN", 11);
        EnumC4248 r8 = new EnumC4248("EVDO_B", 12);
        EnumC4248 r6 = new EnumC4248("LTE", 13);
        EnumC4248 r4 = new EnumC4248("EHRPD", 14);
        EnumC4248 r2 = new EnumC4248("HSPAP", 15);
        EnumC4248 r62 = new EnumC4248("GSM", 16);
        EnumC4248 r42 = new EnumC4248("TD_SCDMA", 17);
        EnumC4248 r22 = new EnumC4248("IWLAN", 18);
        EnumC4248 r63 = new EnumC4248("LTE_CA", 19);
        f15586 = new EnumC4248[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6, r4, r2, r62, r42, r22, r63, new EnumC4248("COMBINED", 20)};
        SparseArray r23 = new SparseArray();
        f15585 = r23;
        r23.put(0, r0);
        r23.put(1, r1);
        r23.put(2, r3);
        r23.put(3, r5);
        r23.put(4, r7);
        r23.put(5, r9);
        r23.put(6, r11);
        r23.put(7, r13);
        r23.put(8, r15);
        r23.put(9, r14);
        r23.put(10, r12);
        r23.put(11, r10);
        r23.put(12, r8);
        r23.put(13, r6);
        r23.put(14, r4);
        r23.put(15, r2);
        r23.put(16, r62);
        r23.put(17, r42);
        r23.put(18, r22);
        r23.put(19, r63);
    }

    public static EnumC4248 valueOf(String r1) {
        return (EnumC4248) Enum.valueOf(EnumC4248.class, r1);
    }

    public static EnumC4248[] values() {
        return (EnumC4248[]) f15586.clone();
    }
}
