package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0607 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final C0558 f2432 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ EnumC0607[] f2433 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC0607 f2434 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f2435;

    static {
        EnumC0607 r0 = new EnumC0607(0, -999, "RESPONSE_CODE_UNSPECIFIED");
        f2434 = r0;
        f2433 = new EnumC0607[]{r0, new EnumC0607(1, -3, "SERVICE_TIMEOUT"), new EnumC0607(2, -2, "FEATURE_NOT_SUPPORTED"), new EnumC0607(3, -1, "SERVICE_DISCONNECTED"), new EnumC0607(4, 0, "OK"), new EnumC0607(5, 1, "USER_CANCELED"), new EnumC0607(6, 2, "SERVICE_UNAVAILABLE"), new EnumC0607(7, 3, "BILLING_UNAVAILABLE"), new EnumC0607(8, 4, "ITEM_UNAVAILABLE"), new EnumC0607(9, 5, "DEVELOPER_ERROR"), new EnumC0607(10, 6, "ERROR"), new EnumC0607(11, 7, "ITEM_ALREADY_OWNED"), new EnumC0607(12, 8, "ITEM_NOT_OWNED"), new EnumC0607(13, 11, "EXPIRED_OFFER_TOKEN"), new EnumC0607(14, 12, "NETWORK_ERROR")};
        int r1 = 0;
        ʽﹳ r02 = new ʽﹳ((byte) 0, 0);
        r02.ʽʽ = new Object[8];
        r02.ᴵˊ = 0;
        EnumC0607[] r2 = values();
        int r3 = r2.length;
    L3:
        if (r1 >= r3) goto L14;
        EnumC0607 r4 = r2[r1];
        Integer r5 = Integer.valueOf(r4.f2435);
        int r6 = r02.ᴵˊ + 1;
        Object[] r7 = (Object[]) r02.ʽʽ;
        int r8 = r7.length;
        int r62 = r6 + r6;
        if (r62 <= r8) goto L13;
        if (r62 <= r8) goto L12;
        r8 = (r8 + (r8 >> 1)) + 1;
        if (r8 >= r62) goto L10;
        int r63 = Integer.highestOneBit(r62 - 1);
        r8 = r63 + r63;
    L10:
        if (r8 >= 0) goto L12;
        r8 = Integer.MAX_VALUE;
    L12:
        r02.ʽʽ = Arrays.copyOf(r7, r8);
    L13:
        Object[] r64 = (Object[]) r02.ʽʽ;
        int r72 = r02.ᴵˊ;
        int r82 = r72 + r72;
        r64[r82] = r5;
        r64[r82 + 1] = r4;
        r02.ᴵˊ = r72 + 1;
        r1 = r1 + 1;
        goto L3
    L14:
        C0581 r12 = (C0581) r02.ˈٴ;
        if (r12 != null) goto L23;
        C0558 r13 = C0558.m2191(r02.ᴵˊ, (Object[]) r02.ʽʽ, r02);
        C0581 r03 = (C0581) r02.ˈٴ;
        if (r03 != null) goto L21;
        f2432 = r13;
        return;
    L21:
        throw r03.m2230();
    L23:
        throw r12.m2230();
    }

    EnumC0607(int r1, int r2, String r3) {
        this.f2435 = r2;
    }

    public static EnumC0607[] values() {
        return (EnumC0607[]) f2433.clone();
    }
}
