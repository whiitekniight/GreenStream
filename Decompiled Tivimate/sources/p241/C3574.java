package p241;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ˑʼ.ˈˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C3574 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ ArrayList f12721;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ View f12722;

    public C3574(View r1, ArrayList r2) {
        this.f12722 = r1;
        this.f12721 = r2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition r5) {
        r5.removeListener(this);
        this.f12722.setVisibility(8);
        ArrayList r52 = this.f12721;
        int r0 = r52.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        ((View) r52.get(r2)).setVisibility(0);
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition r1) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition r1) {
        r1.removeListener(this);
        r1.addListener(this);
    }
}
