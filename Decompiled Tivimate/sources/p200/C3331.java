package p200;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: ˋⁱ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3331 extends AbstractC3325 {

    /* JADX INFO: renamed from: ʽ */
    public float f11639;

    /* JADX INFO: renamed from: ⁱˊ */
    public float f11640;

    @Override // p200.AbstractC3325
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7024(Matrix r3, Path r4) {
        Matrix r0 = this.f11589;
        r3.invert(r0);
        r4.transform(r0);
        r4.lineTo(this.f11640, this.f11639);
        r4.transform(r3);
    }
}
