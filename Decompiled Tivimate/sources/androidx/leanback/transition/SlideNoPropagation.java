package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class SlideNoPropagation extends Slide {
    public SlideNoPropagation(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // android.transition.Slide
    public final void setSlideEdge(int r1) {
        super.setSlideEdge(r1);
        setPropagation(null);
    }
}
