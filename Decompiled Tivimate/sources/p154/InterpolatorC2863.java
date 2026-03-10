package p154;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ˉـ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC2863 implements Interpolator {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f10118;

    public /* synthetic */ InterpolatorC2863(int r1) {
        this.f10118 = r1;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
        switch(this.f10118) {
            case 0: goto L4;
            default: goto L4;
        };
    L4:
        float r32 = r3 - 1.0f;
        return ((((r32 * r32) * r32) * r32) * r32) + 1.0f;
    }
}
