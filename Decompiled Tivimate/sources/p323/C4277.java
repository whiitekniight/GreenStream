package p323;

import p025.C1390;
import p341.InterfaceC4589;

/* JADX INFO: renamed from: ᐧᵢ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4277 implements InterfaceC4589 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f15650;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ InterfaceC4284 f15651;

    public /* synthetic */ C4277(InterfaceC4284 r1, int r2) {
        this.f15650 = r2;
        this.f15651 = r1;
    }

    @Override // p341.InterfaceC4589
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo4555(Object r2) {
        switch(this.f15650) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Throwable r22 = (Throwable) r2;
        this.f15651.cancel();
        return C1390.f4774;
    L6:
        Throwable r23 = (Throwable) r2;
        this.f15651.cancel();
        return C1390.f4774;
    L8:
        Throwable r24 = (Throwable) r2;
        this.f15651.cancel();
        return C1390.f4774;
    }
}
