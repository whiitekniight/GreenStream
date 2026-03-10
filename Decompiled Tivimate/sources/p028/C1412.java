package p028;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ʼ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1412 implements InterfaceC1424 {
    @Override // p028.InterfaceC1424
    /* JADX INFO: renamed from: ʼˎ */
    public final InterfaceC1420 mo3906(SSLSocket r1) {
        return new C1419();
    }

    @Override // p028.InterfaceC1424
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3907(SSLSocket r2) {
        if (C1419.f4803 == true) goto L5;
        return false;
    L5:
        if (Conscrypt.isConscrypt(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
