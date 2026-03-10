package p320;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᐧٴ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4257 extends Enum {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4257 f15596 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC4257[] f15597 = null;

    static {
        EnumC4257 r0 = new EnumC4257("NOT_SET", 0);
        EnumC4257 r1 = new EnumC4257("EVENT_OVERRIDE", 1);
        f15596 = r1;
        f15597 = new EnumC4257[]{r0, r1};
        SparseArray r3 = new SparseArray();
        r3.put(0, r0);
        r3.put(5, r1);
    }

    public static EnumC4257 valueOf(String r1) {
        return (EnumC4257) Enum.valueOf(EnumC4257.class, r1);
    }

    public static EnumC4257[] values() {
        return (EnumC4257[]) f15597.clone();
    }
}
