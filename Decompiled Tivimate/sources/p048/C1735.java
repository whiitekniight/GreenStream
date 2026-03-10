package p048;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ʽ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C1735 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1735 f5807 = null;

    static {
        f5807 = new C1735();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m4548(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r2);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m4549(Object r1, int r2, Object r3) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(r2, (OnBackInvokedCallback) r3);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final OnBackInvokedCallback m4550(InterfaceC4587 r3) {
        return new C1741(0, r3);
    }
}
