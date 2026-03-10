package p005j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0905c implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3490b;

    public /* synthetic */ C0905c(int r1, Object r2) {
        this.f3489a = r1;
        this.f3490b = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r4, Object r5) {
        switch(this.f3489a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ToLongFunction r0 = (ToLongFunction) this.f3490b;
        return Long.compare(r0.applyAsLong(r4), r0.applyAsLong(r5));
    L6:
        Function r02 = (Function) this.f3490b;
        return ((Comparable) r02.apply(r4)).compareTo(r02.apply(r5));
    L8:
        ToDoubleFunction r03 = (ToDoubleFunction) this.f3490b;
        return Double.compare(r03.applyAsDouble(r4), r03.applyAsDouble(r5));
    L10:
        ToIntFunction r04 = (ToIntFunction) this.f3490b;
        return Integer.compare(r04.applyAsInt(r4), r04.applyAsInt(r5));
    }
}
