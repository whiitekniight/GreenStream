package p005j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.G */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0882G extends InterfaceC0891P {
    @Override // java.util.Iterator, p005j$.util.InterfaceC1234y
    void forEachRemaining(Consumer r1);

    void forEachRemaining(DoubleConsumer r1);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}
