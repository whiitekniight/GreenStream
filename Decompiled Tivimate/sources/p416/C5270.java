package p416;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import p257.C3766;

/* JADX INFO: renamed from: ﹳʽ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C5270 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C5270 f18971 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final HashMap f18972;

    static {
        f18971 = new C5270();
    }

    public C5270() {
        this.f18972 = new HashMap();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m10268(C3766 r2, Class r3) {
        monitor-enter(this);
        C3766 r0 = (C3766) this.f18972.get(r3);     // Catch: Throwable -> L10
        if (r0 != null) goto L6;
    L12:
        this.f18972.put(r3, r2);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L6:
        if (r0.equals(r2) == true) goto L12;
        throw new GeneralSecurityException("Different key creator for parameters class already inserted");     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }
}
