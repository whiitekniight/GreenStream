package p395;

import java.util.ArrayDeque;
import p099.C2223;

/* JADX INFO: renamed from: ⁱʼ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C5068 extends C2223 {
    @Override // p099.C2223
    /* JADX INFO: renamed from: ʽ */
    public final void mo5218(Object r1, Object r2) {
        C5077 r12 = (C5077) r1;
        r12.getClass();
        ArrayDeque r22 = C5077.f18052;
        monitor-enter(r22);
        r22.offer(r12);     // Catch: Throwable -> L7
        monitor-exit(r22);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
