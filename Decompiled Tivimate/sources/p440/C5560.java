package p440;

/* JADX INFO: renamed from: ﹶʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5560 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f20070;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f20071;

    public C5560(long r1, long r3) {
        this.f20071 = r1;
        this.f20070 = r3;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C5560) == true) goto L8;
        return false;
    L8:
        C5560 r82 = (C5560) r8;
        if (this.f20071 == r82.f20071) goto L11;
    L13:
        return false;
    L11:
        if (this.f20070 != r82.f20070) goto L13;
        return true;
    }

    public final int hashCode() {
        return (((int) this.f20071) * 31) + ((int) this.f20070);
    }
}
