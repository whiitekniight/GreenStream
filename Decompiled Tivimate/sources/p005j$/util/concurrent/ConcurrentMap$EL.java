package p005j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p005j$.util.Objects;

/* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ConcurrentMap$EL {
    public static Object computeIfAbsent(ConcurrentMap r1, Object r2, Function r3) {
        if ((r1 instanceof InterfaceC0926t) == true) goto L5;
        Objects.requireNonNull(r3);
        Object r0 = r1.get(r2);
        if (r0 != null) goto L14;
        Object r32 = r3.apply(r2);
        if (r32 == null) goto L14;
        Object r12 = r1.putIfAbsent(r2, r32);
        if (r12 != null) goto L13;
        return r32;
    L13:
        return r12;
    L14:
        return r0;
    L5:
        return ((InterfaceC0926t) r1).computeIfAbsent(r2, r3);
    }
}
