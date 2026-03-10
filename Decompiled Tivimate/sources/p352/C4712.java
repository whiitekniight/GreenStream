package p352;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p138.InterfaceC2619;
import p164.C2931;

/* JADX INFO: renamed from: ᵎˈ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4712 implements InterfaceC4739 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f16660;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C2931 f16661;

    public /* synthetic */ C4712(C2931 r1, int r2) {
        this.f16660 = r2;
        this.f16661 = r1;
    }

    @Override // p352.InterfaceC4739
    /* JADX INFO: renamed from: ﹳٴ */
    public final Object mo4110(Object r1, InterfaceC2619 r2) {
        switch(this.f16660) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f16661.f10351 = r1;
        throw new AbortFlowException(this);
    L6:
        this.f16661.f10351 = r1;
        throw new AbortFlowException(this);
    }
}
