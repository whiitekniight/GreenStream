package p365;

import android.view.ActionProvider;
import ˊⁱ.ˑﹳ;

/* JADX INFO: renamed from: ᵔʾ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC4797 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final ActionProvider f16942;

    /* JADX INFO: renamed from: ﹳٴ */
    public ˑﹳ f16943;

    public ActionProviderVisibilityListenerC4797(MenuItemC4807 r1, ActionProvider r2) {
        this.f16942 = r2;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r2) {
        ˑﹳ r22 = this.f16943;
        if (r22 == null) goto L6;
        MenuC4795 r23 = ((C4812) r22.ᴵˊ).f17029;
        r23.f16909 = true;
        r23.m9437(true);
        return;
    }
}
