package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0473;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C0673 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0673> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final int f2758;

    /* JADX INFO: renamed from: ʾˋ */
    public final Calendar f2759;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f2760;

    /* JADX INFO: renamed from: ˊʻ */
    public final long f2761;

    /* JADX INFO: renamed from: ٴᵢ */
    public String f2762;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f2763;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f2764;

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(11);
    }

    public C0673(Calendar r4) {
        r4.set(5, 1);
        Calendar r42 = AbstractC0654.m2448(r4);
        this.f2759 = r42;
        this.f2763 = r42.get(2);
        this.f2758 = r42.get(1);
        this.f2760 = r42.getMaximum(7);
        this.f2764 = r42.getActualMaximum(5);
        this.f2761 = r42.getTimeInMillis();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C0673 m2463(long r1) {
        Calendar r0 = AbstractC0654.m2446(null);
        r0.setTimeInMillis(r1);
        return new C0673(r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C0673 m2464(int r2, int r3) {
        Calendar r0 = AbstractC0654.m2446(null);
        r0.set(1, r2);
        r0.set(2, r3);
        return new C0673(r0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f2759.compareTo(((C0673) r2).f2759);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0673) == true) goto L8;
        return false;
    L8:
        C0673 r52 = (C0673) r5;
        if (this.f2763 == r52.f2763) goto L11;
    L13:
        return false;
    L11:
        if (this.f2758 != r52.f2758) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2763), Integer.valueOf(this.f2758)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f2758);
        r1.writeInt(this.f2763);
    }

    /* JADX INFO: renamed from: ʽ */
    public final String m2465() {
        if (this.f2762 != null) goto L6;
        this.f2762 = AbstractC0473.m1976(this.f2759.getTimeInMillis());
    L6:
        return this.f2762;
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m2466(C0673 r3) {
        if ((this.f2759 instanceof GregorianCalendar) == false) goto L7;
        int r0 = (r3.f2758 - this.f2758) * 12;
        return (r3.f2763 - this.f2763) + r0;
    L7:
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
