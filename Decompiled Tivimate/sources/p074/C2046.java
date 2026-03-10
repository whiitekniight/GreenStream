package p074;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ʾˈ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2046 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f7055 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f7056 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f7057 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2046 f7058 = null;

    static {
        f7058 = new C2046();
        f7057 = C2217.m5392("performance");
        f7055 = C2217.m5392("crashlytics");
        f7056 = C2217.m5392("sessionSamplingRate");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        C2053 r42 = (C2053) r4;
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        r52.mo5391(f7057, r42.f7078);
        r52.mo5391(f7055, r42.f7077);
        r52.mo5387(f7056, r42.f7076);
    }
}
