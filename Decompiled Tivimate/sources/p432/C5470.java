package p432;

/* JADX INFO: renamed from: ﹳᵢ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C5470 {

    /* JADX INFO: renamed from: ʽ */
    public final int f19569;

    /* JADX INFO: renamed from: ˈ */
    public final long f19570;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f19571;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f19572;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f19573;

    public C5470(long r8, Object r10) {
        this(r10, -1, -1, r8, -1);
    }

    public C5470(Object r3) {
        this(-1, r3);
    }

    public C5470(Object r1, int r2, int r3, long r4, int r6) {
        this.f19573 = r1;
        this.f19572 = r2;
        this.f19569 = r3;
        this.f19570 = r4;
        this.f19571 = r6;
    }

    public C5470(Object r8, long r9, int r11) {
        this(r8, -1, -1, r9, r11);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C5470) == true) goto L8;
        return false;
    L8:
        C5470 r82 = (C5470) r8;
        if (this.f19573.equals(r82.f19573) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.f19572 != r82.f19572) goto L19;
        if (this.f19569 != r82.f19569) goto L19;
        if (this.f19570 != r82.f19570) goto L19;
        if (this.f19571 != r82.f19571) goto L19;
        return true;
    }

    public final int hashCode() {
        return ((((((((this.f19573.hashCode() + 527) * 31) + this.f19572) * 31) + this.f19569) * 31) + ((int) this.f19570)) * 31) + this.f19571;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean m10553() {
        if (this.f19572 == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5470 m10554(Object r9) {
        if (this.f19573.equals(r9) == false) goto L5;
        return this;
    L5:
        long r5 = this.f19570;
        int r7 = this.f19571;
        return new C5470(r9, this.f19572, this.f19569, r5, r7);
    }
}
