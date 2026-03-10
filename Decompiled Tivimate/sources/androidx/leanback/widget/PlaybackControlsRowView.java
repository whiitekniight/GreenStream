package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
class PlaybackControlsRowView extends LinearLayout {
    public PlaybackControlsRowView(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r1) {
        if (super.dispatchKeyEvent(r1) == false) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, Rect r3) {
        View r0 = findFocus();
        if (r0 == null) goto L9;
        if (r0.requestFocus(r2, r3) == false) goto L9;
        return true;
    L9:
        return super.onRequestFocusInDescendants(r2, r3);
    }
}
