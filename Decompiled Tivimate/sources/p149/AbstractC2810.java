package p149;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p005j$.util.Objects;
import p048.C1741;

/* JADX INFO: renamed from: ˉˆ.ᵔⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2810 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6130(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6131(Object r0, Object r1) {
        ((OnBackInvokedDispatcher) r0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static OnBackInvokedCallback m6132(Runnable r2) {
        Objects.requireNonNull(r2);
        return new C1741(1, r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static OnBackInvokedDispatcher m6133(View r0) {
        return r0.findOnBackInvokedDispatcher();
    }
}
