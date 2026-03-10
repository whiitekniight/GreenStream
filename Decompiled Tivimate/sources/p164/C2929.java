package p164;

/* JADX INFO: renamed from: ˊʼ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C2929 implements InterfaceC2932 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f10350;

    public C2929(Class r1) {
        this.f10350 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2929) == false) goto L8;
        Class r22 = ((C2929) r2).f10350;
        if (AbstractC2927.m6273(this.f10350, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f10350.hashCode();
    }

    public final String toString() {
        return this.f10350 + " (Kotlin reflection is not available)";
    }

    @Override // p164.InterfaceC2932
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo6282() {
        return this.f10350;
    }
}
