package p099;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p378.C4945;

/* JADX INFO: renamed from: ʿٴ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2226 extends InputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public static final ArrayDeque f8041 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public C4945 f8042;

    /* JADX INFO: renamed from: ᴵˊ */
    public IOException f8043;

    static {
        char[] r0 = AbstractC2229.f8047;
        f8041 = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8042.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8042.close();
    }

    @Override // java.io.InputStream
    public final void mark(int r2) {
        this.f8042.mark(r2);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f8042.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f8042.read();
    L4:
        e = move-exception;
        this.f8043 = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2) {
        return this.f8042.read(r2);
    L4:
        e = move-exception;
        this.f8043 = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        return this.f8042.read(r2, r3, r4);
    L4:
        e = move-exception;
        this.f8043 = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        this.f8042.reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r2) {
        return this.f8042.skip(r2);
    L4:
        e = move-exception;
        this.f8043 = e;
        throw e;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m5405() {
        this.f8043 = null;
        this.f8042 = null;
        ArrayDeque r0 = f8041;
        monitor-enter(r0);
        r0.offer(this);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
