package p103;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ʿⁱ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 {

    /* JADX INFO: renamed from: ʽ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8378 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8379 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8380 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8381 = null;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AtomicReferenceArray f8382;

    static {
        f8381 = AtomicReferenceFieldUpdater.newUpdater(C2332.class, Object.class, "lastScheduledTask$volatile");
        f8378 = AtomicIntegerFieldUpdater.newUpdater(C2332.class, "producerIndex$volatile");
        f8379 = AtomicIntegerFieldUpdater.newUpdater(C2332.class, "consumerIndex$volatile");
        f8380 = AtomicIntegerFieldUpdater.newUpdater(C2332.class, "blockingTasksInBuffer$volatile");
    }

    public C2332() {
        this.f8382 = new AtomicReferenceArray(128);
    }

    /* JADX INFO: renamed from: ʽ */
    public final AbstractRunnableC2329 m5492(int r5, boolean r6) {
        int r52 = r5 & 127;
        AtomicReferenceArray r0 = this.f8382;
        AbstractRunnableC2329 r1 = (AbstractRunnableC2329) r0.get(r52);
        if (r1 != null) goto L5;
    L13:
        return null;
    L5:
        if (r1.f8357 != r6) goto L13;
    L7:
        if (r0.compareAndSet(r52, r1, null) == true) goto L8;
        if (r0.get(r52) == r1) goto L7;
    L8:
        if (r6 == false) goto L10;
        f8380.decrementAndGet(this);
    L10:
        return r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractRunnableC2329 m5493() {
    L2:
        AtomicIntegerFieldUpdater r0 = f8379;
        int r1 = r0.get(this);
        if ((r1 - f8378.get(this)) == 0) goto L4;
        int r2 = r1 & 127;
        if (r0.compareAndSet(this, r1, r1 + 1) == false) goto L2;
        AbstractRunnableC2329 r02 = (AbstractRunnableC2329) this.f8382.getAndSet(r2, null);
        if (r02 == null) goto L2;
        if (r02.f8357 == false) goto L13;
        f8380.decrementAndGet(this);
    L13:
        return r02;
    L4:
        return null;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractRunnableC2329 m5494(AbstractRunnableC2329 r5) {
        AtomicIntegerFieldUpdater r0 = f8378;
        if ((r0.get(this) - f8379.get(this)) != 127) goto L6;
        return r5;
    L6:
        if (r5.f8357 == false) goto L8;
        f8380.incrementAndGet(this);
    L8:
        int r1 = r0.get(this) & 127;
    L9:
        AtomicReferenceArray r2 = this.f8382;
        if (r2.get(r1) == null) goto L12;
        Thread.yield();
        goto L9
    L12:
        r2.lazySet(r1, r5);
        r0.incrementAndGet(this);
        return null;
    }
}
