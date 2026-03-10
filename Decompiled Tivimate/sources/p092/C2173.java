package p092;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p043.InterfaceC1624;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ʿʾ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2173 extends WeakReference {

    /* JADX INFO: renamed from: ʽ */
    public InterfaceC2193 f7816;

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f7817;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC1624 f7818;

    public C2173(InterfaceC1624 r1, C2175 r2, ReferenceQueue r3) {
        super(r2, r3);
        AbstractC2234.m5422(r1, "Argument must not be null");
        this.f7818 = r1;
        boolean r12 = r2.f7821;
        this.f7816 = null;
        this.f7817 = r12;
    }
}
