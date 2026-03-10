package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f0;

    /* JADX INFO: renamed from: ᴵˊ */
    public final MediaDescriptionCompat f1;

    static {
        CREATOR = new ﹳٴ(0);
    }

    public MediaBrowserCompat$MediaItem(Parcel r2) {
        this.f0 = r2.readInt();
        this.f1 = MediaDescriptionCompat.CREATOR.createFromParcel(r2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f0 + ", mDescription=" + this.f1 + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.f0);
        this.f1.writeToParcel(r2, r3);
    }
}
