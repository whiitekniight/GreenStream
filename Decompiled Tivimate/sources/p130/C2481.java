package p130;

import java.io.OutputStream;

/* JADX INFO: renamed from: ˈʾ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2481 extends OutputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public long f8809;

    @Override // java.io.OutputStream
    public final void write(int r5) {
        this.f8809++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r5) {
        this.f8809 += (long) r5.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3, int r4, int r5) {
        if (r4 < 0) goto L12;
        if (r4 > r3.length) goto L12;
        if (r5 < 0) goto L12;
        int r42 = r4 + r5;
        if (r42 > r3.length) goto L12;
        if (r42 < 0) goto L12;
        this.f8809 += (long) r5;
        return;
    L12:
        throw new IndexOutOfBoundsException();
    }
}
