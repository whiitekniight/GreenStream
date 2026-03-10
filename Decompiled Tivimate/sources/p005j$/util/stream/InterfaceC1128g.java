package p005j$.util.stream;

import java.util.Iterator;
import p005j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1128g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC1128g onClose(Runnable r1);

    InterfaceC1128g parallel();

    InterfaceC1128g sequential();

    Spliterator spliterator();

    InterfaceC1128g unordered();
}
