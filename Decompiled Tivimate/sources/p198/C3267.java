package p198;

import android.view.DisplayCutout;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˋᵔ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C3267 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final DisplayCutout f11484;

    public C3267(DisplayCutout r1) {
        this.f11484 = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C3267.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Objects.equals(this.f11484, ((C3267) r3).f11484);
    }

    public final int hashCode() {
        DisplayCutout r0 = this.f11484;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f11484 + "}";
    }
}
