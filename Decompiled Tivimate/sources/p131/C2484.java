package p131;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˈʿ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2484 {

    /* JADX INFO: renamed from: ʽ */
    public final int f8812;

    /* JADX INFO: renamed from: ˈ */
    public final int f8813;

    /* JADX INFO: renamed from: ⁱˊ */
    public final TextDirectionHeuristic f8814;

    /* JADX INFO: renamed from: ﹳٴ */
    public final TextPaint f8815;

    public C2484(PrecomputedText.Params r2) {
        this.f8815 = r2.getTextPaint();
        this.f8814 = r2.getTextDirection();
        this.f8812 = r2.getBreakStrategy();
        this.f8813 = r2.getHyphenationFrequency();
    }

    public C2484(TextPaint r3, TextDirectionHeuristic r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        new PrecomputedText.Params.Builder(r3).setBreakStrategy(r5).setHyphenationFrequency(r6).setTextDirection(r4).build();
    L5:
        this.f8815 = r3;
        this.f8814 = r4;
        this.f8812 = r5;
        this.f8813 = r6;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof C2484) == false) goto L54;
        C2484 r62 = (C2484) r6;
        int r0 = Build.VERSION.SDK_INT;
        if (this.f8812 == r62.f8812) goto L11;
        return false;
    L11:
        if (this.f8813 != r62.f8813) goto L56;
        TextPaint r1 = this.f8815;
        float r2 = r1.getTextSize();
        TextPaint r3 = r62.f8815;
        if (r2 == r3.getTextSize()) goto L17;
        return false;
    L17:
        if (r1.getTextScaleX() == r3.getTextScaleX()) goto L20;
        return false;
    L20:
        if (r1.getTextSkewX() == r3.getTextSkewX()) goto L23;
        return false;
    L23:
        if (r1.getLetterSpacing() == r3.getLetterSpacing()) goto L26;
        return false;
    L26:
        if (TextUtils.equals(r1.getFontFeatureSettings(), r3.getFontFeatureSettings()) == true) goto L29;
        return false;
    L29:
        if (r1.getFlags() == r3.getFlags()) goto L32;
        return false;
    L32:
        if (r0 < 24) goto L37;
        if (r1.getTextLocales().equals(r3.getTextLocales()) == true) goto L40;
        return false;
    L40:
        if (r1.getTypeface() != null) goto L45;
        if (r3.getTypeface() == null) goto L48;
        return false;
    L48:
        if (this.f8814 != r62.f8814) goto L51;
        return true;
    L51:
        return false;
    L45:
        if (r1.getTypeface().equals(r3.getTypeface()) == true) goto L48;
        return false;
    L37:
        if (r1.getTextLocale().equals(r3.getTextLocale()) == true) goto L40;
        return false;
    L56:
        return false;
    L54:
        return false;
    }

    public final int hashCode() {
        int r1 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic r15 = this.f8814;
        int r3 = this.f8813;
        int r4 = this.f8812;
        TextPaint r5 = this.f8815;
        if (r1 < 24) goto L7;
        return Objects.hash(new Object[]{Float.valueOf(r5.getTextSize()), Float.valueOf(r5.getTextScaleX()), Float.valueOf(r5.getTextSkewX()), Float.valueOf(r5.getLetterSpacing()), Integer.valueOf(r5.getFlags()), r5.getTextLocales(), r5.getTypeface(), Boolean.valueOf(r5.isElegantTextHeight()), r15, Integer.valueOf(r4), Integer.valueOf(r3)});
    L7:
        return Objects.hash(new Object[]{Float.valueOf(r5.getTextSize()), Float.valueOf(r5.getTextScaleX()), Float.valueOf(r5.getTextSkewX()), Float.valueOf(r5.getLetterSpacing()), Integer.valueOf(r5.getFlags()), r5.getTextLocale(), r5.getTypeface(), Boolean.valueOf(r5.isElegantTextHeight()), r15, Integer.valueOf(r4), Integer.valueOf(r3)});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("{");
        StringBuilder r1 = new StringBuilder("textSize=");
        TextPaint r2 = this.f8815;
        r1.append(r2.getTextSize());
        r0.append(r1.toString());
        r0.append(", textScaleX=" + r2.getTextScaleX());
        r0.append(", textSkewX=" + r2.getTextSkewX());
        int r12 = Build.VERSION.SDK_INT;
        r0.append(", letterSpacing=" + r2.getLetterSpacing());
        r0.append(", elegantTextHeight=" + r2.isElegantTextHeight());
        if (r12 < 24) goto L5;
        r0.append(", textLocale=" + r2.getTextLocales());
    L6:
        r0.append(", typeface=" + r2.getTypeface());
        if (r12 < 26) goto L9;
        r0.append(", variationSettings=" + r2.getFontVariationSettings());
    L9:
        r0.append(", textDir=" + this.f8814);
        r0.append(", breakStrategy=" + this.f8812);
        r0.append(", hyphenationFrequency=" + this.f8813);
        r0.append("}");
        return r0.toString();
    L5:
        r0.append(", textLocale=" + r2.getTextLocale());
        goto L6
    }
}
