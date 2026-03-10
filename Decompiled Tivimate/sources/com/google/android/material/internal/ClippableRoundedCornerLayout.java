package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public final float[] f2808;

    public ClippableRoundedCornerLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f2808 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r1) {
        super.dispatchDraw(r1);
    }

    public float[] getCornerRadii() {
        return this.f2808;
    }
}
