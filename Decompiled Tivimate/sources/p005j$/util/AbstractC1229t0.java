package p005j$.util;

import java.security.AccessController;

/* JADX INFO: renamed from: j$.util.t0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1229t0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f4045a = false;

    static {
        f4045a = ((Boolean) AccessController.doPrivileged(new C0969s0(0))).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m3448a(Class r2, String r3) {
        throw new UnsupportedOperationException(r2 + " tripwire tripped but logging not supported: " + r3);
    }
}
