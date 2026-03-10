package androidx.leanback.transition;

import android.view.View;

/* JADX INFO: renamed from: androidx.leanback.transition.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C0076 extends ʼ.ᵎﹶ {

    /* JADX INFO: renamed from: ٴᵢ */
    public final /* synthetic */ int f573;

    public /* synthetic */ C0076(int r1) {
        this.f573 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final float m448(View r2) {
        switch(this.f573) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTranslationY() + r2.getHeight();
    L7:
        return r2.getTranslationY() - r2.getHeight();
    }
}
