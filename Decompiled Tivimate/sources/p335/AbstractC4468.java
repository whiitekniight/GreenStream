package p335;

import android.os.Parcel;
import android.os.Parcelable;
import p051.C1771;

/* JADX INFO: renamed from: ᴵˑ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4468 implements Parcelable {
    public static final Parcelable.Creator<AbstractC4468> CREATOR = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C4469 f16296 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final Parcelable f16297;

    static {
        f16296 = new C4469();
        CREATOR = new C1771(7);
    }

    public AbstractC4468() {
        this.f16297 = null;
    }

    public AbstractC4468(Parcel r1, ClassLoader r2) {
        Parcelable r12 = r1.readParcelable(r2);
        if (r12 != null) goto L6;
        r12 = f16296;
    L6:
        this.f16297 = r12;
    }

    public AbstractC4468(Parcelable r2) {
        if (r2 == null) goto L11;
        if (r2 != f16296) goto L8;
        r2 = null;
    L8:
        this.f16297 = r2;
        return;
    L11:
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f16297, r3);
    }
}
