package p241;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p051.C1771;

/* JADX INFO: renamed from: ˑʼ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3575 implements Parcelable {
    public static final Parcelable.Creator<C3575> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final Bundle f12723;

    static {
        CREATOR = new C1771(5);
    }

    public C3575(Bundle r1) {
        this.f12723 = r1;
    }

    public C3575(Parcel r1, ClassLoader r2) {
        Bundle r12 = r1.readBundle();
        this.f12723 = r12;
        if (r2 == null) goto L7;
        if (r12 == null) goto L8;
        r12.setClassLoader(r2);
        return;
    L8:
        return;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.f12723);
    }
}
