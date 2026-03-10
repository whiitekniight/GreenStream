package p099;

/* JADX INFO: renamed from: ʿٴ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2233 {

    /* JADX INFO: renamed from: ʽ */
    public Class f8053;

    /* JADX INFO: renamed from: ⁱˊ */
    public Class f8054;

    /* JADX INFO: renamed from: ﹳٴ */
    public Class f8055;

    public C2233(Class r1, Class r2, Class r3) {
        this.f8055 = r1;
        this.f8054 = r2;
        this.f8053 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L20:
        return false;
    L8:
        if (C2233.class != r5.getClass()) goto L20;
        C2233 r52 = (C2233) r5;
        if (this.f8055.equals(r52.f8055) == true) goto L14;
        return false;
    L14:
        if (this.f8054.equals(r52.f8054) == true) goto L17;
        return false;
    L17:
        if (AbstractC2229.m5414(this.f8053, r52.f8053) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f8055.hashCode() * 31;
        int r1 = (this.f8054.hashCode() + r0) * 31;
        Class r02 = this.f8053;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return r1 + r03;
    L5:
        r03 = 0;
        goto L7
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f8055 + ", second=" + this.f8054 + '}';
    }
}
