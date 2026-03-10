package p320;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᐧٴ.ٴʼ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4247 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4247 f15583 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC4247[] f15584 = null;

    static {
        EnumC4247 r0 = new EnumC4247("DEFAULT", 0);
        f15583 = r0;
        EnumC4247 r1 = new EnumC4247("UNMETERED_ONLY", 1);
        EnumC4247 r3 = new EnumC4247("UNMETERED_OR_DAILY", 2);
        EnumC4247 r5 = new EnumC4247("FAST_IF_RADIO_AWAKE", 3);
        EnumC4247 r7 = new EnumC4247("NEVER", 4);
        EnumC4247 r9 = new EnumC4247("UNRECOGNIZED", 5);
        f15584 = new EnumC4247[]{r0, r1, r3, r5, r7, r9};
        SparseArray r11 = new SparseArray();
        r11.put(0, r0);
        r11.put(1, r1);
        r11.put(2, r3);
        r11.put(3, r5);
        r11.put(4, r7);
        r11.put(-1, r9);
    }

    public static EnumC4247 valueOf(String r1) {
        return (EnumC4247) Enum.valueOf(EnumC4247.class, r1);
    }

    public static EnumC4247[] values() {
        return (EnumC4247[]) f15584.clone();
    }
}
