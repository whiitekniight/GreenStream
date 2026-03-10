package androidx.leanback.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: androidx.leanback.transition.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0074 extends ᵎ {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ FadeAndShortSlide f571;

    public C0074(FadeAndShortSlide r1) {
        this.f571 = r1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final float m446(FadeAndShortSlide r4, ViewGroup r5, View r6, int[] r7) {
        int r1 = r7[1];
        int r2 = (r6.getHeight() / 2) + r1;
        r5.getLocationOnScreen(r7);
        Rect r12 = this.f571.getEpicenter();
        if (r12 != null) goto L5;
        int r72 = r7[1];
        int r0 = (r5.getHeight() / 2) + r72;
    L6:
        if (r2 < r0) goto L8;
        float r62 = r6.getTranslationY();
        return r4.m443(r5) + r62;
    L8:
        return r6.getTranslationY() - r4.m443(r5);
    L5:
        r0 = r12.centerY();
        goto L6
    }
}
