package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˑˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C0586 extends AbstractC0576 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ʽ */
    public final void mo2220(Object r2, long r3, boolean r5) {
        if (AbstractC0641.f2497 == false) goto L6;
        AbstractC0641.m2312(r2, r3, r5 ? 1 : 0);
        return;
    L6:
        AbstractC0641.m2314(r2, r3, r5 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ˈ */
    public final void mo2221(Object r2, long r3, byte r5) {
        if (AbstractC0641.f2497 == false) goto L6;
        AbstractC0641.m2312(r2, r3, r5);
        return;
    L6:
        AbstractC0641.m2314(r2, r3, r5);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ˑﹳ */
    public final void mo2222(Object r7, long r8, double r10) {
        long r4 = Double.doubleToLongBits(r10);
        this.f2380.putLong(r7, r8, r4);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean mo2223(long r2, Object r4) {
        if (AbstractC0641.f2497 == false) goto L7;
        return AbstractC0641.m2315(r2, r4);
    L7:
        return AbstractC0641.m2320(r2, r4);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ⁱˊ */
    public final float mo2224(long r2, Object r4) {
        return Float.intBitsToFloat(this.f2380.getInt(r4, r2));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ﹳٴ */
    public final double mo2225(long r2, Object r4) {
        return Double.longBitsToDouble(this.f2380.getLong(r4, r2));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo2226(Object r2, long r3, float r5) {
        int r52 = Float.floatToIntBits(r5);
        this.f2380.putInt(r2, r3, r52);
    }
}
