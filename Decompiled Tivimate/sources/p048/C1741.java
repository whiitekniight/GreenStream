package p048;

import android.window.OnBackInvokedCallback;
import p341.InterfaceC4587;
import p375.LayoutInflaterFactory2C4913;

/* JADX INFO: renamed from: ʽ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1741 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ Object f5823;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5824;

    public /* synthetic */ C1741(int r1, Object r2) {
        this.f5824 = r1;
        this.f5823 = r2;
    }

    public final void onBackInvoked() {
        switch(this.f5824) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((LayoutInflaterFactory2C4913) this.f5823).m9672();
        return;
    L6:
        ((Runnable) this.f5823).run();
        return;
    L8:
        ((InterfaceC4587) this.f5823).mo716();
    }
}
