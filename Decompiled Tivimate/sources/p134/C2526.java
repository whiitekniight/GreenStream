package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C2526 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f8921 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f8922 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f8923 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2526 f8924 = null;

    static {
        f8924 = new C2526();
        f8923 = C2217.m5392("name");
        f8921 = C2217.m5392("importance");
        f8922 = C2217.m5392("frames");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2544 r32 = (C2544) ((AbstractC2594) r3);
        String r0 = r32.f9022;
        r42.mo5391(f8923, r0);
        r42.mo5390(f8921, r32.f9021);
        r42.mo5391(f8922, r32.f9020);
    }
}
