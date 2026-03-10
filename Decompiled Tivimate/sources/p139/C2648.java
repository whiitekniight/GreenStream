package p139;

import com.parse.ʼᐧ;
import java.util.TreeSet;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ˈـ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2648 {

    /* JADX INFO: renamed from: ʽ */
    public int f9382;

    /* JADX INFO: renamed from: ˈ */
    public boolean f9383;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f9384;

    /* JADX INFO: renamed from: ﹳٴ */
    public final TreeSet f9385;

    public C2648() {
        this.f9385 = new TreeSet(new ʼᐧ(4));
        m5855();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m5852(int r4, int r5) {
        int r0 = r4 - r5;
        if (Math.abs(r0) <= 1000) goto L10;
        int r1 = (Math.min(r4, r5) - Math.max(r4, r5)) + 65535;
        if (r1 >= 1000) goto L10;
        if (r4 >= r5) goto L9;
        return r1;
    L9:
        return -r1;
    L10:
        return r0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final synchronized void m5853(C2628 r5, long r6) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.f9385.size() >= 5000) goto L26;
        int r0 = r5.f9277;     // Catch: Throwable -> L10
        if (this.f9383 == true) goto L13;
        m5855();     // Catch: Throwable -> L10
        this.f9382 = ˉˆ.ʼʼ(r0 - 1);     // Catch: Throwable -> L10
        this.f9383 = true;     // Catch: Throwable -> L10
        m5856(new C2635(r5, r6));     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L13:
        if (Math.abs(m5852(r0, C2628.m5808(this.f9384))) >= 1000) goto L22;
        if (m5852(r0, this.f9382) <= 0) goto L19;
        m5856(new C2635(r5, r6));     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L19:
        monitor-exit(this);
        return;
    L22:
        this.f9382 = ˉˆ.ʼʼ(r0 - 1);     // Catch: Throwable -> L10
        this.f9385.clear();     // Catch: Throwable -> L10
        m5856(new C2635(r5, r6));     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L26:
        throw new IllegalStateException("Queue size limit of 5000 reached.");     // Catch: Throwable -> L10
    }

    /* JADX INFO: renamed from: ˈ */
    public final synchronized C2628 m5854(long r6) {
        monitor-enter(this);
    L16:
        th = move-exception;
        throw th;
    L5:
        if (this.f9385.isEmpty() == false) goto L8;
        monitor-exit(this);
        return null;
    L8:
        C2635 r0 = (C2635) this.f9385.first();     // Catch: Throwable -> L16
        int r2 = r0.f9316.f9277;     // Catch: Throwable -> L16
        if (r2 != C2628.m5808(this.f9382)) goto L12;
    L18:
        this.f9385.pollFirst();     // Catch: Throwable -> L16
        this.f9382 = r2;     // Catch: Throwable -> L16
        C2628 r62 = r0.f9316;     // Catch: Throwable -> L16
        monitor-exit(this);
        return r62;
    L12:
        if (r6 >= r0.f9315) goto L18;
        monitor-exit(this);
        return null;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final synchronized void m5855() {
        monitor-enter(this);
        this.f9385.clear();     // Catch: Throwable -> L6
        this.f9383 = false;     // Catch: Throwable -> L6
        this.f9382 = -1;     // Catch: Throwable -> L6
        this.f9384 = -1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m5856(C2635 r2) {
        monitor-enter(this);
        this.f9384 = r2.f9316.f9277;     // Catch: Throwable -> L6
        this.f9385.add(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
