package p134;

import java.util.List;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2571 extends AbstractC2560 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9114;

    /* JADX INFO: renamed from: ﹳٴ */
    public final List f9115;

    public C2571(String r1, List r2) {
        this.f9115 = r2;
        this.f9114 = r1;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2560) == false) goto L16;
        C2571 r52 = (C2571) ((AbstractC2560) r5);
        String r1 = r52.f9114;
        List r53 = r52.f9115;
        if (this.f9115.equals(r53) == false) goto L16;
        String r54 = this.f9114;
        if (r54 != null) goto L14;
        if (r1 != null) goto L16;
    L15:
        return true;
    L14:
        if (r54.equals(r1) == true) goto L15;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f9115.hashCode() ^ 1000003) * 1000003;
        String r1 = this.f9114;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r0 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("FilesPayload{files=");
        r0.append(this.f9115);
        r0.append(", orgId=");
        return AbstractC1703.m4486(r0, this.f9114, "}");
    }
}
