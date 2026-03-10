package p005j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.K */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0886K extends InterfaceC0891P {
    @Override // java.util.Iterator, p005j$.util.InterfaceC1234y
    void forEachRemaining(Consumer r1);

    void forEachRemaining(IntConsumer r1);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
