package p034;

import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p011xz.XZIOException;
import p473.InterfaceC5898;

/* JADX INFO: renamed from: ʼˊ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 extends InputStream {

    /* JADX INFO: renamed from: ٴʼ */
    public static final /* synthetic */ int f5050 = 0;

    /* JADX INFO: renamed from: ʽʽ */
    public final byte[] f5051;

    /* JADX INFO: renamed from: ʾˋ */
    public InputStream f5052;

    /* JADX INFO: renamed from: ˈٴ */
    public int f5053;

    /* JADX INFO: renamed from: ˉٴ */
    public IOException f5054;

    /* JADX INFO: renamed from: ˊʻ */
    public int f5055;

    /* JADX INFO: renamed from: ٴᵢ */
    public boolean f5056;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC5898 f5057;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f5058;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final byte[] f5059;

    public C1527(InputStream r2, InterfaceC5898 r3) {
        this.f5051 = new byte[4096];
        this.f5053 = 0;
        this.f5058 = 0;
        this.f5055 = 0;
        this.f5056 = false;
        this.f5054 = null;
        this.f5059 = new byte[1];
        r2.getClass();
        this.f5052 = r2;
        this.f5057 = r3;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f5052 == null) goto L10;
        IOException r0 = this.f5054;
        if (r0 == null) goto L7;
        throw r0;
    L7:
        return this.f5058;
    L10:
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream r0 = this.f5052;
        if (r0 != null) goto L12;
        return;
    L12:
        r0.close();     // Catch: Throwable -> L8
        this.f5052 = null;
        return;
    L8:
        th = move-exception;
        this.f5052 = null;
        throw th;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.f5059;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
        byte[] r0 = this.f5051;
        if (r10 < 0) goto L41;
        if (r11 < 0) goto L41;
        int r1 = r10 + r11;
        if (r1 < 0) goto L41;
        if (r1 > r9.length) goto L41;
        if (r11 != 0) goto L13;
        return 0;
    L13:
        if (this.f5052 == null) goto L39;
        IOException r2 = this.f5054;
        if (r2 != null) goto L37;
        int r22 = 0;
    L42:
        int r3 = Math.min(this.f5058, r11);     // Catch: IOException -> L20
        System.arraycopy(r0, this.f5053, r9, r10, r3);     // Catch: IOException -> L20
        int r4 = this.f5053 + r3;     // Catch: IOException -> L20
        this.f5053 = r4;     // Catch: IOException -> L20
        int r5 = this.f5058 - r3;     // Catch: IOException -> L20
        this.f5058 = r5;     // Catch: IOException -> L20
        r10 = r10 + r3;     // Catch: IOException -> L20
        r11 = r11 - r3;     // Catch: IOException -> L20
        r22 = r22 + r3;     // Catch: IOException -> L20
        int r6 = this.f5055;     // Catch: IOException -> L20
        if (((r4 + r5) + r6) != 4096) goto L23;
        System.arraycopy(r0, r4, r0, 0, r5 + r6);     // Catch: IOException -> L20
        this.f5053 = 0;     // Catch: IOException -> L20
    L23:
        if (r11 == 0) goto L32;
        if (this.f5056 == true) goto L32;
        int r42 = (this.f5053 + this.f5058) + this.f5055;     // Catch: IOException -> L20
        int r43 = this.f5052.read(r0, r42, 4096 - r42);     // Catch: IOException -> L20
        if (r43 == (-1)) goto L29;
        int r32 = this.f5055 + r43;     // Catch: IOException -> L20
        this.f5055 = r32;     // Catch: IOException -> L20
        int r33 = this.f5057.mo11563(r0, this.f5053, r32);     // Catch: IOException -> L20
        this.f5058 = r33;     // Catch: IOException -> L20
        this.f5055 -= r33;
        goto L42
    L29:
        this.f5056 = true;     // Catch: IOException -> L20
        this.f5058 = this.f5055;     // Catch: IOException -> L20
        this.f5055 = 0;     // Catch: IOException -> L20
    L32:
        if (r22 <= 0) goto L34;
        return r22;
    L34:
        return -1;
    L20:
        e = move-exception;
        this.f5054 = e;
        throw e;
    L37:
        throw r2;
    L39:
        throw new XZIOException("Stream closed");
    L41:
        throw new IndexOutOfBoundsException();
    }
}
