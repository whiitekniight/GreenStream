package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C0056 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C0056 f484 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static volatile C0056 f485;

    static {
        C0056 r0 = new C0056();
        Map r1 = Collections.EMPTY_MAP;
        f484 = r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C0056 m359() {
        C0035 r0 = C0035.f426;
        C0056 r02 = f485;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(C0056.class);
        C0056 r03 = f485;     // Catch: Throwable -> L18
        if (r03 != null) goto L20;
        Class r2 = AbstractC0024.f409;     // Catch: Throwable -> L18
        C0056 r3 = null;
        if (r2 != null) goto L26;
    L14:
        if (r3 == null) goto L16;
        r03 = r3;
    L17:
        f485 = r03;     // Catch: Throwable -> L18
        goto L20
    L16:
        r03 = f484;     // Catch: Throwable -> L18
        goto L17
    L26:
        r3 = (C0056) r2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);     // Catch: Exception -> L25 Throwable -> L18
    L20:
        monitor-exit(C0056.class);     // Catch: Throwable -> L18
        return r03;
    L18:
        th = move-exception;
        throw th;
    }
}
