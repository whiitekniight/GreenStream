package p404;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ⁱי.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5147 {

    /* JADX INFO: renamed from: ʽ */
    public final long f18422;

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f18423;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f18424;

    public C5147(C5159 r3) {
        this.f18424 = r3.f18488;
        this.f18423 = r3.f18487;
        this.f18422 = r3.f18486;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C5147) == true) goto L8;
        return false;
    L8:
        C5147 r82 = (C5147) r8;
        if (this.f18424 == r82.f18424) goto L11;
    L15:
        return false;
    L11:
        if (this.f18423 != r82.f18423) goto L15;
        if (this.f18422 != r82.f18422) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f18424), Float.valueOf(this.f18423), Long.valueOf(this.f18422)});
    }
}
