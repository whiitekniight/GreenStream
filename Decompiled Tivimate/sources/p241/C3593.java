package p241;

import android.os.Parcel;
import android.os.Parcelable;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑʼ.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C3593 implements Parcelable {
    public static final Parcelable.Creator<C3593> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public String f12784;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f12785;

    static {
        CREATOR = new ᵎˊ(6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f12784);
        r1.writeInt(this.f12785);
    }
}
