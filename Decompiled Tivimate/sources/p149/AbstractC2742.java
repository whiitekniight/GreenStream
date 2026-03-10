package p149;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ˉˆ.ˆﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2742 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static void m5997(View r2, Rect r3, Rect r4) {
        Insets r22 = r2.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(r3)).build(), r4).getSystemWindowInsets();
        r3.set(r22.left, r22.top, r22.right, r22.bottom);
    }
}
