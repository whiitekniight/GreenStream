package p269;

/* JADX INFO: renamed from: יᐧ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3873 implements InterfaceC3877 {

    /* JADX INFO: renamed from: ʽ */
    public Class f14181;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f14182;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3874 f14183;

    public C3873(C3874 r1) {
        this.f14183 = r1;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3873) == false) goto L10;
        C3873 r42 = (C3873) r4;
        if (this.f14182 != r42.f14182) goto L10;
        if (this.f14181 != r42.f14181) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f14182 * 31;
        Class r1 = this.f14181;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r0 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public final String toString() {
        return "Key{size=" + this.f14182 + "array=" + this.f14181 + '}';
    }

    @Override // p269.InterfaceC3877
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7984() {
        this.f14183.ˎᐧ(this);
    }
}
