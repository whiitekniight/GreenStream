package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final CharSequence f2;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f3;

    /* JADX INFO: renamed from: ˈٴ */
    public final CharSequence f4;

    /* JADX INFO: renamed from: ˉٴ */
    public final Uri f5;

    /* JADX INFO: renamed from: ˊʻ */
    public final Uri f6;

    /* JADX INFO: renamed from: ٴᵢ */
    public final Bundle f7;

    /* JADX INFO: renamed from: ᴵˊ */
    public final CharSequence f8;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final Bitmap f9;

    /* JADX INFO: renamed from: ᵎⁱ */
    public Object f10;

    static {
        CREATOR = new ﹳٴ(1);
    }

    public MediaDescriptionCompat(String r1, CharSequence r2, CharSequence r3, CharSequence r4, Bitmap r5, Uri r6, Bundle r7, Uri r8) {
        this.f3 = r1;
        this.f8 = r2;
        this.f2 = r3;
        this.f4 = r4;
        this.f9 = r5;
        this.f6 = r6;
        this.f7 = r7;
        this.f5 = r8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f8 + ", " + this.f2 + ", " + this.f4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        Object r0 = this.f10;
        if (r0 != null) goto L5;
        MediaDescription.Builder r02 = new MediaDescription.Builder();
        r02.setMediaId(this.f3);
        r02.setTitle(this.f8);
        r02.setSubtitle(this.f2);
        r02.setDescription(this.f4);
        r02.setIconBitmap(this.f9);
        r02.setIconUri(this.f6);
        r02.setExtras(this.f7);
        r02.setMediaUri(this.f5);
        r0 = r02.build();
        this.f10 = r0;
    L5:
        ((MediaDescription) r0).writeToParcel(r3, r4);
    }
}
