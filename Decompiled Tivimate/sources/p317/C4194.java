package p317;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᐧˎ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4194 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final ArrayList f15412 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Handler f15413;

    static {
        f15412 = new ArrayList(50);
    }

    public C4194(Handler r1) {
        this.f15413 = r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C4199 m8460() {
        ArrayList r0 = f15412;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.isEmpty() == false) goto L9;
        C4199 r1 = new C4199();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L9:
        r1 = (C4199) r0.remove(r0.size() - 1);     // Catch: Throwable -> L7
        goto L10
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m8461(Runnable r2) {
        return this.f15413.post(r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m8462(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        AbstractC4214.m8560(r0);
        this.f15413.removeMessages(r2);
        return;
    L4:
        r0 = false;
        goto L5
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m8463(int r2) {
        return this.f15413.sendEmptyMessage(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4199 m8464(int r3, Object r4) {
        C4199 r0 = m8460();
        r0.f15433 = this.f15413.obtainMessage(r3, r4);
        return r0;
    }
}
