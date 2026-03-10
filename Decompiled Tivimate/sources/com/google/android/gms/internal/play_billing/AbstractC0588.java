package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0588 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int f2404 = 0;

    static {
        AbstractC0588.class.getClassLoader();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Parcelable m2237(Parcel r2) {
        Parcelable.Creator r0 = Bundle.CREATOR;
        if (r2.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r0.createFromParcel(r2);
    }
}
