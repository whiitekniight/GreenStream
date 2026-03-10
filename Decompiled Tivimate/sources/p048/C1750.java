package p048;

import android.window.BackEvent;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ʽ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1750 {

    /* JADX INFO: renamed from: ʽ */
    public final float f5862;

    /* JADX INFO: renamed from: ˈ */
    public final int f5863;

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f5864;

    /* JADX INFO: renamed from: ﹳٴ */
    public final float f5865;

    public C1750(BackEvent r5) {
        C1751 r0 = C1751.f5866;
        float r1 = r0.m4566(r5);
        float r2 = r0.m4567(r5);
        float r3 = r0.m4568(r5);
        int r52 = r0.m4565(r5);
        this.f5865 = r1;
        this.f5864 = r2;
        this.f5862 = r3;
        this.f5863 = r52;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("BackEventCompat{touchX=");
        r0.append(this.f5865);
        r0.append(", touchY=");
        r0.append(this.f5864);
        r0.append(", progress=");
        r0.append(this.f5862);
        r0.append(", swipeEdge=");
        return AbstractC1703.m4495(r0, this.f5863, '}');
    }
}
