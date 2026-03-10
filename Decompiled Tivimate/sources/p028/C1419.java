package p028;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p283.AbstractC3963;
import ˋⁱ.ﾞᴵ;

/* JADX INFO: renamed from: ʼ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1419 implements InterfaceC1420 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final boolean f4803 = false;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1412 f4804 = null;

    static {
        f4804 = new C1412();
        boolean r0 = false;
        Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC1414.class.getClassLoader());     // Catch: Throwable -> L10
        if (Conscrypt.isAvailable() == false) goto L8;
        if (AbstractC1414.m3909() == false) goto L8;
        r0 = true;
    L8:
        f4803 = r0;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo3910() {
        return f4803;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ˈ */
    public final void mo3911(SSLSocket r1, String r2, List r3) {
        if (mo3913(r1) == false) goto L6;
        Conscrypt.setUseSessionTickets(r1, true);
        AbstractC3963 r22 = AbstractC3963.f14600;
        Conscrypt.setApplicationProtocols(r1, (String[]) ﾞᴵ.יـ(r3).toArray(new String[0]));
        return;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3913(SSLSocket r1) {
        return Conscrypt.isConscrypt(r1);
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ﹳٴ */
    public final String mo3914(SSLSocket r2) {
        if (mo3913(r2) == true) goto L5;
        return null;
    L5:
        return Conscrypt.getApplicationProtocol(r2);
    }
}
