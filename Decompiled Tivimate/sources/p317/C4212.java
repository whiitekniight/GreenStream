package p317;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p015.RunnableC1269;
import p295.RunnableC4051;

/* JADX INFO: renamed from: ᐧˎ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4212 {

    /* JADX INFO: renamed from: ﾞᴵ */
    public static C4212 f15460;

    /* JADX INFO: renamed from: ʽ */
    public final Object f15461;

    /* JADX INFO: renamed from: ˈ */
    public int f15462;

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean f15463;

    /* JADX INFO: renamed from: ⁱˊ */
    public final CopyOnWriteArrayList f15464;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Executor f15465;

    public C4212(Context r4) {
        Executor r0 = AbstractC4214.m8578();
        this.f15465 = r0;
        this.f15464 = new CopyOnWriteArrayList();
        this.f15461 = new Object();
        this.f15462 = 0;
        r0.execute(new RunnableC1269(this, 27, r4));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static synchronized C4212 m8547(Context r2) {
        monitor-enter(C4212.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f15460 != null) goto L9;
        f15460 = new C4212(r2);     // Catch: Throwable -> L7
    L9:
        C4212 r22 = f15460;     // Catch: Throwable -> L7
        monitor-exit(C4212.class);
        return r22;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m8548(int r5) {
        CopyOnWriteArrayList r0 = this.f15464;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        C4197 r2 = (C4197) r1.next();
        if (r2.f15429.get() != null) goto L4;
        r0.remove(r2);
        goto L4
    L8:
        Object r02 = this.f15461;
        monitor-enter(r02);
    L16:
        th = move-exception;
        throw th;
    L11:
        if (this.f15463 == true) goto L13;
    L18:
        this.f15463 = true;     // Catch: Throwable -> L16
        this.f15462 = r5;     // Catch: Throwable -> L16
        Iterator r52 = this.f15464.iterator();     // Catch: Throwable -> L16
        monitor-exit(r02);     // Catch: Throwable -> L16
    L21:
        if (r52.hasNext() == false) goto L23;
        C4197 r03 = (C4197) r52.next();
        r03.f15428.execute(new RunnableC4051(2, r03));
        goto L21
    L23:
        return;
    L13:
        if (this.f15462 != r5) goto L18;
        monitor-exit(r02);     // Catch: Throwable -> L16
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m8549() {
        Object r0 = this.f15461;
        monitor-enter(r0);
        int r1 = this.f15462;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
