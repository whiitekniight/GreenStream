package p005j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.a0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0902a0 extends InterfaceC0932d0 {
    void forEachRemaining(LongConsumer r1);

    boolean tryAdvance(LongConsumer r1);

    @Override // p005j$.util.InterfaceC0932d0, p005j$.util.Spliterator
    InterfaceC0902a0 trySplit();
}
