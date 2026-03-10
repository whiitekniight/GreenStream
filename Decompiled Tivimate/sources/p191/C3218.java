package p191;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ˋˋ.ᵔי */
/* JADX INFO: loaded from: classes.dex */
public final class C3218 implements Parcelable {
    public static final Parcelable.Creator<C3218> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f11387;

    /* JADX INFO: renamed from: ʾˋ */
    public int f11388;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f11389;

    static {
        CREATOR = new ᵎˊ(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f11388);
        r1.writeInt(this.f11389);
        r1.writeInt(this.f11387 ? 1 : 0);
    }
}
