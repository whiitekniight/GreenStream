package p371;

import p151.C2839;
import p151.C2850;

/* JADX INFO: renamed from: ᵔـ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4844 {

    /* JADX INFO: renamed from: ʽ */
    public final C2850 f17135;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2839 f17136;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f17137;

    public C4844(long r1, C2839 r3, C2850 r4) {
        this.f17137 = r1;
        this.f17136 = r3;
        this.f17135 = r4;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof C4844) == false) goto L14;
        C4844 r82 = (C4844) r8;
        if (this.f17137 != r82.f17137) goto L14;
        if (this.f17136.equals(r82.f17136) == false) goto L14;
        if (this.f17135.equals(r82.f17135) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        long r1 = this.f17137;
        return ((((((int) (r1 ^ (r1 >>> 32))) ^ 1000003) * 1000003) ^ this.f17136.hashCode()) * 1000003) ^ this.f17135.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f17137 + ", transportContext=" + this.f17136 + ", event=" + this.f17135 + "}";
    }
}
