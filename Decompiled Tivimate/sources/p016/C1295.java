package p016;

/* JADX INFO: renamed from: ʻˆ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1295 {

    /* JADX INFO: renamed from: ⁱˊ */
    public long f4398;

    /* JADX INFO: renamed from: ﹳٴ */
    public long f4399;

    public C1295() {
        this.f4399 = -9223372036854775807L;
        this.f4398 = -9223372036854775807L;
    }

    public C1295(int r1, long r2, long r4) {
        this.f4399 = r2;
        this.f4398 = r4;
    }

    public C1295(long r1, long r3) {
        this.f4399 = r1;
        this.f4398 = r3;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m3663(long r5) {
        long r0 = this.f4398 + r5;
        this.f4398 = r0;
        long r52 = this.f4399;
        if (r52 <= 0) goto L6;
        long r02 = (r0 * 100) / r52;
        return;
    }
}
