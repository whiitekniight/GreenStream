package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f18;

    /* JADX INFO: renamed from: ʾˋ */
    public int f19;

    /* JADX INFO: renamed from: ˈٴ */
    public int f20;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f21;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f22;

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f19);
        r1.writeInt(this.f18);
        r1.writeInt(this.f20);
        r1.writeInt(this.f22);
        r1.writeInt(this.f21);
    }
}
