package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public final class SeekBar extends View {

    /* JADX INFO: renamed from: ʽʽ */
    public final RectF f762;

    /* JADX INFO: renamed from: ʾˋ */
    public final RectF f763;

    /* JADX INFO: renamed from: ˆﾞ */
    public int f764;

    /* JADX INFO: renamed from: ˈٴ */
    public final Paint f765;

    /* JADX INFO: renamed from: ˉٴ */
    public int f766;

    /* JADX INFO: renamed from: ˊʻ */
    public final Paint f767;

    /* JADX INFO: renamed from: ٴʼ */
    public int f768;

    /* JADX INFO: renamed from: ٴᵢ */
    public final Paint f769;

    /* JADX INFO: renamed from: ᴵˊ */
    public final RectF f770;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final Paint f771;

    /* JADX INFO: renamed from: ᵎˊ */
    public int f772;

    /* JADX INFO: renamed from: ᵎⁱ */
    public int f773;

    /* JADX INFO: renamed from: ᵔי */
    public int f774;

    /* JADX INFO: renamed from: ᵔٴ */
    public int f775;

    public SeekBar(Context r5, AttributeSet r6) {
        super(r5, r6);
        this.f763 = new RectF();
        this.f770 = new RectF();
        this.f762 = new RectF();
        Paint r62 = new Paint(1);
        this.f765 = r62;
        Paint r1 = new Paint(1);
        this.f771 = r1;
        Paint r2 = new Paint(1);
        this.f767 = r2;
        Paint r3 = new Paint(1);
        this.f769 = r3;
        setWillNotDraw(false);
        r2.setColor(-7829368);
        r62.setColor(-3355444);
        r1.setColor(-65536);
        r3.setColor(-1);
        this.f764 = r5.getResources().getDimensionPixelSize(R.dimen.u);
        this.f775 = r5.getResources().getDimensionPixelSize(R.dimen.u);
        this.f774 = r5.getResources().getDimensionPixelSize(R.dimen.u);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f768;
    }

    public int getProgress() {
        return this.f766;
    }

    public int getSecondProgress() {
        return this.f773;
    }

    public int getSecondaryProgressColor() {
        return this.f765.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r5) {
        super.onDraw(r5);
        if (isFocused() == false) goto L5;
        int r0 = this.f774;
    L6:
        float r02 = r0;
        r5.drawRoundRect(this.f762, r02, r02, this.f767);
        RectF r1 = this.f770;
        if (r1.right <= r1.left) goto L9;
        r5.drawRoundRect(r1, r02, r02, this.f765);
    L9:
        r5.drawRoundRect(this.f763, r02, r02, this.f771);
        r5.drawCircle(this.f772, getHeight() / 2, r02, this.f769);
        return;
    L5:
        r0 = this.f764 / 2;
        goto L6
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        super.onFocusChanged(r1, r2, r3);
        m555();
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        m555();
    }

    public void setAccessibilitySeekListener(AbstractC0129 r1) {
    }

    public void setActiveBarHeight(int r1) {
        this.f775 = r1;
        m555();
    }

    public void setActiveRadius(int r1) {
        this.f774 = r1;
        m555();
    }

    public void setBarHeight(int r1) {
        this.f764 = r1;
        m555();
    }

    public void setMax(int r1) {
        this.f768 = r1;
        m555();
    }

    public void setProgress(int r2) {
        int r0 = this.f768;
        if (r2 <= r0) goto L5;
        r2 = r0;
    L7:
        this.f766 = r2;
        m555();
        return;
    L5:
        if (r2 >= 0) goto L7;
        r2 = 0;
        goto L7
    }

    public void setProgressColor(int r2) {
        this.f771.setColor(r2);
    }

    public void setSecondaryProgress(int r2) {
        int r0 = this.f768;
        if (r2 <= r0) goto L5;
        r2 = r0;
    L7:
        this.f773 = r2;
        m555();
        return;
    L5:
        if (r2 >= 0) goto L7;
        r2 = 0;
        goto L7
    }

    public void setSecondaryProgressColor(int r2) {
        this.f765.setColor(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m555() {
        if (isFocused() == false) goto L5;
        int r0 = this.f775;
    L6:
        int r1 = getWidth();
        int r2 = getHeight();
        int r02 = (r2 - r0) / 2;
        int r3 = this.f764;
        float r5 = r02;
        float r03 = r2 - r02;
        this.f762.set(r3 / 2, r5, r1 - (r3 / 2), r03);
        if (isFocused() == false) goto L9;
        int r22 = this.f774;
    L10:
        float r12 = r1 - (r22 * 2);
        float r32 = (this.f766 / this.f768) * r12;
        int r4 = this.f764;
        RectF r7 = this.f763;
        r7.set(r4 / 2, r5, (r4 / 2) + r32, r03);
        float r42 = (this.f773 / this.f768) * r12;
        this.f770.set(r7.right, r5, (this.f764 / 2) + r42, r03);
        this.f772 = r22 + ((int) r32);
        invalidate();
        return;
    L9:
        r22 = this.f764 / 2;
        goto L10
    L5:
        r0 = this.f764;
        goto L6
    }
}
