package p034;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: ʼˊ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1528 extends FilterInputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public long f5060;

    public C1528(InputStream r3) {
        super(r3);
        this.f5060 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int r0 = ((FilterInputStream) this).in.read();
        if (r0 == (-1)) goto L7;
        long r1 = this.f5060;
        if (r1 < 0) goto L7;
        this.f5060 = r1 + 1;
    L7:
        return r0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        int r32 = ((FilterInputStream) this).in.read(r3, r4, r5);
        if (r32 <= 0) goto L7;
        long r42 = this.f5060;
        if (r42 < 0) goto L7;
        this.f5060 = r42 + ((long) r32);
    L7:
        return r32;
    }
}
