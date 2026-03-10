package p469;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: renamed from: ﾞˏ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5871 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: ʾˋ */
    public final DisplayManager f21460;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C5888 f21461;

    public C5871(C5888 r1, DisplayManager r2) {
        this.f21461 = r1;
        this.f21460 = r2;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r1) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r2) {
        if (r2 != 0) goto L5;
        Display r22 = this.f21460.getDisplay(0);
        C5888.m11548(this.f21461, r22);
        return;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r1) {
    }
}
