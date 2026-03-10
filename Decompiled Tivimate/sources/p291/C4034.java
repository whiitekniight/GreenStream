package p291;

import java.util.ArrayList;
import java.util.HashSet;
import p099.AbstractC2229;

/* JADX INFO: renamed from: ٴʽ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4034 implements InterfaceC4038 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ יـ f14839;

    public C4034(יـ r1) {
        this.f14839 = r1;
    }

    @Override // p291.InterfaceC4038
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo1199(boolean r5) {
        AbstractC2229.m5415();
        יـ r0 = this.f14839;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((HashSet) this.f14839.ʽ);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        int r02 = r1.size();
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L9;
        Object r3 = r1.get(r2);
        r2 = r2 + 1;
        ((InterfaceC4038) r3).mo1199(r5);
        goto L7
    L9:
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
