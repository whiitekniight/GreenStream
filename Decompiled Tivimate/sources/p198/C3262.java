package p198;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ˋᵔ.ʾˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3262 extends C3288 {
    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m6896(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.f11505;
        r1.clearFlags(134217728);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(16 | r32.getSystemUiVisibility());
        return;
    L6:
        m6944(16);
    }
}
