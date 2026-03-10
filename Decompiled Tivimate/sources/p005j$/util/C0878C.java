package p005j$.util;

/* JADX INFO: renamed from: j$.util.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0878C {

    /* JADX INFO: renamed from: c */
    public static final C0878C f3456c = null;

    /* JADX INFO: renamed from: a */
    public final boolean f3457a;

    /* JADX INFO: renamed from: b */
    public final long f3458b;

    static {
        f3456c = new C0878C();
    }

    public C0878C() {
        this.f3457a = false;
        this.f3458b = 0;
    }

    public C0878C(long r2) {
        this.f3457a = true;
        this.f3458b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof C0878C) == false) goto L21;
        C0878C r52 = (C0878C) r5;
        boolean r0 = r52.f3457a;
        boolean r1 = this.f3457a;
        if (r1 == false) goto L13;
        if (r0 == false) goto L13;
        if (this.f3458b == r52.f3458b) goto L19;
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
        if (this.f3457a == false) goto L6;
        long r1 = this.f3458b;
        return (int) (r1 ^ (r1 >>> 32));
    L6:
        return 0;
    }

    public final String toString() {
        if (this.f3457a == true) goto L5;
        return "OptionalLong.empty";
    L5:
        return "OptionalLong[" + this.f3458b + "]";
    }
}
