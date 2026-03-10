package p427;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ﹳـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5402 {
    /* JADX INFO: renamed from: ʽ */
    public static float m10434(EdgeEffect r0, float r1, float r2) {
        return r0.onPullDistance(r1, r2);
    L4:
        r0.onPull(r1, r2);
        return 0.0f;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static float m10435(EdgeEffect r0) {
        return r0.getDistance();
    L4:
        return 0.0f;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static EdgeEffect m10436(Context r1, AttributeSet r2) {
        return new EdgeEffect(r1, r2);
    L5:
        return new EdgeEffect(r1);
    }
}
