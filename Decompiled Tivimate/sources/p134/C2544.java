package p134;

import java.util.List;

/* JADX INFO: renamed from: ˈˋ.ˈⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C2544 extends AbstractC2594 {

    /* JADX INFO: renamed from: ʽ */
    public final List f9020;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f9021;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9022;

    public C2544(int r1, String r2, List r3) {
        this.f9022 = r2;
        this.f9021 = r1;
        this.f9020 = r3;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2594) == false) goto L14;
        C2544 r52 = (C2544) ((AbstractC2594) r5);
        String r1 = r52.f9022;
        if (this.f9022.equals(r1) == false) goto L14;
        if (this.f9021 != r52.f9021) goto L14;
        if (this.f9020.equals(r52.f9020) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return ((((this.f9022.hashCode() ^ 1000003) * 1000003) ^ this.f9021) * 1000003) ^ this.f9020.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f9022 + ", importance=" + this.f9021 + ", frames=" + this.f9020 + "}";
    }
}
