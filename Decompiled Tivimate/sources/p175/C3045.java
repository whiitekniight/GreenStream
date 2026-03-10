package p175;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: ˊٴ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3045 extends AbstractC3042 {

    /* JADX INFO: renamed from: ʽʽ */
    public Deflater f10674;

    /* JADX INFO: renamed from: ᴵˊ */
    public byte[] f10675;

    @Override // p175.AbstractC3042, java.io.OutputStream
    public final void write(int r4) {
        write(new byte[]{(byte) r4}, 0, 1);
    }

    @Override // p175.AbstractC3042, java.io.OutputStream
    public final void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // p175.AbstractC3042, java.io.OutputStream
    public final void write(byte[] r2, int r3, int r4) {
        Deflater r0 = this.f10674;
        r0.setInput(r2, r3, r4);
    L4:
        if (r0.needsInput() == true) goto L8;
        byte[] r22 = this.f10675;
        int r32 = r0.deflate(r22, 0, r22.length);
        if (r32 <= 0) goto L4;
        super.write(r22, 0, r32);
        goto L4
    }

    @Override // p175.AbstractC3042
    /* JADX INFO: renamed from: ʽ */
    public final void mo6434() {
        Deflater r0 = this.f10674;
        if (r0.finished() == true) goto L10;
        r0.finish();
    L6:
        if (r0.finished() == true) goto L10;
        byte[] r1 = this.f10675;
        int r2 = r0.deflate(r1, 0, r1.length);
        if (r2 <= 0) goto L6;
        super.write(r1, 0, r2);
    L10:
        r0.end();
        super.mo6434();
    }
}
