package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0888M implements InterfaceC0890O, InterfaceC1234y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f3469a;

    public /* synthetic */ C0888M(PrimitiveIterator.OfLong r1) {
        this.f3469a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        PrimitiveIterator.OfLong r0 = this.f3469a;
        if ((r3 instanceof C0888M) == false) goto L6;
        r3 = ((C0888M) r3).f3469a;
    L6:
        return r0.equals(r3);
    }

    @Override // p005j$.util.InterfaceC0891P
    public final /* synthetic */ void forEachRemaining(Object r2) {
        this.f3469a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0890O, java.util.Iterator, p005j$.util.InterfaceC1234y
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3469a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0890O
    public final /* synthetic */ void forEachRemaining(LongConsumer r2) {
        this.f3469a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3469a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3469a.hashCode();
    }

    @Override // p005j$.util.InterfaceC0890O, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f3469a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3469a.next();
    }

    @Override // p005j$.util.InterfaceC0890O
    public final /* synthetic */ long nextLong() {
        return this.f3469a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3469a.remove();
    }
}
