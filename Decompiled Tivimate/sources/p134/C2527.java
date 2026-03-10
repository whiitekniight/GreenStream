package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2527 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f8925 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f8926 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2527 f8927 = null;

    static {
        f8927 = new C2527();
        f8926 = C2217.m5392("key");
        f8925 = C2217.m5392("value");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2549 r32 = (C2549) ((AbstractC2529) r3);
        String r0 = r32.f9041;
        r42.mo5391(f8926, r0);
        r42.mo5391(f8925, r32.f9040);
    }
}
