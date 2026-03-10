package p202;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ˋﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3355 extends ProxySelector {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C3355 f11729 = null;

    static {
        f11729 = new C3355();
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI r1, SocketAddress r2, IOException r3) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI r2) {
        if (r2 == null) goto L6;
        return Collections.singletonList(Proxy.NO_PROXY);
    L6:
        throw new IllegalArgumentException("uri must not be null");
    }
}
