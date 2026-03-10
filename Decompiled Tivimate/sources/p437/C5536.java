package p437;

import p016.C1286;

/* JADX INFO: renamed from: ﹶ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C5536 {

    /* JADX INFO: renamed from: ˈ */
    public static final C5536 f19955 = null;

    /* JADX INFO: renamed from: ʽ */
    public final boolean f19956;

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f19957;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f19958;

    static {
        f19955 = new C1286().m3634();
    }

    public C5536(C1286 r2) {
        this.f19958 = r2.f4365;
        this.f19957 = r2.f4364;
        this.f19956 = r2.f4363;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C5536.class != r3.getClass()) goto L22;
        C5536 r32 = (C5536) r3;
        if (this.f19958 == r32.f19958) goto L11;
        return false;
    L11:
        if (this.f19957 == r32.f19957) goto L13;
        return false;
    L13:
        if (this.f19956 != r32.f19956) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        return (((this.f19958 ? 1 : 0) << 2) + ((this.f19957 ? 1 : 0) << 1)) + (this.f19956 ? 1 : 0);
    }
}
