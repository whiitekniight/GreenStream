package p249;

import android.os.Handler;
import android.os.Looper;
import p308.C4164;

/* JADX INFO: renamed from: ˑי.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3685 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static C3685 f13195;

    /* JADX INFO: renamed from: ﹳٴ */
    public Object f13196;

    public C3685() {
        this.f13196 = new Object();
        new Handler(Looper.getMainLooper(), new C4164(1, this));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m7753() {
        Object r0 = this.f13196;
        monitor-enter(r0);
        monitor-exit(r0);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
