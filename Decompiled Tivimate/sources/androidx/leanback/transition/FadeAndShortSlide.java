package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.internal.measurement.ᵎ;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* JADX INFO: renamed from: ˉٴ */
    public static final C0079 f543 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final C0079 f544 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final C0079 f545 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final C0079 f546 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final DecelerateInterpolator f547 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final C0079 f548 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public float f549;

    /* JADX INFO: renamed from: ʾˋ */
    public ᵎ f550;

    /* JADX INFO: renamed from: ˈٴ */
    public final C0074 f551;

    /* JADX INFO: renamed from: ᴵˊ */
    public Visibility f552;

    static {
        f547 = new DecelerateInterpolator();
        f544 = new C0079(0);
        f546 = new C0079(1);
        f543 = new C0079(2);
        f548 = new C0079(3);
        f545 = new C0079(4);
    }

    public FadeAndShortSlide(int r2) {
        this.f552 = new Fade();
        this.f549 = -1.0f;
        this.f551 = new C0074(this);
        m442(r2);
    }

    public FadeAndShortSlide(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f552 = new Fade();
        this.f549 = -1.0f;
        this.f551 = new C0074(this);
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC3966.f14611);
        m442(r22.getInt(3, 8388611));
        r22.recycle();
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener r2) {
        this.f552.addListener(r2);
        return super.addListener(r2);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues r3) {
        this.f552.captureEndValues(r3);
        super.captureEndValues(r3);
        int[] r1 = new int[2];
        r3.view.getLocationOnScreen(r1);
        r3.values.put("android:fadeAndShortSlideTransition:screenPosition", r1);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues r3) {
        this.f552.captureStartValues(r3);
        super.captureStartValues(r3);
        int[] r1 = new int[2];
        r3.view.getLocationOnScreen(r1);
        r3.values.put("android:fadeAndShortSlideTransition:screenPosition", r1);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide r0 = (FadeAndShortSlide) super.clone();
        r0.f552 = (Visibility) this.f552.clone();
        return r0;
    }

    @Override // android.transition.Transition
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup r11, View r12, TransitionValues r13, TransitionValues r14) {
        if (r14 == null) goto L15;
        if (r11 != r12) goto L8;
        return null;
    L8:
        int[] r2 = (int[]) r14.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int r3 = r2[0];
        int r4 = r2[1];
        float r6 = r12.getTranslationX();
        float r5 = this.f550.ʼˎ(this, r11, r12, r2);
        float r7 = r12.getTranslationY();
        ObjectAnimator r22 = ʽٴ.ˈ.ﾞᴵ(r12, r14, r3, r4, r5, this.f550.ˆʾ(this, r11, r12, r2), r6, r7, f547, this);
        Animator r0 = this.f552.onAppear(r11, r12, r13, r14);
        if (r22 != null) goto L11;
        return r0;
    L11:
        if (r0 != null) goto L13;
        return r22;
    L13:
        AnimatorSet r1 = new AnimatorSet();
        r1.play(r22).with(r0);
        return r1;
    L15:
        return null;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup r11, View r12, TransitionValues r13, TransitionValues r14) {
        if (r13 == null) goto L14;
        if (r11 != r12) goto L7;
        return null;
    L7:
        int[] r2 = (int[]) r13.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int r3 = r2[0];
        int r4 = r2[1];
        float r42 = r12.getTranslationX();
        float r6 = this.f550.ʼˎ(this, r11, r12, r2);
        ObjectAnimator r22 = ʽٴ.ˈ.ﾞᴵ(r12, r13, r3, r4, r42, r12.getTranslationY(), r6, this.f550.ˆʾ(this, r11, r12, r2), f547, this);
        Animator r0 = this.f552.onDisappear(r11, r12, r13, r14);
        if (r22 != null) goto L10;
        return r0;
    L10:
        if (r0 != null) goto L12;
        return r22;
    L12:
        AnimatorSet r1 = new AnimatorSet();
        r1.play(r22).with(r0);
        return r1;
    L14:
        return null;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener r2) {
        this.f552.removeListener(r2);
        return super.removeListener(r2);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback r2) {
        this.f552.setEpicenterCallback(r2);
        super.setEpicenterCallback(r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m442(int r2) {
        if (r2 != 48) goto L5;
        this.f550 = f545;
        return;
    L5:
        if (r2 != 80) goto L7;
        this.f550 = f548;
        return;
    L7:
        if (r2 != 112) goto L9;
        this.f550 = this.f551;
        return;
    L9:
        if (r2 != 8388611) goto L11;
        this.f550 = f544;
        return;
    L11:
        if (r2 != 8388613) goto L13;
        this.f550 = f546;
        return;
    L13:
        if (r2 != 8388615) goto L17;
        this.f550 = f543;
        return;
    L17:
        throw new IllegalArgumentException("Invalid slide direction");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final float m443(ViewGroup r3) {
        float r0 = this.f549;
        if (r0 < 0.0f) goto L6;
        return r0;
    L6:
        return r3.getHeight() / 4;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final float m444(ViewGroup r3) {
        float r0 = this.f549;
        if (r0 < 0.0f) goto L6;
        return r0;
    L6:
        return r3.getWidth() / 4;
    }
}
