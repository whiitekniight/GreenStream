package p175;

import java.io.OutputStream;

/* JADX INFO: renamed from: ˊٴ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3042 extends OutputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC3049 f10668;

    public AbstractC3042(AbstractC3049 r1) {
        this.f10668 = r1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10668.close();
    }

    @Override // java.io.OutputStream
    public void write(int r3) {
        write(new byte[]{(byte) r3});
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) {
        this.f10668.write(r2, r3, r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public void mo6434() {
        this.f10668.mo6441();
    }
}
