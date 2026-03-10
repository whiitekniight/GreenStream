package p176;

import p442.AbstractC5579;

/* JADX INFO: renamed from: ˊᐧ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C3060 {

    /* JADX INFO: renamed from: ʽ */
    public int f10720;

    /* JADX INFO: renamed from: ˈ */
    public boolean f10721;

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean f10722;

    /* JADX INFO: renamed from: ᵎﹶ */
    public C3060 f10723;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f10724;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f10725;

    /* JADX INFO: renamed from: ﾞᴵ */
    public C3060 f10726;

    public C3060() {
        this.f10725 = new byte[8192];
        this.f10722 = true;
        this.f10721 = false;
    }

    public C3060(byte[] r1, int r2, int r3, boolean r4) {
        this.f10725 = r1;
        this.f10724 = r2;
        this.f10720 = r3;
        this.f10721 = r4;
        this.f10722 = false;
    }

    /* JADX INFO: renamed from: ʽ */
    public final C3060 m6484() {
        this.f10721 = true;
        int r2 = this.f10724;
        int r3 = this.f10720;
        return new C3060(this.f10725, r2, r3, true);
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6485(C3060 r6, int r7) {
        boolean r0 = r6.f10722;
        byte[] r1 = r6.f10725;
        if (r0 == false) goto L18;
        int r02 = r6.f10720;
        int r2 = r02 + r7;
        if (r2 > 8192) goto L7;
    L15:
        int r03 = r6.f10720;
        int r22 = this.f10724;
        System.arraycopy(this.f10725, r22, r1, r03, (r22 + r7) - r22);
        r6.f10720 += r7;
        this.f10724 += r7;
        return;
    L7:
        if (r6.f10721 == true) goto L14;
        int r4 = r6.f10724;
        if ((r2 - r4) > 8192) goto L12;
        AbstractC5579.m10716(r4, r02, r1, r1);
        r6.f10720 -= r6.f10724;
        r6.f10724 = 0;
        goto L15
    L12:
        throw new IllegalArgumentException();
    L14:
        throw new IllegalArgumentException();
    L18:
        throw new IllegalStateException("only owner can write");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6486(C3060 r2) {
        r2.f10723 = this;
        r2.f10726 = this.f10726;
        this.f10726.f10723 = r2;
        this.f10726 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3060 m6487() {
        C3060 r0 = this.f10726;
        if (r0 == this) goto L5;
        C3060 r2 = r0;
    L6:
        C3060 r3 = this.f10723;
        r3.f10726 = r0;
        this.f10726.f10723 = r3;
        this.f10726 = null;
        this.f10723 = null;
        return r2;
    L5:
        r2 = null;
        goto L6
    }
}
