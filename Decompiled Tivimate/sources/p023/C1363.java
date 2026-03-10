package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: ʻᐧ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 extends C1362 {
    public static final Parcelable.Creator<C1363> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public String f4676;

    static {
        CREATOR = new ﹳٴ(13);
    }

    public C1363() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public C1363(Parcel r1) {
        super(r1);
        this.f4676 = r1.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeString(this.f4676);
    }
}
