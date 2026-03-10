package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.J */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0885J implements PrimitiveIterator.OfInt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0886K f3466a;

    public /* synthetic */ C0885J(InterfaceC0886K r1) {
        this.f3466a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        InterfaceC0886K r0 = this.f3466a;
        if ((r3 instanceof C0885J) == false) goto L6;
        r3 = ((C0885J) r3).f3466a;
    L6:
        return r0.equals(r3);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer r2) {
        this.f3466a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3466a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer r2) {
        this.f3466a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3466a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3466a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f3466a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3466a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f3466a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3466a.remove();
    }
}
