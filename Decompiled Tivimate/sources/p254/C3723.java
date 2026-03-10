package p254;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑﹳ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3723 implements Parcelable {
    public static final Parcelable.Creator<C3723> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f13309;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Intent f13310;

    static {
        CREATOR = new ᵎˊ(9);
    }

    public C3723(Intent r1, int r2) {
        this.f13309 = r2;
        this.f13310 = r1;
    }

    public C3723(Parcel r2) {
        this.f13309 = r2.readInt();
        if (r2.readInt() != 0) goto L5;
        Intent r22 = null;
    L6:
        this.f13310 = r22;
        return;
    L5:
        r22 = (Intent) Intent.CREATOR.createFromParcel(r2);
        goto L6
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ActivityResult{resultCode=");
        int r2 = this.f13309;
        if (r2 == (-1)) goto L7;
        if (r2 == 0) goto L6;
        String r1 = String.valueOf(r2);
    L8:
        r0.append(r1);
        r0.append(", data=");
        r0.append(this.f13310);
        r0.append('}');
        return r0.toString();
    L6:
        r1 = "RESULT_CANCELED";
        goto L8
    L7:
        r1 = "RESULT_OK";
        goto L8
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.f13309);
        Intent r0 = this.f13310;
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        r3.writeInt(r1);
        if (r0 == null) goto L10;
        r0.writeToParcel(r3, r4);
        return;
    L10:
        return;
    L5:
        r1 = 1;
        goto L6
    }
}
