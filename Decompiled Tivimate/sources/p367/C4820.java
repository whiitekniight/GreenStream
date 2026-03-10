package p367;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᵔˆ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4820 implements Closeable {

    /* JADX INFO: renamed from: ʽʽ */
    public byte[] f17085;

    /* JADX INFO: renamed from: ʾˋ */
    public final FileInputStream f17086;

    /* JADX INFO: renamed from: ˈٴ */
    public int f17087;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Charset f17088;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f17089;

    public C4820(FileInputStream r2, Charset r3) {
        if (r3 == null) goto L11;
        if (r3.equals(AbstractC4823.f17097) == false) goto L9;
        this.f17086 = r2;
        this.f17088 = r3;
        this.f17085 = new byte[8192];
        return;
    L9:
        throw new IllegalArgumentException("Unsupported encoding");
    L11:
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileInputStream r0 = this.f17086;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f17085 == null) goto L9;
        this.f17085 = null;     // Catch: Throwable -> L7
        this.f17086.close();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    /* JADX INFO: renamed from: ʽ */
    public final String m9514() {
        FileInputStream r0 = this.f17086;
        monitor-enter(r0);
        byte[] r1 = this.f17085;     // Catch: Throwable -> L23
        if (r1 == null) goto L48;
        if (this.f17087 < this.f17089) goto L13;
        int r12 = this.f17086.read(r1, 0, r1.length);     // Catch: Throwable -> L23
        if (r12 == (-1)) goto L12;
        this.f17087 = 0;     // Catch: Throwable -> L23
        this.f17089 = r12;     // Catch: Throwable -> L23
        goto L13
    L12:
        throw new EOFException();     // Catch: Throwable -> L23
    L13:
        int r13 = this.f17087;     // Catch: Throwable -> L23
    L15:
        if (r13 == this.f17089) goto L30;
        byte[] r2 = this.f17085;     // Catch: Throwable -> L23
        if (r2[r13] == 10) goto L18;
        r13 = r13 + 1;     // Catch: Throwable -> L23
        goto L15
    L18:
        int r3 = this.f17087;     // Catch: Throwable -> L23
        if (r13 == r3) goto L25;
        int r4 = r13 - 1;
        if (r2[r4] != 13) goto L25;
    L26:
        String r5 = new String(r2, r3, r4 - r3, this.f17088.name());     // Catch: Throwable -> L23
        this.f17087 = r13 + 1;     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r5;
    L25:
        r4 = r13;
        goto L26
    L30:
        C4819 r14 = new C4819(this, (this.f17089 - this.f17087) + 80);     // Catch: Throwable -> L23
    L31:
        byte[] r22 = this.f17085;     // Catch: Throwable -> L23
        int r6 = this.f17087;     // Catch: Throwable -> L23
        r14.write(r22, r6, this.f17089 - r6);     // Catch: Throwable -> L23
        this.f17089 = -1;     // Catch: Throwable -> L23
        FileInputStream r23 = this.f17086;     // Catch: Throwable -> L23
        byte[] r62 = this.f17085;     // Catch: Throwable -> L23
        int r24 = r23.read(r62, 0, r62.length);     // Catch: Throwable -> L23
        if (r24 == (-1)) goto L46;
        this.f17087 = 0;     // Catch: Throwable -> L23
        this.f17089 = r24;     // Catch: Throwable -> L23
        int r25 = 0;
    L35:
        if (r25 == this.f17089) goto L31;
        byte[] r63 = this.f17085;     // Catch: Throwable -> L23
        if (r63[r25] == 10) goto L38;
        r25 = r25 + 1;     // Catch: Throwable -> L23
        goto L35
    L38:
        int r32 = this.f17087;     // Catch: Throwable -> L23
        if (r25 == r32) goto L41;
        r14.write(r63, r32, r25 - r32);     // Catch: Throwable -> L23
    L41:
        this.f17087 = r25 + 1;     // Catch: Throwable -> L23
        String r15 = r14.toString();     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r15;
    L46:
        throw new EOFException();     // Catch: Throwable -> L23
    L48:
        throw new IOException("LineReader is closed");     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }
}
