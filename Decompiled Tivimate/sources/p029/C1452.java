package p029;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: ʼʻ.ˊˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C1452 extends AbstractC1457 implements ListIterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ AbstractList f4869;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ int f4870;

    public /* synthetic */ C1452(AbstractList r1, ListIterator r2, int r3) {
        this.f4870 = r3;
        this.f4869 = r1;
        super(r2);
    }

    @Override // java.util.ListIterator
    public final void add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4879).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4879).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo3961(((ListIterator) this.f4879).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4879).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // p029.AbstractC1457
    /* JADX INFO: renamed from: ﹳٴ */
    public final Object mo3961(Object r2) {
        switch(this.f4870) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C1462) this.f4869).f4892.apply(r2);
    L7:
        return ((C1430) this.f4869).f4829.apply(r2);
    }
}
