package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.leanback.widget.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C0093 implements Parcelable {
    public static final Parcelable.Creator<C0093> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public int f860;

    /* JADX INFO: renamed from: ᴵˊ */
    public Bundle f861;

    static {
        CREATOR = new C0114();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f860);
        r1.writeBundle(this.f861);
    }
}
