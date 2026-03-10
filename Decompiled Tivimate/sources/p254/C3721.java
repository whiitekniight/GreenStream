package p254;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑﹳ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3721 implements Parcelable {
    public static final Parcelable.Creator<C3721> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final int f13305;

    /* JADX INFO: renamed from: ʾˋ */
    public final IntentSender f13306;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f13307;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Intent f13308;

    static {
        CREATOR = new ᵎˊ(10);
    }

    public C3721(IntentSender r1, Intent r2, int r3, int r4) {
        this.f13306 = r1;
        this.f13308 = r2;
        this.f13305 = r3;
        this.f13307 = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f13306, r3);
        r2.writeParcelable(this.f13308, r3);
        r2.writeInt(this.f13305);
        r2.writeInt(this.f13307);
    }
}
