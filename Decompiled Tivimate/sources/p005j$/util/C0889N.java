package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.N */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0889N implements PrimitiveIterator.OfLong {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0890O f3470a;

    public /* synthetic */ C0889N(InterfaceC0890O r1) {
        this.f3470a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        InterfaceC0890O r0 = this.f3470a;
        if ((r3 instanceof C0889N) == false) goto L6;
        r3 = ((C0889N) r3).f3470a;
    L6:
        return r0.equals(r3);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer r2) {
        this.f3470a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3470a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer r2) {
        this.f3470a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3470a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3470a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f3470a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3470a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f3470a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3470a.remove();
    }
}
