package p356;

/* JADX INFO: renamed from: ᵎˑ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4751 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f16782;

    public C4751(long r1) {
        this.f16782 = r1;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L13:
        return false;
    L8:
        if (getClass() != r7.getClass()) goto L13;
        if (this.f16782 != ((C4751) r7).f16782) goto L13;
        return true;
    }

    public final int hashCode() {
        long r1 = this.f16782;
        return (int) (r1 ^ (r1 >>> 32));
    }
}
