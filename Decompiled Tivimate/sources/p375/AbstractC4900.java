package p375;

import android.content.res.Configuration;
import android.os.LocaleList;
import p126.C2464;

/* JADX INFO: renamed from: ᵔᵢ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4900 {
    /* JADX INFO: renamed from: ʽ */
    public static void m9635(C2464 r0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(r0.f8782.mo5680()));
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m9636(Configuration r0, C2464 r1) {
        r0.setLocales(LocaleList.forLanguageTags(r1.f8782.mo5680()));
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C2464 m9637(Configuration r0) {
        return C2464.m5677(r0.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m9638(Configuration r1, Configuration r2, Configuration r3) {
        LocaleList r12 = r1.getLocales();
        LocaleList r0 = r2.getLocales();
        if (r12.equals(r0) == true) goto L6;
        r3.setLocales(r0);
        r3.locale = r2.locale;
        return;
    }
}
