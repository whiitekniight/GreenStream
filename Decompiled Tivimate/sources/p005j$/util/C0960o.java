package p005j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.o */
/* JADX INFO: loaded from: classes2.dex */
public class C0960o extends C0956m implements List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* JADX INFO: renamed from: b */
    public final List f3619b;

    public C0960o(List r1) {
        super(r1);
        this.f3619b = r1;
    }

    private Object readResolve() {
        List r0 = this.f3619b;
        if ((r0 instanceof RandomAccess) == true) goto L5;
        return this;
    L5:
        return new C1230u(r0);
    }

    @Override // java.util.List
    public final void add(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if (this.f3619b.equals(r2) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        return this.f3619b.get(r2);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f3619b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object r2) {
        return this.f3619b.indexOf(r2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r2) {
        return this.f3619b.lastIndexOf(r2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0958n(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        return new C0958n(this, r2);
    }

    @Override // java.util.List
    public final Object remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p005j$.util.List
    public final void replaceAll(UnaryOperator r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p005j$.util.List
    public final void sort(Comparator r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public List subList(int r3, int r4) {
        return new C0960o(this.f3619b.subList(r3, r4));
    }
}
