package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p159.AbstractC2895;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC2895 {

    /* JADX INFO: renamed from: ʽ */
    public int f2537;

    /* JADX INFO: renamed from: ˈ */
    public int f2538;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f2539;

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean f2540;

    /* JADX INFO: renamed from: ﾞᴵ */
    public VelocityTracker f2541;

    public AppBarLayout$BaseBehavior() {
        this.f2537 = -1;
        this.f2539 = -1;
    }

    public AppBarLayout$BaseBehavior(Context r1, AttributeSet r2) {
        this.f2537 = -1;
        this.f2539 = -1;
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ʼᐧ */
    public final void mo2376(View r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ˆʾ */
    public final /* synthetic */ void mo2377(CoordinatorLayout r1, View r2, View r3, int r4, int r5, int[] r6, int r7) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ˉʿ */
    public final void mo2378(View r1, Parcelable r2) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ˉˆ */
    public final boolean mo2379(View r1, int r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo2380(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        throw new ClassCastException();
    }

    @Override // p159.AbstractC2895, p051.AbstractC1774
    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean mo2381(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ᵔʾ */
    public final Parcelable mo2382(View r1) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean mo2383(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ᵔﹳ */
    public final boolean mo2384(View r6, MotionEvent r7) {
        int r0 = r7.getActionMasked();
        if (r0 != 1) goto L5;
        VelocityTracker r02 = this.f2541;
        if (r02 != null) goto L33;
    L23:
        this.f2540 = false;
        this.f2537 = -1;
        VelocityTracker r62 = this.f2541;
        if (r62 == null) goto L26;
        r62.recycle();
        this.f2541 = null;
    L26:
        VelocityTracker r63 = this.f2541;
        if (r63 == null) goto L30;
        r63.addMovement(r7);
    L30:
        if (this.f2540 == true) goto L32;
    L31:
        return false;
    L32:
        return true;
    L33:
        r02.addMovement(r7);
        this.f2541.computeCurrentVelocity(1000);
        this.f2541.getYVelocity(this.f2537);
        r6.getClass();
        throw new ClassCastException();
    L5:
        if (r0 != 2) goto L7;
        int r03 = r7.findPointerIndex(this.f2537);
        if (r03 == (-1)) goto L31;
        this.f2538 = (int) r7.getY(r03);
        r6.getClass();
        throw new ClassCastException();
    L7:
        if (r0 == 3) goto L23;
        if (r0 != 6) goto L26;
        if (r7.getActionIndex() != 0) goto L14;
        int r64 = 1;
    L15:
        this.f2537 = r7.getPointerId(r64);
        this.f2538 = (int) (r7.getY(r64) + 0.5f);
        goto L26
    L14:
        r64 = 0;
        goto L15
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean mo2385(CoordinatorLayout r4, View r5, MotionEvent r6) {
        if (this.f2539 >= 0) goto L6;
        this.f2539 = ViewConfiguration.get(r4.getContext()).getScaledTouchSlop();
    L6:
        if (r6.getActionMasked() != 2) goto L20;
        if (this.f2540 == false) goto L20;
        int r42 = this.f2537;
        if (r42 == (-1)) goto L24;
        int r43 = r6.findPointerIndex(r42);
        if (r43 == (-1)) goto L24;
        int r44 = (int) r6.getY(r43);
        if (Math.abs(r44 - this.f2538) <= this.f2539) goto L20;
        this.f2538 = r44;
        return true;
    L24:
        return false;
    L20:
        if (r6.getActionMasked() == 0) goto L25;
        VelocityTracker r45 = this.f2541;
        if (r45 == null) goto L24;
        r45.addMovement(r6);
        goto L24
    L25:
        this.f2537 = -1;
        r6.getX();
        r6.getY();
        throw new ClassCastException();
    }
}
