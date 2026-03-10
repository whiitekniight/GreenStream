package p211;

import com.bumptech.glide.load.data.InterfaceC0222;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p043.InterfaceC1631;

/* JADX INFO: renamed from: ˎˈ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3387 implements InterfaceC0222, InterfaceC1631 {

    /* JADX INFO: renamed from: ʾˋ */
    public final ByteBuffer f11884;

    public C3387() {
        this.f11884 = ByteBuffer.allocate(4);
    }

    public C3387(ByteBuffer r1) {
        this.f11884 = r1;
    }

    @Override // p043.InterfaceC1631
    /* JADX INFO: renamed from: ˈ */
    public void mo4291(byte[] r3, Object r4, MessageDigest r5) {
        Integer r42 = (Integer) r4;
        if (r42 != null) goto L5;
        return;
    L5:
        r5.update(r3);
        ByteBuffer r32 = this.f11884;
        monitor-enter(r32);
        this.f11884.position(0);     // Catch: Throwable -> L10
        r5.update(this.f11884.putInt(r42.intValue()).array());     // Catch: Throwable -> L10
        monitor-exit(r32);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0222
    /* JADX INFO: renamed from: ⁱˊ */
    public void mo1162() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0222
    /* JADX INFO: renamed from: ﹳٴ */
    public Object mo1163() {
        ByteBuffer r1 = this.f11884;
        r1.position(0);
        return r1;
    }
}
