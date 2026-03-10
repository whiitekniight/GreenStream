package p175;

import java.io.OutputStream;
import p180.InterfaceC3096;
import p273.C3894;

/* JADX INFO: renamed from: ˊٴ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3049 extends OutputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public final C3043 f10696;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC3096 f10697;

    public AbstractC3049(C3043 r1, C3894 r2, char[] r3, boolean r4) {
        this.f10696 = r1;
        this.f10697 = mo6442(r2, r3, r4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10696.getClass();
    }

    @Override // java.io.OutputStream
    public void write(int r2) {
        this.f10696.write(r2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2) {
        this.f10696.write(r2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) {
        this.f10697.mo6575(r2, r3, r4);
        this.f10696.write(r2, r3, r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public void mo6441() {
        this.f10696.f10669 = true;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract InterfaceC3096 mo6442(C3894 r1, char[] r2, boolean r3);
}
