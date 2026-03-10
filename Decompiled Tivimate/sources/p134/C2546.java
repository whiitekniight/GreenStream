package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C2546 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9029 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9030 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9031 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2546 f9032 = null;

    static {
        f9032 = new C2546();
        f9031 = C2217.m5392("name");
        f9029 = C2217.m5392("code");
        f9030 = C2217.m5392("address");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        C2598 r42 = (C2598) ((AbstractC2530) r4);
        String r0 = r42.f9227;
        r52.mo5391(f9031, r0);
        r52.mo5391(f9029, r42.f9226);
        r52.mo5389(f9030, r42.f9225);
    }
}
