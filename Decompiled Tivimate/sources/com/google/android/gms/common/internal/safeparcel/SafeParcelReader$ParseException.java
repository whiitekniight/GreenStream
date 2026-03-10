package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(String r3, Parcel r4) {
        super(r3 + " Parcel: pos=" + r4.dataPosition() + " size=" + r4.dataSize());
    }
}
