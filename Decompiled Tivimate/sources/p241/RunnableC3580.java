package p241;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p198.ViewTreeObserverOnPreDrawListenerC3314;

/* JADX INFO: renamed from: ˑʼ.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3580 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f12745;

    /* JADX INFO: renamed from: ʾˋ */
    public final ViewGroup f12746;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f12747;

    /* JADX INFO: renamed from: ᴵˊ */
    public final View f12748;

    /* JADX INFO: renamed from: ᴵᵔ */
    public boolean f12749;

    public RunnableC3580(Animation r2, ViewGroup r3, View r4) {
        super(false);
        this.f12749 = true;
        this.f12746 = r3;
        this.f12748 = r4;
        addAnimation(r2);
        r3.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5) {
        this.f12749 = true;
        if (this.f12745 == false) goto L7;
        return !this.f12747;
    L7:
        if (super.getTransformation(r3, r5) == true) goto L9;
        this.f12745 = true;
        ViewTreeObserverOnPreDrawListenerC3314.m7000(this.f12746, this);
    L9:
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5, float r6) {
        this.f12749 = true;
        if (this.f12745 == false) goto L7;
        return !this.f12747;
    L7:
        if (super.getTransformation(r3, r5, r6) == true) goto L9;
        this.f12745 = true;
        ViewTreeObserverOnPreDrawListenerC3314.m7000(this.f12746, this);
    L9:
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.f12745;
        ViewGroup r1 = this.f12746;
        if (r0 == false) goto L5;
    L8:
        r1.endViewTransition(this.f12748);
        this.f12747 = true;
        return;
    L5:
        if (this.f12749 == false) goto L8;
        this.f12749 = false;
        r1.post(this);
    }
}
