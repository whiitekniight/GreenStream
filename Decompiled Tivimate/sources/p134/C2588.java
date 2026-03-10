package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2588 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9191 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9192 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9193 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9194 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2588 f9195 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f9196 = null;

    static {
        f9195 = new C2588();
        f9194 = C2217.m5392("type");
        f9191 = C2217.m5392("reason");
        f9192 = C2217.m5392("frames");
        f9193 = C2217.m5392("causedBy");
        f9196 = C2217.m5392("overflowCount");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2565 r32 = (C2565) ((AbstractC2562) r3);
        String r0 = r32.f9096;
        r42.mo5391(f9194, r0);
        r42.mo5391(f9191, r32.f9095);
        r42.mo5391(f9192, r32.f9092);
        r42.mo5391(f9193, r32.f9093);
        r42.mo5390(f9196, r32.f9094);
    }
}
