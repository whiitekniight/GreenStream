package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: androidx.leanback.widget.ˈⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0105 extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == true) goto L8;
        if (r2 == null) goto L10;
        return false;
    L10:
        return true;
    L8:
        return true;
    }
}
