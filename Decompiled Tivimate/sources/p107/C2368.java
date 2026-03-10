package p107;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ˆʽ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2368 implements InterfaceC2366, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final List f8472;

    public C2368(List r1) {
        this.f8472 = r1;
    }

    @Override // p107.InterfaceC2366
    public final boolean apply(Object r5) {
        int r1 = 0;
    L3:
        List r2 = this.f8472;
        if (r1 >= r2.size()) goto L9;
        if (((InterfaceC2366) r2.get(r1)).apply(r5) == false) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return false;
    L9:
        return true;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2368) == true) goto L5;
        return false;
    L5:
        return this.f8472.equals(((C2368) r2).f8472);
    }

    public final int hashCode() {
        return this.f8472.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Predicates.and(");
        Iterator r1 = this.f8472.iterator();
        boolean r2 = true;
    L4:
        if (r1.hasNext() == false) goto L9;
        Object r3 = r1.next();
        if (r2 == true) goto L8;
        r0.append(',');
    L8:
        r0.append(r3);
        r2 = false;
        goto L4
    L9:
        r0.append(')');
        return r0.toString();
    }
}
