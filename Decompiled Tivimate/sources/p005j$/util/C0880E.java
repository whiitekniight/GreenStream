package p005j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.E */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0880E implements InterfaceC0882G, InterfaceC1234y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f3461a;

    public /* synthetic */ C0880E(PrimitiveIterator.OfDouble r1) {
        this.f3461a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        PrimitiveIterator.OfDouble r0 = this.f3461a;
        if ((r3 instanceof C0880E) == false) goto L6;
        r3 = ((C0880E) r3).f3461a;
    L6:
        return r0.equals(r3);
    }

    @Override // p005j$.util.InterfaceC0891P
    public final /* synthetic */ void forEachRemaining(Object r2) {
        this.f3461a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0882G, java.util.Iterator, p005j$.util.InterfaceC1234y
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3461a.forEachRemaining(r2);
    }

    @Override // p005j$.util.InterfaceC0882G
    public final /* synthetic */ void forEachRemaining(DoubleConsumer r2) {
        this.f3461a.forEachRemaining(r2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f3461a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f3461a.hashCode();
    }

    @Override // p005j$.util.InterfaceC0882G, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f3461a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f3461a.next();
    }

    @Override // p005j$.util.InterfaceC0882G
    public final /* synthetic */ double nextDouble() {
        return this.f3461a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f3461a.remove();
    }
}
