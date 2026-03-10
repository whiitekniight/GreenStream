package p312;

/* JADX INFO: renamed from: ᐧʿ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4181 extends Number implements Comparable {

    /* JADX INFO: renamed from: ʾˋ */
    public long f15386;

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        long r0 = this.f15386;
        long r2 = ((C4181) r5).f15386;
        if (r0 != r2) goto L6;
        return 0;
    L6:
        if (r0 >= r2) goto L9;
        return -1;
    L9:
        return 1;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f15386;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof C4181) == true) goto L5;
    L8:
        return false;
    L5:
        if (this.f15386 != ((C4181) r7).f15386) goto L8;
        return true;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f15386;
    }

    public final int hashCode() {
        long r0 = this.f15386;
        return (int) (r0 ^ (r0 >>> 32));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f15386;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f15386;
    }

    public final String toString() {
        return String.valueOf(this.f15386);
    }
}
