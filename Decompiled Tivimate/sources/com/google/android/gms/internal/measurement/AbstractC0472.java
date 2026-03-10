package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final ClassLoader f2241 = null;

    static {
        f2241 = AbstractC0472.class.getClassLoader();
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m1966(Parcel r0, IInterface r1) {
        if (r1 != null) goto L5;
        r0.writeStrongBinder(null);
        return;
    L5:
        r0.writeStrongBinder(r1.asBinder());
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m1967(Parcel r3) {
        int r32 = r3.dataAvail();
        if (r32 > 0) goto L5;
        return;
    L5:
        StringBuilder r2 = new StringBuilder(String.valueOf(r32).length() + 45);
        r2.append("Parcel data not fully consumed, unread size: ");
        r2.append(r32);
        throw new BadParcelableException(r2.toString());
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m1968(Parcel r2, Parcelable r3) {
        if (r3 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Parcelable m1969(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r2.createFromParcel(r1);
    }
}
