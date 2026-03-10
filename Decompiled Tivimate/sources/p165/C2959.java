package p165;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ˊʽ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public class C2959 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10395 = null;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        f10395 = AtomicReferenceFieldUpdater.newUpdater(C2959.class, Object.class, "_cur$volatile");
    }

    public C2959() {
        this._cur$volatile = new C2953(8, false);
    }

    /* JADX INFO: renamed from: ʽ */
    public final int m6317() {
        C2953 r0 = (C2953) f10395.get(this);
        r0.getClass();
        long r02 = C2953.f10384.get(r0);
        int r2 = (int) (1073741823 & r02);
        return (((int) ((r02 & 1152921503533105152L) >> 30)) - r2) & 1073741823;
    }

    /* JADX INFO: renamed from: ˈ */
    public final Object m6318() {
    L2:
        AtomicReferenceFieldUpdater r0 = f10395;
        C2953 r1 = (C2953) r0.get(this);
        Object r2 = r1.m6310();
        if (r2 != C2953.f10383) goto L4;
        C2953 r22 = r1.m6309();
    L7:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    L4:
        return r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6319() {
    L2:
        AtomicReferenceFieldUpdater r0 = f10395;
        C2953 r1 = (C2953) r0.get(this);
        if (r1.m6311() == true) goto L4;
        C2953 r2 = r1.m6309();
    L7:
        if (r0.compareAndSet(this, r1, r2) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m6320(Runnable r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = f10395;
        C2953 r1 = (C2953) r0.get(this);
        int r2 = r1.m6312(r5);
        if (r2 == 0) goto L17;
        if (r2 != 1) goto L6;
        C2953 r22 = r1.m6309();
    L12:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L12;
    L6:
        if (r2 != 2) goto L2;
        return false;
    L17:
        return true;
    }
}
