package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C2522 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f8902 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f8903 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f8904 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f8905 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2522 f8906 = null;

    static {
        f8906 = new C2522();
        f8905 = C2217.m5392("platform");
        f8902 = C2217.m5392("version");
        f8903 = C2217.m5392("buildVersion");
        f8904 = C2217.m5392("jailbroken");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2542 r32 = (C2542) ((AbstractC2567) r3);
        int r0 = r32.f9010;
        r42.mo5390(f8905, r0);
        r42.mo5391(f8902, r32.f9009);
        r42.mo5391(f8903, r32.f9007);
        r42.mo5388(f8904, r32.f9008);
    }
}
