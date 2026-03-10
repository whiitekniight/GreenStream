package p378;

import p043.C1626;

/* JADX INFO: renamed from: ᵔﹶ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4976 {

    /* JADX INFO: renamed from: ʽ */
    public static final C4976 f17780 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C4976 f17781 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C4976 f17782 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C1626 f17783 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final boolean f17784 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C4976 f17785 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C4976 f17786 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f17787;

    static {
        f17785 = new C4976(2);
        f17780 = new C4976(0);
        C4976 r0 = new C4976(1);
        f17781 = r0;
        f17782 = new C4976(3);
        f17786 = r0;
        f17783 = C1626.m4287(r0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f17784 = true;
    }

    public /* synthetic */ C4976(int r1) {
        this.f17787 = r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final float m9778(int r2, int r3, int r4, int r5) {
        switch(this.f17787) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return 1.0f;
    L7:
        if (f17784 == false) goto L10;
        return Math.min(r4 / r2, r5 / r3);
    L10:
        if (Math.max(r3 / r5, r2 / r4) != 0) goto L13;
        return 1.0f;
    L13:
        return 1.0f / Integer.highestOneBit(r2);
    L15:
        return Math.max(r4 / r2, r5 / r3);
    L17:
        return Math.min(1.0f, f17785.m9778(r2, r3, r4, r5));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m9779(int r3, int r4, int r5, int r6) {
        switch(this.f17787) {
            case 0: goto L14;
            case 1: goto L11;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return 2;
    L11:
        return 2;
    L7:
        if (f17784 == false) goto L9;
        return 2;
    L9:
        return 1;
    L14:
        if (m9778(r3, r4, r5, r6) != 1.0f) goto L17;
        return 2;
    L17:
        return f17785.m9779(r3, r4, r5, r6);
    }
}
