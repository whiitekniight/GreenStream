package p165;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p336.AbstractRunnableC4486;
import p336.C4528;

/* JADX INFO: renamed from: ˊʽ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public class C2958 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10393 = null;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ﹳٴ */
    public AbstractRunnableC4486[] f10394;

    static {
        f10393 = AtomicIntegerFieldUpdater.newUpdater(C2958.class, "_size$volatile");
    }

    /* JADX INFO: renamed from: ʽ */
    public final AbstractRunnableC4486 m6313(int r9) {
        Object[] r0 = this.f10394;
        AtomicIntegerFieldUpdater r1 = f10393;
        r1.set(this, r1.get(this) - 1);
        if (r9 >= r1.get(this)) goto L28;
        m6314(r9, r1.get(this));
        int r2 = (r9 - 1) / 2;
        if (r9 <= 0) goto L15;
        if (r0[r9].compareTo(r0[r2]) >= 0) goto L15;
        m6314(r9, r2);
    L9:
        if (r2 <= 0) goto L28;
        Object[] r92 = this.f10394;
        int r4 = (r2 - 1) / 2;
        if (r92[r4].compareTo(r92[r2]) <= 0) goto L28;
        m6314(r2, r4);
        r2 = r4;
    L15:
        int r22 = r9 * 2;
        int r42 = r22 + 1;
        if (r42 >= r1.get(this)) goto L28;
        Object[] r5 = this.f10394;
        int r23 = r22 + 2;
        if (r23 < r1.get(this)) goto L21;
    L23:
        r23 = r42;
    L25:
        if (r5[r9].compareTo(r5[r23]) <= 0) goto L28;
        m6314(r9, r23);
        r9 = r23;
        goto L15
    L21:
        if (r5[r23].compareTo(r5[r42]) >= 0) goto L23;
    L28:
        AbstractRunnableC4486 r93 = r0[r1.get(this)];
        r93.m8906(null);
        r93.f16323 = -1;
        r0[r1.get(this)] = null;
        return r93;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6314(int r4, int r5) {
        AbstractRunnableC4486[] r0 = this.f10394;
        AbstractRunnableC4486 r1 = r0[r5];
        AbstractRunnableC4486 r2 = r0[r4];
        r0[r4] = r1;
        r0[r5] = r2;
        r1.f16323 = r4;
        r2.f16323 = r5;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6315(AbstractRunnableC4486 r2) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (r2.m8904() == null) goto L7;
        m6313(r2.f16323);     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6316(AbstractRunnableC4486 r5) {
        r5.m8906((C4528) this);
        AbstractRunnableC4486[] r0 = this.f10394;
        AtomicIntegerFieldUpdater r1 = f10393;
        if (r0 != null) goto L6;
        r0 = new AbstractRunnableC4486[4];
        this.f10394 = r0;
    L8:
        int r2 = r1.get(this);
        r1.set(this, r2 + 1);
        r0[r2] = r5;
        r5.f16323 = r2;
    L9:
        if (r2 <= 0) goto L13;
        Object[] r52 = this.f10394;
        int r02 = (r2 - 1) / 2;
        if (r52[r02].compareTo(r52[r2]) <= 0) goto L17;
        m6314(r2, r02);
        r2 = r02;
        goto L9
    L17:
        return;
    L13:
        return;
    L6:
        if (r1.get(this) < r0.length) goto L8;
        r0 = (AbstractRunnableC4486[]) Arrays.copyOf(r0, r1.get(this) * 2);
        this.f10394 = r0;
        goto L8
    }
}
