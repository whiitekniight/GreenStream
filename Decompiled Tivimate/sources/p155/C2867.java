package p155;

import android.content.res.Resources;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˉٴ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2867 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Resources.Theme f10155;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Resources f10156;

    public C2867(Resources r1, Resources.Theme r2) {
        this.f10156 = r1;
        this.f10155 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C2867.class != r5.getClass()) goto L15;
        C2867 r52 = (C2867) r5;
        if (this.f10156.equals(r52.f10156) == false) goto L15;
        if (Objects.equals(this.f10155, r52.f10155) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f10156, this.f10155});
    }
}
