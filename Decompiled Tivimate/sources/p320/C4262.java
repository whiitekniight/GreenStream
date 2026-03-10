package p320;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ᐧٴ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C4262 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f15624 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f15625 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C4262 f15626 = null;

    static {
        f15626 = new C4262();
        f15625 = C2217.m5392("clearBlob");
        f15624 = C2217.m5392("encryptedBlob");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C4230 r32 = (C4230) ((AbstractC4250) r3);
        byte[] r0 = r32.f15544;
        r42.mo5391(f15625, r0);
        r42.mo5391(f15624, r32.f15543);
    }
}
