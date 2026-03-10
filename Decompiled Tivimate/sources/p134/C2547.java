package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ˉـ */
/* JADX INFO: loaded from: classes.dex */
public final class C2547 extends AbstractC2534 {

    /* JADX INFO: renamed from: ʽ */
    public final String f9033;

    /* JADX INFO: renamed from: ˈ */
    public final long f9034;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f9035;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9036;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f9037;

    public C2547(long r1, String r3, String r4, long r5, int r7) {
        this.f9037 = r1;
        this.f9036 = r3;
        this.f9033 = r4;
        this.f9034 = r5;
        this.f9035 = r7;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof AbstractC2534) == false) goto L22;
        C2547 r82 = (C2547) ((AbstractC2534) r8);
        String r1 = r82.f9033;
        long r3 = r82.f9037;
        if (this.f9037 != r3) goto L22;
        if (this.f9036.equals(r82.f9036) == false) goto L22;
        String r32 = this.f9033;
        if (r32 != null) goto L16;
        if (r1 != null) goto L22;
    L18:
        if (this.f9034 != r82.f9034) goto L22;
        if (this.f9035 != r82.f9035) goto L22;
        return true;
    L16:
        if (r32.equals(r1) == true) goto L18;
    L22:
        return false;
    }

    public final int hashCode() {
        long r0 = this.f9037;
        int r02 = (((((int) (r0 ^ (r0 >>> 32))) ^ 1000003) * 1000003) ^ this.f9036.hashCode()) * 1000003;
        String r3 = this.f9033;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r03 = (r02 ^ r32) * 1000003;
        long r33 = this.f9034;
        return ((r03 ^ ((int) (r33 ^ (r33 >>> 32)))) * 1000003) ^ this.f9035;
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Frame{pc=");
        r0.append(this.f9037);
        r0.append(", symbol=");
        r0.append(this.f9036);
        r0.append(", file=");
        r0.append(this.f9033);
        r0.append(", offset=");
        r0.append(this.f9034);
        r0.append(", importance=");
        return AbstractC1703.m4493(r0, this.f9035, "}");
    }
}
