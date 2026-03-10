package p029;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ʼʻ.ﹳﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1488 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection r4) {
        r4.getClass();
        boolean r1 = false;
        if ((r4 instanceof Set) == true) goto L5;
    L13:
        Iterator r42 = r4.iterator();
    L15:
        if (r42.hasNext() == false) goto L17;
        r1 = r1 | remove(r42.next());
        goto L15
    L17:
        return r1;
    L5:
        if (r4.size() <= size()) goto L13;
        Iterator<E> r0 = iterator();
    L8:
        if (r0.hasNext() == false) goto L12;
        if (r4.contains(r0.next()) == false) goto L8;
        r0.remove();
        r1 = true;
        goto L8
    L12:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection r1) {
        r1.getClass();
        return super.retainAll(r1);
    }
}
