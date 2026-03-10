package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: ʻᐧ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C1336 extends C1362 {
    public static final Parcelable.Creator<C1336> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public String f4597;

    static {
        CREATOR = new ﹳٴ(12);
    }

    public C1336() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public C1336(Parcel r1) {
        super(r1);
        this.f4597 = r1.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeString(this.f4597);
    }
}
