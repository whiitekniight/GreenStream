package p191;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ʽˑ;
import java.util.ArrayList;
import java.util.List;
import p091.C2164;
import p319.AbstractC4223;

/* JADX INFO: renamed from: ˋˋ.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3205 {

    /* JADX INFO: renamed from: ʽ */
    public long f11303;

    /* JADX INFO: renamed from: ˈ */
    public long f11304;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f11305;

    /* JADX INFO: renamed from: ⁱˊ */
    public ArrayList f11306;

    /* JADX INFO: renamed from: ﹳٴ */
    public C3225 f11307;

    /* JADX INFO: renamed from: ﾞᴵ */
    public long f11308;

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m6812(AbstractC3156 r2) {
        int r0 = r2.f11127;
        if (r2.m6726() == false) goto L6;
        return;
    L6:
        if ((r0 & 4) != 0) goto L9;
        r2.m6728();
        return;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6813(AbstractC3156 r11) {
        C3225 r0 = this.f11307;
        if (r0 == null) goto L46;
        RecyclerView r02 = r0.f11405;
        boolean r1 = true;
        r11.m6716(true);
        View r2 = r11.f11118;
        if (r11.f11122 != null) goto L7;
    L9:
        r11.f11132 = null;
        if ((r11.f11127 & 16) != 0) goto L50;
        C3149 r3 = r02.f1464;
        r02.m965();
        ʽˑ r4 = r02.f1482;
        C2164 r5 = (C2164) r4.ˈٴ;
        C3225 r6 = (C3225) r4.ʽʽ;
        int r7 = r4.ᴵˊ;
        if (r7 != 1) goto L20;
        if (((View) r4.ˊʻ) != r2) goto L18;
    L16:
        r1 = false;
    L32:
        if (r1 == false) goto L36;
        AbstractC3156 r42 = RecyclerView.m927(r2);
        r3.m6663(r42);
        r3.m6661(r42);
        if (RecyclerView.f1455 == false) goto L36;
        String r03 = "after removing animated view: " + r2 + ", " + r02;
    L36:
        r02.m971(!r1);
        if (r1 == false) goto L39;
        return;
    L39:
        if (r11.m6731() == false) goto L49;
        r02.removeDetachedView(r2, false);
        return;
    L49:
        return;
    L18:
        throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
    L20:
        if (r7 == 2) goto L45;
        r4.ᴵˊ = 2;     // Catch: Throwable -> L25
        int r72 = r6.f11405.indexOfChild(r2);     // Catch: Throwable -> L25
        if (r72 != (-1)) goto L28;
        r4.ˊˋ(r2);     // Catch: Throwable -> L25
    L24:
        r4.ᴵˊ = 0;
        goto L32
    L28:
        if (r5.m5304(r72) == false) goto L31;
        r5.m5290(r72);     // Catch: Throwable -> L25
        r4.ˊˋ(r2);     // Catch: Throwable -> L25
        r6.m6856(r72);     // Catch: Throwable -> L25
        goto L24
    L31:
        r4.ᴵˊ = 0;
    L25:
        th = move-exception;
        r4.ᴵˊ = 0;
        throw th;
    L45:
        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
    L50:
        return;
    L7:
        if (r11.f11132 != null) goto L9;
        r11.f11122 = null;
        goto L9
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6814() {
        ArrayList r0 = this.f11306;
        if (r0.size() > 0) goto L7;
        r0.clear();
        return;
    L7:
        throw AbstractC4223.m8642(0, r0);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract void m6815(AbstractC3156 r1);

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract boolean m6816();

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract void m6817();

    /* JADX INFO: renamed from: ⁱˊ */
    public abstract boolean m6818(AbstractC3156 r1, List r2);

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract void m6819();
}
