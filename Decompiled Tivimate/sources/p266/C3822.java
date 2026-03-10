package p266;

/* JADX INFO: renamed from: יי.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3822 {

    /* JADX INFO: renamed from: ʽ */
    public final int f13927;

    /* JADX INFO: renamed from: ˈ */
    public int f13928;

    /* JADX INFO: renamed from: ˑﹳ */
    public String f13929;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f13930;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f13931;

    public C3822(int r2, int r3) {
        this(Integer.MIN_VALUE, r2, r3);
    }

    public C3822(int r4, int r5, int r6) {
        if (r4 == Integer.MIN_VALUE) goto L5;
        String r42 = r4 + "/";
    L6:
        this.f13931 = r42;
        this.f13930 = r5;
        this.f13927 = r6;
        this.f13928 = Integer.MIN_VALUE;
        this.f13929 = "";
        return;
    L5:
        r42 = "";
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7869() {
        if (this.f13928 == Integer.MIN_VALUE) goto L6;
        return;
    L6:
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7870() {
        int r0 = this.f13928;
        if (r0 != Integer.MIN_VALUE) goto L5;
        int r02 = this.f13930;
    L6:
        this.f13928 = r02;
        this.f13929 = this.f13931 + this.f13928;
        return;
    L5:
        r02 = r0 + this.f13927;
        goto L6
    }
}
