package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.datepicker.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C0662 implements Parcelable {
    public static final Parcelable.Creator<C0662> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f2713;

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(10);
    }

    public C0662(long r1) {
        this.f2713 = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0662) == true) goto L9;
        return false;
    L9:
        if (this.f2713 != ((C0662) r8).f2713) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2713)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.f2713);
    }
}
