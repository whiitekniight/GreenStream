package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0881F implements PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0882G f3462a;

    public /* synthetic */ C0881F(InterfaceC0882G r1) {
        this.f3462a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        InterfaceC0882G r0 = this.f3462a;
        if ((r3 instanceof C0881F) == false) goto L6;
        r3 = ((C0881F) r3).f3462a;
    L6:
        return r0.equals(r3);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer r2) {
        this.f3462a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3462a.forEachRemaining(r2);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer r2) {
        this.f3462a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3462a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3462a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f3462a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3462a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f3462a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3462a.remove();
    }
}
