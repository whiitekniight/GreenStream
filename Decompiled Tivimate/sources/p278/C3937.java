package p278;

import java.io.InputStream;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ـˊ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3937 extends InputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public final byte[] f14506;

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC3945 f14507;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f14508;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C3939 f14509;

    /* JADX INFO: renamed from: ᴵᵔ */
    public boolean f14510;

    public C3937(InterfaceC3945 r2, C3939 r3) {
        this.f14508 = false;
        this.f14510 = false;
        this.f14507 = r2;
        this.f14509 = r3;
        this.f14506 = new byte[1];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14510 == true) goto L6;
        this.f14507.close();
        this.f14510 = true;
        return;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r0 = this.f14506;
        if (read(r0, 0, r0.length) != (-1)) goto L6;
        return -1;
    L6:
        return r0[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) {
        AbstractC4214.m8568(!this.f14510);
        boolean r0 = this.f14508;
        InterfaceC3945 r2 = this.f14507;
        if (r0 == true) goto L5;
        r2.mo5395(this.f14509);
        this.f14508 = true;
    L5:
        int r42 = r2.read(r4, r5, r6);
        if (r42 != (-1)) goto L8;
        return -1;
    L8:
        return r42;
    }
}
