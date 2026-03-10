package p029;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ʼʻ.ـﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1463 extends AbstractSet {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ Set f4893;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ Set f4894;

    public C1463(Set r1, Set r2) {
        this.f4893 = r1;
        this.f4894 = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r2) {
        if (this.f4893.contains(r2) == true) goto L5;
        return false;
    L5:
        if (this.f4894.contains(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r2) {
        if (this.f4893.containsAll(r2) == true) goto L5;
        return false;
    L5:
        if (this.f4894.containsAll(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f4894, this.f4893);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1443(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator r0 = this.f4893.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r2 = r0.next();
        if (this.f4894.contains(r2) == false) goto L4;
        r1 = r1 + 1;
        goto L4
    L8:
        return r1;
    }
}
