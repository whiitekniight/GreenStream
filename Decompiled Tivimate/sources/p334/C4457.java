package p334;

import androidx.work.Worker;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ᴵˋ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4457 implements InterfaceC4587 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f16263;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ Worker f16264;

    public /* synthetic */ C4457(Worker r1, int r2) {
        this.f16263 = r2;
        this.f16264 = r1;
    }

    @Override // p341.InterfaceC4587
    /* JADX INFO: renamed from: ʽ */
    public final Object mo716() {
        switch(this.f16263) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        this.f16264.getClass();
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    L7:
        return this.f16264.mo1022();
    }
}
