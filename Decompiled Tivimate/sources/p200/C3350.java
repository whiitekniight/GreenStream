package p200;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ˋⁱ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3350 implements InterfaceC3335 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final float f11721;

    public C3350(float r1) {
        this.f11721 = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3350) == true) goto L9;
        return false;
    L9:
        if (this.f11721 != ((C3350) r4).f11721) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11721)});
    }

    public final String toString() {
        return this.f11721 + "px";
    }

    @Override // p200.InterfaceC3335
    /* JADX INFO: renamed from: ﹳٴ */
    public final float mo7053(RectF r1) {
        return this.f11721;
    }
}
