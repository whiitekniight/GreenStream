package p029;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ʼʻ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public class C1490 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: ʽʽ */
    public final C1490 f4939;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4940;

    /* JADX INFO: renamed from: ˈٴ */
    public final Collection f4941;

    /* JADX INFO: renamed from: ˊʻ */
    public final /* synthetic */ C1472 f4942;

    /* JADX INFO: renamed from: ᴵˊ */
    public Collection f4943;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ C1472 f4944;

    public C1490(C1472 r1, Object r2, List r3, C1490 r4) {
        this.f4942 = r1;
        this.f4944 = r1;
        this.f4940 = r2;
        this.f4943 = r3;
        this.f4939 = r4;
        if (r4 != null) goto L5;
        Collection r12 = null;
    L6:
        this.f4941 = r12;
        return;
    L5:
        r12 = r4.f4943;
        goto L6
    }

    @Override // java.util.List
    public final void add(int r3, Object r4) {
        m4010();
        boolean r0 = this.f4943.isEmpty();
        ((List) this.f4943).add(r3, r4);
        this.f4942.f4912++;
        if (r0 == false) goto L6;
        m4011();
        return;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r4) {
        m4010();
        boolean r0 = this.f4943.isEmpty();
        boolean r42 = this.f4943.add(r4);
        if (r42 == false) goto L7;
        this.f4944.f4912++;
        if (r0 == false) goto L7;
        m4011();
    L7:
        return r42;
    }

    @Override // java.util.List
    public final boolean addAll(int r4, Collection r5) {
        if (r5.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r42 = ((List) this.f4943).addAll(r4, r5);
        if (r42 == false) goto L11;
        this.f4942.f4912 += this.f4943.size() - r0;
        if (r0 != 0) goto L11;
        m4011();
    L11:
        return r42;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r5) {
        if (r5.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r52 = this.f4943.addAll(r5);
        if (r52 == false) goto L11;
        this.f4944.f4912 += this.f4943.size() - r0;
        if (r0 != 0) goto L11;
        m4011();
    L11:
        return r52;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int r0 = size();
        if (r0 != 0) goto L5;
        return;
    L5:
        this.f4943.clear();
        this.f4944.f4912 -= r0;
        m4009();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        m4010();
        return this.f4943.contains(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection r2) {
        m4010();
        return this.f4943.containsAll(r2);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r2) {
        if (r2 != this) goto L5;
        return true;
    L5:
        m4010();
        return this.f4943.equals(r2);
    }

    @Override // java.util.List
    public final Object get(int r2) {
        m4010();
        return ((List) this.f4943).get(r2);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m4010();
        return this.f4943.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object r2) {
        m4010();
        return ((List) this.f4943).indexOf(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m4010();
        return new C1433(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r2) {
        m4010();
        return ((List) this.f4943).lastIndexOf(r2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m4010();
        return new C1467(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        m4010();
        return new C1467(this, r2);
    }

    @Override // java.util.List
    public final Object remove(int r3) {
        m4010();
        Object r32 = ((List) this.f4943).remove(r3);
        C1472 r0 = this.f4942;
        r0.f4912--;
        m4009();
        return r32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r3) {
        m4010();
        boolean r32 = this.f4943.remove(r3);
        if (r32 == false) goto L5;
        C1472 r0 = this.f4944;
        r0.f4912--;
        m4009();
    L5:
        return r32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r4) {
        if (r4.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r42 = this.f4943.removeAll(r4);
        if (r42 == false) goto L9;
        this.f4944.f4912 += this.f4943.size() - r0;
        m4009();
    L9:
        return r42;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r4) {
        r4.getClass();
        int r0 = size();
        boolean r42 = this.f4943.retainAll(r4);
        if (r42 == false) goto L5;
        this.f4944.f4912 += this.f4943.size() - r0;
        m4009();
    L5:
        return r42;
    }

    @Override // java.util.List
    public final Object set(int r2, Object r3) {
        m4010();
        return ((List) this.f4943).set(r2, r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m4010();
        return this.f4943.size();
    }

    @Override // java.util.List
    public final List subList(int r4, int r5) {
        m4010();
        List r42 = ((List) this.f4943).subList(r4, r5);
        C1490 r52 = this.f4939;
        if (r52 != null) goto L5;
        r52 = this;
    L5:
        boolean r0 = r42 instanceof RandomAccess;
        C1472 r1 = this.f4942;
        Object r2 = this.f4940;
        if (r0 == false) goto L10;
        return new C1481(r1, r2, r42, r52);
    L10:
        return new C1490(r1, r2, r42, r52);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m4010();
        return this.f4943.toString();
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m4009() {
        C1490 r0 = this.f4939;
        if (r0 == null) goto L7;
        r0.m4009();
        return;
    L7:
        if (this.f4943.isEmpty() == false) goto L10;
        this.f4944.f4910.remove(this.f4940);
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m4010() {
        C1490 r0 = this.f4939;
        if (r0 == null) goto L10;
        r0.m4010();
        if (r0.f4943 != this.f4941) goto L8;
        return;
    L8:
        throw new ConcurrentModificationException();
    L10:
        if (this.f4943.isEmpty() == false) goto L15;
        Collection r02 = (Collection) this.f4944.f4910.get(this.f4940);
        if (r02 == null) goto L16;
        this.f4943 = r02;
        return;
    L16:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m4011() {
        C1490 r0 = this.f4939;
        if (r0 == null) goto L6;
        r0.m4011();
        return;
    L6:
        this.f4944.f4910.put(this.f4940, this.f4943);
    }
}
