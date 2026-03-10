package p302;

import java.util.Set;

/* JADX INFO: renamed from: ٴᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4090 {

    /* JADX INFO: renamed from: ʽ */
    public final Set f15050;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f15051;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f15052;

    public C4090(long r1, long r3, Set r5) {
        this.f15052 = r1;
        this.f15051 = r3;
        this.f15050 = r5;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof C4090) == false) goto L14;
        C4090 r82 = (C4090) r8;
        if (this.f15052 != r82.f15052) goto L14;
        if (this.f15051 != r82.f15051) goto L14;
        if (this.f15050.equals(r82.f15050) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        long r0 = this.f15052;
        int r02 = (((int) (r0 ^ (r0 >>> 32))) ^ 1000003) * 1000003;
        long r3 = this.f15051;
        return ((r02 ^ ((int) (r3 ^ (r3 >>> 32)))) * 1000003) ^ this.f15050.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f15052 + ", maxAllowedDelay=" + this.f15051 + ", flags=" + this.f15050 + "}";
    }
}
