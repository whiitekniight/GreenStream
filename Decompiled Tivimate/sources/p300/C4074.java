package p300;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: ٴـ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4074 extends InputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public byte[] f14971;

    /* JADX INFO: renamed from: ʾˋ */
    public PushbackInputStream f14972;

    /* JADX INFO: renamed from: ˈٴ */
    public long f14973;

    /* JADX INFO: renamed from: ᴵˊ */
    public long f14974;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14972.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r0 = this.f14971;
        if (read(r0, 0, r0.length) != (-1)) goto L6;
        return -1;
    L6:
        return r0[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) {
        long r0 = this.f14973;
        if (r0 == (-1)) goto L11;
        long r2 = this.f14974;
        if (r2 < r0) goto L8;
        return -1;
    L8:
        long r02 = r0 - r2;
        if (r9 <= r02) goto L11;
        r9 = (int) r02;
    L11:
        int r72 = this.f14972.read(r7, r8, r9);
        if (r72 <= 0) goto L14;
        this.f14974 += (long) r72;
    L14:
        return r72;
    }
}
