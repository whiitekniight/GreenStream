package androidx.leanback.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.ᵎ;

/* JADX INFO: renamed from: androidx.leanback.transition.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends ᵎ {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ int f583;

    public /* synthetic */ C0079(int r1) {
        this.f583 = r1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public float m453(FadeAndShortSlide r4, ViewGroup r5, View r6, int[] r7) {
        switch(this.f583) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int r1 = r7[0];
        int r2 = (r6.getWidth() / 2) + r1;
        r5.getLocationOnScreen(r7);
        Rect r12 = r4.getEpicenter();
        if (r12 != null) goto L9;
        int r72 = r7[0];
        int r0 = (r5.getWidth() / 2) + r72;
    L10:
        if (r2 >= r0) goto L13;
        return r6.getTranslationX() - r4.m444(r5);
    L13:
        return r6.getTranslationX() + r4.m444(r5);
    L9:
        r0 = r12.centerX();
        goto L10
    L5:
        return super.ʼˎ(r4, r5, r6, r7);
    L15:
        if (r5.getLayoutDirection() != 1) goto L18;
        return r6.getTranslationX() - r4.m444(r5);
    L18:
        return r6.getTranslationX() + r4.m444(r5);
    L20:
        if (r5.getLayoutDirection() != 1) goto L23;
        float r62 = r6.getTranslationX();
        return r4.m444(r5) + r62;
    L23:
        return r6.getTranslationX() - r4.m444(r5);
    }

    /* JADX INFO: renamed from: ˆʾ */
    public float m454(FadeAndShortSlide r2, ViewGroup r3, View r4, int[] r5) {
        switch(this.f583) {
            case 3: goto L8;
            case 4: goto L7;
            default: goto L5;
        };
    L8:
        float r42 = r4.getTranslationY();
        return r2.m443(r3) + r42;
    L5:
        return super.ˆʾ(r2, r3, r4, r5);
    L7:
        return r4.getTranslationY() - r2.m443(r3);
    }
}
