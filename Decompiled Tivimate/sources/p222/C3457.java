package p222;

import java.io.FilterOutputStream;

/* JADX INFO: renamed from: ˎﹶ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3457 extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int r2) {
        ((FilterOutputStream) this).out.write(r2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] r2, int r3, int r4) {
        ((FilterOutputStream) this).out.write(r2, r3, r4);
    }
}
