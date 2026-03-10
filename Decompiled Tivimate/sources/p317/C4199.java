package p317;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᐧˎ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4199 {

    /* JADX INFO: renamed from: ﹳٴ */
    public Message f15433;

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m8527() {
        Message r0 = this.f15433;
        r0.getClass();
        r0.sendToTarget();
        m8528();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m8528() {
        this.f15433 = null;
        ArrayList r0 = C4194.f15412;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.size() >= 50) goto L9;
        r0.add(this);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }
}
