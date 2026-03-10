package p015;

import android.view.View;
import p191.AbstractC3156;

/* JADX INFO: renamed from: ʻʿ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 {

    /* JADX INFO: renamed from: ⁱˊ */
    public int f4206;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f4207;

    public /* synthetic */ C1264(int r1, int r2) {
        this.f4207 = r1;
        this.f4206 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m3587(AbstractC3156 r2) {
        View r22 = r2.f11118;
        this.f4207 = r22.getLeft();
        this.f4206 = r22.getTop();
        r22.getRight();
        r22.getBottom();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public int m3588() {
        int r0 = this.f4206;
        if (r0 != 2) goto L5;
        return 10;
    L5:
        if (r0 != 5) goto L7;
        return 11;
    L7:
        if (r0 != 29) goto L9;
        return 12;
    L9:
        if (r0 != 42) goto L11;
        return 16;
    L11:
        if (r0 != 22) goto L13;
        return 1073741824;
    L13:
        if (r0 == 23) goto L16;
        return 0;
    L16:
        return 15;
    }
}
