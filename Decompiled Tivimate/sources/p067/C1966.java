package p067;

/* JADX INFO: renamed from: ʽⁱ.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1966 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C1930 f6775;

    public C1966(C1930 r1) {
        this.f6775 = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C1966) == true) goto L10;
        return false;
    L10:
        return this.f6775.equals(((C1966) r2).f6775);
    }

    public final int hashCode() {
        return this.f6775.hashCode();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m5004(int... r6) {
        int r0 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (this.f6775.f6581.get(r6[r2]) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
