package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ˈˆ.ﾞᴵ;

/* JADX INFO: loaded from: classes.dex */
class GuidedStepRootLayout extends LinearLayout {
    public GuidedStepRootLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r3, int r4) {
        View r0 = super.focusSearch(r3, r4);
        if (r4 == 17) goto L7;
        if (r4 == 66) goto L7;
    L8:
        return r0;
    L7:
        if (ﾞᴵ.ˈٴ(this, r0) == true) goto L8;
        getLayoutDirection();
        return r3;
    }
}
