package p346;

import android.support.v4.media.session.AbstractC0002;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ᵎʻ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC4689 implements Interpolator {

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f16591;

    /* JADX INFO: renamed from: ﹳٴ */
    public final float[] f16592;

    public AbstractInterpolatorC4689(float[] r2) {
        this.f16592 = r2;
        this.f16591 = 1.0f / (r2.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r5) {
        if (r5 < 1.0f) goto L6;
        return 1.0f;
    L6:
        if (r5 > 0.0f) goto L8;
        return 0.0f;
    L8:
        float[] r0 = this.f16592;
        int r1 = Math.min((int) ((r0.length - 1) * r5), r0.length - 2);
        float r3 = this.f16591;
        float r52 = (r5 - (r1 * r3)) / r3;
        float r2 = r0[r1];
        return AbstractC0002.m23(r0[r1 + 1], r2, r52, r2);
    }
}
