package p198;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ˋᵔ.ـᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3292 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static int m6946(int r4) {
        int r0 = 0;
        int r2 = 1;
    L4:
        if (r2 > 512) goto L33;
        if ((r4 & r2) == 0) goto L32;
        if (r2 != 1) goto L9;
        int r3 = WindowInsets.Type.statusBars();
    L24:
        r0 = r0 | r3;
        goto L32
    L9:
        if (r2 != 2) goto L11;
        r3 = WindowInsets.Type.navigationBars();
        goto L24
    L11:
        if (r2 != 4) goto L13;
        r3 = WindowInsets.Type.captionBar();
        goto L24
    L13:
        if (r2 != 8) goto L15;
        r3 = WindowInsets.Type.ime();
        goto L24
    L15:
        if (r2 != 16) goto L17;
        r3 = WindowInsets.Type.systemGestures();
        goto L24
    L17:
        if (r2 != 32) goto L19;
        r3 = WindowInsets.Type.mandatorySystemGestures();
        goto L24
    L19:
        if (r2 != 64) goto L21;
        r3 = WindowInsets.Type.tappableElement();
        goto L24
    L21:
        if (r2 != 128) goto L32;
        r3 = WindowInsets.Type.displayCutout();
    L32:
        r2 = r2 << 1;
        goto L4
    L33:
        return r0;
    }
}
