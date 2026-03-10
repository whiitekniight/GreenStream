package p029;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p107.InterfaceC2364;

/* JADX INFO: renamed from: ʼʻ.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C1462 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final List f4891;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC2364 f4892;

    public C1462(List r1, InterfaceC2364 r2) {
        r1.getClass();
        this.f4891 = r1;
        this.f4892 = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4891.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        return new C1452(this, this.f4891.listIterator(r3), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r2, int r3) {
        this.f4891.subList(r2, r3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4891.size();
    }
}
