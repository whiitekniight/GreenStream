package p378;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᵔﹶ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4949 extends MediaDataSource {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ ByteBuffer f17661;

    public C4949(ByteBuffer r1) {
        this.f17661 = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f17661.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r4, byte[] r6, int r7, int r8) {
        ByteBuffer r0 = this.f17661;
        if (r4 < r0.limit()) goto L6;
        return -1;
    L6:
        r0.position((int) r4);
        int r42 = Math.min(r8, r0.remaining());
        r0.get(r6, r7, r42);
        return r42;
    }
}
