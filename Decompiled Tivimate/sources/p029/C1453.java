package p029;

import java.io.Serializable;

/* JADX INFO: renamed from: ʼʻ.ˊᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C1453 extends AbstractC1438 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC1438 f4871;

    public C1453(AbstractC1438 r1) {
        this.f4871 = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        return this.f4871.compare(r3, r2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof C1453) == true) goto L8;
        return false;
    L8:
        return this.f4871.equals(((C1453) r2).f4871);
    }

    public final int hashCode() {
        return -this.f4871.hashCode();
    }

    public final String toString() {
        return this.f4871 + ".reverse()";
    }

    @Override // p029.AbstractC1438
    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC1438 mo3953() {
        return this.f4871;
    }
}
