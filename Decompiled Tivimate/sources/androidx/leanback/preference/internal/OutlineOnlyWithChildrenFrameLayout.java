package androidx.leanback.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import p122.C2431;

/* JADX INFO: loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public C2431 f541;

    /* JADX INFO: renamed from: ᴵˊ */
    public ViewOutlineProvider f542;

    public OutlineOnlyWithChildrenFrameLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider r2) {
        this.f542 = r2;
        if (this.f541 != null) goto L5;
        this.f541 = new C2431(this, 1);
    L5:
        super.setOutlineProvider(this.f541);
    }
}
