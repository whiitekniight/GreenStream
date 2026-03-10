package p224;

/* JADX INFO: renamed from: ˏ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C3471 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Class f12346;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f12347;

    public C3471(Class r1, Class r2) {
        this.f12347 = r1;
        this.f12346 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C3471 m7230(Class r2) {
        return new C3471(InterfaceC3475.class, r2);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L8;
    L15:
        return false;
    L8:
        if (C3471.class != r4.getClass()) goto L15;
        C3471 r42 = (C3471) r4;
        if (this.f12346.equals(r42.f12346) == true) goto L14;
        return false;
    L14:
        return this.f12347.equals(r42.f12347);
    }

    public final int hashCode() {
        int r0 = this.f12346.hashCode() * 31;
        return this.f12347.hashCode() + r0;
    }

    public final String toString() {
        Class r1 = this.f12346;
        Class r2 = this.f12347;
        if (r2 != InterfaceC3475.class) goto L7;
        return r1.getName();
    L7:
        return "@" + r2.getName() + " " + r1.getName();
    }
}
