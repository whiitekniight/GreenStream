package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: ʻᐧ.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C1346 extends C1362 {
    public static final Parcelable.Creator<C1346> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f4619;

    static {
        CREATOR = new ﹳٴ(18);
    }

    public C1346() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public C1346(Parcel r2) {
        super(r2);
        boolean r0 = true;
        if (r2.readInt() == 1) goto L6;
        r0 = false;
    L6:
        this.f4619 = r0;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f4619 ? 1 : 0);
    }
}
