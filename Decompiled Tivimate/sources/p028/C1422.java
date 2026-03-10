package p028;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ʼ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1422 extends ˉˆ {

    /* JADX INFO: renamed from: ʽ */
    public final X509TrustManager f4807;

    /* JADX INFO: renamed from: ˈ */
    public final X509TrustManagerExtensions f4808;

    public C1422(X509TrustManager r1, X509TrustManagerExtensions r2) {
        this.f4807 = r1;
        this.f4808 = r2;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1422) == true) goto L5;
        return false;
    L5:
        if (((C1422) r2).f4807 != this.f4807) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4807);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final List m3915(String r3, List r4) {
        X509Certificate[] r42 = (X509Certificate[]) r4.toArray(new X509Certificate[0]);
        return this.f4808.checkServerTrusted(r42, "RSA", r3);
    L5:
        e = move-exception;
        SSLPeerUnverifiedException r43 = new SSLPeerUnverifiedException(e.getMessage());
        r43.initCause(e);
        throw r43;
    }
}
