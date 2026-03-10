package p220;

import java.util.LinkedHashMap;
import java.util.List;
import p442.C5580;
import p447.AbstractC5635;

/* JADX INFO: renamed from: ˎᵢ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3449 implements InterfaceC3452, InterfaceC3434 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C3449 f12271 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C3449 f12272 = null;

    static {
        f12271 = new C3449();
        f12272 = new C3449();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C3446 m7206(C3449 r1, String r2) {
        C3446 r12 = new C3446(r2);
        C3446.f12253.put(r2, r12);
        return r12;
    }

    @Override // p220.InterfaceC3452
    /* JADX INFO: renamed from: ˉʿ */
    public void mo7207(C3423 r1, List r2) {
    }

    @Override // p220.InterfaceC3452
    /* JADX INFO: renamed from: ᵔʾ */
    public List mo7208(C3423 r1) {
        return C5580.f20144;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public synchronized C3446 m7209(String r7) {
        monitor-enter(this);
        LinkedHashMap r0 = C3446.f12253;     // Catch: Throwable -> L15
        C3446 r1 = (C3446) r0.get(r7);     // Catch: Throwable -> L15
        if (r1 == null) goto L6;
    L18:
        monitor-exit(this);
        return r1;
    L6:
        if (AbstractC5635.m10865(r7, "TLS_", false) == false) goto L9;
        String r12 = "SSL_".concat(r7.substring(4));     // Catch: Throwable -> L15
    L12:
        r1 = (C3446) r0.get(r12);     // Catch: Throwable -> L15
        if (r1 != null) goto L17;
        r1 = new C3446(r7);     // Catch: Throwable -> L15
    L17:
        r0.put(r7, r1);     // Catch: Throwable -> L15
        goto L18
    L9:
        if (AbstractC5635.m10865(r7, "SSL_", false) == false) goto L11;
        r12 = "TLS_".concat(r7.substring(4));     // Catch: Throwable -> L15
        goto L12
    L11:
        r12 = r7;
    L15:
        th = move-exception;
        throw th;
    }
}
