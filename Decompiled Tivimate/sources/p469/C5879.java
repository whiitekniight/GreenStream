package p469;

import android.content.Context;
import android.opengl.GLSurfaceView;
import p433.AbstractC5481;

/* JADX INFO: renamed from: ﾞˏ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C5879 extends GLSurfaceView implements InterfaceC5877 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ int f21533 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final C5891 f21534;

    public C5879(Context r2) {
        super(r2, null);
        C5891 r22 = new C5891(this);
        this.f21534 = r22;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(r22);
        setRenderMode(0);
    }

    @Deprecated
    public InterfaceC5877 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(AbstractC5481 r3) {
        C5891 r0 = this.f21534;
        if (r0.f21596.getAndSet(r3) != null) goto L7;
        r0.f21594.requestRender();
        return;
    L7:
        throw new ClassCastException();
    }
}
