package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import p352.InterfaceC4739;

/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: ʾˋ */
    public final transient Object f4051;

    public AbortFlowException(InterfaceC4739 r2) {
        super("Flow was aborted, no more elements needed");
        this.f4051 = r2;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
