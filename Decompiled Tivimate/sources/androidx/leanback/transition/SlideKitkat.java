package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import ar.tvplayer.p002tv.R;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* JADX INFO: renamed from: ʽʽ */
    public static final AccelerateInterpolator f553 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final C0075 f554 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final C0075 f555 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final C0075 f556 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final C0076 f557 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final DecelerateInterpolator f558 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final C0076 f559 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final C0075 f560 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC0081 f561;

    static {
        f558 = new DecelerateInterpolator();
        f553 = new AccelerateInterpolator();
        f554 = new C0075(0);
        f559 = new C0076(0);
        f556 = new C0075(1);
        f557 = new C0076(1);
        f555 = new C0075(2);
        f560 = new C0075(3);
    }

    public SlideKitkat(Context r7, AttributeSet r8) {
        TypedArray r82 = r7.obtainStyledAttributes(r8, AbstractC3966.f14611);
        int r2 = r82.getInt(3, 80);
        if (r2 != 3) goto L5;
        this.f561 = f554;
    L21:
        long r22 = r82.getInt(1, -1);
        if (r22 < 0) goto L24;
        setDuration(r22);
    L24:
        long r0 = r82.getInt(2, -1);
        if (r0 <= 0) goto L27;
        setStartDelay(r0);
    L27:
        int r02 = r82.getResourceId(0, 0);
        if (r02 <= 0) goto L30;
        setInterpolator(AnimationUtils.loadInterpolator(r7, r02));
    L30:
        r82.recycle();
        return;
    L5:
        if (r2 != 5) goto L7;
        this.f561 = f556;
        goto L21
    L7:
        if (r2 == 48) goto L18;
        if (r2 != 80) goto L10;
        this.f561 = f557;
        goto L21
    L10:
        if (r2 != 8388611) goto L12;
        this.f561 = f555;
        goto L21
    L12:
        if (r2 != 8388613) goto L15;
        this.f561 = f560;
        goto L21
    L15:
        throw new IllegalArgumentException("Invalid slide direction");
    L18:
        this.f561 = f559;
        goto L21
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static ObjectAnimator m445(View r6, Property r7, float r8, float r9, float r10, TimeInterpolator r11, int r12) {
        float[] r1 = (float[]) r6.getTag(R.id.u);
        if (r1 != null) goto L5;
    L9:
        ObjectAnimator r82 = ObjectAnimator.ofFloat(r6, r7, new float[]{r8, r9});
        C0077 r0 = new C0077(r6, r7, r10, r9, r12);
        r82.addListener(r0);
        r82.addPauseListener(r0);
        r82.setInterpolator(r11);
        return r82;
    L5:
        if (View.TRANSLATION_Y != r7) goto L7;
        r8 = r1[1];
    L8:
        r6.setTag(R.id.u, null);
        goto L9
    L7:
        r8 = r1[0];
        goto L8
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup r8, TransitionValues r9, int r10, TransitionValues r11, int r12) {
        if (r11 == null) goto L5;
        View r0 = r11.view;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        float r3 = this.f561.m455(r0);
        return m445(r0, this.f561.m456(), this.f561.m457(r0), r3, r3, f558, 0);
    L5:
        r0 = null;
        goto L6
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup r8, TransitionValues r9, int r10, TransitionValues r11, int r12) {
        if (r9 == null) goto L5;
        View r0 = r9.view;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        float r2 = this.f561.m455(r0);
        return m445(r0, this.f561.m456(), r2, this.f561.m457(r0), r2, f553, 4);
    L5:
        r0 = null;
        goto L6
    }
}
