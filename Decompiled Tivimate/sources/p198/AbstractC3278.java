package p198;

import android.view.View;

/* JADX INFO: renamed from: ˋᵔ.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3278 {
    /* JADX INFO: renamed from: ʽ */
    public static boolean m6921(View r0) {
        return r0.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6922(View r0, boolean r1) {
        r0.setAccessibilityHeading(r1);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m6923(View r0, CharSequence r1) {
        r0.setAccessibilityPaneTitle(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m6924(View r0) {
        return r0.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static CharSequence m6925(View r0) {
        return r0.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m6926(View r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }
}
