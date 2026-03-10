package p048;

import android.window.BackEvent;

/* JADX INFO: renamed from: ʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1751 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1751 f5866 = null;

    static {
        f5866 = new C1751();
    }

    /* JADX INFO: renamed from: ʽ */
    public final int m4565(BackEvent r1) {
        return r1.getSwipeEdge();
    }

    /* JADX INFO: renamed from: ˈ */
    public final float m4566(BackEvent r1) {
        return r1.getTouchX();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final float m4567(BackEvent r1) {
        return r1.getTouchY();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final float m4568(BackEvent r1) {
        return r1.getProgress();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final BackEvent m4569(float r2, float r3, float r4, int r5) {
        return new BackEvent(r2, r3, r4, r5);
    }
}
