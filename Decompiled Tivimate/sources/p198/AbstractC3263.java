package p198;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ˋᵔ.ʾˋ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3263 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6897(View r0) {
        r0.requestApplyInsets();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static WindowInsets m6898(View r0, WindowInsets r1) {
        return r0.onApplyWindowInsets(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static WindowInsets m6899(View r1, WindowInsets r2) {
        int r0 = AbstractC3268.f11485;
        return r1.dispatchApplyWindowInsets(r2);
    }
}
