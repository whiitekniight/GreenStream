package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0292 implements IInterface {

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ int f1916;

    /* JADX INFO: renamed from: ˑﹳ */
    public final IBinder f1917;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f1918;

    public /* synthetic */ AbstractC0292(IBinder r1, String r2, int r3) {
        this.f1916 = r3;
        this.f1917 = r1;
        this.f1918 = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch(this.f1916) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return this.f1917;
    L7:
        return this.f1917;
    L9:
        return this.f1917;
    }

    /* JADX INFO: renamed from: ʽ */
    public Parcel m1358(Parcel r4, int r5) {
        Parcel r0 = Parcel.obtain();
        this.f1917.transact(r5, r4, r0, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r0.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r4.recycle();
        return r0;
    L6:
        th = move-exception;
        r4.recycle();
        throw th;
    L8:
        e = move-exception;
        r0.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }

    /* JADX INFO: renamed from: ˆﾞ */
    public void m1359(Parcel r5) {
        this.f1917.transact(2, r5, null, 1);     // Catch: Throwable -> L5
        r5.recycle();
        return;
    L5:
        th = move-exception;
        r5.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: ˈ */
    public Parcel m1360(Parcel r4, int r5) {
        Parcel r0 = Parcel.obtain();
        this.f1917.transact(r5, r4, r0, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r0.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r4.recycle();
        return r0;
    L6:
        th = move-exception;
        r4.recycle();
        throw th;
    L8:
        e = move-exception;
        r0.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }

    /* JADX INFO: renamed from: ˈʿ */
    public Parcel m1361(Parcel r4, int r5) {
        Parcel r0 = Parcel.obtain();
        this.f1917.transact(r5, r4, r0, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r0.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r4.recycle();
        return r0;
    L6:
        th = move-exception;
        r4.recycle();
        throw th;
    L8:
        e = move-exception;
        r0.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public Parcel m1362() {
        switch(this.f1916) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(this.f1918);
        return r0;
    L6:
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.f1918);
        return r02;
    }

    /* JADX INFO: renamed from: ᵔי */
    public void m1363(Parcel r4, int r5) {
        Parcel r0 = Parcel.obtain();
        this.f1917.transact(r5, r4, r0, 0);     // Catch: Throwable -> L6
        r0.readException();     // Catch: Throwable -> L6
        r4.recycle();
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r4.recycle();
        r0.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: ᵔٴ */
    public Parcel m1364() {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(this.f1918);
        return r0;
    }
}
