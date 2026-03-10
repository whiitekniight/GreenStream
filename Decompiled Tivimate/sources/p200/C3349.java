package p200;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ˋⁱ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3349 implements InterfaceC3335 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f11719;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC3335 f11720;

    public C3349(float r2, InterfaceC3335 r3) {
    L4:
        if ((r3 instanceof C3349) == false) goto L6;
        r3 = ((C3349) r3).f11720;
        r2 = r2 + ((C3349) r3).f11719;
        goto L4
    L6:
        this.f11720 = r3;
        this.f11719 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3349) == true) goto L8;
        return false;
    L8:
        C3349 r52 = (C3349) r5;
        if (this.f11720.equals(r52.f11720) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f11719 != r52.f11719) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11720, Float.valueOf(this.f11719)});
    }

    @Override // p200.InterfaceC3335
    /* JADX INFO: renamed from: ﹳٴ */
    public final float mo7053(RectF r2) {
        return Math.max(0.0f, this.f11720.mo7053(r2) + this.f11719);
    }
}
