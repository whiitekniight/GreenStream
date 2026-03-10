package p372;

import java.util.List;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ᵔٴ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4853 {

    /* JADX INFO: renamed from: ʽ */
    public List f17169;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f17170;

    /* JADX INFO: renamed from: ﹳٴ */
    public String f17171;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4853) == true) goto L8;
        return false;
    L8:
        C4853 r52 = (C4853) r5;
        if (Objects.equals(this.f17171, r52.f17171) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.f17170, r52.f17170) == false) goto L15;
        if (Objects.equals(this.f17169, r52.f17169) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f17171, this.f17170, this.f17169});
    }
}
