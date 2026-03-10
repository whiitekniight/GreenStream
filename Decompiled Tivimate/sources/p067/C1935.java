package p067;

import p317.AbstractC4195;

/* JADX INFO: renamed from: ʽⁱ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1935 {

    /* JADX INFO: renamed from: ʽ */
    public final long f6589;

    /* JADX INFO: renamed from: ˈ */
    public final float f6590;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f6591;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f6592;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f6593;

    static {
        new C1956().m4989();
        AbstractC4195.m8513(0);
        AbstractC4195.m8513(1);
        AbstractC4195.m8513(2);
        AbstractC4195.m8513(3);
        AbstractC4195.m8513(4);
    }

    public C1935(C1956 r8) {
        long r0 = r8.f6707;
        long r2 = r8.f6706;
        long r4 = r8.f6703;
        float r6 = r8.f6704;
        float r82 = r8.f6705;
        this.f6593 = r0;
        this.f6592 = r2;
        this.f6589 = r4;
        this.f6590 = r6;
        this.f6591 = r82;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C1935) == true) goto L8;
        return false;
    L8:
        C1935 r82 = (C1935) r8;
        if (this.f6593 == r82.f6593) goto L11;
    L19:
        return false;
    L11:
        if (this.f6592 != r82.f6592) goto L19;
        if (this.f6589 != r82.f6589) goto L19;
        if (this.f6590 != r82.f6590) goto L19;
        if (this.f6591 != r82.f6591) goto L19;
        return true;
    }

    public final int hashCode() {
        long r0 = this.f6593;
        long r3 = this.f6592;
        int r02 = ((((int) (r0 ^ (r0 >>> 32))) * 31) + ((int) (r3 ^ (r3 >>> 32)))) * 31;
        long r32 = this.f6589;
        int r03 = (r02 + ((int) ((r32 >>> 32) ^ r32))) * 31;
        float r1 = this.f6590;
        int r4 = 0;
        if (r1 == 0.0f) goto L5;
        int r12 = Float.floatToIntBits(r1);
    L6:
        int r04 = (r03 + r12) * 31;
        float r13 = this.f6591;
        if (r13 == 0.0f) goto L10;
        r4 = Float.floatToIntBits(r13);
    L10:
        return r04 + r4;
    L5:
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C1956 m4953() {
        C1956 r0 = new C1956();
        r0.f6707 = this.f6593;
        r0.f6706 = this.f6592;
        r0.f6703 = this.f6589;
        r0.f6704 = this.f6590;
        r0.f6705 = this.f6591;
        return r0;
    }
}
