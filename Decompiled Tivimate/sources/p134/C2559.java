package p134;

import java.util.List;
import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2559 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9079 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9080 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2559 f9081 = null;

    static {
        f9081 = new C2559();
        f9080 = C2217.m5392("files");
        f9079 = C2217.m5392("orgId");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        C2571 r32 = (C2571) ((AbstractC2560) r3);
        List r0 = r32.f9115;
        r42.mo5391(f9080, r0);
        r42.mo5391(f9079, r32.f9114);
    }
}
