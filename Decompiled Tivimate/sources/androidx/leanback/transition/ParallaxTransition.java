package androidx.leanback.transition;

import android.animation.Animator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public class ParallaxTransition extends Visibility {
    static {
        new LinearInterpolator();
    }

    public ParallaxTransition(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup r1, View r2, TransitionValues r3, TransitionValues r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        if (r2.getTag(R.id.u) != null) goto L9;
        return null;
    L9:
        throw new ClassCastException();
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup r1, View r2, TransitionValues r3, TransitionValues r4) {
        if (r3 != null) goto L5;
        return null;
    L5:
        if (r2.getTag(R.id.u) != null) goto L9;
        return null;
    L9:
        throw new ClassCastException();
    }
}
