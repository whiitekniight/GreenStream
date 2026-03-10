package p102;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p176.C3052;
import p176.C3082;
import p176.InterfaceC3073;

/* JADX INFO: renamed from: ʿᵢ.ʻˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C2256 extends OutputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f8104;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f8105;

    public C2256(FileOutputStream r2) {
        this.f8104 = 0;
        this.f8105 = r2;
    }

    public /* synthetic */ C2256(InterfaceC3073 r1, int r2) {
        this.f8104 = r2;
        this.f8105 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    private final void m5443() {
    }

    /* JADX INFO: renamed from: ˉˆ */
    private final void m5444() {
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    private final void m5445() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch(this.f8104) {
            case 0: goto L6;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((C3052) this.f8105).close();
        return;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch(this.f8104) {
            case 0: goto L8;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        C3052 r0 = (C3052) this.f8105;
        if (r0.f10701 == true) goto L11;
        r0.flush();
        return;
    L11:
        return;
    L8:
        ((FileOutputStream) this.f8105).flush();
        return;
    }

    public String toString() {
        switch(this.f8104) {
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return ((C3052) this.f8105) + ".outputStream()";
    L9:
        return ((C3082) this.f8105) + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int r3) {
        switch(this.f8104) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        C3052 r0 = (C3052) this.f8105;
        if (r0.f10701 == true) goto L9;
        r0.f10703.m6536((byte) r3);
        r0.m6444();
        return;
    L9:
        throw new IOException("closed");
    L10:
        ((C3082) this.f8105).m6536(r3);
        return;
    L12:
        ((FileOutputStream) this.f8105).write(r3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2) {
        switch(this.f8104) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.write(r2);
        return;
    L6:
        ((FileOutputStream) this.f8105).write(r2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3, int r4, int r5) {
        switch(this.f8104) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        C3052 r0 = (C3052) this.f8105;
        if (r0.f10701 == true) goto L9;
        r0.f10703.write(r3, r4, r5);
        r0.m6444();
        return;
    L9:
        throw new IOException("closed");
    L10:
        ((C3082) this.f8105).write(r3, r4, r5);
        return;
    L12:
        ((FileOutputStream) this.f8105).write(r3, r4, r5);
    }
}
