package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public View.OnKeyListener f587;

    /* JADX INFO: renamed from: ʾˋ */
    public InterfaceC0099 f588;

    /* JADX INFO: renamed from: ᴵˊ */
    public InterfaceC0086 f589;

    public BrowseFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r4) {
        boolean r0 = super.dispatchKeyEvent(r4);
        View.OnKeyListener r1 = this.f587;
        if (r1 == null) goto L7;
        if (r0 == true) goto L7;
        return r1.onKey(getRootView(), r4.getKeyCode(), r4);
    L7:
        return r0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r2, int r3) {
        InterfaceC0099 r0 = this.f588;
        if (r0 == null) goto L8;
        View r02 = r0.m589(r2, r3);
        if (r02 == null) goto L8;
        return r02;
    L8:
        return super.focusSearch(r2, r3);
    }

    public InterfaceC0086 getOnChildFocusListener() {
        return this.f589;
    }

    public InterfaceC0099 getOnFocusSearchListener() {
        return this.f588;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, Rect r3) {
        InterfaceC0086 r0 = this.f589;
        if (r0 == null) goto L7;
        r0.m572(r2, r3);
        return true;
    L7:
        return super.onRequestFocusInDescendants(r2, r3);
    }

    public void setOnChildFocusListener(InterfaceC0086 r1) {
        this.f589 = r1;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener r1) {
        this.f587 = r1;
    }

    public void setOnFocusSearchListener(InterfaceC0099 r1) {
        this.f588 = r1;
    }
}
