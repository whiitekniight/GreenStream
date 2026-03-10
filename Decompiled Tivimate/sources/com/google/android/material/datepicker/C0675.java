package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.material.datepicker.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C0675 implements Parcelable {
    public static final Parcelable.Creator<C0675> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final C0662 f2766;

    /* JADX INFO: renamed from: ʾˋ */
    public final C0673 f2767;

    /* JADX INFO: renamed from: ˈٴ */
    public final C0673 f2768;

    /* JADX INFO: renamed from: ˊʻ */
    public final int f2769;

    /* JADX INFO: renamed from: ٴᵢ */
    public final int f2770;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C0673 f2771;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f2772;

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(9);
    }

    public C0675(C0673 r2, C0673 r3, C0662 r4, C0673 r5, int r6) {
        Objects.requireNonNull(r2, "start cannot be null");
        Objects.requireNonNull(r3, "end cannot be null");
        Objects.requireNonNull(r4, "validator cannot be null");
        this.f2767 = r2;
        this.f2771 = r3;
        this.f2768 = r5;
        this.f2772 = r6;
        this.f2766 = r4;
        if (r5 != null) goto L5;
    L9:
        if (r5 != null) goto L11;
    L15:
        if (r6 < 0) goto L21;
        if (r6 > AbstractC0654.m2446(null).getMaximum(7)) goto L21;
        this.f2770 = r2.m2466(r3) + 1;
        this.f2769 = (r3.f2758 - r2.f2758) + 1;
        return;
    L21:
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    L11:
        if (r5.f2759.compareTo(r3.f2759) <= 0) goto L15;
        throw new IllegalArgumentException("current Month cannot be after end Month");
    L5:
        if (r2.f2759.compareTo(r5.f2759) <= 0) goto L9;
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0675) == true) goto L8;
        return false;
    L8:
        C0675 r52 = (C0675) r5;
        if (this.f2767.equals(r52.f2767) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.f2771.equals(r52.f2771) == false) goto L19;
        if (Objects.equals(this.f2768, r52.f2768) == false) goto L19;
        if (this.f2772 != r52.f2772) goto L19;
        if (this.f2766.equals(r52.f2766) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2767, this.f2771, this.f2768, Integer.valueOf(this.f2772), this.f2766});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f2767, 0);
        r2.writeParcelable(this.f2771, 0);
        r2.writeParcelable(this.f2768, 0);
        r2.writeParcelable(this.f2766, 0);
        r2.writeInt(this.f2772);
    }
}
