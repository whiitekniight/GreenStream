package p191;

import android.database.Observable;

/* JADX INFO: renamed from: ˋˋ.ˉـ */
/* JADX INFO: loaded from: classes.dex */
public final class C3179 extends Observable {
    /* JADX INFO: renamed from: ʽ */
    public final void m6767(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo3782(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6768(int r3, int r4, Object r5) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo3785(r3, r4, r5);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m6769(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo3781(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m6770() {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo6743();
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6771() {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo3786();
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m6772() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m6773(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC3167) ((Observable) this).mObservers.get(r0)).mo3783(r3, r4);
        r0 = r0 - 1;
        goto L3
    }
}
