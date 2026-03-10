package p141;

import android.view.View;

/* JADX INFO: renamed from: ˈᐧ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2673 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        r1.removeOnAttachStateChangeListener(this);
        r1.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
    }
}
