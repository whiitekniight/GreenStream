package p404;

/* JADX INFO: renamed from: ⁱי.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C5161 {

    /* JADX INFO: renamed from: ʽ */
    public static final C5161 f18495 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f18496;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f18497;

    static {
        f18495 = new C5161(0, false);
    }

    public C5161(int r1, boolean r2) {
        this.f18497 = r1;
        this.f18496 = r2;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C5161.class != r3.getClass()) goto L19;
        C5161 r32 = (C5161) r3;
        if (this.f18497 == r32.f18497) goto L11;
        return false;
    L11:
        if (this.f18496 != r32.f18496) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        return (this.f18497 << 1) + (this.f18496 ? 1 : 0);
    }
}
