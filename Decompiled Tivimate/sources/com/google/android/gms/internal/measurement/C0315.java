package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0315 extends AbstractC0292 implements InterfaceC0462 {
    public C0315(IBinder r3) {
        super(r3, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0462
    /* JADX INFO: renamed from: ᵔﹳ */
    public final void mo1608(Bundle r2) {
        Parcel r0 = m1362();
        AbstractC0472.m1968(r0, r2);
        m1363(r0, 1);
    }
}
