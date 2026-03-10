package p300;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import p273.C3888;

/* JADX INFO: renamed from: ٴـ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4082 extends AbstractC4079 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f15008;

    /* JADX INFO: renamed from: ʾˋ */
    public RandomAccessFile f15009;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f15010;

    /* JADX INFO: renamed from: ˊʻ */
    public byte[] f15011;

    /* JADX INFO: renamed from: ᴵˊ */
    public File f15012;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f15013;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile r0 = this.f15009;
        if (r0 == null) goto L6;
        r0.close();
        return;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r0 = this.f15011;
        if (read(r0, 0, r0.length) != (-1)) goto L6;
        return -1;
    L6:
        return r0[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r32 = this.f15009.read(r2, r3, r4);
        if (r32 != r4) goto L7;
        if (r32 == (-1)) goto L7;
        return r32;
    L7:
        if (this.f15010 == false) goto L16;
        m8270(this.f15013 + 1);
        this.f15013++;
        if (r32 >= 0) goto L11;
        r32 = 0;
    L11:
        int r22 = this.f15009.read(r2, r32, r4 - r32);
        if (r22 > 0) goto L14;
        return r32;
    L14:
        return r32 + r22;
    L16:
        return r32;
    }

    @Override // p300.AbstractC4079
    /* JADX INFO: renamed from: ʽ */
    public final void mo8266(C3888 r4) {
        if (this.f15010 == false) goto L7;
        int r0 = this.f15013;
        int r1 = r4.f14288;
        if (r0 == r1) goto L7;
        m8270(r1);
        this.f15013 = r4.f14288;
    L7:
        this.f15009.seek(r4.f14289);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m8270(int r7) {
        File r0 = this.f15012;
        if (r7 == this.f15008) goto L11;
        String r02 = r0.getCanonicalPath();
        if (r7 < 9) goto L8;
        String r1 = ".z";
    L9:
        r0 = new File(r02.substring(0, r02.lastIndexOf(".")) + r1 + (r7 + 1));
        goto L11
    L8:
        r1 = ".z0";
    L11:
        if (r0.exists() == false) goto L15;
        this.f15009.close();
        this.f15009 = new RandomAccessFile(r0, "r");
        return;
    L15:
        throw new FileNotFoundException("zip split file does not exist: " + r0);
    }
}
