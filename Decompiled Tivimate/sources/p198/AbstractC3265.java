package p198;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ˋᵔ.ʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3265 {

    /* JADX INFO: renamed from: ʽ */
    public final Interpolator f11479;

    /* JADX INFO: renamed from: ˈ */
    public final long f11480;

    /* JADX INFO: renamed from: ⁱˊ */
    public float f11481;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f11482;

    public AbstractC3265(int r1, Interpolator r2, long r3) {
        this.f11482 = r1;
        this.f11479 = r2;
        this.f11480 = r3;
    }

    /* JADX INFO: renamed from: ʽ */
    public float mo6900() {
        Interpolator r0 = this.f11479;
        if (r0 == null) goto L7;
        return r0.getInterpolation(this.f11481);
    L7:
        return this.f11481;
    }

    /* JADX INFO: renamed from: ˈ */
    public int mo6901() {
        return this.f11482;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public void mo6902(float r1) {
        this.f11481 = r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public long mo6903() {
        return this.f11480;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public float mo6904() {
        return 1.0f;
    }
}
