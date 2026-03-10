package p029;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p107.InterfaceC2366;

/* JADX INFO: renamed from: ʼʻ.ﹶᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C1489 extends C1444 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4856).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator r0 = this.f4856.iterator();
        r0.getClass();
        InterfaceC2366 r1 = this.f4857;
        r1.getClass();
    L4:
        if (r0.hasNext() == false) goto L9;
        Object r2 = r0.next();
        if (r1.apply(r2) == false) goto L4;
        return r2;
    L9:
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object r3) {
        return new C1489(((SortedSet) this.f4856).headSet(r3), this.f4857);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet r0 = (SortedSet) this.f4856;
    L3:
        Object r1 = r0.last();
        if (this.f4857.apply(r1) == true) goto L5;
        r0 = r0.headSet(r1);
        goto L3
    L5:
        return r1;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object r3, Object r4) {
        return new C1489(((SortedSet) this.f4856).subSet(r3, r4), this.f4857);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object r3) {
        return new C1489(((SortedSet) this.f4856).tailSet(r3), this.f4857);
    }
}
