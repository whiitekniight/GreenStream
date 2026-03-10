package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f12;

    /* JADX INFO: renamed from: ᴵˊ */
    public final float f13;

    static {
        CREATOR = new ﹳٴ(3);
    }

    public RatingCompat(int r1, float r2) {
        this.f12 = r1;
        this.f13 = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f12;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Rating:style=");
        r0.append(this.f12);
        r0.append(" rating=");
        float r2 = this.f13;
        if (r2 >= 0.0f) goto L5;
        String r1 = "unrated";
    L6:
        r0.append(r1);
        return r0.toString();
    L5:
        r1 = String.valueOf(r2);
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f12);
        r1.writeFloat(this.f13);
    }
}
