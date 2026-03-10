package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p051.AbstractC1774;
import p051.C1770;
import p271.AbstractC3882;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC1774 {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context r2, AttributeSet r3) {
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC3882.f14234);
        r22.getBoolean(0, true);
        r22.recycle();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ʽ */
    public final void mo2401(C1770 r2) {
        if (r2.f5921 != 0) goto L6;
        r2.f5921 = 80;
        return;
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ˈ */
    public final boolean mo2387(CoordinatorLayout r1, View r2, View r3) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean mo2381(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo2474(View r1) {
        throw new ClassCastException();
    }
}
