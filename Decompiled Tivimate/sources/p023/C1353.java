package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: ʻᐧ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C1353 extends C1362 {
    public static final Parcelable.Creator<C1353> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f4656;

    /* JADX INFO: renamed from: ʾˋ */
    public int f4657;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f4658;

    static {
        CREATOR = new ﹳٴ(17);
    }

    public C1353() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public C1353(Parcel r2) {
        super(r2);
        this.f4657 = r2.readInt();
        this.f4658 = r2.readInt();
        this.f4656 = r2.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f4657);
        r1.writeInt(this.f4658);
        r1.writeInt(this.f4656);
    }
}
