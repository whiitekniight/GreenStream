package androidx.leanback.transition;

import android.view.View;
import com.google.android.gms.internal.play_billing.י;

/* JADX INFO: renamed from: androidx.leanback.transition.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C0075 extends י {

    /* JADX INFO: renamed from: ᵔٴ */
    public final /* synthetic */ int f572;

    public /* synthetic */ C0075(int r1) {
        this.f572 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final float m447(View r3) {
        switch(this.f572) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L10;
            default: goto L5;
        };
    L5:
        if (r3.getLayoutDirection() != 1) goto L8;
        return r3.getTranslationX() - r3.getWidth();
    L8:
        return r3.getTranslationX() + r3.getWidth();
    L10:
        if (r3.getLayoutDirection() != 1) goto L13;
        return r3.getTranslationX() + r3.getWidth();
    L13:
        return r3.getTranslationX() - r3.getWidth();
    L15:
        return r3.getTranslationX() + r3.getWidth();
    L17:
        return r3.getTranslationX() - r3.getWidth();
    }
}
