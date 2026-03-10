package p005j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.U */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0895U extends InterfaceC0932d0 {
    void forEachRemaining(DoubleConsumer r1);

    boolean tryAdvance(DoubleConsumer r1);

    @Override // p005j$.util.InterfaceC0932d0, p005j$.util.Spliterator
    InterfaceC0895U trySplit();
}
