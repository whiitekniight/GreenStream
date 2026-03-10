package p085;

import java.util.ArrayDeque;
import p099.AbstractC2229;
import p388.C5018;

/* JADX INFO: renamed from: ʾⁱ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2125 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final ArrayDeque f7622;

    public C2125(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.f7622 = new ArrayDeque();
        return;
    L5:
        char[] r22 = AbstractC2229.f8047;
        this.f7622 = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: ʽ */
    public synchronized void m5204(C5018 r2) {
        monitor-enter(this);
        r2.f17914 = null;     // Catch: Throwable -> L7
        r2.f17912 = null;     // Catch: Throwable -> L7
        this.f7622.offer(r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m5205(C2130 r4) {
        ArrayDeque r0 = this.f7622;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f7622.size() >= 10) goto L9;
        this.f7622.offer(r4);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public C2130 m5206() {
        ArrayDeque r0 = this.f7622;
        monitor-enter(r0);
        C2130 r1 = (C2130) this.f7622.poll();     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 == null) goto L8;
        return r1;
    L8:
        return new C2130();
    L10:
        th = move-exception;
        throw th;
    }
}
