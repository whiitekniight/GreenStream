package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C2563 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9089 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9090 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2563 f9091 = null;

    static {
        f9091 = new C2563();
        f9090 = C2217.m5392("rolloutId");
        f9089 = C2217.m5392("variantId");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2521 r32 = (C2521) ((AbstractC2601) r3);
        String r0 = r32.f8901;
        r42.mo5391(f9090, r0);
        r42.mo5391(f9089, r32.f8900);
    }
}
