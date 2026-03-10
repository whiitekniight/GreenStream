package androidx.leanback.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class LeanbackSettingsRootView extends FrameLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public View.OnKeyListener f540;

    public LeanbackSettingsRootView(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r5) {
        if (r5.getAction() == 1) goto L5;
    L9:
        boolean r0 = false;
    L10:
        if (r0 == false) goto L12;
    L15:
        return true;
    L12:
        if (super.dispatchKeyEvent(r5) == true) goto L15;
        return false;
    L5:
        if (r5.getKeyCode() != 4) goto L9;
        View.OnKeyListener r02 = this.f540;
        if (r02 == null) goto L9;
        r0 = r02.onKey(this, r5.getKeyCode(), r5);
        goto L10
    }

    public void setOnBackKeyListener(View.OnKeyListener r1) {
        this.f540 = r1;
    }
}
