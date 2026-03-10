package p117;

import ar.tvplayer.core.domain.ʽﹳ;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ˆי.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2411 implements Closeable {

    /* JADX INFO: renamed from: ٴᵢ */
    public static final Logger f8611 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f8612;

    /* JADX INFO: renamed from: ʾˋ */
    public final RandomAccessFile f8613;

    /* JADX INFO: renamed from: ˈٴ */
    public C2414 f8614;

    /* JADX INFO: renamed from: ˊʻ */
    public final byte[] f8615;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f8616;

    /* JADX INFO: renamed from: ᴵᵔ */
    public C2414 f8617;

    static {
        f8611 = Logger.getLogger(C2411.class.getName());
    }

    public C2411(File r14) {
        byte[] r1 = new byte[16];
        this.f8615 = r1;
        if (r14.exists() == true) goto L17;
        File r2 = new File(r14.getPath() + ".tmp");
        RandomAccessFile r8 = new RandomAccessFile(r2, "rwd");
        r8.setLength(4096);     // Catch: Throwable -> L14
        r8.seek(0);     // Catch: Throwable -> L14
        byte[] r0 = new byte[16];     // Catch: Throwable -> L14
        int[] r9 = {4096, 0, 0, 0};     // Catch: Throwable -> L14
        int r10 = 0;
        int r11 = 0;
    L6:
        if (r10 >= 4) goto L8;
        m5582(r0, r11, r9[r10]);     // Catch: Throwable -> L14
        r11 = r11 + 4;     // Catch: Throwable -> L14
        r10 = r10 + 1;     // Catch: Throwable -> L14
        goto L6
    L8:
        r8.write(r0);     // Catch: Throwable -> L14
        r8.close();
        if (r2.renameTo(r14) == true) goto L17;
        throw new IOException("Rename failed!");
    L14:
        th = move-exception;
        r8.close();
        throw th;
    L17:
        RandomAccessFile r02 = new RandomAccessFile(r14, "rwd");
        this.f8613 = r02;
        r02.seek(0);
        r02.readFully(r1);
        int r142 = m5581(0, r1);
        this.f8616 = r142;
        if (r142 > r02.length()) goto L22;
        this.f8612 = m5581(4, r1);
        int r143 = m5581(8, r1);
        int r03 = m5581(12, r1);
        this.f8614 = m5584(r143);
        this.f8617 = m5584(r03);
        return;
    L22:
        throw new IOException("File is truncated. Expected length: " + this.f8616 + ", Actual length: " + r02.length());
    }

    /* JADX INFO: renamed from: ˈٴ */
    public static int m5581(int r2, byte[] r3) {
        return ((((r3[r2] & 255) << 24) + ((r3[r2 + 1] & 255) << 16)) + ((r3[r2 + 2] & 255) << 8)) + (r3[r2 + 3] & 255);
    }

    /* JADX INFO: renamed from: ﹶᐧ */
    public static void m5582(byte[] r2, int r3, int r4) {
        r2[r3] = (byte) (r4 >> 24);
        r2[r3 + 1] = (byte) (r4 >> 16);
        r2[r3 + 2] = (byte) (r4 >> 8);
        r2[r3 + 3] = (byte) r4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
        this.f8613.close();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(C2411.class.getSimpleName());
        r0.append("[fileLength=");
        r0.append(this.f8616);
        r0.append(", size=");
        r0.append(this.f8612);
        r0.append(", first=");
        r0.append(this.f8614);
        r0.append(", last=");
        r0.append(this.f8617);
        r0.append(", element lengths=[");
        m5594(new ʽﹳ(r0));     // Catch: IOException -> L5
    L7:
        r0.append("]]");
        return r0.toString();
    L5:
        e = move-exception;
        Level r2 = Level.WARNING;
        f8611.log(r2, "read error", e);
        goto L7
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m5583(byte[] r8) {
        int r0 = r8.length;
        monitor-enter(this);
        if (r0 < 0) goto L24;
    L19:
        th = move-exception;
        throw th;
    L6:
        if (r0 > r8.length) goto L24;
        m5587(r0);     // Catch: Throwable -> L19
        boolean r1 = m5589();     // Catch: Throwable -> L19
        if (r1 == false) goto L10;
        int r3 = 16;
    L11:
        C2414 r4 = new C2414(r3, r0);     // Catch: Throwable -> L19
        m5582(this.f8615, 0, r0);     // Catch: Throwable -> L19
        m5591(this.f8615, r3, 4);     // Catch: Throwable -> L19
        m5591(r8, r3 + 4, r0);     // Catch: Throwable -> L19
        if (r1 == false) goto L14;
        int r82 = r3;
    L15:
        m5588(this.f8616, this.f8612 + 1, r82, r3);     // Catch: Throwable -> L19
        this.f8617 = r4;     // Catch: Throwable -> L19
        this.f8612++;
        if (r1 == false) goto L21;
        this.f8614 = r4;     // Catch: Throwable -> L19
    L21:
        monitor-exit(this);
        return;
    L14:
        r82 = this.f8614.f8623;     // Catch: Throwable -> L19
        goto L15
    L10:
        C2414 r32 = this.f8617;     // Catch: Throwable -> L19
        r3 = m5590((r32.f8623 + 4) + r32.f8622);     // Catch: Throwable -> L19
    L24:
        throw new IndexOutOfBoundsException();     // Catch: Throwable -> L19
    }

    /* JADX INFO: renamed from: ʾˋ */
    public final C2414 m5584(int r4) {
        if (r4 == 0) goto L4;
        RandomAccessFile r2 = this.f8613;
        r2.seek(r4);
        return new C2414(r4, r2.readInt());
    L4:
        return C2414.f8621;
    }

    /* JADX INFO: renamed from: ʿᵢ */
    public final int m5585() {
        if (this.f8612 != 0) goto L5;
        return 16;
    L5:
        C2414 r0 = this.f8617;
        int r2 = r0.f8623;
        int r3 = this.f8614.f8623;
        if (r2 < r3) goto L10;
        return (((r2 - r3) + 4) + r0.f8622) + 16;
    L10:
        return (((r2 + 4) + r0.f8622) + this.f8616) - r3;
    }

    /* JADX INFO: renamed from: ˈʿ */
    public final void m5586(int r6, int r7, int r8, byte[] r9) {
        int r62 = m5590(r6);
        int r0 = r62 + r8;
        int r1 = this.f8616;
        RandomAccessFile r2 = this.f8613;
        if (r0 > r1) goto L6;
        r2.seek(r62);
        r2.readFully(r9, r7, r8);
        return;
    L6:
        int r12 = r1 - r62;
        r2.seek(r62);
        r2.readFully(r9, r7, r12);
        r2.seek(16);
        r2.readFully(r9, r7 + r12, r8 - r12);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final void m5587(int r10) {
        int r102 = r10 + 4;
        int r0 = this.f8616 - m5585();
        if (r0 < r102) goto L5;
        return;
    L5:
        int r1 = this.f8616;
    L6:
        r0 = r0 + r1;
        r1 = r1 << 1;
        if (r0 < r102) goto L6;
        RandomAccessFile r103 = this.f8613;
        r103.setLength(r1);
        r103.getChannel().force(true);
        C2414 r02 = this.f8617;
        int r03 = m5590((r02.f8623 + 4) + r02.f8622);
        if (r03 >= this.f8614.f8623) goto L15;
        FileChannel r3 = r103.getChannel();
        r3.position(this.f8616);
        long r6 = r03 - 4;
        if (r3.transferTo(16, r6, r3) == r6) goto L15;
        throw new AssertionError("Copied insufficient number of bytes!");
    L15:
        int r104 = this.f8617.f8623;
        int r04 = this.f8614.f8623;
        if (r104 >= r04) goto L18;
        int r2 = (this.f8616 + r104) - 16;
        m5588(r1, this.f8612, r04, r2);
        this.f8617 = new C2414(r2, this.f8617.f8622);
    L19:
        this.f8616 = r1;
        return;
    L18:
        m5588(r1, this.f8612, r04, r104);
        goto L19
    }

    /* JADX INFO: renamed from: ˊᵔ */
    public final void m5588(int r3, int r4, int r5, int r6) {
        int[] r32 = {r3, r4, r5, r6};
        int r42 = 0;
        int r52 = 0;
    L3:
        byte[] r62 = this.f8615;
        if (r42 >= 4) goto L6;
        m5582(r62, r52, r32[r42]);
        r52 = r52 + 4;
        r42 = r42 + 1;
        goto L3
    L6:
        RandomAccessFile r53 = this.f8613;
        r53.seek(0);
        r53.write(r62);
    }

    /* JADX INFO: renamed from: ـˆ */
    public final synchronized boolean m5589() {
        monitor-enter(this);
        if (this.f8612 != 0) goto L6;
        boolean r0 = true;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = false;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᴵʼ */
    public final int m5590(int r2) {
        int r0 = this.f8616;
        if (r2 >= r0) goto L6;
        return r2;
    L6:
        return (r2 + 16) - r0;
    }

    /* JADX INFO: renamed from: ᴵˑ */
    public final void m5591(byte[] r7, int r8, int r9) {
        int r82 = m5590(r8);
        int r0 = r82 + r9;
        int r1 = this.f8616;
        RandomAccessFile r3 = this.f8613;
        if (r0 > r1) goto L6;
        r3.seek(r82);
        r3.write(r7, 0, r9);
        return;
    L6:
        int r12 = r1 - r82;
        r3.seek(r82);
        r3.write(r7, 0, r12);
        r3.seek(16);
        r3.write(r7, r12, r9 - r12);
    }

    /* JADX INFO: renamed from: ᵎˊ */
    public final synchronized void m5592() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (m5589() == true) goto L14;
        if (this.f8612 != 1) goto L10;
        m5593();     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
        return;
    L10:
        C2414 r0 = this.f8614;     // Catch: Throwable -> L8
        int r02 = m5590((r0.f8623 + 4) + r0.f8622);     // Catch: Throwable -> L8
        m5586(r02, 0, 4, this.f8615);     // Catch: Throwable -> L8
        int r2 = m5581(0, this.f8615);     // Catch: Throwable -> L8
        m5588(this.f8616, this.f8612 - 1, r02, this.f8617.f8623);     // Catch: Throwable -> L8
        this.f8612--;
        this.f8614 = new C2414(r02, r2);     // Catch: Throwable -> L8
        goto L11
    L14:
        throw new NoSuchElementException();     // Catch: Throwable -> L8
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final synchronized void m5593() {
        monitor-enter(this);
        m5588(4096, 0, 0, 0);     // Catch: Throwable -> L10
        this.f8612 = 0;     // Catch: Throwable -> L10
        C2414 r0 = C2414.f8621;     // Catch: Throwable -> L10
        this.f8614 = r0;     // Catch: Throwable -> L10
        this.f8617 = r0;     // Catch: Throwable -> L10
        if (this.f8616 <= 4096) goto L7;
        RandomAccessFile r02 = this.f8613;     // Catch: Throwable -> L10
        r02.setLength(4096);     // Catch: Throwable -> L10
        r02.getChannel().force(true);     // Catch: Throwable -> L10
    L7:
        this.f8616 = 4096;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public final synchronized void m5594(InterfaceC2406 r5) {
        monitor-enter(this);
        int r0 = this.f8614.f8623;     // Catch: Throwable -> L8
        int r1 = 0;
    L4:
        if (r1 >= this.f8612) goto L10;
        C2414 r02 = m5584(r0);     // Catch: Throwable -> L8
        r5.mo5575(new C2404(this, r02), r02.f8622);     // Catch: Throwable -> L8
        r0 = m5590((r02.f8623 + 4) + r02.f8622);     // Catch: Throwable -> L8
        r1 = r1 + 1;
        goto L4
    L10:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
