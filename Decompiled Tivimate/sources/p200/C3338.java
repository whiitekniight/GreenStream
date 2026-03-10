package p200;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: ˋⁱ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C3338 extends AbstractC3325 {

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final RectF f11670 = null;

    /* JADX INFO: renamed from: ʽ */
    public final float f11671;

    /* JADX INFO: renamed from: ˈ */
    public final float f11672;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f11673;

    /* JADX INFO: renamed from: ᵎﹶ */
    public float f11674;

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f11675;

    /* JADX INFO: renamed from: ﾞᴵ */
    public float f11676;

    static {
        f11670 = new RectF();
    }

    public C3338(float r1, float r2, float r3, float r4) {
        this.f11675 = r1;
        this.f11671 = r2;
        this.f11672 = r3;
        this.f11673 = r4;
    }

    @Override // p200.AbstractC3325
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7024(Matrix r6, Path r7) {
        Matrix r0 = this.f11589;
        r6.invert(r0);
        r7.transform(r0);
        float r02 = this.f11672;
        float r1 = this.f11673;
        RectF r2 = f11670;
        r2.set(this.f11675, this.f11671, r02, r1);
        r7.arcTo(r2, this.f11676, this.f11674, false);
        r7.transform(r6);
    }
}
