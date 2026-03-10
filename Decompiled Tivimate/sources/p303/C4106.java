package p303;

/* JADX INFO: renamed from: ٴᴵ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4106 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f15119;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f15120;

    public C4106(long r1, long r3) {
        this.f15120 = r1;
        this.f15119 = r3;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L15:
        return false;
    L8:
        if (C4106.class != r7.getClass()) goto L15;
        C4106 r72 = (C4106) r7;
        if (this.f15120 != r72.f15120) goto L15;
        if (this.f15119 != r72.f15119) goto L15;
        return true;
    }

    public final int hashCode() {
        return (((int) this.f15120) * 31) + ((int) this.f15119);
    }
}
