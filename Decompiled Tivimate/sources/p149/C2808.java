package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ʼⁱ.ﾞˊ;

/* JADX INFO: renamed from: ˉˆ.ᵔٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2808 extends View.BaseSavedState {
    public static final Parcelable.Creator<C2808> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f10003;

    static {
        CREATOR = new ﾞˊ(26);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeByte(this.f10003 ? 1 : 0);
    }
}
