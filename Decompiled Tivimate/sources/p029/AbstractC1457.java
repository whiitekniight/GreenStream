package p029;

import java.util.Iterator;

/* JADX INFO: renamed from: ʼʻ.ˑʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1457 implements Iterator {

    /* JADX INFO: renamed from: ʾˋ */
    public final Iterator f4879;

    public AbstractC1457(Iterator r1) {
        r1.getClass();
        this.f4879 = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4879.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo3961(this.f4879.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4879.remove();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract Object mo3961(Object r1);
}
