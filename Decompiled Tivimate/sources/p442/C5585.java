package p442;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ﹶˈ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C5585 implements ListIterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C5585 f20148 = null;

    static {
        f20148 = new C5585();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
