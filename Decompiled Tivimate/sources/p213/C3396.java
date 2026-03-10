package p213;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ˎˊ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3396 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final HashMap f11943 = null;

    /* JADX INFO: renamed from: ʽ */
    public final Lock f11944;

    /* JADX INFO: renamed from: ˈ */
    public FileChannel f11945;

    /* JADX INFO: renamed from: ⁱˊ */
    public final File f11946;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f11947;

    static {
        f11943 = new HashMap();
    }

    public C3396(String r2, File r3, boolean r4) {
        this.f11947 = r4;
        if (r3 == null) goto L5;
        File r42 = new File(r3, r2.concat(".lck"));
    L6:
        this.f11946 = r42;
        HashMap r32 = f11943;
        monitor-enter(r32);
        Object r43 = r32.get(r2);     // Catch: Throwable -> L11
        if (r43 != null) goto L13;
        r43 = new ReentrantLock();     // Catch: Throwable -> L11
        r32.put(r2, r43);     // Catch: Throwable -> L11
    L13:
        Lock r44 = (Lock) r43;     // Catch: Throwable -> L11
        monitor-exit(r32);
        this.f11944 = r44;
        return;
    L11:
        th = move-exception;
        throw th;
    L5:
        r42 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7151() {
        FileChannel r0 = this.f11945;     // Catch: IOException -> L7
        if (r0 == null) goto L5;
        r0.close();     // Catch: IOException -> L7
    L5:
        this.f11944.unlock();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7152(boolean r3) {
        this.f11944.lock();
        if (r3 == false) goto L18;
        File r32 = this.f11946;
        if (r32 == null) goto L14;
        File r0 = r32.getParentFile();     // Catch: IOException -> L9
        if (r0 == null) goto L11;
        r0.mkdirs();     // Catch: IOException -> L9
    L11:
        FileChannel r33 = new FileOutputStream(r32).getChannel();     // Catch: IOException -> L9
        r33.lock();     // Catch: IOException -> L9
        this.f11945 = r33;     // Catch: IOException -> L9
        return;
    L14:
        throw new IOException("No lock directory was provided.");     // Catch: IOException -> L9
    L15:
        this.f11945 = null;
        return;
    }
}
