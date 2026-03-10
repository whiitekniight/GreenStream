package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import ar.tvplayer.p002tv.R;

/* JADX INFO: renamed from: androidx.leanback.transition.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C0077 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ʽ */
    public final View f574;

    /* JADX INFO: renamed from: ˈ */
    public final float f575;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f576;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Property f577;

    /* JADX INFO: renamed from: ⁱˊ */
    public float f578;

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean f579;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f580;

    public C0077(View r2, Property r3, float r4, float r5, int r6) {
        this.f579 = false;
        this.f577 = r3;
        this.f574 = r2;
        this.f576 = r4;
        this.f575 = r5;
        this.f580 = r6;
        r2.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r5) {
        View r52 = this.f574;
        r52.setTag(R.id.u, new float[]{r52.getTranslationX(), r52.getTranslationY()});
        this.f577.set(r52, Float.valueOf(this.f576));
        this.f579 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        boolean r32 = this.f579;
        View r0 = this.f574;
        if (r32 == true) goto L5;
        Float r33 = Float.valueOf(this.f576);
        this.f577.set(r0, r33);
    L5:
        r0.setVisibility(this.f580);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r3) {
        Property r32 = this.f577;
        View r0 = this.f574;
        this.f578 = ((Float) r32.get(r0)).floatValue();
        r32.set(r0, Float.valueOf(this.f575));
        r0.setVisibility(this.f580);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r3) {
        Float r32 = Float.valueOf(this.f578);
        Property r0 = this.f577;
        View r1 = this.f574;
        r0.set(r1, r32);
        r1.setVisibility(0);
    }
}
