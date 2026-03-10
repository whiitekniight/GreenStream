package p317;

/* JADX INFO: renamed from: ᐧˎ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C4206 {

    /* JADX INFO: renamed from: ʽ */
    public static final C4206 f15441 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f15442;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f15443;

    static {
        f15441 = new C4206(-1, -1);
        new C4206(0, 0);
    }

    public C4206(int r2, int r3) {
        if (r2 == (-1)) goto L5;
        if (r2 >= 0) goto L5;
    L8:
        boolean r0 = false;
    L10:
        AbstractC4214.m8560(r0);
        this.f15443 = r2;
        this.f15442 = r3;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        if (r3 < 0) goto L8;
    L9:
        r0 = true;
        goto L10
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof C4206) == false) goto L15;
        C4206 r52 = (C4206) r5;
        if (this.f15443 != r52.f15443) goto L15;
        if (this.f15442 != r52.f15442) goto L15;
        return true;
    L15:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f15443;
        int r1 = r0 << 16;
        return ((r0 >>> 16) | r1) ^ this.f15442;
    }

    public final String toString() {
        return this.f15443 + "x" + this.f15442;
    }
}
