package p175;

import java.io.OutputStream;

/* JADX INFO: renamed from: ˊٴ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C3043 extends OutputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f10669;

    /* JADX INFO: renamed from: ʾˋ */
    public long f10670;

    /* JADX INFO: renamed from: ᴵˊ */
    public OutputStream f10671;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(int r4) {
        write(new byte[]{(byte) r4}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3, int r4, int r5) {
        if (this.f10669 == true) goto L7;
        this.f10671.write(r3, r4, r5);
        this.f10670 += (long) r5;
        return;
    L7:
        throw new IllegalStateException("ZipEntryOutputStream is closed");
    }
}
