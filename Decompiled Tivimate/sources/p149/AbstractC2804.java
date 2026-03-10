package p149;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˉˆ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2804 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static void m6129(ThemedSpinnerAdapter r1, Resources.Theme r2) {
        if (Objects.equals(r1.getDropDownViewTheme(), r2) == true) goto L6;
        r1.setDropDownViewTheme(r2);
        return;
    }
}
