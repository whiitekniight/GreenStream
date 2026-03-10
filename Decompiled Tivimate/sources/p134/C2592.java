package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2592 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9207 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9208 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9209 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9210 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2592 f9211 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f9212 = null;

    static {
        f9211 = new C2592();
        f9210 = C2217.m5392("pc");
        f9207 = C2217.m5392("symbol");
        f9208 = C2217.m5392("file");
        f9209 = C2217.m5392("offset");
        f9212 = C2217.m5392("importance");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        C2547 r42 = (C2547) ((AbstractC2534) r4);
        long r0 = r42.f9037;
        r52.mo5389(f9210, r0);
        r52.mo5391(f9207, r42.f9036);
        r52.mo5391(f9208, r42.f9033);
        r52.mo5389(f9209, r42.f9034);
        r52.mo5390(f9212, r42.f9035);
    }
}
