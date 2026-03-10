package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p039.BinderC1566;
import p319.AbstractC4223;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0554 extends Binder implements IInterface {

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ int f2347;

    public /* synthetic */ AbstractBinderC0554() {
        this.f2347 = 0;
    }

    public AbstractBinderC0554(String r2) {
        this.f2347 = 1;
        attachInterface(this, r2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int r0 = this.f2347;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        switch(this.f2347) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        if (r4 > 16777215) goto L8;
        r5.enforceInterface(getInterfaceDescriptor());
    L12:
        return mo2188(r4, r5, r6);
    L8:
        if (super.onTransact(r4, r5, r6, r7) == false) goto L12;
        return true;
    L13:
        if (r4 > 16777215) goto L15;
        r5.enforceInterface(getInterfaceDescriptor());
    L18:
        BinderC1566 r62 = (BinderC1566) this;
        if (r4 != 1) goto L25;
        int r42 = r5.readInt();
        int r72 = AbstractC0588.f2404;
        int r52 = r5.dataAvail();
        if (r52 > 0) goto L24;
        r62.f5180.m2137(Integer.valueOf(r42));
        return true;
    L24:
        throw new BadParcelableException(AbstractC4223.m8643(r52, "Parcel data not fully consumed, unread size: "));
    L25:
        return false;
    L15:
        if (super.onTransact(r4, r5, r6, r7) == false) goto L18;
        return true;
    L5:
        return super.onTransact(r4, r5, r6, r7);
    }

    /* JADX INFO: renamed from: ᵔי */
    public boolean mo2188(int r1, Parcel r2, Parcel r3) {
        return false;
    }
}
