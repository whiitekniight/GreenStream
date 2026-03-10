package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionItemContainer extends AbstractC0105 {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f649;

    public GuidedActionItemContainer(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        new Rect();
        if (r4.getApplicationInfo().targetSdkVersion >= 23) goto L9;
        TypedArray r42 = r4.obtainStyledAttributes(r5, new int[]{R.attr.foreground});
        Drawable r52 = r42.getDrawable(0);
        if (r52 == null) goto L8;
        setForeground(r52);
    L8:
        r42.recycle();
    L9:
        this.f649 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r2, int r3) {
        if (this.f649 == true) goto L13;
        if (ˈˆ.ﾞᴵ.ˈٴ(this, r2) == false) goto L13;
        View r22 = super.focusSearch(r2, r3);
        if (ˈˆ.ﾞᴵ.ˈٴ(this, r22) == false) goto L10;
        return r22;
    L10:
        return null;
    L13:
        return super.focusSearch(r2, r3);
    }
}
