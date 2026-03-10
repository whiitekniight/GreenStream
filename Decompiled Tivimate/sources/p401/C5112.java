package p401;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ᴵˈ.ٴﹶ;

/* JADX INFO: renamed from: ⁱˊ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public class C5112 implements Parcelable {
    public static final Parcelable.Creator<C5112> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public InterfaceC5113 f18245;

    static {
        CREATOR = new ٴﹶ(27);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f18245 != null) goto L8;
        this.f18245 = new BinderC5111(this);     // Catch: Throwable -> L6
    L8:
        r1.writeStrongBinder(this.f18245.asBinder());     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void mo0(int r1, Bundle r2) {
    }
}
