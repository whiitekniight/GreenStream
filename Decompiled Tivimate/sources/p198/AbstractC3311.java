package p198;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ˋᵔ.ᵔי */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3311 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Method f11554 = null;

    static {
        if (Build.VERSION.SDK_INT != 25) goto L10;
        f11554 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);     // Catch: Exception -> L6
        return;
    L7:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static float m6998(ViewConfiguration r3, Context r4) {
        if (Build.VERSION.SDK_INT >= 25) goto L5;
    L11:
        TypedValue r32 = new TypedValue();
        if (r4.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, r32, true) == true) goto L14;
        return 0.0f;
    L14:
        return r32.getDimension(r4.getResources().getDisplayMetrics());
    L5:
        if (f11554 == null) goto L11;
        return ((Integer) r0.invoke(r3, null)).intValue();
    }
}
