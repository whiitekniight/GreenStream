package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C0515 implements InterfaceC0457 {

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC0457 f2295;

    /* JADX INFO: renamed from: ᴵˊ */
    public final String f2296;

    public C0515(String r2) {
        this.f2295 = InterfaceC0457.f2227;
        this.f2296 = r2;
    }

    public C0515(String r1, InterfaceC0457 r2) {
        this.f2295 = r2;
        this.f2296 = r1;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0515) == true) goto L8;
        return false;
    L8:
        C0515 r52 = (C0515) r5;
        String r1 = r52.f2296;
        if (this.f2296.equals(r1) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f2295.equals(r52.f2295) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f2296.hashCode() * 31;
        return this.f2295.hashCode() + r0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ˆʾ */
    public final InterfaceC0457 mo1610() {
        return new C0515(this.f2296, this.f2295.mo1610());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵎﹶ */
    public final String mo1615() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵔᵢ */
    public final InterfaceC0457 mo1617(String r1, ˏˆ.ﹳٴ r2, ArrayList r3) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ⁱˊ */
    public final Double mo1619() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﹳٴ */
    public final Boolean mo1620() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﾞᴵ */
    public final Iterator mo1622() {
        return null;
    }
}
