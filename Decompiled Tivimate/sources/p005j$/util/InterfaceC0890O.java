package p005j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.O */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0890O extends InterfaceC0891P {
    @Override // java.util.Iterator, p005j$.util.InterfaceC1234y
    void forEachRemaining(Consumer r1);

    void forEachRemaining(LongConsumer r1);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
