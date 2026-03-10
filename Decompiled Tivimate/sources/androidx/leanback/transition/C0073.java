package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import ar.tvplayer.p002tv.R;

/* JADX INFO: renamed from: androidx.leanback.transition.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C0073 extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ʼˎ */
    public final float f562;

    /* JADX INFO: renamed from: ʽ */
    public final int f563;

    /* JADX INFO: renamed from: ˈ */
    public final int f564;

    /* JADX INFO: renamed from: ˑﹳ */
    public int[] f565;

    /* JADX INFO: renamed from: ᵎﹶ */
    public float f566;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final float f567;

    /* JADX INFO: renamed from: ⁱˊ */
    public final View f568;

    /* JADX INFO: renamed from: ﹳٴ */
    public final View f569;

    /* JADX INFO: renamed from: ﾞᴵ */
    public float f570;

    public C0073(View r2, View r3, int r4, int r5, float r6, float r7) {
        this.f568 = r2;
        this.f569 = r3;
        this.f563 = r4 - Math.round(r2.getTranslationX());
        this.f564 = r5 - Math.round(r2.getTranslationY());
        this.f567 = r6;
        this.f562 = r7;
        int[] r42 = (int[]) r3.getTag(R.id.u);
        this.f565 = r42;
        if (r42 == null) goto L6;
        r3.setTag(R.id.u, null);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r4) {
        if (this.f565 != null) goto L5;
        this.f565 = new int[2];
    L5:
        int[] r42 = this.f565;
        float r0 = this.f563;
        View r1 = this.f568;
        r42[0] = Math.round(r1.getTranslationX() + r0);
        this.f565[1] = Math.round(r1.getTranslationY() + this.f564);
        this.f569.setTag(R.id.u, this.f565);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r2) {
        View r22 = this.f568;
        this.f570 = r22.getTranslationX();
        this.f566 = r22.getTranslationY();
        r22.setTranslationX(this.f567);
        r22.setTranslationY(this.f562);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r2) {
        float r22 = this.f570;
        View r0 = this.f568;
        r0.setTranslationX(r22);
        r0.setTranslationY(this.f566);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition r2) {
        float r22 = this.f567;
        View r0 = this.f568;
        r0.setTranslationX(r22);
        r0.setTranslationY(this.f562);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition r1) {
    }
}
