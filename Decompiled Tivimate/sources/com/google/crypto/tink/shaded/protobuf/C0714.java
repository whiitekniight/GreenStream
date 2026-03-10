package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C0714 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C0714 f3013 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static volatile C0714 f3014;

    static {
        C0714 r0 = new C0714();
        Map r1 = Collections.EMPTY_MAP;
        f3013 = r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C0714 m2583() {
        C0697 r0 = C0697.f2977;
        C0714 r02 = f3014;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(C0714.class);
        C0714 r03 = f3014;     // Catch: Throwable -> L18
        if (r03 != null) goto L20;
        Class r2 = AbstractC0742.f3059;     // Catch: Throwable -> L18
        C0714 r3 = null;
        if (r2 != null) goto L26;
    L14:
        if (r3 == null) goto L16;
        r03 = r3;
    L17:
        f3014 = r03;     // Catch: Throwable -> L18
        goto L20
    L16:
        r03 = f3013;     // Catch: Throwable -> L18
        goto L17
    L26:
        r3 = (C0714) r2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);     // Catch: Exception -> L25 Throwable -> L18
    L20:
        monitor-exit(C0714.class);     // Catch: Throwable -> L18
        return r03;
    L18:
        th = move-exception;
        throw th;
    }
}
