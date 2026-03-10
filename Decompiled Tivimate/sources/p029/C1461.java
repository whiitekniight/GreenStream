package p029;

import com.parse.ʼᐧ;
import java.io.Serializable;

/* JADX INFO: renamed from: ʼʻ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C1461 extends AbstractC1438 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final ʼᐧ f4890;

    public C1461(ʼᐧ r1) {
        this.f4890 = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        return this.f4890.compare(r2, r3);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof C1461) == true) goto L8;
        return false;
    L8:
        return this.f4890.equals(((C1461) r2).f4890);
    }

    public final int hashCode() {
        return this.f4890.hashCode();
    }

    public final String toString() {
        return this.f4890.toString();
    }
}
