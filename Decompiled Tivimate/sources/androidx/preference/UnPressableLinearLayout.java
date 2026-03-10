package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean r1) {
    }
}
