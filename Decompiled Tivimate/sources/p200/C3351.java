package p200;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p095.C2203;

/* JADX INFO: renamed from: ˋⁱ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C3351 extends AbstractC3341 {

    /* JADX INFO: renamed from: ʽ */
    public final C3338 f11722;

    public C3351(C3338 r1) {
        this.f11722 = r1;
    }

    @Override // p200.AbstractC3341
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7070(Matrix r23, C2203 r24, int r25, Canvas r26) {
        C3338 r4 = this.f11722;
        float r5 = r4.f11676;
        float r6 = r4.f11674;
        RectF r7 = new RectF(r4.f11675, r4.f11671, r4.f11672, r4.f11673);
        Paint r8 = r24.f7974;
        if (r6 >= 0.0f) goto L5;
        boolean r9 = true;
    L6:
        Path r12 = r24.f7972;
        int[] r19 = C2203.f7967;
        if (r9 == false) goto L9;
        r19[0] = 0;
        r19[1] = r24.f7976;
        r19[2] = r24.f7971;
        r19[3] = r24.f7970;
        float r16 = 0.0f;
    L10:
        float r18 = r7.width() / 2.0f;
        if (r18 > r16) goto L13;
        return;
    L13:
        float r1 = 1.0f - (r25 / r18);
        float[] r20 = C2203.f7968;
        r20[1] = r1;
        r20[2] = ((1.0f - r1) / 2.0f) + r1;
        r8.setShader(new RadialGradient(r7.centerX(), r7.centerY(), r18, r19, r20, Shader.TileMode.CLAMP));
        r26.save();
        r26.concat(r23);
        r26.scale(1.0f, r7.height() / r7.width());
        if (r9 == true) goto L16;
        r26.clipPath(r12, Region.Op.DIFFERENCE);
        r26.drawPath(r12, r24.f7973);
    L16:
        r26.drawArc(r7, r5, r6, true, r8);
        r26.restore();
        return;
    L9:
        r12.rewind();
        r16 = 0.0f;
        r12.moveTo(r7.centerX(), r7.centerY());
        r12.arcTo(r7, r5, r6);
        r12.close();
        float r42 = -r25;
        r7.inset(r42, r42);
        r19[0] = 0;
        r19[1] = r24.f7970;
        r19[2] = r24.f7971;
        r19[3] = r24.f7976;
        goto L10
    L5:
        r9 = false;
        goto L6
    }
}
