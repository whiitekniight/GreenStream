package p040;

import android.app.job.JobParameters;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import p149.C2795;

/* JADX INFO: renamed from: ʼᐧ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1599 {
    /* JADX INFO: renamed from: ʼˎ */
    public static int m4239(DisplayCutout r0) {
        return r0.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static boolean m4240(ViewConfiguration r0) {
        return r0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* JADX INFO: renamed from: ʽ */
    public static String[] m4241(DecimalFormatSymbols r0) {
        return r0.getDigitStrings();
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static int m4242(DisplayCutout r0) {
        return r0.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m4243(JobParameters r0) {
        r0.getNetwork();
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static int m4244(Object r0) {
        return ((Icon) r0).getType();
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static void m4245(TextView r0, int r1) {
        r0.setFirstBaselineToTopHeight(r1);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static int m4246(Object r0) {
        return ((Icon) r0).getResId();
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static int m4247(ViewConfiguration r0) {
        return r0.getScaledHoverSlop();
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static int m4248(DisplayCutout r0) {
        return r0.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static Uri m4249(Object r0) {
        return ((Icon) r0).getUri();
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static int m4250(DisplayCutout r0) {
        return r0.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Handler m4251(Looper r0) {
        return Handler.createAsync(r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Handler m4252(Looper r0) {
        return Handler.createAsync(r0);
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static PrecomputedText.Params m4253(C2795 r0) {
        return r0.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static String m4254(Object r0) {
        return ((Icon) r0).getResPackage();
    }
}
