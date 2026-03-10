package p005j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.X */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0898X extends InterfaceC0932d0 {
    void forEachRemaining(IntConsumer r1);

    boolean tryAdvance(IntConsumer r1);

    @Override // p005j$.util.InterfaceC0932d0, p005j$.util.Spliterator
    InterfaceC0898X trySplit();
}
