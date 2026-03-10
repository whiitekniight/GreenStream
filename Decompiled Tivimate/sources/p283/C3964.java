package p283;

import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p027.InterfaceC1409;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ـᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3964 implements InterfaceC1409 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Method f14601;

    /* JADX INFO: renamed from: ﹳٴ */
    public final X509TrustManager f14602;

    public C3964(X509TrustManager r1, Method r2) {
        this.f14602 = r1;
        this.f14601 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3964) == true) goto L8;
        return false;
    L8:
        C3964 r52 = (C3964) r5;
        if (AbstractC2927.m6273(this.f14602, r52.f14602) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f14601, r52.f14601) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f14602.hashCode() * 31;
        return this.f14601.hashCode() + r0;
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f14602 + ", findByIssuerAndSignatureMethod=" + this.f14601 + ')';
    }

    @Override // p027.InterfaceC1409
    /* JADX INFO: renamed from: ﹳٴ */
    public final X509Certificate mo3903(X509Certificate r5) {
        return ((TrustAnchor) this.f14601.invoke(this.f14602, new Object[]{r5})).getTrustedCert();
    L4:
        e = move-exception;
        throw new AssertionError("unable to get issues and signature", e);
    L6:
        return null;
    }
}
