package p149;

import android.widget.TextView;

/* JADX INFO: renamed from: ˉˆ.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2819 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6141(TextView r0, int[] r1, int r2) {
        r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public static boolean m6142(TextView r0, String r1) {
        return r0.setFontVariationSettings(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m6143(TextView r0, int r1, int r2, int r3, int r4) {
        r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m6144(TextView r0) {
        return r0.getAutoSizeStepGranularity();
    }
}
