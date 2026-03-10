package p337;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ar.tvplayer.p002tv.R;
import p141.AbstractC2668;
import p196.AbstractC3247;
import p200.C3327;
import p200.C3345;
import p271.AbstractC3882;
import ʽٴ.ˈ;
import ˈˋ.ʾˊ;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ᴵـ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4541 extends FrameLayout {

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final ViewOnTouchListenerC4542 f16393 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final float f16394;

    /* JADX INFO: renamed from: ʾˋ */
    public final C3345 f16395;

    /* JADX INFO: renamed from: ˈٴ */
    public final float f16396;

    /* JADX INFO: renamed from: ˉٴ */
    public PorterDuff.Mode f16397;

    /* JADX INFO: renamed from: ˊʻ */
    public final int f16398;

    /* JADX INFO: renamed from: ٴᵢ */
    public ColorStateList f16399;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f16400;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f16401;

    static {
        f16393 = new ViewOnTouchListenerC4542();
    }

    public AbstractC4541(Context r5, AttributeSet r6) {
        super(AbstractC3247.m6874(r5, r6, 0, 0), r6);
        Context r52 = getContext();
        TypedArray r1 = r52.obtainStyledAttributes(r6, AbstractC3882.f14232);
        if (r1.hasValue(6) == false) goto L5;
        setElevation(r1.getDimensionPixelSize(6, 0));
    L5:
        this.f16400 = r1.getInt(2, 0);
        if (r1.hasValue(8) == false) goto L8;
    L9:
        this.f16395 = C3345.m7072(r52, r6, 0, 0).m7067();
    L10:
        this.f16394 = r1.getFloat(3, 1.0f);
        setBackgroundTintList(ⁱˊ.ﹳᐧ(r52, r1, 4));
        setBackgroundTintMode(AbstractC2668.m5900(r1.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f16396 = r1.getFloat(1, 1.0f);
        this.f16401 = r1.getDimensionPixelSize(0, -1);
        this.f16398 = r1.getDimensionPixelSize(7, -1);
        r1.recycle();
        setOnTouchListener(f16393);
        setFocusable(true);
        if (getBackground() != null) goto L21;
        int r53 = ˈ.ˏי(getBackgroundOverlayColorAlpha(), ˈ.ʼʼ(getContext(), ʾˊ.ᴵˊ(this, R.attr.u)), ˈ.ʼʼ(getContext(), ʾˊ.ᴵˊ(this, R.attr.u)));
        C3345 r62 = this.f16395;
        if (r62 == null) goto L15;
        int r0 = AbstractC4540.f16392;
        C3327 r02 = new C3327(r62);
        r02.m7032(ColorStateList.valueOf(r53));
        Drawable r03 = r02;
    L16:
        ColorStateList r54 = this.f16399;
        if (r54 == null) goto L19;
        r03.setTintList(r54);
    L19:
        setBackground(r03);
        return;
    L15:
        Resources r63 = getResources();
        int r12 = AbstractC4540.f16392;
        float r64 = r63.getDimension(R.dimen.u);
        GradientDrawable r13 = new GradientDrawable();
        r13.setShape(0);
        r13.setCornerRadius(r64);
        r13.setColor(r53);
        r03 = r13;
        goto L16
    L21:
        return;
    L8:
        if (r1.hasValue(9) == false) goto L10;
        goto L9
    }

    private void setBaseTransientBottomBar(AbstractC4540 r1) {
    }

    public float getActionTextColorAlpha() {
        return this.f16396;
    }

    public int getAnimationMode() {
        return this.f16400;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f16394;
    }

    public int getMaxInlineActionWidth() {
        return this.f16398;
    }

    public int getMaxWidth() {
        return this.f16401;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.f16401;
        if (r22 > 0) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= r22) goto L9;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), r3);
        return;
    }

    public void setAnimationMode(int r1) {
        this.f16400 = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        super.setBackgroundDrawable(r2);
        return;
    L4:
        if (this.f16399 == null) goto L6;
        r2 = r2.mutate();
        r2.setTintList(this.f16399);
        r2.setTintMode(this.f16397);
        goto L6
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        this.f16399 = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintList(r2);
        r0.setTintMode(this.f16397);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        this.f16397 = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintMode(r2);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams r5) {
        super.setLayoutParams(r5);
        if ((r5 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r5;
        new Rect(r52.leftMargin, r52.topMargin, r52.rightMargin, r52.bottomMargin);
        return;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener r2) {
        if (r2 == null) goto L4;
        ViewOnTouchListenerC4542 r0 = null;
    L5:
        setOnTouchListener(r0);
        super.setOnClickListener(r2);
        return;
    L4:
        r0 = f16393;
        goto L5
    }
}
