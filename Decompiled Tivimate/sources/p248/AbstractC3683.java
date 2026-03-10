package p248;

import android.support.v4.media.session.AbstractC0002;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p346.C4690;

/* JADX INFO: renamed from: ˑˏ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3683 {

    /* JADX INFO: renamed from: ʽ */
    public static final C4690 f13185 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C4690 f13186 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C4690 f13187 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final LinearInterpolator f13188 = null;

    static {
        f13188 = new LinearInterpolator();
        f13187 = new C4690(C4690.f16594);
        f13185 = new C4690();
        f13186 = new C4690(C4690.f16595);
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m7749(float r0, int r1, int r2) {
        return Math.round(r0 * (r2 - r1)) + r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static float m7750(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return m7751(r1, r2, (r5 - r3) / (r4 - r3));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static float m7751(float r0, float r1, float r2) {
        return AbstractC0002.m23(r1, r0, r2, r0);
    }
}
