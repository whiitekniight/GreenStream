package p005j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Spliterator<T> {

    public final /* synthetic */ class Wrapper implements java.util.Spliterator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Spliterator f3475a;

        public /* synthetic */ Wrapper(Spliterator r1) {
            this.f3475a = r1;
        }

        public static /* synthetic */ java.util.Spliterator convert(Spliterator r1) {
            if (r1 != null) goto L6;
            return null;
        L6:
            if ((r1 instanceof C0934e0) == false) goto L10;
            return ((C0934e0) r1).f3572a;
        L10:
            if ((r1 instanceof InterfaceC0932d0) == false) goto L14;
            return C0906c0.m3186a((InterfaceC0932d0) r1);
        L14:
            return new Wrapper(r1);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ int characteristics() {
            return this.f3475a.characteristics();
        }

        public final /* synthetic */ boolean equals(Object r3) {
            Spliterator r0 = this.f3475a;
            if ((r3 instanceof Wrapper) == false) goto L6;
            r3 = ((Wrapper) r3).f3475a;
        L6:
            return r0.equals(r3);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long estimateSize() {
            return this.f3475a.estimateSize();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ void forEachRemaining(Consumer r2) {
            this.f3475a.forEachRemaining(r2);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ Comparator getComparator() {
            return this.f3475a.getComparator();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long getExactSizeIfKnown() {
            return this.f3475a.getExactSizeIfKnown();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean hasCharacteristics(int r2) {
            return this.f3475a.hasCharacteristics(r2);
        }

        public final /* synthetic */ int hashCode() {
            return this.f3475a.hashCode();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean tryAdvance(Consumer r2) {
            return this.f3475a.tryAdvance(r2);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ java.util.Spliterator trySplit() {
            return convert(this.f3475a.trySplit());
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer r1);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int r1);

    boolean tryAdvance(Consumer r1);

    Spliterator trySplit();
}
