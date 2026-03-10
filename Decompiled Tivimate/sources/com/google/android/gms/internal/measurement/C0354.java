package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˋᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C0354 extends AbstractC0292 implements InterfaceC0342 {
    public C0354(IBinder r3) {
        super(r3, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0342
    /* JADX INFO: renamed from: ʽﹳ */
    public final void mo1625(long r2, Bundle r4, String r5, String r6) {
        Parcel r0 = m1362();
        r0.writeString(r5);
        r0.writeString(r6);
        AbstractC0472.m1968(r0, r4);
        r0.writeLong(r2);
        m1363(r0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0342
    /* JADX INFO: renamed from: ﾞᴵ */
    public final int mo1626() {
        Parcel r0 = m1360(m1362(), 2);
        int r1 = r0.readInt();
        r0.recycle();
        return r1;
    }
}
