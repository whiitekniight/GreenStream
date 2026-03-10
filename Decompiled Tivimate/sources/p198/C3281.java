package p198;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ˋᵔ.ˋᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C3281 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final WeakReference f11492;

    public C3281(View r2) {
        this.f11492 = new WeakReference(r2);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6937(long r2) {
        View r0 = (View) this.f11492.get();
        if (r0 == null) goto L6;
        r0.animate().setDuration(r2);
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6938(InterfaceC3279 r5) {
        View r0 = (View) this.f11492.get();
        if (r0 == null) goto L9;
        if (r5 == null) goto L7;
        r0.animate().setListener(new C3286(r5, r0, 0));
        return;
    L7:
        r0.animate().setListener(null);
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m6939(float r2) {
        View r0 = (View) this.f11492.get();
        if (r0 == null) goto L6;
        r0.animate().translationY(r2);
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6940() {
        View r0 = (View) this.f11492.get();
        if (r0 == null) goto L6;
        r0.animate().cancel();
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6941(float r2) {
        View r0 = (View) this.f11492.get();
        if (r0 == null) goto L6;
        r0.animate().alpha(r2);
        return;
    }
}
