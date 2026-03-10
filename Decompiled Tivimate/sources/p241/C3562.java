package p241;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑʼ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3562 implements Parcelable {
    public static final Parcelable.Creator<C3562> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final ArrayList f12640;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ArrayList f12641;

    static {
        CREATOR = new ᵎˊ(5);
    }

    public C3562(Parcel r2) {
        this.f12640 = r2.createStringArrayList();
        this.f12641 = r2.createTypedArrayList(C3618.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeStringList(this.f12640);
        r1.writeTypedList(this.f12641);
    }
}
