package p395;

import java.util.ArrayDeque;
import p099.AbstractC2229;

/* JADX INFO: renamed from: ⁱʼ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C5077 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final ArrayDeque f18052 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public Object f18053;

    static {
        char[] r0 = AbstractC2229.f8047;
        f18052 = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C5077 m9854(Object r2) {
        ArrayDeque r0 = f18052;
        monitor-enter(r0);
        C5077 r1 = (C5077) r0.poll();     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 != null) goto L8;
        r1 = new C5077();
    L8:
        r1.f18053 = r2;
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C5077) == true) goto L5;
        return false;
    L5:
        if (this.f18053.equals(((C5077) r2).f18053) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.f18053.hashCode();
    }
}
