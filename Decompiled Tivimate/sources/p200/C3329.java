package p200;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ˋⁱ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3329 implements InterfaceC3335 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final float f11634;

    public C3329(float r1) {
        this.f11634 = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3329) == true) goto L9;
        return false;
    L9:
        if (this.f11634 != ((C3329) r4).f11634) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11634)});
    }

    @Override // p200.InterfaceC3335
    /* JADX INFO: renamed from: ﹳٴ */
    public final float mo7053(RectF r4) {
        float r42 = Math.min(r4.width() / 2.0f, r4.height() / 2.0f);
        float r0 = this.f11634;
        if (r0 >= 0.0f) goto L6;
        return 0.0f;
    L6:
        if (r0 <= r42) goto L8;
        return r42;
    L8:
        return r0;
    }
}
