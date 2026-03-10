package p032;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import ʻʿ.ˈ;
import ﹳי.ʽ;

/* JADX INFO: renamed from: ʼˈ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C1508 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ ˈ f5001;

    public C1508(InputConnection r1, ˈ r2) {
        this.f5001 = r2;
        super(r1, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r4, int r5, Bundle r6) {
        ʽ r0 = null;
        if (r4 == null) goto L10;
        if (Build.VERSION.SDK_INT < 25) goto L10;
        r0 = new ʽ(new C1510(r4));
    L10:
        if (this.f5001.ᵔʾ(r0, r5, r6) == false) goto L14;
        return true;
    L14:
        return super.commitContent(r4, r5, r6);
    }
}
