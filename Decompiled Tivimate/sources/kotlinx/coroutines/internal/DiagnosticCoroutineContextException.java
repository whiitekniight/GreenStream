package kotlinx.coroutines.internal;

import p138.InterfaceC2622;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: ʾˋ */
    public final transient InterfaceC2622 f4052;

    public DiagnosticCoroutineContextException(InterfaceC2622 r1) {
        this.f4052 = r1;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f4052);
    }
}
