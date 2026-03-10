package p191;

/* JADX INFO: renamed from: ˋˋ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3220 implements InterfaceC3190 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f11391;

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC3190 f11392;

    /* JADX INFO: renamed from: ˈٴ */
    public int f11393;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f11394;

    /* JADX INFO: renamed from: ᴵᵔ */
    public Object f11395;

    public C3220(InterfaceC3190 r2) {
        this.f11394 = 0;
        this.f11391 = -1;
        this.f11393 = -1;
        this.f11395 = null;
        this.f11392 = r2;
    }

    @Override // p191.InterfaceC3190
    /* JADX INFO: renamed from: ʼˎ */
    public final void mo6789(int r4, int r5) {
        if (this.f11394 != 2) goto L10;
        int r0 = this.f11391;
        if (r0 < r4) goto L10;
        if (r0 > (r4 + r5)) goto L10;
        this.f11393 += r5;
        this.f11391 = r4;
        return;
    L10:
        m6844();
        this.f11391 = r4;
        this.f11393 = r5;
        this.f11394 = 2;
    }

    @Override // p191.InterfaceC3190
    /* JADX INFO: renamed from: ʽʽ */
    public final void mo6790(int r6, int r7, Object r8) {
        if (this.f11394 != 3) goto L12;
        int r0 = this.f11391;
        int r2 = this.f11393 + r0;
        if (r6 > r2) goto L12;
        int r3 = r6 + r7;
        if (r3 < r0) goto L12;
        if (this.f11395 != r8) goto L12;
        this.f11391 = Math.min(r6, r0);
        this.f11393 = Math.max(r2, r3) - this.f11391;
        return;
    L12:
        m6844();
        this.f11391 = r6;
        this.f11393 = r7;
        this.f11395 = r8;
        this.f11394 = 3;
    }

    @Override // p191.InterfaceC3190
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo6791(int r2, int r3) {
        m6844();
        this.f11392.mo6791(r2, r3);
    }

    @Override // p191.InterfaceC3190
    /* JADX INFO: renamed from: ᵢˏ */
    public final void mo6792(int r5, int r6) {
        if (this.f11394 != 1) goto L10;
        int r0 = this.f11391;
        if (r5 < r0) goto L10;
        int r2 = this.f11393;
        if (r5 > (r0 + r2)) goto L10;
        this.f11393 = r2 + r6;
        this.f11391 = Math.min(r5, r0);
        return;
    L10:
        m6844();
        this.f11391 = r5;
        this.f11393 = r6;
        this.f11394 = 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6844() {
        int r0 = this.f11394;
        if (r0 != 0) goto L5;
        return;
    L5:
        InterfaceC3190 r2 = this.f11392;
        if (r0 != 1) goto L8;
        r2.mo6792(this.f11391, this.f11393);
    L15:
        this.f11395 = null;
        this.f11394 = 0;
        return;
    L8:
        if (r0 != 2) goto L10;
        r2.mo6789(this.f11391, this.f11393);
        goto L15
    L10:
        if (r0 != 3) goto L15;
        r2.mo6790(this.f11391, this.f11393, this.f11395);
        goto L15
    }
}
