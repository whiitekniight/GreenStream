package p165;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p138.InterfaceC2622;
import p336.InterfaceC4498;

/* JADX INFO: renamed from: ˊʽ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2966 extends AbstractC2948 implements InterfaceC4498 {

    /* JADX INFO: renamed from: ˈ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10413 = null;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: ʽ */
    public final long f10414;

    static {
        f10413 = AtomicIntegerFieldUpdater.newUpdater(AbstractC2966.class, "cleanedAndPointers$volatile");
    }

    public AbstractC2966(long r1, AbstractC2966 r3, int r4) {
        super(r3);
        this.f10414 = r1;
        this.cleanedAndPointers$volatile = r4 << 16;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m6342() {
        if (f10413.incrementAndGet(this) != mo4614()) goto L6;
        m6300();
        return;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final boolean m6343() {
    L2:
        AtomicIntegerFieldUpdater r0 = f10413;
        int r1 = r0.get(this);
        if (r1 != mo4614()) goto L10;
        if (m6298() == null) goto L10;
        return false;
    L10:
        if (r0.compareAndSet(this, r1, 65536 + r1) == false) goto L2;
        return true;
    }

    @Override // p165.AbstractC2948
    /* JADX INFO: renamed from: ˈ */
    public final boolean mo6299() {
        if (f10413.get(this) == mo4614()) goto L5;
        return false;
    L5:
        if (m6298() == null) goto L11;
        return true;
    L11:
        return false;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract int mo4614();

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract void mo4616(int r1, InterfaceC2622 r2);

    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean m6344() {
        if (f10413.addAndGet(this, -65536) == mo4614()) goto L5;
        return false;
    L5:
        if (m6298() == null) goto L11;
        return true;
    L11:
        return false;
    }
}
