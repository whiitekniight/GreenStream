package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f17;

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(6);
    }

    public MediaSessionCompat$Token(Parcelable r1) {
        this.f17 = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MediaSessionCompat$Token) == true) goto L8;
        return false;
    L8:
        Object r42 = ((MediaSessionCompat$Token) r4).f17;
        Object r1 = this.f17;
        if (r1 != null) goto L13;
        if (r42 != null) goto L12;
        return true;
    L12:
        return false;
    L13:
        if (r42 != null) goto L16;
        return false;
    L16:
        return r1.equals(r42);
    }

    public final int hashCode() {
        Object r0 = this.f17;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable((Parcelable) this.f17, r3);
    }
}
