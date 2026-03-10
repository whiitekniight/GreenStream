package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0884I implements InterfaceC0886K, InterfaceC1234y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f3465a;

    public /* synthetic */ C0884I(PrimitiveIterator.OfInt r1) {
        this.f3465a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        PrimitiveIterator.OfInt r0 = this.f3465a;
        if ((r3 instanceof C0884I) == false) goto L6;
        r3 = ((C0884I) r3).f3465a;
    L6:
        return r0.equals(r3);
    }

    @Override // p005j$.util.InterfaceC0891P
    public final /* synthetic */ void forEachRemaining(Object r2) {
        this.f3465a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0886K, java.util.Iterator, p005j$.util.InterfaceC1234y
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3465a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0886K
    public final /* synthetic */ void forEachRemaining(IntConsumer r2) {
        this.f3465a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3465a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3465a.hashCode();
    }

    @Override // p005j$.util.InterfaceC0886K, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f3465a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3465a.next();
    }

    @Override // p005j$.util.InterfaceC0886K
    public final /* synthetic */ int nextInt() {
        return this.f3465a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3465a.remove();
    }
}
