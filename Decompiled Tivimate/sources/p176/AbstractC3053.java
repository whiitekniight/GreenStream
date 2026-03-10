package p176;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ˊᐧ.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3053 {

    /* JADX INFO: renamed from: ʽ */
    public static final AtomicReference[] f10704 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final int f10705 = 0;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C3060 f10706 = null;

    static {
        int r1 = 0;
        f10706 = new C3060(new byte[0], 0, 0, false);
        int r0 = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10705 = r0;
        AtomicReference[] r2 = new AtomicReference[r0];
    L3:
        if (r1 >= r0) goto L5;
        r2[r1] = new AtomicReference();
        r1 = r1 + 1;
        goto L3
    L5:
        f10704 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C3060 m6454() {
        int r0 = (int) (Thread.currentThread().getId() & (((long) f10705) - 1));
        AtomicReference r02 = f10704[r0];
        C3060 r1 = f10706;
        C3060 r2 = (C3060) r02.getAndSet(r1);
        if (r2 != r1) goto L7;
        return new C3060();
    L7:
        if (r2 != null) goto L10;
        r02.set(null);
        return new C3060();
    L10:
        r02.set(r2.f10726);
        r2.f10726 = null;
        r2.f10720 = 0;
        return r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final void m6455(C3060 r6) {
        if (r6.f10726 != null) goto L23;
        if (r6.f10723 != null) goto L23;
        if (r6.f10721 == true) goto L24;
        AtomicReference r0 = f10704[(int) (Thread.currentThread().getId() & (((long) f10705) - 1))];
        C3060 r1 = f10706;
        C3060 r2 = (C3060) r0.getAndSet(r1);
        if (r2 != r1) goto L13;
        return;
    L13:
        if (r2 == null) goto L15;
        int r3 = r2.f10720;
    L17:
        if (r3 < 65536) goto L20;
        r0.set(r2);
        return;
    L20:
        r6.f10726 = r2;
        r6.f10724 = 0;
        r6.f10720 = r3 + 8192;
        r0.set(r6);
        return;
    L15:
        r3 = 0;
        goto L17
    L24:
        return;
    L23:
        throw new IllegalArgumentException("Failed requirement.");
    }
}
