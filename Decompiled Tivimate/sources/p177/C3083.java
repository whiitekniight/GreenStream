package p177;

/* JADX INFO: renamed from: ˊᴵ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3083 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static C3083 f10778;

    /* JADX INFO: renamed from: ʽ */
    public long f10779;

    /* JADX INFO: renamed from: ˈ */
    public int f10780;

    /* JADX INFO: renamed from: ⁱˊ */
    public long f10781;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f10782;

    public /* synthetic */ C3083() {
        this.f10782 = 1;
    }

    public C3083(int r2) {
        this.f10782 = 0;
        this.f10780 = r2;
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m6555(C3083 r3, long r4, long r6, int r8) {
        if ((r8 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r8 & 2) == 0) goto L8;
        r6 = 0;
    L8:
        monitor-enter(r3);
        if (r4 < 0) goto L25;
        if (r6 < 0) goto L23;
        long r0 = r3.f10781 + r4;     // Catch: Throwable -> L20
        r3.f10781 = r0;     // Catch: Throwable -> L20
        long r42 = r3.f10779 + r6;     // Catch: Throwable -> L20
        r3.f10779 = r42;     // Catch: Throwable -> L20
        if (r42 > r0) goto L19;
        monitor-exit(r3);
        return;
    L19:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L23:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L25:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.f10782) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "WindowCounter(streamId=" + this.f10780 + ", total=" + this.f10781 + ", acknowledged=" + this.f10779 + ", unacknowledged=" + m6556() + ')';
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public synchronized long m6556() {
        monitor-enter(this);
        long r0 = this.f10781 - this.f10779;
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m6557(double r15, double r17, long r19) {
        double r4 = (0.01720197f * ((r19 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double r8 = (((Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + ((Math.sin(2.0f * r3) * 3.4906598739326E-4d) + ((Math.sin(r4) * 0.03341960161924362d) + r4))) + 1.796593063d) + 3.141592653589793d;
        double r2 = (Math.sin(2.0d * r8) * (-0.0069d)) + ((Math.sin(r4) * 0.0053d) + (((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-r17) / 360.0d)));
        double r42 = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(r8));
        double r6 = 0.01745329238474369d * r15;
        double r82 = (Math.sin(-0.10471975803375244d) - (Math.sin(r42) * Math.sin(r6))) / (Math.cos(r42) * Math.cos(r6));
        if (r82 < 1.0d) goto L7;
        this.f10780 = 1;
        this.f10781 = -1;
        this.f10779 = -1;
        return;
    L7:
        if (r82 > (-1.0d)) goto L10;
        this.f10780 = 0;
        this.f10781 = -1;
        this.f10779 = -1;
        return;
    L10:
        double r62 = (float) (Math.acos(r82) / 6.283185307179586d);
        this.f10781 = Math.round((r2 + r62) * 8.64E7d) + 946728000000L;
        long r22 = Math.round((r2 - r62) * 8.64E7d) + 946728000000L;
        this.f10779 = r22;
        if (r22 < r19) goto L13;
    L16:
        this.f10780 = 1;
        return;
    L13:
        if (this.f10781 <= r19) goto L16;
        this.f10780 = 0;
    }
}
