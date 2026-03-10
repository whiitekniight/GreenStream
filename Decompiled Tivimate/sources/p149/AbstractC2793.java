package p149;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: renamed from: ˉˆ.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2793 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static StaticLayout m6105(CharSequence r2, Layout.Alignment r3, int r4, int r5, TextView r6, TextPaint r7, AbstractC2718 r8) {
        StaticLayout.Builder r22 = StaticLayout.Builder.obtain(r2, 0, r2.length(), r7, r4);
        StaticLayout.Builder r32 = r22.setAlignment(r3).setLineSpacing(r6.getLineSpacingExtra(), r6.getLineSpacingMultiplier()).setIncludePad(r6.getIncludeFontPadding()).setBreakStrategy(r6.getBreakStrategy()).setHyphenationFrequency(r6.getHyphenationFrequency());
        if (r5 != (-1)) goto L5;
        r5 = Integer.MAX_VALUE;
    L5:
        r32.setMaxLines(r5);
        r8.mo5948(r22, r6);     // Catch: ClassCastException -> L8
    L10:
        return r22.build();
    }
}
