package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0292;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 extends AbstractC0292 implements InterfaceC0532 {
    /* JADX INFO: renamed from: ʼˈ */
    public final Bundle m2303(int r2, String r3, String r4, String r5, Bundle r6) {
        Parcel r0 = m1364();
        r0.writeInt(r2);
        r0.writeString(r3);
        r0.writeString(r4);
        r0.writeString(r5);
        r0.writeString(null);
        int r22 = AbstractC0588.f2404;
        r0.writeInt(1);
        r6.writeToParcel(r0, 0);
        Parcel r23 = m1361(r0, 8);
        Parcelable.Creator r32 = Bundle.CREATOR;
        Bundle r33 = (Bundle) AbstractC0588.m2237(r23);
        r23.recycle();
        return r33;
    }

    /* JADX INFO: renamed from: ˈⁱ */
    public final Bundle m2304(int r2, String r3, String r4, Bundle r5, Bundle r6) {
        Parcel r0 = m1364();
        r0.writeInt(r2);
        r0.writeString(r3);
        r0.writeString(r4);
        int r22 = AbstractC0588.f2404;
        r0.writeInt(1);
        r5.writeToParcel(r0, 0);
        r0.writeInt(1);
        r6.writeToParcel(r0, 0);
        Parcel r23 = m1361(r0, 901);
        Parcelable.Creator r32 = Bundle.CREATOR;
        Bundle r33 = (Bundle) AbstractC0588.m2237(r23);
        r23.recycle();
        return r33;
    }

    /* JADX INFO: renamed from: ˊˋ */
    public final Bundle m2305(String r3, String r4, String r5) {
        Parcel r0 = m1364();
        r0.writeInt(3);
        r0.writeString(r3);
        r0.writeString(r4);
        r0.writeString(r5);
        r0.writeString(null);
        Parcel r32 = m1361(r0, 3);
        Parcelable.Creator r42 = Bundle.CREATOR;
        Bundle r43 = (Bundle) AbstractC0588.m2237(r32);
        r32.recycle();
        return r43;
    }

    /* JADX INFO: renamed from: ˋᵔ */
    public final Bundle m2306(String r3, String r4, Bundle r5) {
        Parcel r0 = m1364();
        r0.writeInt(9);
        r0.writeString(r3);
        r0.writeString(r4);
        int r32 = AbstractC0588.f2404;
        r0.writeInt(1);
        r5.writeToParcel(r0, 0);
        Parcel r33 = m1361(r0, 902);
        Parcelable.Creator r42 = Bundle.CREATOR;
        Bundle r43 = (Bundle) AbstractC0588.m2237(r33);
        r33.recycle();
        return r43;
    }

    /* JADX INFO: renamed from: ˑٴ */
    public final int m2307(int r2, String r3, String r4, Bundle r5) {
        Parcel r0 = m1364();
        r0.writeInt(r2);
        r0.writeString(r3);
        r0.writeString(r4);
        int r22 = AbstractC0588.f2404;
        r0.writeInt(1);
        r5.writeToParcel(r0, 0);
        Parcel r23 = m1361(r0, 10);
        int r32 = r23.readInt();
        r23.recycle();
        return r32;
    }

    /* JADX INFO: renamed from: ـˏ */
    public final Bundle m2308(String r3, String r4, String r5) {
        Parcel r0 = m1364();
        r0.writeInt(3);
        r0.writeString(r3);
        r0.writeString(r4);
        r0.writeString(r5);
        Parcel r32 = m1361(r0, 4);
        Parcelable.Creator r42 = Bundle.CREATOR;
        Bundle r43 = (Bundle) AbstractC0588.m2237(r32);
        r32.recycle();
        return r43;
    }

    /* JADX INFO: renamed from: ﹳـ */
    public final Bundle m2309(int r2, String r3, String r4, String r5, Bundle r6) {
        Parcel r0 = m1364();
        r0.writeInt(r2);
        r0.writeString(r3);
        r0.writeString(r4);
        r0.writeString(r5);
        int r22 = AbstractC0588.f2404;
        r0.writeInt(1);
        r6.writeToParcel(r0, 0);
        Parcel r23 = m1361(r0, 11);
        Parcelable.Creator r32 = Bundle.CREATOR;
        Bundle r33 = (Bundle) AbstractC0588.m2237(r23);
        r23.recycle();
        return r33;
    }
}
