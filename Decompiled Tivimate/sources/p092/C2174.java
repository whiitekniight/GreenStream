package p092;

import android.os.Handler;
import android.os.Message;
import p149.AbstractC2788;

/* JADX INFO: renamed from: ʿʾ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2174 implements Handler.Callback {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f7819;

    public /* synthetic */ C2174(int r1) {
        this.f7819 = r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r3) {
        switch(this.f7819) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        int r0 = r3.what;
        if (r0 == 0) goto L13;
        if (r0 == 1) goto L11;
        return false;
    L11:
        throw AbstractC2788.m6079(r3.obj);
    L13:
        throw AbstractC2788.m6079(r3.obj);
    L15:
        if (r3.what != 1) goto L17;
        ((InterfaceC2193) r3.obj).mo5115();
        return true;
    L17:
        return false;
    }
}
