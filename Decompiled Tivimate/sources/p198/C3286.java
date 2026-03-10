package p198;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p242.AbstractC3626;
import p267.C3842;

/* JADX INFO: renamed from: ˋᵔ.ˑٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3286 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ Object f11496;

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ Object f11497;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f11498;

    public /* synthetic */ C3286(Object r1, View r2, int r3) {
        this.f11498 = r3;
        this.f11496 = r1;
        this.f11497 = r2;
    }

    public C3286(AbstractC3626 r2, C3842 r3) {
        this.f11498 = 2;
        this.f11497 = r2;
        this.f11496 = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f11498) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ((InterfaceC3279) this.f11496).m6929();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.f11498) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((C3842) this.f11496).remove(r3);
        ((AbstractC3626) this.f11497).f12977.remove(r3);
        return;
    L6:
        C3266 r32 = (C3266) this.f11496;
        r32.f11483.mo6902(1.0f);
        C3317.m7006((View) this.f11497, r32);
        return;
    L8:
        ((InterfaceC3279) this.f11496).m6927();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f11498) {
            case 0: goto L8;
            case 1: goto L4;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        ((AbstractC3626) this.f11497).f12977.add(r2);
        return;
    L8:
        ((InterfaceC3279) this.f11496).m6928();
    }
}
