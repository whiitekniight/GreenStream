package p053;

import p164.AbstractC2927;

/* JADX INFO: renamed from: ʽʿ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C1784 f5951 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f5952;

    static {
        f5951 = new C1784();
    }

    public /* synthetic */ C1792(Object r1) {
        this.f5952 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1792) == false) goto L11;
        Object r22 = ((C1792) r2).f5952;
        if (AbstractC2927.m6273(this.f5952, r22) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        Object r0 = this.f5952;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        Object r0 = this.f5952;
        if ((r0 instanceof C1798) == false) goto L7;
        return ((C1798) r0).toString();
    L7:
        return "Value(" + r0 + ')';
    }
}
