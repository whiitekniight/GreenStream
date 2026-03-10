package p028;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ʼ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C1416 implements InterfaceC1420 {

    /* JADX INFO: renamed from: ⁱˊ */
    public InterfaceC1420 f4795;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC1424 f4796;

    public C1416(InterfaceC1424 r1) {
        this.f4796 = r1;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo3910() {
        return true;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ˈ */
    public final void mo3911(SSLSocket r2, String r3, List r4) {
        InterfaceC1420 r0 = m3912(r2);
        if (r0 == null) goto L6;
        r0.mo3911(r2, r3, r4);
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final synchronized InterfaceC1420 m3912(SSLSocket r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f4795 == null) goto L6;
    L10:
        InterfaceC1420 r22 = this.f4795;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r22;
    L6:
        if (this.f4796.mo3907(r2) == false) goto L10;
        this.f4795 = this.f4796.mo3906(r2);     // Catch: Throwable -> L8
        goto L10
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3913(SSLSocket r2) {
        return this.f4796.mo3907(r2);
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ﹳٴ */
    public final String mo3914(SSLSocket r2) {
        InterfaceC1420 r0 = m3912(r2);
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.mo3914(r2);
    }
}
