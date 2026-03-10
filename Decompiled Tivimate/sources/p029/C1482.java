package p029;

import java.io.Serializable;
import java.util.Arrays;
import p107.InterfaceC2364;

/* JADX INFO: renamed from: ʼʻ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1482 extends AbstractC1438 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC2364 f4928;

    /* JADX INFO: renamed from: ᴵˊ */
    public final AbstractC1438 f4929;

    public C1482(InterfaceC2364 r1, AbstractC1438 r2) {
        this.f4928 = r1;
        this.f4929 = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        InterfaceC2364 r0 = this.f4928;
        Object r22 = r0.apply(r2);
        Object r32 = r0.apply(r3);
        return this.f4929.compare(r22, r32);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1482) == false) goto L12;
        C1482 r52 = (C1482) r5;
        if (this.f4928.equals(r52.f4928) == false) goto L12;
        if (this.f4929.equals(r52.f4929) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4928, this.f4929});
    }

    public final String toString() {
        return this.f4929 + ".onResultOf(" + this.f4928 + ")";
    }
}
