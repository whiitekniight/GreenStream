package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C2600 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9232 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9233 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9234 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9235 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2600 f9236 = null;

    static {
        f9236 = new C2600();
        f9235 = C2217.m5392("processName");
        f9232 = C2217.m5392("pid");
        f9233 = C2217.m5392("importance");
        f9234 = C2217.m5392("defaultProcess");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2537 r32 = (C2537) ((AbstractC2520) r3);
        String r0 = r32.f8963;
        r42.mo5391(f9235, r0);
        r42.mo5390(f9232, r32.f8962);
        r42.mo5390(f9233, r32.f8960);
        r42.mo5388(f9234, r32.f8961);
    }
}
