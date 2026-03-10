package p198;

import android.view.View;
import android.view.Window;
import ᴵˋ.ˊʻ;
import ﹳˋ.ʼˎ;

/* JADX INFO: renamed from: ˋᵔ.י */
/* JADX INFO: loaded from: classes.dex */
public class C3288 extends ˊʻ {

    /* JADX INFO: renamed from: ʽ */
    public final Window f11505;

    public C3288(Window r1, ʼˎ r2) {
        super(10);
        this.f11505 = r1;
    }

    /* JADX INFO: renamed from: ʼˈ */
    public final void m6944(int r3) {
        View r0 = this.f11505.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        r0.setSystemUiVisibility((~r3) & r1);
    }

    /* JADX INFO: renamed from: ٴʼ */
    public final void m6945(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.f11505;
        r1.clearFlags(67108864);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(8192 | r32.getSystemUiVisibility());
        return;
    L6:
        m6944(8192);
    }
}
