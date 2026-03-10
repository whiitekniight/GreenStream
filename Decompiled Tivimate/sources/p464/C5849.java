package p464;

import android.support.v4.media.session.ⁱˊ;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p304.C4134;
import p341.InterfaceC4587;
import p406.AbstractC5195;

/* JADX INFO: renamed from: ﾞʿ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5849 {

    /* JADX INFO: renamed from: ʽ */
    public boolean f21367;

    /* JADX INFO: renamed from: ˈ */
    public AbstractC5850 f21368;

    /* JADX INFO: renamed from: ˑﹳ */
    public final ArrayList f21369;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f21370;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5848 f21371;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f21372;

    public C5849(C5848 r1, String r2) {
        this.f21371 = r1;
        this.f21370 = r2;
        this.f21369 = new ArrayList();
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m11479(C5849 r1, String r2, InterfaceC4587 r3) {
        r1.getClass();
        r1.m11480(new C4134(r2, r3), 0);
    }

    public final String toString() {
        return this.f21370;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m11480(AbstractC5850 r3, long r4) {
        C5848 r0 = this.f21371;
        monitor-enter(r0);
    L12:
        th = move-exception;
        throw th;
    L5:
        if (this.f21367 == false) goto L22;
        if (r3.f21375 == false) goto L16;
        Logger r42 = this.f21371.f21364;     // Catch: Throwable -> L12
        if (r42.isLoggable(Level.FINE) == false) goto L14;
        ⁱˊ.ﹳٴ(r42, r3, this, "schedule canceled (queue is shutdown)");     // Catch: Throwable -> L12
    L14:
        monitor-exit(r0);
        return;
    L16:
        Logger r43 = this.f21371.f21364;     // Catch: Throwable -> L12
        if (r43.isLoggable(Level.FINE) == false) goto L20;
        ⁱˊ.ﹳٴ(r43, r3, this, "schedule failed (queue is shutdown)");     // Catch: Throwable -> L12
    L20:
        throw new RejectedExecutionException();     // Catch: Throwable -> L12
    L22:
        if (m11481(r3, r4, false) == false) goto L24;
        this.f21371.m11475(this);     // Catch: Throwable -> L12
    L24:
        monitor-exit(r0);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m11481(AbstractC5850 r12, long r13, boolean r15) {
        Logger r0 = this.f21371.f21364;
        C5849 r1 = r12.f21373;
        if (r1 == this) goto L7;
        if (r1 != null) goto L37;
        r12.f21373 = this;
        goto L7
    L37:
        throw new IllegalStateException("task is in multiple queues");
    L7:
        long r14 = System.nanoTime();
        long r3 = r14 + r13;
        ArrayList r5 = this.f21369;
        int r6 = r5.indexOf(r12);
        if (r6 != (-1)) goto L10;
    L16:
        r12.f21374 = r3;
        if (r0.isLoggable(Level.FINE) == false) goto L22;
        if (r15 == false) goto L20;
        String r152 = "run again after ".concat(ⁱˊ.ﾞᴵ(r3 - r14));
    L21:
        ⁱˊ.ﹳٴ(r0, r12, this, r152);
        goto L22
    L20:
        r152 = "scheduled after ".concat(ⁱˊ.ﾞᴵ(r3 - r14));
    L22:
        int r153 = r5.size();
        int r02 = 0;
        int r32 = 0;
    L23:
        if (r32 >= r153) goto L28;
        Object r4 = r5.get(r32);
        r32 = r32 + 1;
        if ((((AbstractC5850) r4).f21374 - r14) > r13) goto L29;
        r02 = r02 + 1;
    L29:
        if (r02 != (-1)) goto L31;
        r02 = r5.size();
    L31:
        r5.add(r02, r12);
        if (r02 != 0) goto L35;
        return true;
    L35:
        return false;
    L28:
        r02 = -1;
        goto L29
    L10:
        if (r12.f21374 <= r3) goto L12;
        r5.remove(r6);
        goto L16
    L12:
        if (r0.isLoggable(Level.FINE) == false) goto L35;
        ⁱˊ.ﹳٴ(r0, r12, this, "already scheduled");
        return false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean m11482() {
        AbstractC5850 r0 = this.f21368;
        if (r0 != null) goto L5;
    L7:
        ArrayList r02 = this.f21369;
        int r2 = r02.size() - 1;
        boolean r3 = false;
    L9:
        if ((-1) >= r2) goto L17;
        if (((AbstractC5850) r02.get(r2)).f21375 == false) goto L16;
        Logger r32 = this.f21371.f21364;
        AbstractC5850 r4 = (AbstractC5850) r02.get(r2);
        if (r32.isLoggable(Level.FINE) == false) goto L15;
        ⁱˊ.ﹳٴ(r32, r4, this, "canceled");
    L15:
        r02.remove(r2);
        r3 = true;
    L16:
        r2 = r2 - 1;
        goto L9
    L17:
        return r3;
    L5:
        if (r0.f21375 == false) goto L7;
        this.f21372 = true;
        goto L7
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m11483() {
        C5848 r0 = this.f21371;
        TimeZone r1 = AbstractC5195.f18746;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (m11482() == false) goto L10;
        this.f21371.m11475(this);     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m11484() {
        C5848 r0 = this.f21371;
        TimeZone r1 = AbstractC5195.f18746;
        monitor-enter(r0);
        this.f21367 = true;     // Catch: Throwable -> L9
        if (m11482() == false) goto L11;
        this.f21371.m11475(this);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);
        return;
    L9:
        th = move-exception;
        throw th;
    }
}
