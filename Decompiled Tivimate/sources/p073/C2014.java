package p073;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: ʾʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 extends OutputStream {

    /* JADX INFO: renamed from: ˊʻ */
    public static final byte[] f6954 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f6955;

    /* JADX INFO: renamed from: ʾˋ */
    public final ArrayList f6956;

    /* JADX INFO: renamed from: ˈٴ */
    public byte[] f6957;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f6958;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f6959;

    static {
        f6954 = new byte[0];
    }

    public C2014() {
        this.f6956 = new ArrayList();
        monitor-enter(this);
        m5045(1024);     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return new String(m5046(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int r4) {
        monitor-enter(this);
        int r0 = this.f6959;     // Catch: Throwable -> L6
        int r1 = r0 - this.f6955;     // Catch: Throwable -> L6
        if (r1 != this.f6957.length) goto L8;
        m5045(r0 + 1);     // Catch: Throwable -> L6
        r1 = 0;
    L8:
        this.f6957[r1] = (byte) r4;     // Catch: Throwable -> L6
        this.f6959++;
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r6, int r7, int r8) {
        if (r7 < 0) goto L25;
        if (r7 > r6.length) goto L25;
        if (r8 < 0) goto L25;
        int r72 = r7 + r8;
        if (r72 > r6.length) goto L25;
        if (r72 < 0) goto L25;
        if (r8 != 0) goto L11;
        return;
    L11:
        monitor-enter(this);
        int r0 = this.f6959;     // Catch: Throwable -> L17
        int r1 = r0 + r8;     // Catch: Throwable -> L17
        int r02 = r0 - this.f6955;     // Catch: Throwable -> L17
    L13:
        if (r8 <= 0) goto L19;
        int r2 = Math.min(r8, this.f6957.length - r02);     // Catch: Throwable -> L17
        System.arraycopy(r6, r72 - r8, this.f6957, r02, r2);     // Catch: Throwable -> L17
        r8 = r8 - r2;     // Catch: Throwable -> L17
        if (r8 <= 0) goto L13;
        m5045(r1);     // Catch: Throwable -> L17
        r02 = 0;
        goto L13
    L19:
        this.f6959 = r1;     // Catch: Throwable -> L17
        monitor-exit(this);     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        throw th;
    L25:
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m5045(int r4) {
        int r0 = this.f6958;
        ArrayList r1 = this.f6956;
        if (r0 >= (r1.size() - 1)) goto L6;
        this.f6955 += this.f6957.length;
        int r42 = this.f6958 + 1;
        this.f6958 = r42;
        this.f6957 = (byte[]) r1.get(r42);
        return;
    L6:
        byte[] r02 = this.f6957;
        if (r02 != null) goto L9;
        this.f6955 = 0;
    L10:
        this.f6958++;
        byte[] r43 = new byte[r4];
        this.f6957 = r43;
        r1.add(r43);
        return;
    L9:
        r4 = Math.max(r02.length << 1, r4 - this.f6955);
        this.f6955 += this.f6957.length;
        goto L10
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final synchronized byte[] m5046() {
        monitor-enter(this);
        int r0 = this.f6959;     // Catch: Throwable -> L8
        if (r0 != 0) goto L10;
        byte[] r02 = f6954;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r02;
    L10:
        byte[] r1 = new byte[r0];     // Catch: Throwable -> L8
        ArrayList r2 = this.f6956;     // Catch: Throwable -> L8
        int r3 = r2.size();     // Catch: Throwable -> L8
        int r5 = 0;
        int r6 = 0;
    L11:
        if (r6 >= r3) goto L15;
        Object r7 = r2.get(r6);     // Catch: Throwable -> L8
        r6 = r6 + 1;     // Catch: Throwable -> L8
        byte[] r72 = (byte[]) r7;     // Catch: Throwable -> L8
        int r8 = Math.min(r72.length, r0);     // Catch: Throwable -> L8
        System.arraycopy(r72, 0, r1, r5, r8);     // Catch: Throwable -> L8
        r5 = r5 + r8;
        r0 = r0 - r8;
        if (r0 != 0) goto L11;
    L15:
        monitor-exit(this);
        return r1;
    L8:
        th = move-exception;
        throw th;
    }
}
