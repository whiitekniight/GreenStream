package p469;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import p044.InterfaceC1654;
import p317.AbstractC4195;

/* JADX INFO: renamed from: ﾞˏ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5865 implements Handler.Callback {

    /* JADX INFO: renamed from: ʾˋ */
    public final Handler f21445;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ AbstractC5872 f21446;

    public C5865(AbstractC5872 r1, InterfaceC1654 r2) {
        this.f21446 = r1;
        Handler r12 = AbstractC4195.m8470(this);
        this.f21445 = r12;
        r2.mo4298(this, r12);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r7) {
        if (r7.what == 0) goto L6;
        return false;
    L6:
        int r0 = r7.arg1;
        int r72 = r7.arg2;
        String r1 = AbstractC4195.f15423;
        m11496(((((long) r0) & 4294967295L) << 32) | (4294967295L & ((long) r72)));
        return true;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m11496(long r4) {
        AbstractC5872 r0 = this.f21446;
        if (this == r0.f21484) goto L5;
        return;
    L5:
        if (r0.f5438 != null) goto L8;
        return;
    L8:
        if (r4 != Long.MAX_VALUE) goto L16;
        r0.f5434 = true;
        return;
    L16:
        r0.m11512(r4);     // Catch: ExoPlaybackException -> L13
        return;
    L13:
        e = move-exception;
        r0.f5466 = e;
    }
}
