package p005j$.lang;

import java.util.Iterator;
import java.util.function.Consumer;
import p005j$.util.Objects;

/* JADX INFO: renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable r1, Consumer r2) {
        Objects.requireNonNull(r2);
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        r2.accept(r12.next());
        goto L4
    }
}
