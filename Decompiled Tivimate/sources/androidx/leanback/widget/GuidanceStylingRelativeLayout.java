package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ar.tvplayer.p002tv.R;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public final float f640;

    public GuidanceStylingRelativeLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f640 = m539(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static float m539(Context r2) {
        TypedArray r22 = r2.getTheme().obtainStyledAttributes(AbstractC3966.f14613);
        float r0 = r22.getFloat(46, 40.0f);
        r22.recycle();
        return r0;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        super.onLayout(r4, r5, r6, r7, r8);
        View r52 = getRootView().findViewById(R.id.u);
        View r62 = getRootView().findViewById(R.id.u);
        View r72 = getRootView().findViewById(R.id.u);
        ImageView r82 = (ImageView) getRootView().findViewById(R.id.u);
        int r0 = (int) ((getMeasuredHeight() * this.f640) / 100.0f);
        if (r52 != null) goto L5;
    L14:
        if (r82 != null) goto L16;
        return;
    L16:
        if (r82.getParent() == this) goto L18;
        return;
    L18:
        if (r82.getDrawable() == null) goto L23;
        r82.offsetTopAndBottom(r0 - (r82.getMeasuredHeight() / 2));
        return;
    L23:
        return;
    L5:
        if (r52.getParent() != this) goto L14;
        int r1 = (((r0 - r52.getBaseline()) - r62.getMeasuredHeight()) - r52.getPaddingTop()) - r62.getTop();
        if (r62.getParent() != this) goto L9;
        r62.offsetTopAndBottom(r1);
    L9:
        r52.offsetTopAndBottom(r1);
        if (r72 == null) goto L14;
        if (r72.getParent() != this) goto L14;
        r72.offsetTopAndBottom(r1);
        goto L14
    }
}
