package p053;

import p164.AbstractC2927;

/* JADX INFO: renamed from: ʽʿ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C1798 extends C1784 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Throwable f5975;

    public C1798(Throwable r1) {
        this.f5975 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1798) == false) goto L8;
        Throwable r22 = ((C1798) r2).f5975;
        if (AbstractC2927.m6273(this.f5975, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        Throwable r0 = this.f5975;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    @Override // p053.C1784
    public final String toString() {
        return "Closed(" + this.f5975 + ')';
    }
}
