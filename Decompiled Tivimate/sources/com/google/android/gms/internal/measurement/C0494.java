package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C0494 implements InterfaceC0457 {
    public final boolean equals(Object r1) {
        if (r1 != this) goto L6;
        return true;
    L6:
        return r1 instanceof C0494;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ˆʾ */
    public final InterfaceC0457 mo1610() {
        return InterfaceC0457.f2227;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵎﹶ */
    public final String mo1615() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵔᵢ */
    public final InterfaceC0457 mo1617(String r1, ˏˆ.ﹳٴ r2, ArrayList r3) {
        throw new IllegalStateException("Undefined has no function ".concat(r1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ⁱˊ */
    public final Double mo1619() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﹳٴ */
    public final Boolean mo1620() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﾞᴵ */
    public final Iterator mo1622() {
        return null;
    }
}
