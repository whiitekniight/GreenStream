package p134;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ˈˋ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C2561 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f9082 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f9083 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f9084 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C2217 f9085 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f9086 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2561 f9087 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C2217 f9088 = null;

    static {
        f9087 = new C2561();
        f9086 = C2217.m5392("batteryLevel");
        f9082 = C2217.m5392("batteryVelocity");
        f9083 = C2217.m5392("proximityOn");
        f9084 = C2217.m5392("orientation");
        f9088 = C2217.m5392("ramUsed");
        f9085 = C2217.m5392("diskUsed");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r4, Object r5) {
        InterfaceC2215 r52 = (InterfaceC2215) r5;
        C2577 r42 = (C2577) ((AbstractC2583) r4);
        Double r0 = r42.f9130;
        r52.mo5391(f9086, r0);
        r52.mo5390(f9082, r42.f9129);
        r52.mo5388(f9083, r42.f9126);
        r52.mo5390(f9084, r42.f9127);
        r52.mo5389(f9088, r42.f9128);
        r52.mo5389(f9085, r42.f9131);
    }
}
