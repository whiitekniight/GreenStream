package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: ʻᐧ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1338 extends C1362 {
    public static final Parcelable.Creator<C1338> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f4599;

    static {
        CREATOR = new ﹳٴ(16);
    }

    public C1338(int r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4599 = r2;
    }

    public C1338(Parcel r1) {
        super(r1);
        this.f4599 = r1.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f4599);
    }
}
