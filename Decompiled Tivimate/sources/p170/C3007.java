package p170;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.leanback.widget.ˉˆ;
import java.util.List;

/* JADX INFO: renamed from: ˊˋ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public class C3007 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ﹳٴ */
    public final ˉˆ f10557;

    public C3007(ˉˆ r1) {
        this.f10557 = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
        C3018 r22 = this.f10557.ٴﹶ(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f10575;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String r1, int r2) {
        this.f10557.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r2) {
        C3018 r22 = this.f10557.ʼᐧ(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.f10575;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, Bundle r4) {
        return this.f10557.ـˆ(r2, r3, r4);
    }
}
