package p442;

import java.util.Collection;
import java.util.Iterator;
import p164.AbstractC2927;
import p398.InterfaceC5098;
import ᐧᵎ.ˆʾ;

/* JADX INFO: renamed from: ﹶˈ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5595 implements Collection, InterfaceC5098 {
    @Override // java.util.Collection
    public final boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object r4) {
        if (isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator<E> r0 = iterator();
    L7:
        if (r0.hasNext() == false) goto L12;
        if (AbstractC2927.m6273(r0.next(), r4) == false) goto L7;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r3) {
        if (r3.isEmpty() == false) goto L5;
        return true;
    L5:
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L12;
        if (contains(r32.next()) == true) goto L7;
        return false;
    L12:
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (mo6497() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo6497();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2927.m6276(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] r1) {
        return AbstractC2927.m6277(this, r1);
    }

    public final String toString() {
        return AbstractC5582.m10749(this, ", ", "[", "]", new ˆʾ(21, this), 24);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract int mo6497();
}
