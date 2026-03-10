package p320;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᐧٴ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C4239 extends AbstractC4246 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final ArrayList f15561;

    public C4239(ArrayList r1) {
        this.f15561 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC4246) == false) goto L9;
        ArrayList r22 = ((C4239) ((AbstractC4246) r2)).f15561;
        return this.f15561.equals(r22);
    L9:
        return false;
    }

    public final int hashCode() {
        return this.f15561.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f15561 + "}";
    }
}
