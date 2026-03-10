package p074;

import p097.C2217;
import p097.InterfaceC2214;
import p097.InterfaceC2215;

/* JADX INFO: renamed from: ʾˈ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2076 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ʽ */
    public static final C2217 f7149 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2217 f7150 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2217 f7151 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2217 f7152 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2076 f7153 = null;

    static {
        f7153 = new C2076();
        f7152 = C2217.m5392("processName");
        f7149 = C2217.m5392("pid");
        f7150 = C2217.m5392("importance");
        f7151 = C2217.m5392("defaultProcess");
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        C2059 r32 = (C2059) r3;
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        r42.mo5391(f7152, r32.f7107);
        r42.mo5390(f7149, r32.f7106);
        r42.mo5390(f7150, r32.f7104);
        r42.mo5388(f7151, r32.f7105);
    }
}
