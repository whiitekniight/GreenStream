package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˑ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584 implements Cloneable {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC0529 f2399;

    /* JADX INFO: renamed from: ᴵˊ */
    public AbstractC0529 f2400;

    public AbstractC0584(AbstractC0529 r2) {
        this.f2399 = r2;
        if (r2.m2102() == true) goto L7;
        this.f2400 = (AbstractC0529) r2.mo2079(4);
        return;
    L7:
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Object clone() {
        AbstractC0584 r0 = (AbstractC0584) this.f2399.mo2079(5);
        r0.f2400 = m2232();
        return r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m2231() {
        if (this.f2400.m2102() == true) goto L6;
        AbstractC0529 r0 = (AbstractC0529) this.f2399.mo2079(4);
        AbstractC0529 r1 = this.f2400;
        C0637.f2486.m2302(r0.getClass()).mo2203(r0, r1);
        this.f2400 = r0;
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractC0529 m2232() {
        if (this.f2400.m2102() == false) goto L5;
        AbstractC0529 r0 = this.f2400;
        r0.getClass();
        C0637.f2486.m2302(r0.getClass()).mo2207(r0);
        r0.m2101();
        return this.f2400;
    L5:
        return this.f2400;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC0529 m2233() {
        AbstractC0529 r0 = m2232();
        r0.getClass();
        if (AbstractC0529.m2098(r0, true) == false) goto L6;
        return r0;
    L6:
        throw new zzhg();
    }
}
