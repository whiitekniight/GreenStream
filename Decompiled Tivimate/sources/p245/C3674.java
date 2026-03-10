package p245;

import android.content.Context;

/* JADX INFO: renamed from: ˑˊ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3674 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C3674 f13151 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public C3675 f13152;

    static {
        C3674 r0 = new C3674();
        r0.f13152 = null;
        f13151 = r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C3675 m7725(Context r2) {
        C3674 r0 = f13151;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r0.f13152 == null) goto L7;
    L12:
        C3675 r22 = r0.f13152;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r22;
    L7:
        if (r2.getApplicationContext() == null) goto L11;
        r2 = r2.getApplicationContext();     // Catch: Throwable -> L9
    L11:
        r0.f13152 = new C3675(r2);     // Catch: Throwable -> L9
        goto L12
    }
}
