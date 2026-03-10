package androidx.leanback.transition;

import android.transition.Transition;
import androidx.leanback.widget.C0118;

/* JADX INFO: renamed from: androidx.leanback.transition.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C0078 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ Object f581;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f582;

    public /* synthetic */ C0078(int r1, Object r2) {
        this.f582 = r1;
        this.f581 = r2;
    }

    /* JADX INFO: renamed from: ʽ */
    private final void m449(Transition r1) {
    }

    /* JADX INFO: renamed from: ˈ */
    private final void m450(Transition r1) {
    }

    /* JADX INFO: renamed from: ⁱˊ */
    private final void m451(Transition r1) {
    }

    /* JADX INFO: renamed from: ﹳٴ */
    private final void m452(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition r1) {
        switch(this.f582) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ﹳי.ʽ) this.f581).getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition r2) {
        switch(this.f582) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) this.f581).run();
        return;
    L6:
        ((C0118) ((ﹳי.ʽ) this.f581).ʾˋ).f938 = null;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition r1) {
        switch(this.f582) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ﹳי.ʽ) this.f581).getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition r1) {
        switch(this.f582) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ﹳי.ʽ) this.f581).getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition r1) {
        switch(this.f582) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ﹳי.ʽ) this.f581).getClass();
    }
}
