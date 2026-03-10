package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2599 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9228 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9229 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9230 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2599 f9231 = null;

    static {
        f9231 = new C2599();
        f9230 = C2217.m5392("arch");
        f9228 = C2217.m5392("libraryName");
        f9229 = C2217.m5392("buildId");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2581 r32 = (C2581) ((AbstractC2582) r3);
        String r0 = r32.f9156;
        r42.mo5391(f9230, r0);
        r42.mo5391(f9228, r32.f9155);
        r42.mo5391(f9229, r32.f9154);
    }
}
