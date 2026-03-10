package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0452 extends AbstractBinderC0257 implements InterfaceC0462 {

    /* JADX INFO: renamed from: ˈ */
    public final AtomicReference f2215;

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean f2216;

    public BinderC0452() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f2215 = new AtomicReference();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static final Object m1940(Bundle r3, Class r4) {
        if (r3 == null) goto L10;
        Object r32 = r3.get("r");
        if (r32 == null) goto L14;
        return r4.cast(r32);
    L7:
        e = move-exception;
        String r0 = "Unexpected object type. Expected, Received: " + r4.getCanonicalName() + ", " + r32.getClass().getCanonicalName();
        throw e;
    L14:
        return null;
    L10:
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0257
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo1261(int r2, Parcel r3, Parcel r4) {
        if (r2 != 1) goto L6;
        Bundle r22 = (Bundle) AbstractC0472.m1969(r3, Bundle.CREATOR);
        AbstractC0472.m1967(r3);
        mo1608(r22);
        r4.writeNoException();
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public final Bundle m1941(long r3) {
        AtomicReference r0 = this.f2215;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.f2216 == false) goto L18;
    L13:
        Bundle r32 = (Bundle) this.f2215.get();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return r32;
    L18:
        r0.wait(r3);     // Catch: Throwable -> L8 InterruptedException -> L10
    L11:
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0462
    /* JADX INFO: renamed from: ᵔﹳ */
    public final void mo1608(Bundle r3) {
        AtomicReference r0 = this.f2215;
        monitor-enter(r0);
        r0.set(r3);     // Catch: Throwable -> L10
        this.f2216 = true;     // Catch: Throwable -> L10
        this.f2215.notify();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    L10:
        th = move-exception;
        this.f2215.notify();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    }
}
