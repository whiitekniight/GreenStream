package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0062 extends AbstractList implements InterfaceC0038 {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f501;

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r1, Collection r2) {
        m370();
        return super.addAll(r1, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r1) {
        m370();
        return super.addAll(r1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m370();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof List) == true) goto L9;
        return false;
    L9:
        if ((r7 instanceof RandomAccess) == false) goto L11;
        List r72 = (List) r7;
        int r1 = size();
        if (r1 == r72.size()) goto L15;
        return false;
    L15:
        int r3 = 0;
    L16:
        if (r3 >= r1) goto L21;
        if (get(r3).equals(r72.get(r3)) == false) goto L19;
        r3 = r3 + 1;
        goto L16
    L19:
        return false;
    L21:
        return true;
    L11:
        return super.equals(r7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = size();
        int r1 = 1;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1 = (r1 * 31) + get(r2).hashCode();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        m370();
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        remove(r22);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r1) {
        m370();
        return super.removeAll(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r1) {
        m370();
        return super.retainAll(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m370() {
        if (this.f501 == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }
}
