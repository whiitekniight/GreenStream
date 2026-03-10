package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;
import p133.AbstractC2504;
import p165.C2952;
import p341.InterfaceC4589;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˈⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 {

    /* JADX INFO: renamed from: ʽ */
    public final Object f2360;

    /* JADX INFO: renamed from: ⁱˊ */
    public volatile Object f2361;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f2362;

    public C0559() {
        this.f2360 = new Object();
        this.f2362 = AbstractC2504.class.getName();
    }

    public C0559(Class r2) {
        this.f2360 = new C0562();
        this.f2362 = r2.getName();
    }

    public C0559(String r1, InterfaceC4589 r2, C2952 r3) {
        this.f2362 = r1;
        this.f2360 = new Object();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public Logger m2192() {
        Logger r0 = (Logger) this.f2361;
        if (r0 == null) goto L5;
        return r0;
    L5:
        C0562 r02 = (C0562) this.f2360;
        monitor-enter(r02);
        Logger r1 = (Logger) this.f2361;     // Catch: Throwable -> L11
        if (r1 == null) goto L13;
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r1;
    L13:
        Logger r12 = Logger.getLogger(this.f2362);     // Catch: Throwable -> L11
        this.f2361 = r12;     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r12;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public Logger m2193() {
        Logger r0 = (Logger) this.f2361;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Object r02 = this.f2360;
        monitor-enter(r02);
        Logger r1 = (Logger) this.f2361;     // Catch: Throwable -> L11
        if (r1 == null) goto L13;
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r1;
    L13:
        Logger r12 = Logger.getLogger(this.f2362);     // Catch: Throwable -> L11
        this.f2361 = r12;     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r12;
    L11:
        th = move-exception;
        throw th;
    }
}
