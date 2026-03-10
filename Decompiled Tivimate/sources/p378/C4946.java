package p378;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p043.InterfaceC1631;

/* JADX INFO: renamed from: ᵔﹶ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C4946 implements InterfaceC4953, InterfaceC1631 {

    /* JADX INFO: renamed from: ʾˋ */
    public final ByteBuffer f17645;

    public C4946() {
        this.f17645 = ByteBuffer.allocate(8);
    }

    public C4946(ByteBuffer r2) {
        this.f17645 = r2;
        r2.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // p378.InterfaceC4953
    public long skip(long r4) {
        ByteBuffer r0 = this.f17645;
        int r42 = (int) Math.min(r0.remaining(), r4);
        r0.position(r0.position() + r42);
        return r42;
    }

    @Override // p043.InterfaceC1631
    /* JADX INFO: renamed from: ˈ */
    public void mo4291(byte[] r4, Object r5, MessageDigest r6) {
        Long r52 = (Long) r5;
        r6.update(r4);
        ByteBuffer r42 = this.f17645;
        monitor-enter(r42);
        this.f17645.position(0);     // Catch: Throwable -> L7
        r6.update(this.f17645.putLong(r52.longValue()).array());     // Catch: Throwable -> L7
        monitor-exit(r42);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p378.InterfaceC4953
    /* JADX INFO: renamed from: ˉʿ */
    public int mo9730(int r3, byte[] r4) {
        ByteBuffer r0 = this.f17645;
        int r32 = Math.min(r3, r0.remaining());
        if (r32 != 0) goto L6;
        return -1;
    L6:
        r0.get(r4, 0, r32);
        return r32;
    }

    @Override // p378.InterfaceC4953
    /* JADX INFO: renamed from: ٴﹶ */
    public int mo9731() {
        return (mo9732() << 8) | mo9732();
    }

    @Override // p378.InterfaceC4953
    /* JADX INFO: renamed from: ᵔᵢ */
    public short mo9732() {
        ByteBuffer r0 = this.f17645;
        if (r0.remaining() < 1) goto L7;
        return (short) (r0.get() & 255);
    L7:
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }
}
