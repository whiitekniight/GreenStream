package p029;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p107.InterfaceC2364;

/* JADX INFO: renamed from: ʼʻ.ʼˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1430 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final List f4828;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC2364 f4829;

    public C1430(List r1, InterfaceC2364 r2) {
        r1.getClass();
        this.f4828 = r1;
        this.f4829 = r2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        Object r22 = this.f4828.get(r2);
        return this.f4829.apply(r22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4828.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        return new C1452(this, this.f4828.listIterator(r3), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int r2) {
        Object r22 = this.f4828.remove(r2);
        return this.f4829.apply(r22);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r2, int r3) {
        this.f4828.subList(r2, r3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4828.size();
    }
}
