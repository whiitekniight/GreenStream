package p200;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p095.C2203;

/* JADX INFO: renamed from: ˋⁱ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C3340 extends AbstractC3341 {

    /* JADX INFO: renamed from: ʽ */
    public final C3331 f11677;

    /* JADX INFO: renamed from: ˈ */
    public final float f11678;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f11679;

    public C3340(C3331 r1, float r2, float r3) {
        this.f11677 = r1;
        this.f11678 = r2;
        this.f11679 = r3;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final float m7069() {
        C3331 r0 = this.f11677;
        return (float) Math.toDegrees(Math.atan((r0.f11639 - this.f11679) / (r0.f11640 - this.f11678)));
    }

    @Override // p200.AbstractC3341
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7070(Matrix r18, C2203 r19, int r20, Canvas r21) {
        C3331 r4 = this.f11677;
        float r5 = r4.f11639;
        float r6 = this.f11679;
        float r42 = r4.f11640;
        float r7 = this.f11678;
        RectF r8 = new RectF(0.0f, 0.0f, (float) Math.hypot(r5 - r6, r42 - r7), 0.0f);
        Matrix r43 = this.f11681;
        r43.set(r18);
        r43.preTranslate(r7, r6);
        r43.preRotate(m7069());
        r19.getClass();
        r8.bottom += r20;
        r8.offset(0.0f, -r20);
        int r52 = r19.f7976;
        int[] r14 = C2203.f7965;
        r14[0] = r52;
        r14[1] = r19.f7971;
        r14[2] = r19.f7970;
        Paint r1 = r19.f7969;
        float r10 = r8.left;
        r1.setShader(new LinearGradient(r10, r8.top, r10, r8.bottom, r14, C2203.f7966, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r43);
        r21.drawRect(r8, r1);
        r21.restore();
    }
}
