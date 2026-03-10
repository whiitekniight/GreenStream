package p029;

import com.google.android.gms.internal.play_billing.י;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p107.InterfaceC2366;

/* JADX INFO: renamed from: ʼʻ.ˈˏ */
/* JADX INFO: loaded from: classes.dex */
public class C1444 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: ʾˋ */
    public final Set f4856;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC2366 f4857;

    public C1444(Set r1, InterfaceC2366 r2) {
        this.f4856 = r1;
        this.f4857 = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r2) {
        if (this.f4857.apply(r2) == false) goto L7;
        return this.f4856.add(r2);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r4) {
        Iterator r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        Object r1 = r0.next();
        if (this.f4857.apply(r1) == true) goto L4;
        throw new IllegalArgumentException();
    L11:
        return this.f4856.addAll(r4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set r0 = this.f4856;
        boolean r1 = r0 instanceof RandomAccess;
        InterfaceC2366 r2 = this.f4857;
        if (r1 == true) goto L5;
    L20:
        Iterator r02 = r0.iterator();
        r2.getClass();
    L22:
        if (r02.hasNext() == false) goto L38;
        if (r2.apply(r02.next()) == false) goto L22;
        r02.remove();
        goto L22
    L38:
        return;
    L5:
        if ((r0 instanceof List) == false) goto L20;
        List r03 = (List) r0;
        r2.getClass();
        int r12 = 0;
        int r3 = 0;
    L8:
        if (r12 >= r03.size()) goto L18;
        Object r4 = r03.get(r12);
        if (r2.apply(r4) == true) goto L17;
        if (r12 > r3) goto L27;
    L16:
        r3 = r3 + 1;
        goto L17
    L27:
        r03.set(r3, r4);     // Catch: IllegalArgumentException -> L14 UnsupportedOperationException -> L15
    L14:
        AbstractC1487.m3989(r03, r2, r3, r12);
        return;
    L15:
        AbstractC1487.m3989(r03, r2, r3, r12);
        return;
    L17:
        r12 = r12 + 1;
        goto L8
    L18:
        r03.subList(r3, r03.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        Set r0 = this.f4856;
        r0.getClass();
        boolean r02 = r0.contains(r3);     // Catch: Throwable -> L5
    L6:
        if (r02 == true) goto L8;
        return false;
    L8:
        return this.f4857.apply(r3);
    L5:
        r02 = false;
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (contains(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r1) {
        return AbstractC1487.m4000(this, r1);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1487.m3999(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator r0 = this.f4856.iterator();
        InterfaceC2366 r2 = this.f4857;
        י.ᵔᵢ(r2, "predicate");
        boolean r1 = false;
        int r3 = 0;
    L4:
        if (r0.hasNext() == false) goto L9;
        if (r2.apply(r0.next()) == true) goto L11;
        r3 = r3 + 1;
    L11:
        if (r3 == (-1)) goto L14;
        r1 = true;
    L14:
        return true ^ r1;
    L9:
        r3 = -1;
        goto L11
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator r0 = this.f4856.iterator();
        r0.getClass();
        InterfaceC2366 r1 = this.f4857;
        r1.getClass();
        return new C1443(r0, r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r2) {
        if (contains(r2) == true) goto L5;
        return false;
    L5:
        if (this.f4856.remove(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r5) {
        Iterator r0 = this.f4856.iterator();
        boolean r1 = false;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        if (this.f4857.apply(r2) == false) goto L4;
        if (r5.contains(r2) == false) goto L4;
        r0.remove();
        r1 = true;
        goto L4
    L10:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r5) {
        Iterator r0 = this.f4856.iterator();
        boolean r1 = false;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        if (this.f4857.apply(r2) == false) goto L4;
        if (r5.contains(r2) == true) goto L4;
        r0.remove();
        r1 = true;
        goto L4
    L10:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator r0 = this.f4856.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r2 = r0.next();
        if (this.f4857.apply(r2) == false) goto L4;
        r1 = r1 + 1;
        goto L4
    L8:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator r0 = iterator();
        ArrayList r1 = new ArrayList();
    L3:
        C1443 r2 = (C1443) r0;
        if (r2.hasNext() == false) goto L7;
        r1.add(r2.next());
        goto L3
    L7:
        return r1.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r5) {
        Iterator r0 = iterator();
        ArrayList r1 = new ArrayList();
    L3:
        C1443 r2 = (C1443) r0;
        if (r2.hasNext() == false) goto L7;
        r1.add(r2.next());
        goto L3
    L7:
        return r1.toArray(r5);
    }
}
