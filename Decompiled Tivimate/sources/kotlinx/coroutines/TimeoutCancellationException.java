package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p336.InterfaceC4519;

/* JADX INFO: loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: ʾˋ */
    public final transient InterfaceC4519 f4050;

    public TimeoutCancellationException(String r1, InterfaceC4519 r2) {
        super(r1);
        this.f4050 = r2;
    }
}
