package p442;

import p164.AbstractC2927;

/* JADX INFO: renamed from: ﹶˈ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C5588 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f20149;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f20150;

    public C5588(int r1, Object r2) {
        this.f20150 = r1;
        this.f20149 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C5588) == true) goto L8;
        return false;
    L8:
        C5588 r52 = (C5588) r5;
        if (this.f20150 == r52.f20150) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f20149, r52.f20149) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f20150 * 31;
        Object r1 = this.f20149;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r0 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f20150 + ", value=" + this.f20149 + ')';
    }
}
