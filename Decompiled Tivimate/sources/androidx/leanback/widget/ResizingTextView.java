package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
class ResizingTextView extends TextView {

    /* JADX INFO: renamed from: ʽʽ */
    public final boolean f703;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f704;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f705;

    /* JADX INFO: renamed from: ˉٴ */
    public float f706;

    /* JADX INFO: renamed from: ˊʻ */
    public boolean f707;

    /* JADX INFO: renamed from: ٴʼ */
    public int f708;

    /* JADX INFO: renamed from: ٴᵢ */
    public int f709;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f710;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f711;

    /* JADX INFO: renamed from: ᵎⁱ */
    public int f712;

    public ResizingTextView(Context r4, AttributeSet r5) {
        super(r4, r5, R.attr.textViewStyle);
        this.f707 = false;
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC3966.f14614, R.attr.textViewStyle, 0);
        this.f704 = r42.getInt(1, 1);     // Catch: Throwable -> L6
        this.f710 = r42.getDimensionPixelSize(4, -1);     // Catch: Throwable -> L6
        this.f703 = r42.getBoolean(0, false);     // Catch: Throwable -> L6
        this.f705 = r42.getDimensionPixelOffset(3, 0);     // Catch: Throwable -> L6
        this.f711 = r42.getDimensionPixelOffset(2, 0);     // Catch: Throwable -> L6
        r42.recycle();
        return;
    L6:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r8, int r9) {
        boolean r1 = true;
        if (this.f707 == true) goto L5;
        this.f709 = (int) getTextSize();
        this.f706 = getLineSpacingExtra();
        this.f712 = getPaddingTop();
        this.f708 = getPaddingBottom();
        this.f707 = true;
    L5:
        boolean r2 = false;
        setTextSize(0, this.f709);
        setLineSpacing(this.f706, getLineSpacingMultiplier());
        m547(this.f712, this.f708);
        super.onMeasure(r8, r9);
        Layout r0 = getLayout();
        if (r0 != null) goto L8;
    L13:
        boolean r02 = false;
    L14:
        int r3 = (int) getTextSize();
        boolean r4 = this.f703;
        int r6 = this.f710;
        if (r02 == false) goto L29;
        if (r6 == (-1)) goto L19;
        if (r3 == r6) goto L19;
        setTextSize(0, r6);
        r2 = true;
    L19:
        float r03 = (this.f706 + this.f709) - r6;
        if (r4 == true) goto L22;
    L24:
        int r04 = this.f712 + this.f705;
        int r32 = this.f708 + this.f711;
        if (getPaddingTop() == r04) goto L27;
    L28:
        m547(r04, r32);
    L44:
        if (r1 == false) goto L47;
        super.onMeasure(r8, r9);
        return;
    L47:
        return;
    L27:
        if (getPaddingBottom() != r32) goto L28;
    L42:
        r1 = r2;
        goto L44
    L22:
        if (getLineSpacingExtra() == r03) goto L24;
        setLineSpacing(r03, getLineSpacingMultiplier());
        r2 = true;
        goto L24
    L29:
        if (r6 == (-1)) goto L33;
        int r05 = this.f709;
        if (r3 == r05) goto L33;
        setTextSize(0, r05);
        r2 = true;
    L33:
        if (r4 == false) goto L38;
        float r06 = getLineSpacingExtra();
        float r33 = this.f706;
        if (r06 == r33) goto L38;
        setLineSpacing(r33, getLineSpacingMultiplier());
        r2 = true;
    L38:
        if (getPaddingTop() == this.f712) goto L40;
    L43:
        m547(this.f712, this.f708);
        goto L44
    L40:
        if (getPaddingBottom() == this.f708) goto L42;
    L8:
        if ((this.f704 & 1) <= 0) goto L13;
        int r07 = r0.getLineCount();
        int r34 = getMaxLines();
        if (r34 <= 1) goto L13;
        if (r07 != r34) goto L13;
        r02 = true;
        goto L14
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ﹳٴ.ﹳٴ.ˉـ(r1, this));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m547(int r3, int r4) {
        if (isPaddingRelative() == false) goto L6;
        setPaddingRelative(getPaddingStart(), r3, getPaddingEnd(), r4);
        return;
    L6:
        setPadding(getPaddingLeft(), r3, getPaddingRight(), r4);
    }
}
