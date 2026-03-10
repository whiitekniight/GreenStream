package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public float f713;

    /* JADX INFO: renamed from: ʾˋ */
    public float f714;

    /* JADX INFO: renamed from: ᴵˊ */
    public float f715;

    public ScaleFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f714 = 1.0f;
        this.f715 = 1.0f;
        this.f713 = 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, ViewGroup.LayoutParams r3) {
        super.addView(r1, r2, r3);
        r1.setScaleX(this.f713);
        r1.setScaleY(this.f713);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View r1, int r2, ViewGroup.LayoutParams r3, boolean r4) {
        boolean r22 = super.addViewInLayout(r1, r2, r3, r4);
        if (r22 == false) goto L5;
        r1.setScaleX(this.f713);
        r1.setScaleY(this.f713);
    L5:
        return r22;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        ScaleFrameLayout r0 = this;
        int r1 = r0.getChildCount();
        int r2 = r0.getLayoutDirection();
        if (r2 != 1) goto L5;
        float r4 = r0.getWidth() - r0.getPivotX();
    L7:
        if (r0.f714 == 1.0f) goto L10;
        int r5 = r0.getPaddingLeft();
        float r8 = r0.f714;
        int r52 = r5 + ((int) ((r4 - (r4 / r8)) + 0.5f));
        int r82 = (int) (((((r20 - r18) - r4) / r8) + r4) + 0.5f);
        int r9 = r0.getPaddingRight();
    L9:
        int r83 = r82 - r9;
        float r92 = r0.getPivotY();
        if (r0.f715 == 1.0f) goto L15;
        int r6 = r0.getPaddingTop();
        float r10 = r0.f715;
        int r62 = r6 + ((int) ((r92 - (r92 / r10)) + 0.5f));
        int r7 = (int) (((((r21 - r19) - r92) / r10) + r92) + 0.5f);
        int r102 = r0.getPaddingBottom();
    L14:
        int r72 = r7 - r102;
        int r103 = 0;
    L17:
        if (r103 >= r1) goto L45;
        View r11 = r0.getChildAt(r103);
        if (r11.getVisibility() == 8) goto L44;
        FrameLayout.LayoutParams r12 = (FrameLayout.LayoutParams) r11.getLayoutParams();
        int r13 = r11.getMeasuredWidth();
        int r14 = r11.getMeasuredHeight();
        int r15 = r12.gravity;
        if (r15 != (-1)) goto L23;
        r15 = 8388659;
    L23:
        int r3 = Gravity.getAbsoluteGravity(r15, r2);
        int r152 = r15 & 112;
        int r32 = r3 & 7;
        if (r32 != 1) goto L26;
        int r02 = ((((r83 - r52) - r13) / 2) + r52) + r12.leftMargin;
        int r33 = r12.rightMargin;
    L29:
        int r03 = r02 - r33;
    L32:
        if (r152 != 16) goto L34;
        int r34 = ((((r72 - r62) - r14) / 2) + r62) + r12.topMargin;
        int r122 = r12.bottomMargin;
    L40:
        int r35 = r34 - r122;
    L43:
        r11.layout(r03, r35, r13 + r03, r14 + r35);
        r11.setPivotX(r4 - r03);
        r11.setPivotY(r92 - r35);
        goto L44
    L34:
        if (r152 != 48) goto L36;
        int r36 = r12.topMargin;
    L38:
        r35 = r36 + r62;
        goto L43
    L36:
        if (r152 == 80) goto L39;
        r36 = r12.topMargin;
        goto L38
    L39:
        r34 = r72 - r14;
        r122 = r12.bottomMargin;
        goto L40
    L26:
        if (r32 == 5) goto L28;
        r03 = r12.leftMargin + r52;
        goto L32
    L28:
        r02 = r83 - r13;
        r33 = r12.rightMargin;
    L44:
        r103 = r103 + 1;
        r0 = this;
        goto L17
    L45:
        return;
    L15:
        r62 = r0.getPaddingTop();
        r7 = r21 - r19;
        r102 = r0.getPaddingBottom();
        goto L14
    L10:
        r52 = r0.getPaddingLeft();
        r82 = r20 - r18;
        r9 = r0.getPaddingRight();
        goto L9
    L5:
        r4 = r0.getPivotX();
        goto L7
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        float r0 = this.f714;
        if (r0 != 1.0f) goto L10;
        if (this.f715 != 1.0f) goto L10;
        super.onMeasure(r5, r6);
        return;
    L10:
        if (r0 == 1.0f) goto L13;
        r5 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(r5) / r0) + 0.5f), View.MeasureSpec.getMode(r5));
    L13:
        float r02 = this.f715;
        if (r02 == 1.0f) goto L17;
        r6 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(r6) / r02) + 0.5f), View.MeasureSpec.getMode(r6));
    L17:
        super.onMeasure(r5, r6);
        setMeasuredDimension((int) ((getMeasuredWidth() * this.f714) + 0.5f), (int) ((getMeasuredHeight() * this.f715) + 0.5f));
    }

    public void setChildScale(float r3) {
        if (this.f713 == r3) goto L8;
        this.f713 = r3;
        int r0 = 0;
    L6:
        if (r0 >= getChildCount()) goto L10;
        getChildAt(r0).setScaleX(r3);
        getChildAt(r0).setScaleY(r3);
        r0 = r0 + 1;
        goto L6
    L10:
        return;
    }

    @Override // android.view.View
    public void setForeground(Drawable r1) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float r2) {
        if (r2 == this.f714) goto L6;
        this.f714 = r2;
        requestLayout();
        return;
    }

    public void setLayoutScaleY(float r2) {
        if (r2 == this.f715) goto L6;
        this.f715 = r2;
        requestLayout();
        return;
    }
}
