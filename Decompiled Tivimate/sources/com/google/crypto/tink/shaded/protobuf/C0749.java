package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 {

    /* JADX INFO: renamed from: ʽ */
    public final Object[] f3081;

    /* JADX INFO: renamed from: ˈ */
    public final int f3082;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f3083;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC0750 f3084;

    public C0749(AbstractC0750 r4, String r5, Object[] r6) {
        this.f3084 = r4;
        this.f3083 = r5;
        this.f3081 = r6;
        char r42 = r5.charAt(0);
        if (r42 >= '\ud800') goto L6;
        this.f3082 = r42;
        return;
    L6:
        int r43 = r42 & '\u1fff';
        int r0 = 13;
        int r1 = 1;
    L7:
        int r2 = r1 + 1;
        char r12 = r5.charAt(r1);
        if (r12 < '\ud800') goto L10;
        r43 = r43 | ((r12 & '\u1fff') << r0);
        r0 = r0 + 13;
        r1 = r2;
        goto L7
    L10:
        this.f3082 = r43 | (r12 << r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m2755() {
        int r0 = this.f3082;
        if ((r0 & 1) == 0) goto L7;
        return 1;
    L7:
        if ((r0 & 4) != 4) goto L10;
        return 3;
    L10:
        return 2;
    }
}
