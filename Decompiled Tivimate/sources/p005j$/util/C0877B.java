package p005j$.util;

/* JADX INFO: renamed from: j$.util.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0877B {

    /* JADX INFO: renamed from: c */
    public static final C0877B f3453c = null;

    /* JADX INFO: renamed from: a */
    public final boolean f3454a;

    /* JADX INFO: renamed from: b */
    public final int f3455b;

    static {
        f3453c = new C0877B();
    }

    public C0877B() {
        this.f3454a = false;
        this.f3455b = 0;
    }

    public C0877B(int r2) {
        this.f3454a = true;
        this.f3455b = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C0877B) == false) goto L21;
        C0877B r32 = (C0877B) r3;
        boolean r0 = r32.f3454a;
        boolean r1 = this.f3454a;
        if (r1 == false) goto L13;
        if (r0 == false) goto L13;
        if (this.f3455b == r32.f3455b) goto L19;
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
        if (this.f3454a == true) goto L5;
        return 0;
    L5:
        return this.f3455b;
    }

    public final String toString() {
        if (this.f3454a == true) goto L5;
        return "OptionalInt.empty";
    L5:
        return "OptionalInt[" + this.f3455b + "]";
    }
}
