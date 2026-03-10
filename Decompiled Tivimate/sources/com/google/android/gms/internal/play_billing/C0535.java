package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʽˑ */
/* JADX INFO: loaded from: classes.dex */
public final class C0535 {

    /* JADX INFO: renamed from: ʽ */
    public final Object[] f2316;

    /* JADX INFO: renamed from: ˈ */
    public final int f2317;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f2318;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC0601 f2319;

    public C0535(AbstractC0601 r4, String r5, Object[] r6) {
        this.f2319 = r4;
        this.f2318 = r5;
        this.f2316 = r6;
        char r42 = r5.charAt(0);
        if (r42 >= '\ud800') goto L6;
        this.f2317 = r42;
        return;
    L6:
        int r43 = r42 & '\u1fff';
        int r0 = 1;
        int r1 = 13;
    L7:
        int r2 = r0 + 1;
        char r02 = r5.charAt(r0);
        if (r02 < '\ud800') goto L10;
        r43 = r43 | ((r02 & '\u1fff') << r1);
        r1 = r1 + 13;
        r0 = r2;
        goto L7
    L10:
        this.f2317 = r43 | (r02 << r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m2136() {
        int r0 = this.f2317;
        if ((r0 & 1) == 0) goto L7;
        return 1;
    L7:
        if ((r0 & 4) != 4) goto L10;
        return 3;
    L10:
        return 2;
    }
}
