package p005j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p005j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.G0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1001G0 {
    /* JADX INFO: renamed from: a */
    InterfaceC1001G0 mo3271a(int r1);

    long count();

    void forEach(Consumer r1);

    /* JADX INFO: renamed from: j */
    InterfaceC1001G0 mo3275j(long r1, long r3, IntFunction r5);

    /* JADX INFO: renamed from: k */
    void mo3276k(Object[] r1, int r2);

    /* JADX INFO: renamed from: m */
    Object[] mo3277m(IntFunction r1);

    /* JADX INFO: renamed from: o */
    int mo3278o();

    Spliterator spliterator();
}
