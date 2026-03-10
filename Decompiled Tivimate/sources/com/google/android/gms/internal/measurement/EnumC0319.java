package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˈʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0319 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC0319 f1974 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC0319 f1975 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final /* synthetic */ EnumC0319[] f1976 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final EnumC0407 f1977;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f1978;

    static {
        EnumC0319 r0 = new EnumC0319("DOUBLE", 0, EnumC0407.f2151, 1);
        EnumC0319 r1 = new EnumC0319("FLOAT", 1, EnumC0407.f2149, 5);
        EnumC0407 r5 = EnumC0407.f2156;
        EnumC0319 r2 = new EnumC0319("INT64", 2, r5, 0);
        EnumC0319 r7 = new EnumC0319("UINT64", 3, r5, 0);
        EnumC0407 r11 = EnumC0407.f2150;
        EnumC0319 r9 = new EnumC0319("INT32", 4, r11, 0);
        EnumC0319 r12 = new EnumC0319("FIXED64", 5, r5, 1);
        EnumC0319 r14 = new EnumC0319("FIXED32", 6, r11, 5);
        EnumC0319 r15 = new EnumC0319("BOOL", 7, EnumC0407.f2157, 0);
        EnumC0319 r4 = new EnumC0319("STRING", 8, EnumC0407.f2153, 2);
        f1974 = r4;
        EnumC0407 r13 = EnumC0407.f2158;
        EnumC0319 r6 = new EnumC0319("GROUP", 9, r13, 3);
        f1975 = r6;
        f1976 = new EnumC0319[]{r0, r1, r2, r7, r9, r12, r14, r15, r4, r6, new EnumC0319("MESSAGE", 10, r13, 2), new EnumC0319("BYTES", 11, EnumC0407.f2155, 2), new EnumC0319("UINT32", 12, r11, 0), new EnumC0319("ENUM", 13, EnumC0407.f2152, 0), new EnumC0319("SFIXED32", 14, r11, 5), new EnumC0319("SFIXED64", 15, r5, 1), new EnumC0319("SINT32", 16, r11, 0), new EnumC0319("SINT64", 17, r5, 0)};
    }

    EnumC0319(String r1, int r2, EnumC0407 r3, int r4) {
        this.f1977 = r3;
        this.f1978 = r4;
    }

    public static EnumC0319[] values() {
        return (EnumC0319[]) f1976.clone();
    }
}
