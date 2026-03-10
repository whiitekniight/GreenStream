package p440;

import java.util.Arrays;

/* JADX INFO: renamed from: ﹶʽ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5545 {

    /* JADX INFO: renamed from: ⁱˊ */
    public int f19994;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC5550[] f19995;

    public C5545(InterfaceC5550... r1) {
        this.f19995 = r1;
        int r12 = r1.length;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C5545.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Arrays.equals(this.f19995, ((C5545) r3).f19995);
    }

    public final int hashCode() {
        if (this.f19994 != 0) goto L6;
        this.f19994 = 527 + Arrays.hashCode(this.f19995);
    L6:
        return this.f19994;
    }
}
