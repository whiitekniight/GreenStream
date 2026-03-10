package p442;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p164.AbstractC2927;
import p319.AbstractC4223;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ﹶˈ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5580 implements List, Serializable, RandomAccess, InterfaceC5098 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C5580 f20144 = null;

    static {
        f20144 = new C5580();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object r1) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return r1.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof List) == true) goto L5;
        return false;
    L5:
        if (((List) r2).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + r4 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C5585.f20148;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C5585.f20148;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r3) {
        if (r3 != 0) goto L6;
        return C5585.f20148;
    L6:
        throw new IndexOutOfBoundsException(AbstractC4223.m8643(r3, "Index: "));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int r4, int r5) {
        if (r4 != 0) goto L6;
        if (r5 != 0) goto L6;
        return this;
    L6:
        throw new IndexOutOfBoundsException(AbstractC0002.m14(r4, r5, "fromIndex: ", ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC2927.m6276(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC2927.m6277(this, r1);
    }

    public final String toString() {
        return "[]";
    }
}
