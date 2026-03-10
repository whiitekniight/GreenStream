package p198;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import ᴵˋ.ˊʻ;
import ﹳˋ.ʼˎ;

/* JADX INFO: renamed from: ˋᵔ.ˑ */
/* JADX INFO: loaded from: classes.dex */
public class C3284 extends ˊʻ {

    /* JADX INFO: renamed from: ʽ */
    public final WindowInsetsController f11494;

    /* JADX INFO: renamed from: ˈ */
    public final Window f11495;

    public C3284(Window r2, ʼˎ r3) {
        WindowInsetsController r32 = r2.getInsetsController();
        super(10);
        this.f11494 = r32;
        this.f11495 = r2;
    }

    /* JADX INFO: renamed from: ٴʼ */
    public final void m6942(boolean r3) {
        Window r0 = this.f11495;
        if (r3 == false) goto L8;
        if (r0 == null) goto L6;
        View r32 = r0.getDecorView();
        r32.setSystemUiVisibility(r32.getSystemUiVisibility() | 8192);
    L6:
        this.f11494.setSystemBarsAppearance(8, 8);
        return;
    L8:
        if (r0 == null) goto L10;
        View r33 = r0.getDecorView();
        r33.setSystemUiVisibility(r33.getSystemUiVisibility() & (-8193));
    L10:
        this.f11494.setSystemBarsAppearance(0, 8);
    }

    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m6943(boolean r3) {
        Window r0 = this.f11495;
        if (r3 == false) goto L8;
        if (r0 == null) goto L6;
        View r32 = r0.getDecorView();
        r32.setSystemUiVisibility(r32.getSystemUiVisibility() | 16);
    L6:
        this.f11494.setSystemBarsAppearance(16, 16);
        return;
    L8:
        if (r0 == null) goto L10;
        View r33 = r0.getDecorView();
        r33.setSystemUiVisibility(r33.getSystemUiVisibility() & (-17));
    L10:
        this.f11494.setSystemBarsAppearance(0, 16);
    }
}
