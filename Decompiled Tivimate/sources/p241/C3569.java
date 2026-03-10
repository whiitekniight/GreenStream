package p241;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑʼ.ʿᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3569 implements Parcelable {
    public static final Parcelable.Creator<C3569> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public C3618[] f12706;

    /* JADX INFO: renamed from: ʾˋ */
    public ArrayList f12707;

    /* JADX INFO: renamed from: ˈٴ */
    public int f12708;

    /* JADX INFO: renamed from: ˉٴ */
    public ArrayList f12709;

    /* JADX INFO: renamed from: ˊʻ */
    public ArrayList f12710;

    /* JADX INFO: renamed from: ٴᵢ */
    public ArrayList f12711;

    /* JADX INFO: renamed from: ᴵˊ */
    public ArrayList f12712;

    /* JADX INFO: renamed from: ᴵᵔ */
    public String f12713;

    static {
        CREATOR = new ᵎˊ(7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeStringList(this.f12707);
        r2.writeStringList(this.f12712);
        r2.writeTypedArray(this.f12706, r3);
        r2.writeInt(this.f12708);
        r2.writeString(this.f12713);
        r2.writeStringList(this.f12710);
        r2.writeTypedList(this.f12711);
        r2.writeTypedList(this.f12709);
    }
}
