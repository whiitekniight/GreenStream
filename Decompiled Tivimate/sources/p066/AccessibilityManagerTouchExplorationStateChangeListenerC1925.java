package p066;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p051.AbstractC1774;

/* JADX INFO: renamed from: ʽᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC1925 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ AbstractC1774 f6564;

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ View f6565;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f6566;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC1925(AbstractC1774 r1, View r2, int r3) {
        this.f6566 = r3;
        this.f6564 = r1;
        this.f6565 = r2;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
        switch(this.f6566) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        HideViewOnScrollBehavior r0 = (HideViewOnScrollBehavior) this.f6564;
        if (r3 == true) goto L7;
        return;
    L7:
        if (r0.f2562 != 1) goto L17;
        r0.m2393(this.f6565);
        return;
    L17:
        return;
    L10:
        HideBottomViewOnScrollBehavior r02 = (HideBottomViewOnScrollBehavior) this.f6564;
        if (r3 == true) goto L13;
        return;
    L13:
        if (r02.f2551 != 1) goto L19;
        r02.m2392(this.f6565);
        return;
    }
}
