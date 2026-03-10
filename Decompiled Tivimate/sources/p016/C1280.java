package p016;

import p183.C3117;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʻˆ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1280 {

    /* JADX INFO: renamed from: ʽ */
    public final C3117 f4297;

    /* JADX INFO: renamed from: ˈ */
    public final int f4298;

    /* JADX INFO: renamed from: ˑﹳ */
    public final byte[] f4299;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f4300;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f4301;

    public C1280(boolean r5, String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        byte r0 = 0;
        int r1 = 1;
        if (r7 != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r11 != null) goto L8;
        boolean r3 = true;
    L9:
        AbstractC4214.m8560(r2 ^ r3);
        this.f4301 = r5;
        this.f4300 = r6;
        this.f4298 = r7;
        this.f4299 = r11;
        if (r6 != null) goto L13;
    L33:
        this.f4297 = new C3117(r1, r9, r10, r8);
        return;
    L13:
        switch(r6.hashCode()) {
            case 3046605: goto L28;
            case 3046671: goto L24;
            case 3049879: goto L20;
            case 3049895: goto L16;
            default: goto L14;
        };
    L14:
        r0 = -1;
    L30:
        switch(r0) {
            case 0: goto L32;
            case 1: goto L32;
            case 2: goto L33;
            case 3: goto L33;
            default: goto L31;
        };
    L31:
        AbstractC4214.m8561("TrackEncryptionBox", "Unsupported protection scheme type '" + r6 + "'. Assuming AES-CTR crypto mode.");
        goto L33
    L32:
        r1 = 2;
        goto L33
    L16:
        if (r6.equals("cens") == false) goto L35;
        r0 = 3;
        goto L30
    L35:
        r0 = -1;
        goto L30
    L20:
        if (r6.equals("cenc") == false) goto L36;
        r0 = 2;
        goto L30
    L36:
        r0 = -1;
        goto L30
    L24:
        if (r6.equals("cbcs") == false) goto L37;
        r0 = 1;
        goto L30
    L37:
        r0 = -1;
        goto L30
    L28:
        if (r6.equals("cbc1") == true) goto L30;
        r0 = -1;
        goto L30
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }
}
