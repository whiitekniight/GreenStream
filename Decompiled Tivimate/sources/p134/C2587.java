package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2587 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9183 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9184 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9185 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C2217 f9186 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final C2217 f9187 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9188 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2587 f9189 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f9190 = null;

    static {
        f9189 = new C2587();
        f9188 = C2217.m5392("identifier");
        f9183 = C2217.m5392("version");
        f9184 = C2217.m5392("displayVersion");
        f9185 = C2217.m5392("organization");
        f9190 = C2217.m5392("installationUuid");
        f9186 = C2217.m5392("developmentPlatform");
        f9187 = C2217.m5392("developmentPlatformVersion");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2584 r32 = (C2584) ((AbstractC2556) r3);
        String r0 = r32.f9161;
        r42.mo5391(f9188, r0);
        r42.mo5391(f9183, r32.f9160);
        r42.mo5391(f9184, r32.f9157);
        r42.mo5391(f9185, null);
        r42.mo5391(f9190, r32.f9158);
        r42.mo5391(f9186, r32.f9159);
        r42.mo5391(f9187, r32.f9162);
    }
}
