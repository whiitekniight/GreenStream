package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C0544 extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        monitor-enter(this);
        setStackTrace(new StackTraceElement[0]);     // Catch: Throwable -> L7
        monitor-exit(this);
        return this;
    L7:
        th = move-exception;
        throw th;
    }
}
