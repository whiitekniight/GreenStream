package p040;

import android.os.Looper;
import android.support.v4.media.session.ⁱˊ;

/* JADX INFO: renamed from: ʼᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1601 extends ⁱˊ {

    /* JADX INFO: renamed from: ٴﹶ */
    public static volatile C1601 f5314;

    /* JADX INFO: renamed from: ﾞʻ */
    public static final ExecutorC1602 f5315 = null;

    /* JADX INFO: renamed from: ˆʾ */
    public final C1600 f5316;

    static {
        f5315 = new ExecutorC1602(0);
    }

    public C1601() {
        this.f5316 = new C1600();
    }

    /* JADX INFO: renamed from: ʾˋ */
    public static C1601 m4256() {
        if (f5314 == null) goto L7;
        return f5314;
    L7:
        monitor-enter(C1601.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f5314 != null) goto L13;
        f5314 = new C1601();     // Catch: Throwable -> L11
    L13:
        monitor-exit(C1601.class);     // Catch: Throwable -> L11
        return f5314;
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public final void m4257(Runnable r4) {
        C1600 r0 = this.f5316;
        if (r0.f5313 != null) goto L15;
        Object r1 = r0.f5311;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (r0.f5313 != null) goto L11;
        r0.f5313 = C1600.m4255(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L9
    L15:
        r0.f5313.post(r4);
    }
}
