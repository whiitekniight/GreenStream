package p005j$.util.function;

import java.util.function.Function;
import p005j$.util.Objects;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function r2, Function r3) {
        Objects.requireNonNull(r3);
        return new C0940d(r2, r3, 0);
    }

    public static Function $default$compose(Function r2, Function r3) {
        Objects.requireNonNull(r3);
        return new C0940d(r2, r3, 1);
    }
}
