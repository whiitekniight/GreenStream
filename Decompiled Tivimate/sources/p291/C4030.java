package p291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p078.InterfaceC2099;
import p099.AbstractC2229;

/* JADX INFO: renamed from: ٴʽ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C4030 implements InterfaceC4023 {

    /* JADX INFO: renamed from: ʾˋ */
    public final Set f14836;

    public C4030() {
        this.f14836 = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // p291.InterfaceC4023
    /* JADX INFO: renamed from: ʽ */
    public final void mo1216() {
        ArrayList r0 = AbstractC2229.m5411(this.f14836);
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((InterfaceC2099) r3).mo1216();
        goto L3
    }

    @Override // p291.InterfaceC4023
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo1217() {
        ArrayList r0 = AbstractC2229.m5411(this.f14836);
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((InterfaceC2099) r3).mo1217();
        goto L3
    }

    @Override // p291.InterfaceC4023
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo1220() {
        ArrayList r0 = AbstractC2229.m5411(this.f14836);
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((InterfaceC2099) r3).mo1220();
        goto L3
    }
}
