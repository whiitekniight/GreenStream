package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.leanback.widget.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C0114 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        C0093 r0 = new C0093();
        r0.f861 = Bundle.EMPTY;
        r0.f860 = r3.readInt();
        r0.f861 = r3.readBundle(GridLayoutManager.class.getClassLoader());
        return r0;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new C0093[r1];
    }
}
