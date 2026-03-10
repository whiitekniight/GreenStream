package p048;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p341.InterfaceC4587;
import p341.InterfaceC4589;

/* JADX INFO: renamed from: ʽ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1749 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ InterfaceC4587 f5858;

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ InterfaceC4587 f5859;

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ InterfaceC4589 f5860;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ InterfaceC4589 f5861;

    public C1749(InterfaceC4589 r1, InterfaceC4589 r2, InterfaceC4587 r3, InterfaceC4587 r4) {
        this.f5861 = r1;
        this.f5860 = r2;
        this.f5858 = r3;
        this.f5859 = r4;
    }

    public final void onBackCancelled() {
        this.f5859.mo716();
    }

    public final void onBackInvoked() {
        this.f5858.mo716();
    }

    public final void onBackProgressed(BackEvent r2) {
        C1750 r0 = new C1750(r2);
        this.f5860.mo4555(r0);
    }

    public final void onBackStarted(BackEvent r2) {
        C1750 r0 = new C1750(r2);
        this.f5861.mo4555(r0);
    }
}
