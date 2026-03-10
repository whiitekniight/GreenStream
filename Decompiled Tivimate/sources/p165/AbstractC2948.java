package p165;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ˊʽ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2948 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10369 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10370 = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        f10370 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2948.class, Object.class, "_next$volatile");
        f10369 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2948.class, Object.class, "_prev$volatile");
    }

    public AbstractC2948(AbstractC2966 r1) {
        this._prev$volatile = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public final AbstractC2948 m6298() {
        Object r0 = f10370.get(this);
        if (r0 != AbstractC2964.f10410) goto L7;
        return null;
    L7:
        return (AbstractC2948) r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public abstract boolean mo6299();

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m6300() {
        if (m6298() != null) goto L5;
        return;
    L5:
        AtomicReferenceFieldUpdater r0 = f10369;
        AbstractC2948 r1 = (AbstractC2948) r0.get(this);
    L6:
        if (r1 == null) goto L10;
        if (r1.mo6299() == false) goto L10;
        r1 = (AbstractC2948) r0.get(r1);
    L10:
        AbstractC2948 r2 = m6298();
    L12:
        if (r2.mo6299() == false) goto L17;
        AbstractC2948 r3 = r2.m6298();
        if (r3 == null) goto L17;
        r2 = r3;
    L17:
        Object r32 = r0.get(r2);
        if (((AbstractC2948) r32) != null) goto L20;
        AbstractC2948 r4 = null;
    L22:
        if (r0.compareAndSet(r2, r32, r4) == true) goto L23;
        if (r0.get(r2) == r32) goto L22;
    L23:
        if (r1 == null) goto L26;
        f10370.set(r1, r2);
    L26:
        if (r2.mo6299() == false) goto L29;
        if (r2.m6298() != null) goto L5;
    L29:
        if (r1 == null) goto L32;
        if (r1.mo6299() == true) goto L5;
        return;
    L32:
        return;
    L20:
        r4 = r1;
        goto L22
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6301() {
        f10369.set(this, null);
    }
}
