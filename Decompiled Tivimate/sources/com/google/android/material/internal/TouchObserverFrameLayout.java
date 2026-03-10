package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class TouchObserverFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public View.OnTouchListener f2821;

    public TouchObserverFrameLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r2) {
        View.OnTouchListener r0 = this.f2821;
        if (r0 == null) goto L6;
        r0.onTouch(this, r2);
    L6:
        return super.onInterceptTouchEvent(r2);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener r1) {
        this.f2821 = r1;
    }
}
