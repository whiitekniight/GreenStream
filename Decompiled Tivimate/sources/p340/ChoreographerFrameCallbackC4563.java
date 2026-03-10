package p340;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᴵᵔ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4563 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ C4548 f16491;

    public ChoreographerFrameCallbackC4563(C4548 r1) {
        this.f16491 = r1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r6) {
        long r62 = r6 / 1000000;
        C4548 r0 = this.f16491;
        ArrayList r1 = r0.f16410;
        int r3 = 0;
    L4:
        if (r3 >= r1.size()) goto L11;
        InterfaceC4564 r4 = (InterfaceC4564) r1.get(r3);
        if (r4 == null) goto L9;
        r4.mo9024(r62);
    L9:
        r3 = r3 + 1;
        goto L4
    L11:
        if (r0.f16409 == false) goto L20;
        int r63 = r1.size() - 1;
    L13:
        if (r63 < 0) goto L18;
        if (r1.get(r63) != null) goto L17;
        r1.remove(r63);
    L17:
        r63 = r63 - 1;
        goto L13
    L18:
        r0.f16409 = false;
    L20:
        if (r1.size() <= 0) goto L29;
        ChoreographerFrameCallbackC4563 r64 = r0.f16411;
        r64.getClass();
        Choreographer.getInstance().postFrameCallback(r64);
        return;
    }
}
