package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C0330 implements InterfaceC0457 {

    /* JADX INFO: renamed from: ʾˋ */
    public final String f1994;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ArrayList f1995;

    public C0330(String r1, ArrayList r2) {
        this.f1994 = r1;
        ArrayList r12 = new ArrayList();
        this.f1995 = r12;
        r12.addAll(r2);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0330) == true) goto L8;
        return false;
    L8:
        C0330 r42 = (C0330) r4;
        String r0 = r42.f1994;
        String r2 = this.f1994;
        if (r2 != null) goto L11;
        if (r0 == null) goto L16;
    L14:
        return false;
    L16:
        return this.f1995.equals(r42.f1995);
    L11:
        if (r2.equals(r0) == true) goto L16;
        goto L14
    }

    public final int hashCode() {
        String r0 = this.f1994;
        if (r0 == null) goto L5;
        int r02 = r0.hashCode();
    L6:
        int r1 = this.f1995.hashCode();
        return r1 + (r02 * 31);
    L5:
        r02 = 0;
        goto L6
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ˆʾ */
    public final InterfaceC0457 mo1610() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵎﹶ */
    public final String mo1615() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ᵔᵢ */
    public final InterfaceC0457 mo1617(String r1, ˏˆ.ﹳٴ r2, ArrayList r3) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ⁱˊ */
    public final Double mo1619() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﹳٴ */
    public final Boolean mo1620() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457
    /* JADX INFO: renamed from: ﾞᴵ */
    public final Iterator mo1622() {
        return null;
    }
}
