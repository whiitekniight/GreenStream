package p005j$.util.stream;

import java.security.AccessController;
import p005j$.util.C0969s0;

/* JADX INFO: renamed from: j$.util.stream.G3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1004G3 {

    /* JADX INFO: renamed from: a */
    public static final boolean f3688a = false;

    static {
        f3688a = ((Boolean) AccessController.doPrivileged(new C0969s0(2))).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m3279a(Class r2, String r3) {
        throw new UnsupportedOperationException(r2 + " tripwire tripped but logging not supported: " + r3);
    }
}
