package p469;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.GlUtil$GlException;
import com.parse.ʽˑ;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ﾞˏ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5891 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: ˉٴ */
    public static final String[] f21591 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final FloatBuffer f21592 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final int[] f21593;

    /* JADX INFO: renamed from: ʾˋ */
    public final C5879 f21594;

    /* JADX INFO: renamed from: ˈٴ */
    public final int[] f21595;

    /* JADX INFO: renamed from: ˊʻ */
    public final AtomicReference f21596;

    /* JADX INFO: renamed from: ٴᵢ */
    public ʽˑ f21597;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int[] f21598;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int[] f21599;

    static {
        f21591 = new String[]{"y_tex", "u_tex", "v_tex"};
        f21592 = AbstractC4214.m8572(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    }

    public C5891(C5879 r5) {
        this.f21594 = r5;
        this.f21598 = new int[3];
        this.f21593 = new int[3];
        this.f21595 = new int[3];
        this.f21599 = new int[3];
        this.f21596 = new AtomicReference();
        int r0 = 0;
    L3:
        if (r0 >= 3) goto L5;
        int[] r1 = this.f21595;
        this.f21599[r0] = -1;
        r1[r0] = -1;
        r0 = r0 + 1;
        goto L3
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 r2) {
        if (this.f21596.getAndSet(null) != null) goto L6;
        return;
    L6:
        throw new ClassCastException();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 r1, int r2, int r3) {
        GLES20.glViewport(0, 0, r2, r3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 r8, EGLConfig r9) {
        int[] r82 = this.f21593;
        ʽˑ r92 = new ʽˑ("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");     // Catch: GlUtil$GlException -> L5
        this.f21597 = r92;     // Catch: GlUtil$GlException -> L5
        GLES20.glVertexAttribPointer(r92.ˊʻ("in_pos"), 2, 5126, false, 0, f21592);     // Catch: GlUtil$GlException -> L5
        r82[0] = this.f21597.ˊʻ("in_tc_y");     // Catch: GlUtil$GlException -> L5
        r82[1] = this.f21597.ˊʻ("in_tc_u");     // Catch: GlUtil$GlException -> L5
        r82[2] = this.f21597.ˊʻ("in_tc_v");     // Catch: GlUtil$GlException -> L5
        GLES20.glGetUniformLocation(this.f21597.ᴵˊ, "mColorConversion");     // Catch: GlUtil$GlException -> L5
        AbstractC4214.m8565();     // Catch: GlUtil$GlException -> L5
        m11552();     // Catch: GlUtil$GlException -> L5
        AbstractC4214.m8565();     // Catch: GlUtil$GlException -> L5
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m11552() {
        int[] r0 = this.f21598;
        int r1 = 0;
        GLES20.glGenTextures(3, r0, 0);     // Catch: GlUtil$GlException -> L6
    L4:
        if (r1 >= 3) goto L8;
        ʽˑ r3 = this.f21597;     // Catch: GlUtil$GlException -> L6
        String r4 = f21591[r1];     // Catch: GlUtil$GlException -> L6
        GLES20.glUniform1i(GLES20.glGetUniformLocation(r3.ᴵˊ, r4), r1);     // Catch: GlUtil$GlException -> L6
        GLES20.glActiveTexture(33984 + r1);     // Catch: GlUtil$GlException -> L6
        AbstractC4214.m8576(3553, r0[r1]);     // Catch: GlUtil$GlException -> L6
        r1 = r1 + 1;     // Catch: GlUtil$GlException -> L6
        goto L4
    L8:
        AbstractC4214.m8565();     // Catch: GlUtil$GlException -> L6
        return;
    }
}
