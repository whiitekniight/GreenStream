package p328;

import p138.InterfaceC2619;
import p138.InterfaceC2622;

/* JADX INFO: renamed from: ᴵʾ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4390 implements InterfaceC2619 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C4390 f16110 = null;

    static {
        f16110 = new C4390();
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // p138.InterfaceC2619
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4260(Object r2) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p138.InterfaceC2619
    /* JADX INFO: renamed from: ﾞᴵ */
    public final InterfaceC2622 mo4262() {
        throw new IllegalStateException("This continuation is already complete");
    }
}
