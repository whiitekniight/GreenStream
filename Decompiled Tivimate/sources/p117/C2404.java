package p117;

import java.io.InputStream;

/* JADX INFO: renamed from: ˆי.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2404 extends InputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C2411 f8594;

    /* JADX INFO: renamed from: ʾˋ */
    public int f8595;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f8596;

    public C2404(C2411 r2, C2414 r3) {
        this.f8594 = r2;
        this.f8595 = r2.m5590(r3.f8623 + 4);
        this.f8596 = r3.f8622;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f8596 != 0) goto L6;
        return -1;
    L6:
        C2411 r0 = this.f8594;
        r0.f8613.seek(this.f8595);
        int r1 = r0.f8613.read();
        this.f8595 = r0.m5590(this.f8595 + 1);
        this.f8596--;
        return r1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        if (r3 == null) goto L18;
        if ((r4 | r5) < 0) goto L16;
        if (r5 > (r3.length - r4)) goto L16;
        int r0 = this.f8596;
        if (r0 <= 0) goto L13;
        if (r5 <= r0) goto L11;
        r5 = r0;
    L11:
        int r02 = this.f8595;
        C2411 r1 = this.f8594;
        r1.m5586(r02, r4, r5, r3);
        this.f8595 = r1.m5590(this.f8595 + r5);
        this.f8596 -= r5;
        return r5;
    L13:
        return -1;
    L16:
        throw new ArrayIndexOutOfBoundsException();
    L18:
        throw new NullPointerException("buffer");
    }
}
