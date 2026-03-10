package p034;

import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p011xz.XZIOException;
import p117.C2417;

/* JADX INFO: renamed from: ʼˊ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1517 extends InputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public IOException f5005;

    /* JADX INFO: renamed from: ʾˋ */
    public InputStream f5006;

    /* JADX INFO: renamed from: ˈٴ */
    public final byte[] f5007;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C2417 f5008;

    public C1517(InputStream r2, int r3) {
        this.f5005 = null;
        this.f5007 = new byte[1];
        r2.getClass();
        this.f5006 = r2;
        this.f5008 = new C2417(r3);
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream r0 = this.f5006;
        if (r0 == null) goto L10;
        IOException r1 = this.f5005;
        if (r1 == null) goto L7;
        throw r1;
    L7:
        return r0.available();
    L10:
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream r0 = this.f5006;
        if (r0 != null) goto L12;
        return;
    L12:
        r0.close();     // Catch: Throwable -> L8
        this.f5006 = null;
        return;
    L8:
        th = move-exception;
        this.f5006 = null;
        throw th;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.f5007;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
        if (r11 != 0) goto L5;
        return 0;
    L5:
        InputStream r1 = this.f5006;
        if (r1 == null) goto L28;
        IOException r2 = this.f5005;
        if (r2 == null) goto L29;
        throw r2;
    L29:
        int r112 = r1.read(r9, r10, r11);     // Catch: IOException -> L23
        if (r112 != (-1)) goto L13;
        return -1;
    L13:
        C2417 r12 = this.f5008;
        byte[] r22 = r12.f8635;
        int r13 = r12.f8636;
        int r3 = Math.min(r112, r13);
        int r4 = 0;
    L14:
        if (r4 >= r3) goto L16;
        int r5 = r10 + r4;
        r9[r5] = (byte) (r9[r5] + r22[r4]);
        r4 = r4 + 1;
    L16:
        if (r4 >= r112) goto L18;
        int r32 = r10 + r4;
        r9[r32] = (byte) (r9[r32] + r9[r32 - r13]);
        r4 = r4 + 1;
        goto L16
    L18:
        if (r112 < r13) goto L21;
        System.arraycopy(r9, (r10 + r112) - r13, r22, 0, r13);
        return r112;
    L21:
        int r14 = r13 - r4;
        System.arraycopy(r22, r4, r22, 0, r14);
        System.arraycopy(r9, r10, r22, r14, r112);
        return r112;
    L23:
        e = move-exception;
        this.f5005 = e;
        throw e;
    L28:
        throw new XZIOException("Stream closed");
    }
}
