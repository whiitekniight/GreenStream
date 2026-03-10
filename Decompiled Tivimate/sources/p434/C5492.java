package p434;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: ﹳﹳ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5492 extends MediaDataSource {

    /* JADX INFO: renamed from: ʾˋ */
    public long f19691;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C5493 f19692;

    public C5492(C5493 r1) {
        this.f19692 = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r8, byte[] r10, int r11, int r12) {
        if (r12 != 0) goto L6;
        return 0;
    L6:
        if (r8 >= 0) goto L27;
        return -1;
    L27:
        long r4 = this.f19691;     // Catch: IOException -> L26
        C5493 r6 = this.f19692;
        if (r4 == r8) goto L18;
        if (r4 >= 0) goto L14;
    L16:
        r6.m10603(r8);     // Catch: IOException -> L26
        this.f19691 = r8;     // Catch: IOException -> L26
        goto L18
    L14:
        if (r8 < (r4 + ((long) r6.f19688.available()))) goto L16;
        return -1;
    L18:
        if (r12 <= r6.f19688.available()) goto L20;
        r12 = r6.f19688.available();     // Catch: IOException -> L26
    L20:
        int r82 = r6.read(r10, r11, r12);     // Catch: IOException -> L26
        if (r82 < 0) goto L24;
        this.f19691 += (long) r82;
        return r82;
    L24:
        this.f19691 = -1;
        return -1;
    }
}
