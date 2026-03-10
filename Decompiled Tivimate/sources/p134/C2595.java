package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2595 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʼˎ */
    public static final C2217 f9215 = null;

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9216 = null;

    /* JADX INFO: renamed from: ˆʾ */
    public static final C2217 f9217 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9218 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9219 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C2217 f9220 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final C2217 f9221 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9222 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2595 f9223 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f9224 = null;

    static {
        f9223 = new C2595();
        f9222 = C2217.m5392("pid");
        f9216 = C2217.m5392("processName");
        f9218 = C2217.m5392("reasonCode");
        f9219 = C2217.m5392("importance");
        f9224 = C2217.m5392("pss");
        f9220 = C2217.m5392("rss");
        f9221 = C2217.m5392("timestamp");
        f9215 = C2217.m5392("traceFile");
        f9217 = C2217.m5392("buildIdMappingForArch");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        C2543 r42 = (C2543) ((AbstractC2566) r4);
        int r0 = r42.f9018;
        r52.mo5390(f9222, r0);
        r52.mo5391(f9216, r42.f9017);
        r52.mo5390(f9218, r42.f9012);
        r52.mo5390(f9219, r42.f9013);
        r52.mo5389(f9224, r42.f9014);
        r52.mo5389(f9220, r42.f9019);
        r52.mo5389(f9221, r42.f9015);
        r52.mo5391(f9215, r42.f9016);
        r52.mo5391(f9217, r42.f9011);
    }
}
