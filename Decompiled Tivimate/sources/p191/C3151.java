package p191;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ˋˋ.ʻᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C3151 implements Parcelable {
    public static final Parcelable.Creator<C3151> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f11075;

    /* JADX INFO: renamed from: ʾˋ */
    public int f11076;

    /* JADX INFO: renamed from: ˈٴ */
    public int[] f11077;

    /* JADX INFO: renamed from: ˉٴ */
    public boolean f11078;

    /* JADX INFO: renamed from: ˊʻ */
    public int[] f11079;

    /* JADX INFO: renamed from: ٴʼ */
    public boolean f11080;

    /* JADX INFO: renamed from: ٴᵢ */
    public ArrayList f11081;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f11082;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f11083;

    /* JADX INFO: renamed from: ᵎⁱ */
    public boolean f11084;

    static {
        CREATOR = new ᵎˊ(2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f11076);
        r1.writeInt(this.f11082);
        r1.writeInt(this.f11075);
        if (this.f11075 <= 0) goto L5;
        r1.writeIntArray(this.f11077);
    L5:
        r1.writeInt(this.f11083);
        if (this.f11083 <= 0) goto L8;
        r1.writeIntArray(this.f11079);
    L8:
        r1.writeInt(this.f11078 ? 1 : 0);
        r1.writeInt(this.f11084 ? 1 : 0);
        r1.writeInt(this.f11080 ? 1 : 0);
        r1.writeList(this.f11081);
    }
}
