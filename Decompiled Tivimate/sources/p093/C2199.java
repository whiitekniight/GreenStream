package p093;

/* JADX INFO: renamed from: ʿˈ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2199 extends C2201 {

    /* JADX INFO: renamed from: ˈٴ */
    public static final C2199 f7956 = null;

    static {
        f7956 = new C2199(1, 0, 1);
    }

    @Override // p093.C2201
    public final boolean equals(Object r3) {
        if ((r3 instanceof C2199) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C2199 r32 = (C2199) r3;
        int r0 = r32.f7962;
        if (this.f7962 == r0) goto L11;
        return false;
    L11:
        if (this.f7963 != r32.f7963) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((C2199) r3).isEmpty() == false) goto L8;
        return true;
    }

    @Override // p093.C2201
    public final int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (this.f7962 * 31) + this.f7963;
    }

    @Override // p093.C2201
    public final boolean isEmpty() {
        if (this.f7962 <= this.f7963) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p093.C2201
    public final String toString() {
        return this.f7962 + ".." + this.f7963;
    }
}
