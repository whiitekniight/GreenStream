package p375;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: ᵔᵢ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4896 {
    /* JADX INFO: renamed from: ⁱˊ */
    public static void m9633(Object r0, LocaleList r1) {
        ((LocaleManager) r0).setApplicationLocales(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static LocaleList m9634(Object r0) {
        return ((LocaleManager) r0).getApplicationLocales();
    }
}
