package p170;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ˊˋ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3011 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6358(Window r2, boolean r3) {
        View r0 = r2.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        if (r3 == false) goto L5;
        int r12 = r1 & (-257);
    L6:
        r0.setSystemUiVisibility(r12);
        r2.setDecorFitsSystemWindows(r3);
        return;
    L5:
        r12 = r1 | 256;
        goto L6
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6359(Window r0, boolean r1) {
        r0.setDecorFitsSystemWindows(r1);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m6360(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static CharSequence m6361(AccessibilityNodeInfo r0) {
        return r0.getStateDescription();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Icon m6362(Uri r0) {
        return Icon.createWithAdaptiveBitmapContentUri(r0);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m6363(Surface r1, float r2) {
        if (r2 != 0.0f) goto L5;
        int r0 = 0;
    L11:
        r1.setFrameRate(r2, r0);     // Catch: IllegalStateException -> L8
        return;
    L8:
        e = move-exception;
        AbstractC4214.m8574("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        return;
    L5:
        r0 = 1;
        goto L11
    }
}
