package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ControlBar extends LinearLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public int f592;

    /* JADX INFO: renamed from: ᴵˊ */
    public final boolean f593;

    public ControlBar(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f592 = -1;
        this.f593 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList r2, int r3, int r4) {
        if (r3 != 33) goto L5;
    L9:
        int r32 = this.f592;
        if (r32 < 0) goto L16;
        if (r32 >= getChildCount()) goto L16;
        r2.add(getChildAt(this.f592));
        return;
    L16:
        if (getChildCount() > 0) goto L18;
        return;
    L18:
        if (this.f593 == false) goto L20;
        int r33 = getChildCount() / 2;
    L21:
        r2.add(getChildAt(r33));
        return;
    L20:
        r33 = 0;
        goto L21
    L5:
        if (r3 == 130) goto L9;
        super.addFocusables(r2, r3, r4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r3, Rect r4) {
        if (getChildCount() <= 0) goto L18;
        int r0 = this.f592;
        if (r0 < 0) goto L10;
        if (r0 >= getChildCount()) goto L10;
        int r02 = this.f592;
    L14:
        if (getChildAt(r02).requestFocus(r3, r4) == false) goto L18;
        return true;
    L10:
        if (this.f593 == false) goto L12;
        r02 = getChildCount() / 2;
        goto L14
    L12:
        r02 = 0;
    L18:
        return super.onRequestFocusInDescendants(r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r1, View r2) {
        super.requestChildFocus(r1, r2);
        this.f592 = indexOfChild(r1);
    }
}
