package androidx.leanback.transition;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.leanback.transition.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0080 extends ChangeBounds {

    /* JADX INFO: renamed from: ʽʽ */
    public final HashMap f584;

    /* JADX INFO: renamed from: ʾˋ */
    public final HashMap f585;

    /* JADX INFO: renamed from: ᴵˊ */
    public final SparseIntArray f586;

    public C0080() {
        this.f585 = new HashMap();
        this.f586 = new SparseIntArray();
        this.f584 = new HashMap();
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup r3, TransitionValues r4, TransitionValues r5) {
        Animator r32 = super.createAnimator(r3, r4, r5);
        if (r32 == null) goto L18;
        if (r5 == null) goto L18;
        View r42 = r5.view;
        if (r42 == null) goto L18;
        Integer r52 = (Integer) this.f585.get(r42);
        if (r52 == null) goto L10;
        int r43 = r52.intValue();
    L17:
        r32.setStartDelay(r43);
        goto L18
    L10:
        int r53 = this.f586.get(r42.getId(), -1);
        if (r53 == (-1)) goto L13;
        r43 = r53;
        goto L17
    L13:
        Integer r44 = (Integer) this.f584.get(r42.getClass().getName());
        if (r44 == null) goto L16;
        r43 = r44.intValue();
        goto L17
    L16:
        r43 = 0;
    L18:
        return r32;
    }
}
