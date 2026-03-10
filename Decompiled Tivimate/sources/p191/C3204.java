package p191;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: ˋˋ.ᐧˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C3204 implements Parcelable {
    public static final Parcelable.Creator<C3204> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int[] f11299;

    /* JADX INFO: renamed from: ʾˋ */
    public int f11300;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f11301;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f11302;

    static {
        CREATOR = new ᵎˊ(1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f11300 + ", mGapDir=" + this.f11302 + ", mHasUnwantedGapAfter=" + this.f11301 + ", mGapPerSpan=" + Arrays.toString(this.f11299) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.f11300);
        r2.writeInt(this.f11302);
        r2.writeInt(this.f11301 ? 1 : 0);
        int[] r32 = this.f11299;
        if (r32 != null) goto L5;
    L8:
        r2.writeInt(0);
        return;
    L5:
        if (r32.length <= 0) goto L8;
        r2.writeInt(r32.length);
        r2.writeIntArray(this.f11299);
    }
}
