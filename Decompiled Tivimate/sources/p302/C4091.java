package p302;

import java.util.HashMap;
import p330.EnumC4399;
import p431.InterfaceC5417;

/* JADX INFO: renamed from: ٴᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4091 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final HashMap f15053;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC5417 f15054;

    public C4091(InterfaceC5417 r1, HashMap r2) {
        this.f15054 = r1;
        this.f15053 = r2;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof C4091) == false) goto L12;
        C4091 r32 = (C4091) r3;
        if (this.f15054.equals(r32.f15054) == true) goto L9;
        return false;
    L9:
        if (this.f15053.equals(r32.f15053) == false) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f15054.hashCode() ^ 1000003) * 1000003) ^ this.f15053.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f15054 + ", values=" + this.f15053 + "}";
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final long m8280(EnumC4399 r9, long r10, int r12) {
        long r102 = r10 - this.f15054.mo9760();
        C4090 r92 = (C4090) this.f15053.get(r9);
        long r0 = r92.f15052;
        int r122 = r12 - 1;
        if (r0 <= 1) goto L5;
        long r2 = r0;
    L7:
        return Math.min(Math.max((long) ((Math.pow(3.0d, r122) * r0) * Math.max(1.0d, Math.log(10000.0d) / Math.log(r2 * ((long) r122)))), r102), r92.f15051);
    L5:
        r2 = 2;
        goto L7
    }
}
