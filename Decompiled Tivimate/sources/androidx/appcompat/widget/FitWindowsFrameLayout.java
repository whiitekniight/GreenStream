package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149.InterfaceC2770;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    public FitWindowsFrameLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect r1) {
        return super.fitSystemWindows(r1);
    }

    public void setOnFitSystemWindowsListener(InterfaceC2770 r1) {
    }
}
