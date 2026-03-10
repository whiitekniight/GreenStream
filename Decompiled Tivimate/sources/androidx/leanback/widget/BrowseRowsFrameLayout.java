package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class BrowseRowsFrameLayout extends FrameLayout {
    public BrowseRowsFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View r4, int r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
        int r1 = getPaddingLeft();
        int r52 = ViewGroup.getChildMeasureSpec(r5, (getPaddingRight() + r1) + r6, r0.width);
        int r62 = getPaddingTop();
        r4.measure(r52, ViewGroup.getChildMeasureSpec(r7, (getPaddingBottom() + r62) + r8, r0.height));
    }
}
