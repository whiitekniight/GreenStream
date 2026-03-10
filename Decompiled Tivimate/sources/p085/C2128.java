package p085;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import androidx.leanback.widget.ˉˆ;

/* JADX INFO: renamed from: ʾⁱ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2128 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final int f7630 = 0;

    /* JADX INFO: renamed from: ʽ */
    public final ˉˆ f7631;

    /* JADX INFO: renamed from: ˈ */
    public final float f7632;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ActivityManager f7633;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f7634;

    static {
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        int r0 = 4;
    L6:
        f7630 = r0;
        return;
    L5:
        r0 = 1;
        goto L6
    }

    public C2128(Context r4) {
        this.f7632 = f7630;
        this.f7634 = r4;
        ActivityManager r0 = (ActivityManager) r4.getSystemService("activity");
        this.f7633 = r0;
        this.f7631 = new ˉˆ(14, r4.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        return;
    L5:
        if (r0.isLowRamDevice() == false) goto L9;
        this.f7632 = 0.0f;
        return;
    }
}
