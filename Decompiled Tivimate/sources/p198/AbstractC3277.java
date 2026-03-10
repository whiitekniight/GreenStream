package p198;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ˋᵔ.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3277 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6918(View r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static CharSequence m6919(View r0) {
        return r0.getStateDescription();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static WindowInsets m6920(View r0, WindowInsets r1) {
        return r0.dispatchApplyWindowInsets(r1);
    }
}
