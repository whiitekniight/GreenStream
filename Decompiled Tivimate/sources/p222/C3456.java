package p222;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: ˎﹶ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3456 extends FilterInputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public long f12317;

    /* JADX INFO: renamed from: ᴵˊ */
    public long f12318;

    public C3456(ByteArrayInputStream r3) {
        super(r3);
        this.f12318 = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r3) {
        monitor-enter(this);
        ((FilterInputStream) this).in.mark(r3);     // Catch: Throwable -> L6
        this.f12318 = this.f12317;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int r0 = ((FilterInputStream) this).in.read();
        if (r0 == (-1)) goto L5;
        this.f12317++;
    L5:
        return r0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        int r32 = ((FilterInputStream) this).in.read(r3, r4, r5);
        if (r32 == (-1)) goto L5;
        this.f12317 += (long) r32;
    L5:
        return r32;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (((FilterInputStream) this).in.markSupported() == false) goto L15;
        if (this.f12318 == (-1)) goto L13;
        ((FilterInputStream) this).in.reset();     // Catch: Throwable -> L10
        this.f12317 = this.f12318;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L13:
        throw new IOException("Mark not set");     // Catch: Throwable -> L10
    L15:
        throw new IOException("Mark not supported");     // Catch: Throwable -> L10
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r32 = ((FilterInputStream) this).in.skip(r3);
        this.f12317 += r32;
        return r32;
    }
}
