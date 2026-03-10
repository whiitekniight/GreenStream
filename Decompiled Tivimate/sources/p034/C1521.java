package p034;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: ʼˊ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1521 {

    /* JADX INFO: renamed from: ⁱˊ */
    public int f5012;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object[] f5013;

    public C1521() {
        this.f5013 = new Object[512];
        this.f5012 = 0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final synchronized void m4086(SoftReference r3) {
        monitor-enter(this);
        int r0 = (this.f5012 + 1) & 511;     // Catch: Throwable -> L6
        this.f5012 = r0;     // Catch: Throwable -> L6
        this.f5013[r0] = r3;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized Object m4087() {
        monitor-enter(this);
        Object[] r0 = this.f5013;     // Catch: Throwable -> L6
        int r1 = this.f5012;     // Catch: Throwable -> L6
        Object r2 = r0[r1];     // Catch: Throwable -> L6
        r0[r1] = null;     // Catch: Throwable -> L6
        this.f5012 = (r1 - 1) & 511;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r2;
    L6:
        th = move-exception;
        throw th;
    }
}
