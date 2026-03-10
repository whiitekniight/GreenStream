package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p051.C1770;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    public FabTransformationBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // p051.AbstractC1774
    /* JADX INFO: renamed from: ʽ */
    public final void mo2401(C1770 r2) {
        if (r2.f5921 != 0) goto L6;
        r2.f5921 = 80;
        return;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p051.AbstractC1774
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo2388(View r2) {
        if (r2.getVisibility() == 8) goto L6;
        return;
    L6:
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }
}
