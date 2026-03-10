package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.media3.p001ui.AspectRatioFrameLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;
import p017.C1316;
import p056.C1821;
import p242.AbstractC3626;
import p393.C5030;
import p393.C5032;

/* JADX INFO: renamed from: androidx.leanback.widget.ᵔٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0145 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ Object f999;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f1000;

    public /* synthetic */ C0145(int r1, Object r2) {
        this.f1000 = r1;
        this.f999 = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f1000) {
            case 5: goto L8;
            case 6: goto L4;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ((AspectRatioFrameLayout) this.f999).f1257 = null;
        return;
    L8:
        ActionBarOverlayLayout r22 = (ActionBarOverlayLayout) this.f999;
        r22.f122 = null;
        r22.f118 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        switch(this.f1000) {
            case 0: goto L23;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((AspectRatioFrameLayout) this.f999).f1257 = null;
        return;
    L6:
        ((AbstractC3626) this.f999).m7610();
        r5.removeListener(this);
        return;
    L8:
        ActionBarOverlayLayout r52 = (ActionBarOverlayLayout) this.f999;
        r52.f122 = null;
        r52.f118 = false;
        return;
    L10:
        ((HideViewOnScrollBehavior) this.f999).f2565 = null;
        return;
    L12:
        ((HideBottomViewOnScrollBehavior) this.f999).f2554 = null;
        return;
    L14:
        C1821 r53 = (C1821) this.f999;
        r53.m4722();
        r53.f6115.start();
        return;
    L16:
        C1316 r0 = (C1316) this.f999;
        ArrayList r54 = new ArrayList(r0.f4513);
        int r1 = r54.size();
        int r2 = 0;
    L17:
        if (r2 >= r1) goto L22;
        ColorStateList r3 = ((C5032) r54.get(r2)).f18000.f17981;
        if (r3 == null) goto L21;
        r0.setTintList(r3);
    L21:
        r2 = r2 + 1;
        goto L17
    L22:
        return;
    L23:
        ((C0102) this.f999).f893 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r7) {
        switch(this.f1000) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r7);
        return;
    L6:
        C1316 r0 = (C1316) this.f999;
        ArrayList r72 = new ArrayList(r0.f4513);
        int r1 = r72.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L12;
        C5030 r3 = ((C5032) r72.get(r2)).f18000;
        ColorStateList r4 = r3.f17981;
        if (r4 == null) goto L11;
        r0.setTint(r4.getColorForState(r3.f17979, r4.getDefaultColor()));
    L11:
        r2 = r2 + 1;
        goto L7
    }
}
