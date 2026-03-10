package p099;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ʿٴ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2231 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final AtomicReference f8050 = null;

    static {
        f8050 = new AtomicReference();
    }

    /* JADX INFO: renamed from: ʽ */
    public static ByteBuffer m5418(ByteBuffer r1) {
        return (ByteBuffer) r1.position(0);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m5419(ByteBuffer r3, File r4) {
        m5418(r3);
        FileChannel r0 = null;
        RandomAccessFile r1 = new RandomAccessFile(r4, "rw");     // Catch: Throwable -> L10
        r0 = r1.getChannel();     // Catch: Throwable -> L8
        r0.write(r3);     // Catch: Throwable -> L8
        r0.force(false);     // Catch: Throwable -> L8
        r0.close();     // Catch: Throwable -> L8
        r1.close();     // Catch: Throwable -> L8
        r0.close();     // Catch: IOException -> L17
    L27:
        r1.close();     // Catch: IOException -> L18
        return;
    L33:
        return;
    L8:
        th = th;
    L12:
        if (r0 != null) goto L31;
    L14:
        if (r1 == null) goto L34;
        r1.close();     // Catch: IOException -> L20
        throw th;
    L35:
        throw th;
    L34:
        throw th;
    L31:
        r0.close();     // Catch: IOException -> L19
    L10:
        th = th;
        r1 = null;
        goto L12
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static ByteBuffer m5420(InputStream r5) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream(16384);
        AtomicReference r3 = f8050;
        byte[] r2 = (byte[]) r3.getAndSet(null);
        if (r2 != null) goto L5;
        r2 = new byte[16384];
    L5:
        int r1 = r5.read(r2);
        if (r1 < 0) goto L8;
        r0.write(r2, 0, r1);
        goto L5
    L8:
        r3.set(r2);
        byte[] r52 = r0.toByteArray();
        return m5418(ByteBuffer.allocateDirect(r52.length).put(r52));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static MappedByteBuffer m5421(File r9) {
        FileChannel r1 = null;
        long r6 = r9.length();     // Catch: Throwable -> L17
        if (r6 > 2147483647L) goto L22;
        if (r6 == 0) goto L20;
        RandomAccessFile r8 = new RandomAccessFile(r9, "r");     // Catch: Throwable -> L17
        FileChannel r2 = r8.getChannel();     // Catch: Throwable -> L15
        MappedByteBuffer r92 = r2.map(FileChannel.MapMode.READ_ONLY, 0, r6).load();     // Catch: Throwable -> L13
        r2.close();     // Catch: IOException -> L28
    L39:
        r8.close();     // Catch: IOException -> L29
    L12:
        return r92;
    L13:
        th = move-exception;
        Throwable r93 = th;
        r1 = r2;
    L23:
        if (r1 != null) goto L41;
    L25:
        if (r8 == null) goto L45;
        r8.close();     // Catch: IOException -> L31
        throw r93;
    L46:
        throw r93;
    L45:
        throw r93;
    L41:
        r1.close();     // Catch: IOException -> L30
    L15:
        th = move-exception;
        r93 = th;
        goto L23
    L20:
        throw new IOException("File unsuitable for memory mapping");     // Catch: Throwable -> L17
    L22:
        throw new IOException("File too large to map into memory");     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r93 = th;
        r8 = null;
        goto L23
    }
}
