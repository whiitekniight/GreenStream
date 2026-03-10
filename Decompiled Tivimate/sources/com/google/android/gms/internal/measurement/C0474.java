package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ᵢـ */
/* JADX INFO: loaded from: classes.dex */
public final class C0474 extends AbstractC0372 {
    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ʽ */
    public final void mo1759(Object r2, long r3, boolean r5) {
        if (AbstractC0504.f2284 == false) goto L6;
        AbstractC0504.m2045(r2, r3, r5 ? 1 : 0);
        return;
    L6:
        AbstractC0504.m2047(r2, r3, r5 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ˈ */
    public final float mo1760(long r2, Object r4) {
        return Float.intBitsToFloat(this.f2046.getInt(r4, r2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ˑﹳ */
    public final void mo1761(Object r2, long r3, float r5) {
        int r52 = Float.floatToIntBits(r5);
        this.f2046.putInt(r2, r3, r52);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo1762(Object r7, long r8, double r10) {
        long r4 = Double.doubleToLongBits(r10);
        this.f2046.putLong(r7, r8, r4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo1763(long r2, Object r4) {
        if (AbstractC0504.f2284 == false) goto L7;
        return AbstractC0504.m2053(r2, r4);
    L7:
        return AbstractC0504.m2049(r2, r4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo1764(Object r2, long r3, byte r5) {
        if (AbstractC0504.f2284 == false) goto L6;
        AbstractC0504.m2045(r2, r3, r5);
        return;
    L6:
        AbstractC0504.m2047(r2, r3, r5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0372
    /* JADX INFO: renamed from: ﾞᴵ */
    public final double mo1765(long r2, Object r4) {
        return Double.longBitsToDouble(this.f2046.getLong(r4, r2));
    }
}
