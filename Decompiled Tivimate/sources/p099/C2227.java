package p099;

import java.io.FilterInputStream;

/* JADX INFO: renamed from: ʿٴ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2227 extends FilterInputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public int f8044;

    public C2227(C2226 r1) {
        super(r1);
        this.f8044 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int r0 = this.f8044;
        if (r0 != Integer.MIN_VALUE) goto L7;
        return super.available();
    L7:
        return Math.min(r0, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r1) {
        monitor-enter(this);
        super.mark(r1);     // Catch: Throwable -> L6
        this.f8044 = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m5406(1) != (-1)) goto L6;
        return -1;
    L6:
        int r2 = super.read();
        m5407(1);
        return r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        int r52 = (int) m5406(r5);
        if (r52 != (-1)) goto L5;
        return -1;
    L5:
        int r32 = super.read(r3, r4, r52);
        m5407(r32);
        return r32;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        super.reset();     // Catch: Throwable -> L6
        this.f8044 = Integer.MIN_VALUE;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r32 = m5406(r3);
        if (r32 != (-1)) goto L6;
        return 0;
    L6:
        long r33 = super.skip(r32);
        m5407(r33);
        return r33;
    }

    /* JADX INFO: renamed from: ʽ */
    public final long m5406(long r4) {
        int r0 = this.f8044;
        if (r0 != 0) goto L7;
        return -1;
    L7:
        if (r0 != Integer.MIN_VALUE) goto L9;
        return r4;
    L9:
        if (r4 > r0) goto L11;
        return r4;
    L11:
        return r0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m5407(long r4) {
        int r0 = this.f8044;
        if (r0 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (r4 == (-1)) goto L9;
        this.f8044 = (int) (((long) r0) - r4);
        return;
    }
}
