package p423;

import java.util.HashMap;

/* JADX INFO: renamed from: ﹳˎ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5392 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC5392[] f19267 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC5392 f19268 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final HashMap f19269 = null;

    static {
        EnumC5392 r0 = new EnumC5392("X86_32", 0);
        EnumC5392 r1 = new EnumC5392("X86_64", 1);
        EnumC5392 r3 = new EnumC5392("ARM_UNKNOWN", 2);
        EnumC5392 r5 = new EnumC5392("PPC", 3);
        EnumC5392 r7 = new EnumC5392("PPC64", 4);
        EnumC5392 r9 = new EnumC5392("ARMV6", 5);
        EnumC5392 r11 = new EnumC5392("ARMV7", 6);
        EnumC5392 r13 = new EnumC5392("UNKNOWN", 7);
        f19268 = r13;
        EnumC5392 r15 = new EnumC5392("ARMV7S", 8);
        EnumC5392 r2 = new EnumC5392("ARM64", 9);
        f19267 = new EnumC5392[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2};
        HashMap r12 = new HashMap(4);
        f19269 = r12;
        r12.put("armeabi-v7a", r11);
        r12.put("armeabi", r9);
        r12.put("arm64-v8a", r2);
        r12.put("x86", r0);
    }

    public static EnumC5392 valueOf(String r1) {
        return (EnumC5392) Enum.valueOf(EnumC5392.class, r1);
    }

    public static EnumC5392[] values() {
        return (EnumC5392[]) f19267.clone();
    }
}
