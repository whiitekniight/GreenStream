package p067;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ʽⁱ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C1979 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f6883;

    public /* synthetic */ C1979(int r1) {
        this.f6883 = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        switch(this.f6883) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C1941(r2);
    L7:
        return new C1944(r2);
    L9:
        return new C1969(r2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f6883) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C1941[r2];
    L7:
        return new C1944[r2];
    L9:
        return new C1969[r2];
    }
}
