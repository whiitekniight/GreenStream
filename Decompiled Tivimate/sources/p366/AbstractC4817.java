package p366;

/* JADX INFO: renamed from: ᵔʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4817 {

    /* JADX INFO: renamed from: ʽ */
    public long f17067;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f17068;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f17069;

    public AbstractC4817() {
        this.f17069 = new byte[4];
        this.f17068 = 0;
    }

    public AbstractC4817(AbstractC4817 r2) {
        this.f17069 = new byte[4];
        m9498(r2);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public void mo9477() {
        this.f17067 = 0;
        this.f17068 = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.f17069;
        if (r1 >= r2.length) goto L6;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ʽ */
    public abstract int mo9478(int r1, byte[] r2);

    /* JADX INFO: renamed from: ˆʾ */
    public abstract void mo9479(AbstractC4817 r1);

    /* JADX INFO: renamed from: ˈ */
    public final void m9496() {
        long r0 = this.f17067 << 3;
        byte r2 = -128;
    L3:
        m9497(r2);
        if (this.f17068 == 0) goto L6;
        r2 = 0;
        goto L3
    L6:
        mo9482(r0);
        mo9485();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract int mo9481();

    /* JADX INFO: renamed from: ٴﹶ */
    public final void m9497(byte r5) {
        int r0 = this.f17068;
        int r1 = r0 + 1;
        this.f17068 = r1;
        byte[] r2 = this.f17069;
        r2[r0] = r5;
        if (r1 != r2.length) goto L5;
        mo9483(0, r2);
        this.f17068 = 0;
    L5:
        this.f17067++;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract void mo9482(long r1);

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract void mo9483(int r1, byte[] r2);

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m9498(AbstractC4817 r5) {
        byte[] r0 = r5.f17069;
        System.arraycopy(r0, 0, this.f17069, 0, r0.length);
        this.f17068 = r5.f17068;
        this.f17067 = r5.f17067;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract AbstractC4817 mo9484();

    /* JADX INFO: renamed from: ﾞʻ */
    public final void m9499(byte[] r7, int r8, int r9) {
        int r0 = 0;
        int r92 = Math.max(0, r9);
        int r1 = this.f17068;
        byte[] r2 = this.f17069;
        if (r1 == 0) goto L11;
        int r12 = 0;
    L5:
        if (r12 >= r92) goto L10;
        int r3 = this.f17068;
        int r4 = r3 + 1;
        this.f17068 = r4;
        int r5 = r12 + 1;
        r2[r3] = r7[r12 + r8];
        if (r4 == 4) goto L8;
        r12 = r5;
        goto L5
    L8:
        mo9483(0, r2);
        this.f17068 = 0;
        r0 = r5;
        goto L11
    L10:
        r0 = r12;
    L11:
        int r13 = ((r92 - r0) & (-4)) + r0;
    L12:
        if (r0 >= r13) goto L14;
        mo9483(r8 + r0, r7);
        r0 = r0 + 4;
    L14:
        if (r0 >= r92) goto L16;
        int r14 = this.f17068;
        this.f17068 = r14 + 1;
        r2[r14] = r7[r0 + r8];
        r0 = r0 + 1;
        goto L14
    L16:
        this.f17067 += (long) r92;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract void mo9485();
}
