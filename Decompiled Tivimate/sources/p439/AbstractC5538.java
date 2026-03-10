package p439;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* JADX INFO: renamed from: ﹶʼ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5538 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final String f19961 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int[] f19962 = null;

    static {
        f19962 = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f19961 = AbstractC5538.class.getSimpleName();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static ColorStateList m10674(ColorStateList r3) {
        if (r3 == null) goto L13;
        if (Build.VERSION.SDK_INT <= 27) goto L7;
    L11:
        return r3;
    L7:
        if (Color.alpha(r3.getDefaultColor()) != 0) goto L11;
        if (Color.alpha(r3.getColorForState(f19962, 0)) == 0) goto L11;
        String r0 = f19961;
        goto L11
    L13:
        return ColorStateList.valueOf(0);
    }
}
