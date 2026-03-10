package p317;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: ᐧˎ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4211 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: ٴᵢ */
    public static final int[] f15453 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public EGLDisplay f15454;

    /* JADX INFO: renamed from: ʾˋ */
    public final Handler f15455;

    /* JADX INFO: renamed from: ˈٴ */
    public EGLContext f15456;

    /* JADX INFO: renamed from: ˊʻ */
    public SurfaceTexture f15457;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int[] f15458;

    /* JADX INFO: renamed from: ᴵᵔ */
    public EGLSurface f15459;

    static {
        f15453 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC4211(Handler r1) {
        this.f15455 = r1;
        this.f15458 = new int[1];
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture r1) {
        this.f15455.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture r0 = this.f15457;
        if (r0 == null) goto L9;
        r0.updateTexImage();     // Catch: RuntimeException -> L6
        return;
    L10:
        return;
    }
}
