package p312;

/* JADX INFO: renamed from: ᐧʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4182 extends Number implements Comparable {

    /* JADX INFO: renamed from: ʾˋ */
    public int f15387;

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        int r0 = this.f15387;
        int r22 = ((C4182) r2).f15387;
        if (r0 != r22) goto L6;
        return 0;
    L6:
        if (r0 >= r22) goto L9;
        return -1;
    L9:
        return 1;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f15387;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C4182) == true) goto L5;
    L8:
        return false;
    L5:
        if (this.f15387 != ((C4182) r3).f15387) goto L8;
        return true;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f15387;
    }

    public final int hashCode() {
        return this.f15387;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f15387;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f15387;
    }

    public final String toString() {
        return String.valueOf(this.f15387);
    }
}
