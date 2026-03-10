package p300;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: ٴـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4073 extends InputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC4080 f14969;

    /* JADX INFO: renamed from: ᴵˊ */
    public final byte[] f14970;

    public AbstractC4073(AbstractC4080 r2) {
        this.f14970 = new byte[1];
        this.f14969 = r2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14969.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] r0 = this.f14970;
        if (read(r0) != (-1)) goto L6;
        return -1;
    L6:
        return r0[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        return this.f14969.read(r2, r3, r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public void mo8261(InputStream r2, int r3) {
        this.f14969.mo8267(r2, r3);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public int mo8262(PushbackInputStream r1) {
        return 0;
    }
}
