package p028;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p283.AbstractC3963;
import ˋⁱ.ﾞᴵ;

/* JADX INFO: renamed from: ʼ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1421 implements InterfaceC1420 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final boolean f4805 = false;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1425 f4806 = null;

    static {
        f4806 = new C1425();
        boolean r0 = false;
        Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, ᵎﹶ.class.getClassLoader());     // Catch: ClassNotFoundException -> L7
        r0 = true;
    L5:
        f4805 = r0;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo3910() {
        return f4805;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ˈ */
    public final void mo3911(SSLSocket r2, String r3, List r4) {
        if (mo3913(r2) == false) goto L6;
        BCSSLSocket r22 = (BCSSLSocket) r2;
        BCSSLParameters r32 = r22.getParameters();
        AbstractC3963 r0 = AbstractC3963.f14600;
        r32.setApplicationProtocols((String[]) ﾞᴵ.יـ(r4).toArray(new String[0]));
        r22.setParameters(r32);
        return;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3913(SSLSocket r1) {
        return false;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ﹳٴ */
    public final String mo3914(SSLSocket r2) {
        String r22 = ((BCSSLSocket) r2).getApplicationProtocol();
        if (r22 != null) goto L5;
        return null;
    L5:
        if (r22.equals("") == true) goto L10;
        return r22;
    L10:
        return null;
    }
}
