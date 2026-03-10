package p005j$.util;

/* JADX INFO: renamed from: j$.util.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876A {

    /* JADX INFO: renamed from: c */
    public static final C0876A f3450c = null;

    /* JADX INFO: renamed from: a */
    public final boolean f3451a;

    /* JADX INFO: renamed from: b */
    public final double f3452b;

    static {
        f3450c = new C0876A();
    }

    public C0876A() {
        this.f3451a = false;
        this.f3452b = Double.NaN;
    }

    public C0876A(double r2) {
        this.f3451a = true;
        this.f3452b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof C0876A) == false) goto L21;
        C0876A r52 = (C0876A) r5;
        boolean r0 = r52.f3451a;
        boolean r1 = this.f3451a;
        if (r1 == false) goto L13;
        if (r0 == false) goto L13;
        if (Double.compare(this.f3452b, r52.f3452b) == 0) goto L19;
        return false;
    L19:
        return true;
    L13:
        if (r1 != r0) goto L20;
        return true;
    L20:
        return false;
    L21:
        return false;
    }

    public final int hashCode() {
        if (this.f3451a == false) goto L6;
        long r0 = Double.doubleToLongBits(this.f3452b);
        return (int) (r0 ^ (r0 >>> 32));
    L6:
        return 0;
    }

    public final String toString() {
        if (this.f3451a == true) goto L5;
        return "OptionalDouble.empty";
    L5:
        return "OptionalDouble[" + this.f3452b + "]";
    }
}
