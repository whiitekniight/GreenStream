package p108;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: ˆʾ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C2374 implements TimeInterpolator {

    /* JADX INFO: renamed from: ʽ */
    public int f8480;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f8481;

    /* JADX INFO: renamed from: ﹳٴ */
    public int[] f8482;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r5) {
        int r52 = (int) ((r5 * this.f8480) + 0.5f);
        int r0 = this.f8481;
        int[] r1 = this.f8482;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        int r3 = r1[r2];
        if (r52 < r3) goto L7;
        r52 = r52 - r3;
        r2 = r2 + 1;
    L7:
        if (r2 >= r0) goto L9;
        float r53 = r52 / this.f8480;
    L11:
        return (r2 / r0) + r53;
    L9:
        r53 = 0.0f;
        goto L11
    }
}
