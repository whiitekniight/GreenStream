package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2524 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʼˎ */
    public static final C2217 f8911 = null;

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f8912 = null;

    /* JADX INFO: renamed from: ˆʾ */
    public static final C2217 f8913 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f8914 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f8915 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C2217 f8916 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final C2217 f8917 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f8918 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2524 f8919 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f8920 = null;

    static {
        f8919 = new C2524();
        f8918 = C2217.m5392("arch");
        f8912 = C2217.m5392("model");
        f8914 = C2217.m5392("cores");
        f8915 = C2217.m5392("ram");
        f8920 = C2217.m5392("diskSpace");
        f8916 = C2217.m5392("simulator");
        f8917 = C2217.m5392("state");
        f8911 = C2217.m5392("manufacturer");
        f8913 = C2217.m5392("modelClass");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        C2590 r42 = (C2590) ((AbstractC2525) r4);
        int r0 = r42.f9204;
        r52.mo5390(f8918, r0);
        r52.mo5391(f8912, r42.f9203);
        r52.mo5390(f8914, r42.f9198);
        r52.mo5389(f8915, r42.f9199);
        r52.mo5389(f8920, r42.f9200);
        r52.mo5388(f8916, r42.f9205);
        r52.mo5390(f8917, r42.f9201);
        r52.mo5391(f8911, r42.f9202);
        r52.mo5391(f8913, r42.f9197);
    }
}
