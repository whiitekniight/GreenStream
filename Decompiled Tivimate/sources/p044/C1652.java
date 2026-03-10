package p044;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import p469.C5865;

/* JADX INFO: renamed from: ʼᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1652 implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ C5865 f5477;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5478;

    public /* synthetic */ C1652(InterfaceC1654 r1, C5865 r2, int r3) {
        this.f5478 = r3;
        this.f5477 = r2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec r3, long r4, long r6) {
        switch(this.f5478) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C5865 r32 = this.f5477;
        Handler r62 = r32.f21445;
        if (Build.VERSION.SDK_INT >= 30) goto L7;
        r62.sendMessageAtFrontOfQueue(Message.obtain(r62, 0, (int) (r4 >> 32), (int) r4));
        return;
    L7:
        r32.m11496(r4);
        return;
    L9:
        C5865 r33 = this.f5477;
        Handler r63 = r33.f21445;
        if (Build.VERSION.SDK_INT >= 30) goto L12;
        r63.sendMessageAtFrontOfQueue(Message.obtain(r63, 0, (int) (r4 >> 32), (int) r4));
        return;
    L12:
        r33.m11496(r4);
    }
}
