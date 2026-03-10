package p198;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: ˋᵔ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3314 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ʽʽ */
    public final Runnable f11567;

    /* JADX INFO: renamed from: ʾˋ */
    public final View f11568;

    /* JADX INFO: renamed from: ᴵˊ */
    public ViewTreeObserver f11569;

    public ViewTreeObserverOnPreDrawListenerC3314(View r1, Runnable r2) {
        this.f11568 = r1;
        this.f11569 = r1.getViewTreeObserver();
        this.f11567 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m7000(View r1, Runnable r2) {
        if (r1 == null) goto L6;
        ViewTreeObserverOnPreDrawListenerC3314 r0 = new ViewTreeObserverOnPreDrawListenerC3314(r1, r2);
        r1.getViewTreeObserver().addOnPreDrawListener(r0);
        r1.addOnAttachStateChangeListener(r0);
        return;
    L6:
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean r0 = this.f11569.isAlive();
        View r1 = this.f11568;
        if (r0 == false) goto L5;
        this.f11569.removeOnPreDrawListener(this);
    L6:
        r1.removeOnAttachStateChangeListener(this);
        this.f11567.run();
        return true;
    L5:
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.f11569 = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        boolean r22 = this.f11569.isAlive();
        View r0 = this.f11568;
        if (r22 == false) goto L5;
        this.f11569.removeOnPreDrawListener(this);
    L6:
        r0.removeOnAttachStateChangeListener(this);
        return;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }
}
