package p179;

/* JADX INFO: renamed from: ˊᵔ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C3086 {

    /* JADX INFO: renamed from: ʼˎ */
    public double f10788;

    /* JADX INFO: renamed from: ʽ */
    public boolean f10789;

    /* JADX INFO: renamed from: ˆʾ */
    public final C3094 f10790;

    /* JADX INFO: renamed from: ˈ */
    public double f10791;

    /* JADX INFO: renamed from: ˑﹳ */
    public double f10792;

    /* JADX INFO: renamed from: ᵎﹶ */
    public double f10793;

    /* JADX INFO: renamed from: ᵔᵢ */
    public double f10794;

    /* JADX INFO: renamed from: ⁱˊ */
    public double f10795;

    /* JADX INFO: renamed from: ﹳٴ */
    public double f10796;

    /* JADX INFO: renamed from: ﾞᴵ */
    public double f10797;

    public C3086() {
        this.f10796 = Math.sqrt(1500.0d);
        this.f10795 = 0.5d;
        this.f10789 = false;
        this.f10788 = Double.MAX_VALUE;
        this.f10790 = new C3094();
    }

    public C3086(float r3) {
        this.f10796 = Math.sqrt(1500.0d);
        this.f10795 = 0.5d;
        this.f10789 = false;
        this.f10790 = new C3094();
        this.f10788 = r3;
    }

    /* JADX INFO: renamed from: ʽ */
    public final C3094 m6561(double r17, double r19, long r21) {
        if (this.f10789 == false) goto L6;
    L16:
        double r4 = r21 / 1000.0d;
        double r6 = r17 - this.f10788;
        double r8 = this.f10795;
        if (r8 <= 1.0d) goto L19;
        double r1 = this.f10793;
        double r82 = ((r1 * r6) - r19) / (r1 - this.f10797);
        double r62 = r6 - r82;
        double r12 = (Math.pow(2.718281828459045d, this.f10797 * r4) * r82) + (Math.pow(2.718281828459045d, r1 * r4) * r62);
        double r13 = this.f10793;
        double r14 = Math.pow(2.718281828459045d, r13 * r4) * (r62 * r13);
        double r63 = this.f10797;
        double r3 = (Math.pow(2.718281828459045d, r63 * r4) * (r82 * r63)) + r14;
    L22:
        float r15 = (float) (r12 + this.f10788);
        C3094 r2 = this.f10790;
        r2.f10835 = r15;
        r2.f10834 = (float) r3;
        return r2;
    L19:
        if (r8 != 1.0d) goto L21;
        double r16 = this.f10796;
        double r83 = (r16 * r6) + r19;
        double r122 = (r83 * r4) + r6;
        double r18 = Math.pow(2.718281828459045d, (-r16) * r4) * r122;
        double r64 = Math.pow(2.718281828459045d, (-this.f10796) * r4) * r122;
        double r123 = -this.f10796;
        r3 = (Math.pow(2.718281828459045d, r123 * r4) * r83) + (r64 * r123);
        r12 = r18;
        goto L22
    L21:
        double r22 = 1.0d / this.f10794;
        double r124 = this.f10796;
        double r142 = (((r8 * r124) * r6) + r19) * r22;
        r12 = ((Math.sin(this.f10794 * r4) * r142) + (Math.cos(this.f10794 * r4) * r6)) * Math.pow(2.718281828459045d, ((-r8) * r124) * r4);
        double r110 = this.f10796;
        double r10 = this.f10795;
        double r84 = ((-r110) * r12) * r10;
        double r111 = Math.pow(2.718281828459045d, ((-r10) * r110) * r4);
        double r102 = this.f10794;
        double r65 = Math.sin(r102 * r4) * ((-r102) * r6);
        double r112 = this.f10794;
        r3 = (((Math.cos(r112 * r4) * (r142 * r112)) + r65) * r111) + r84;
        goto L22
    L6:
        if (this.f10788 == Double.MAX_VALUE) goto L25;
        double r42 = this.f10795;
        if (r42 <= 1.0d) goto L11;
        double r85 = this.f10796;
        this.f10797 = (Math.sqrt((r42 * r42) - 1.0d) * r85) + ((-r42) * r85);
        double r43 = this.f10795;
        double r86 = this.f10796;
        this.f10793 = ((-r43) * r86) - (Math.sqrt((r43 * r43) - 1.0d) * r86);
    L15:
        this.f10789 = true;
        goto L16
    L11:
        if (r42 < 0.0d) goto L15;
        if (r42 >= 1.0d) goto L15;
        this.f10794 = Math.sqrt(1.0d - (r42 * r42)) * this.f10796;
        goto L15
    L25:
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6562(float r3) {
        if (r3 <= 0.0f) goto L7;
        this.f10796 = Math.sqrt(r3);
        this.f10789 = false;
        return;
    L7:
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6563(float r3) {
        if (r3 < 0.0f) goto L7;
        this.f10795 = r3;
        this.f10789 = false;
        return;
    L7:
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }
}
