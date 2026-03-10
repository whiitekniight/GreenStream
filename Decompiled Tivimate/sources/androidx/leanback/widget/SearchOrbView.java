package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.media.session.AbstractC0002;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ar.tvplayer.p002tv.R;
import java.util.WeakHashMap;
import p198.AbstractC3259;
import p198.AbstractC3306;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: ʼˈ */
    public static final /* synthetic */ int f743 = 0;

    /* JADX INFO: renamed from: ʽʽ */
    public final View f744;

    /* JADX INFO: renamed from: ʾˋ */
    public View.OnClickListener f745;

    /* JADX INFO: renamed from: ˆﾞ */
    public boolean f746;

    /* JADX INFO: renamed from: ˈʿ */
    public final ArgbEvaluator f747;

    /* JADX INFO: renamed from: ˈٴ */
    public final ImageView f748;

    /* JADX INFO: renamed from: ˉٴ */
    public final int f749;

    /* JADX INFO: renamed from: ˊʻ */
    public C0117 f750;

    /* JADX INFO: renamed from: ˊˋ */
    public final C0082 f751;

    /* JADX INFO: renamed from: ˋᵔ */
    public ValueAnimator f752;

    /* JADX INFO: renamed from: ˑٴ */
    public final C0082 f753;

    /* JADX INFO: renamed from: ٴʼ */
    public final float f754;

    /* JADX INFO: renamed from: ٴᵢ */
    public final float f755;

    /* JADX INFO: renamed from: ᴵˊ */
    public final View f756;

    /* JADX INFO: renamed from: ᴵᵔ */
    public Drawable f757;

    /* JADX INFO: renamed from: ᵎˊ */
    public final float f758;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final int f759;

    /* JADX INFO: renamed from: ᵔי */
    public ValueAnimator f760;

    /* JADX INFO: renamed from: ᵔٴ */
    public boolean f761;

    public SearchOrbView(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.u);
    }

    public SearchOrbView(Context r12, AttributeSet r13, int r14) {
        super(r12, r13, r14);
        this.f747 = new ArgbEvaluator();
        this.f753 = new C0082(0, this);
        this.f751 = new C0082(1, this);
        Resources r0 = r12.getResources();
        View r1 = ((LayoutInflater) r12.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), this, true);
        this.f756 = r1;
        this.f744 = r1.findViewById(R.id.u);
        ImageView r15 = (ImageView) r1.findViewById(R.id.icon);
        this.f748 = r15;
        this.f755 = r12.getResources().getFraction(R.fraction.u, 1, 1);
        this.f749 = r12.getResources().getInteger(R.integer.u);
        this.f759 = r12.getResources().getInteger(R.integer.u);
        float r2 = r12.getResources().getDimensionPixelSize(R.dimen.u);
        this.f758 = r2;
        this.f754 = r12.getResources().getDimensionPixelSize(R.dimen.u);
        int[] r7 = AbstractC3966.f14610;
        TypedArray r9 = r12.obtainStyledAttributes(r13, r7, r14, 0);
        AbstractC3306.m6993(this, r12, r7, r13, r9, r14);
        Drawable r122 = r9.getDrawable(2);
        if (r122 != null) goto L5;
        r122 = r0.getDrawable(R.drawable.u);
    L5:
        setOrbIcon(r122);
        int r123 = r9.getColor(1, r0.getColor(R.color.u));
        setOrbColors(new C0117(r123, r9.getColor(0, r123), r9.getColor(3, 0)));
        r9.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        AbstractC3259.m6893(r15, r2);
    }

    public float getFocusedZoom() {
        return this.f755;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f750.f927;
    }

    public C0117 getOrbColors() {
        return this.f750;
    }

    public Drawable getOrbIcon() {
        return this.f757;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f761 = true;
        m553();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        View.OnClickListener r0 = this.f745;
        if (r0 == null) goto L6;
        r0.onClick(r2);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f761 = false;
        m553();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        super.onFocusChanged(r1, r2, r3);
        m554(r1);
    }

    public void setOnOrbClickedListener(View.OnClickListener r1) {
        this.f745 = r1;
    }

    public void setOrbColor(int r3) {
        setOrbColors(new C0117(r3, r3, 0));
    }

    public void setOrbColors(C0117 r2) {
        this.f750 = r2;
        this.f748.setColorFilter(r2.f925);
        if (this.f760 != null) goto L6;
        setOrbViewColor(this.f750.f927);
        return;
    L6:
        this.f746 = true;
        m553();
    }

    public void setOrbIcon(Drawable r2) {
        this.f757 = r2;
        this.f748.setImageDrawable(r2);
    }

    public void setOrbViewColor(int r3) {
        View r0 = this.f744;
        if ((r0.getBackground() instanceof GradientDrawable) == false) goto L6;
        ((GradientDrawable) r0.getBackground()).setColor(r3);
        return;
    }

    public void setSearchOrbZ(float r3) {
        float r0 = this.f754;
        float r32 = AbstractC0002.m23(this.f758, r0, r3, r0);
        WeakHashMap r02 = AbstractC3306.f11545;
        AbstractC3259.m6893(this.f744, r32);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m553() {
        ValueAnimator r0 = this.f760;
        if (r0 == null) goto L6;
        r0.end();
        this.f760 = null;
    L6:
        if (this.f746 == true) goto L8;
        return;
    L8:
        if (this.f761 == false) goto L12;
        ValueAnimator r1 = ValueAnimator.ofObject(this.f747, new Object[]{Integer.valueOf(this.f750.f927), Integer.valueOf(this.f750.f926), Integer.valueOf(this.f750.f927)});
        this.f760 = r1;
        r1.setRepeatCount(-1);
        this.f760.setDuration(this.f749 * 2);
        this.f760.addUpdateListener(this.f753);
        this.f760.start();
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m554(boolean r5) {
        if (r5 == false) goto L4;
        float r0 = this.f755;
    L5:
        ViewPropertyAnimator r02 = this.f756.animate().scaleX(r0).scaleY(r0);
        long r1 = this.f759;
        r02.setDuration(r1).start();
        if (this.f752 != null) goto L8;
        ValueAnimator r03 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f752 = r03;
        r03.addUpdateListener(this.f751);
    L8:
        if (r5 == false) goto L10;
        this.f752.start();
    L11:
        this.f752.setDuration(r1);
        this.f746 = r5;
        m553();
        return;
    L10:
        this.f752.reverse();
        goto L11
    L4:
        r0 = 1.0f;
        goto L5
    }
}
