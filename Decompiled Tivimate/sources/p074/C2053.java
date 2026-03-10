package p074;

/* JADX INFO: renamed from: ʾˈ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2053 {

    /* JADX INFO: renamed from: ʽ */
    public final double f7076;

    /* JADX INFO: renamed from: ⁱˊ */
    public final EnumC2028 f7077;

    /* JADX INFO: renamed from: ﹳٴ */
    public final EnumC2028 f7078;

    public C2053(EnumC2028 r1, EnumC2028 r2, double r3) {
        this.f7078 = r1;
        this.f7077 = r2;
        this.f7076 = r3;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C2053) == true) goto L8;
        return false;
    L8:
        C2053 r82 = (C2053) r8;
        if (this.f7078 == r82.f7078) goto L12;
        return false;
    L12:
        if (this.f7077 == r82.f7077) goto L15;
        return false;
    L15:
        if (Double.compare(this.f7076, r82.f7076) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f7078.hashCode() * 31;
        int r1 = (this.f7077.hashCode() + r0) * 31;
        long r2 = Double.doubleToLongBits(this.f7076);
        return r1 + ((int) (r2 ^ (r2 >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f7078 + ", crashlytics=" + this.f7077 + ", sessionSamplingRate=" + this.f7076 + ')';
    }
}
