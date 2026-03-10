package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackTransportRowView extends LinearLayout {
    public PlaybackTransportRowView(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r1) {
        if (super.dispatchKeyEvent(r1) == false) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r4, int r5) {
        if (r4 == null) goto L29;
        if (r5 != 33) goto L12;
        int r0 = indexOfChild(getFocusedChild()) - 1;
    L6:
        if (r0 < 0) goto L29;
        View r1 = getChildAt(r0);
        if (r1.hasFocusable() == true) goto L9;
        r0 = r0 - 1;
        goto L6
    L9:
        return r1;
    L12:
        if (r5 != 130) goto L21;
        int r02 = indexOfChild(getFocusedChild());
    L14:
        r02 = r02 + 1;
        if (r02 >= getChildCount()) goto L29;
        View r12 = getChildAt(r02);
        if (r12.hasFocusable() == false) goto L14;
        return r12;
    L21:
        if (r5 == 17) goto L25;
        if (r5 != 66) goto L29;
    L25:
        if ((getFocusedChild() instanceof ViewGroup) == false) goto L29;
        return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), r4, r5);
    L29:
        return super.focusSearch(r4, r5);
    }

    public InterfaceC0133 getOnUnhandledKeyListener() {
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, Rect r5) {
        View r0 = findFocus();
        if (r0 != null) goto L5;
    L7:
        View r02 = findViewById(R.id.u);
        if (r02 == null) goto L15;
        if (r02.isFocusable() == false) goto L15;
        if (r02.requestFocus(r4, r5) == false) goto L15;
        return true;
    L15:
        return super.onRequestFocusInDescendants(r4, r5);
    L5:
        if (r0.requestFocus(r4, r5) == false) goto L7;
        return true;
    }

    public void setOnUnhandledKeyListener(InterfaceC0133 r1) {
    }
}
