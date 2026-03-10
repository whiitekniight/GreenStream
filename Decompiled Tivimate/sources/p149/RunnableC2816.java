package p149;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: ˉˆ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2816 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f10015;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ ActionBarOverlayLayout f10016;

    public /* synthetic */ RunnableC2816(ActionBarOverlayLayout r1, int r2) {
        this.f10015 = r2;
        this.f10016 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f10015) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ActionBarOverlayLayout r0 = this.f10016;
        r0.m47();
        r0.f122 = r0.f109.animate().translationY(-r0.f109.getHeight()).setListener(r0.f111);
        return;
    L6:
        ActionBarOverlayLayout r02 = this.f10016;
        r02.m47();
        r02.f122 = r02.f109.animate().translationY(0.0f).setListener(r02.f111);
    }
}
