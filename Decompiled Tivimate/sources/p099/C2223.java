package p099;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p437.C5514;

/* JADX INFO: renamed from: ʿٴ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public class C2223 {

    /* JADX INFO: renamed from: ʽ */
    public Serializable f8035;

    /* JADX INFO: renamed from: ⁱˊ */
    public long f8036;

    /* JADX INFO: renamed from: ﹳٴ */
    public long f8037;

    public C2223() {
        this.f8037 = -9223372036854775807L;
        this.f8036 = -9223372036854775807L;
    }

    public C2223(long r5) {
        this.f8035 = new LinkedHashMap(100, 0.75f, true);
        this.f8037 = r5;
    }

    /* JADX INFO: renamed from: ʽ */
    public void mo5218(Object r1, Object r2) {
    }

    /* JADX INFO: renamed from: ˈ */
    public synchronized Object m5400(Object r8, Object r9) {
        monitor-enter(this);
        int r0 = mo5220(r9);     // Catch: Throwable -> L8
        long r1 = r0;
        Object r4 = null;
        if (r1 < this.f8037) goto L10;
        mo5218(r8, r9);     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L10:
        if (r9 == null) goto L12;
        this.f8036 += r1;
    L12:
        LinkedHashMap r12 = (LinkedHashMap) this.f8035;     // Catch: Throwable -> L8
        if (r9 != null) goto L15;
        C2221 r2 = null;
    L16:
        C2221 r02 = (C2221) r12.put(r8, r2);     // Catch: Throwable -> L8
        if (r02 == null) goto L21;
        this.f8036 -= (long) r02.f8032;
        if (r02.f8033.equals(r9) == true) goto L21;
        mo5218(r8, r02.f8033);     // Catch: Throwable -> L8
    L21:
        m5403(this.f8037);     // Catch: Throwable -> L8
        if (r02 == null) goto L24;
        r4 = r02.f8033;     // Catch: Throwable -> L8
    L24:
        monitor-exit(this);
        return r4;
    L15:
        r2 = new C2221(r0, r9);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public void m5401(Exception r8) {
        long r0 = SystemClock.elapsedRealtime();
        if (((Exception) this.f8035) != null) goto L6;
        this.f8035 = r8;
    L6:
        if (this.f8037 != (-9223372036854775807L)) goto L19;
        Object r2 = C5514.f19776;
        monitor-enter(r2);
    L16:
        th = move-exception;
        throw th;
    L10:
        if (C5514.f19775 <= 0) goto L12;
        boolean r3 = true;
    L13:
        monitor-exit(r2);     // Catch: Throwable -> L16
        if (r3 == true) goto L19;
        this.f8037 = 200 + r0;
        goto L19
    L12:
        r3 = false;
    L19:
        long r22 = this.f8037;
        if (r22 != (-9223372036854775807L)) goto L22;
    L28:
        this.f8036 = r0 + 50;
        return;
    L22:
        if (r0 < r22) goto L28;
        Exception r02 = (Exception) this.f8035;
        if (r02 == r8) goto L26;
        r02.addSuppressed(r8);
    L26:
        Exception r82 = (Exception) this.f8035;
        this.f8035 = null;
        this.f8037 = -9223372036854775807L;
        this.f8036 = -9223372036854775807L;
        throw r82;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public int mo5220(Object r1) {
        return 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public synchronized Object m5402(Object r2) {
        monitor-enter(this);
        C2221 r22 = (C2221) ((LinkedHashMap) this.f8035).get(r2);     // Catch: Throwable -> L7
        if (r22 == null) goto L9;
        Object r23 = r22.f8033;     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r23;
    L9:
        r23 = null;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public synchronized void m5403(long r8) {
        monitor-enter(this);
    L13:
        if (this.f8036 <= r8) goto L9;
        Iterator r0 = ((LinkedHashMap) this.f8035).entrySet().iterator();     // Catch: Throwable -> L7
        Map.Entry r1 = (Map.Entry) r0.next();     // Catch: Throwable -> L7
        C2221 r2 = (C2221) r1.getValue();     // Catch: Throwable -> L7
        this.f8036 -= (long) r2.f8032;
        Object r12 = r1.getKey();     // Catch: Throwable -> L7
        r0.remove();     // Catch: Throwable -> L7
        mo5218(r12, r2.f8033);     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
