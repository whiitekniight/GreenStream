package p373;

/* JADX INFO: renamed from: ᵔᐧ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C4876 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int[] f17281;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f17282;

    public C4876() {
        this.f17281 = new int[10];
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m9603(int r4, int r5) {
        if (r4 < 0) goto L8;
        int[] r0 = this.f17281;
        if (r4 >= r0.length) goto L9;
        this.f17282 = (1 << r4) | this.f17282;
        r0[r4] = r5;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m9604() {
        if ((this.f17282 & 16) != 0) goto L5;
        return 65535;
    L5:
        return this.f17281[4];
    }
}
