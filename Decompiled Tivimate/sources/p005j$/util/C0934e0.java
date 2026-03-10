package p005j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p005j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0934e0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator f3572a;

    public /* synthetic */ C0934e0(Spliterator r1) {
        this.f3572a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator m3227a(Spliterator r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        if ((r1 instanceof Spliterator.Wrapper) == false) goto L10;
        return ((Spliterator.Wrapper) r1).f3475a;
    L10:
        if ((r1 instanceof Spliterator.OfPrimitive) == false) goto L14;
        return C0904b0.m3185a((Spliterator.OfPrimitive) r1);
    L14:
        return new C0934e0(r1);
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f3572a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object r3) {
        java.util.Spliterator r0 = this.f3572a;
        if ((r3 instanceof C0934e0) == false) goto L6;
        r3 = ((C0934e0) r3).f3572a;
    L6:
        return r0.equals(r3);
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f3572a.estimateSize();
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer r2) {
        this.f3572a.forEachRemaining(r2);
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f3572a.getComparator();
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f3572a.getExactSizeIfKnown();
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int r2) {
        return this.f3572a.hasCharacteristics(r2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f3572a.hashCode();
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer r2) {
        return this.f3572a.tryAdvance(r2);
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m3227a(this.f3572a.trySplit());
    }
}
