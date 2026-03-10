package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʼᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0265 extends AbstractList implements InterfaceC0247 {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f1778;

    public AbstractC0265(boolean r1) {
        this.f1778 = r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r1, Collection r2) {
        m1280();
        return super.addAll(r1, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection r1) {
        m1280();
        return super.addAll(r1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1280();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof List) == true) goto L9;
        return false;
    L9:
        if ((r7 instanceof RandomAccess) == false) goto L11;
        List r72 = (List) r7;
        int r1 = size();
        if (r1 != r72.size()) goto L21;
        int r3 = 0;
    L15:
        if (r3 >= r1) goto L20;
        if (get(r3).equals(r72.get(r3)) == false) goto L18;
        r3 = r3 + 1;
        goto L15
    L18:
        return false;
    L20:
        return true;
    L21:
        return false;
    L11:
        return super.equals(r7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r0 = size();
        int r1 = 0;
        int r2 = 1;
    L3:
        if (r1 >= r0) goto L5;
        r2 = (r2 * 31) + get(r1).hashCode();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        m1280();
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        remove(r22);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r1) {
        m1280();
        return super.removeAll(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r1) {
        m1280();
        return super.retainAll(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m1280() {
        if (this.f1778 == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }
}
