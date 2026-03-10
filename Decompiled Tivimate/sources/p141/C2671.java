package p141;

import android.os.Parcel;
import android.os.Parcelable;
import p051.C1771;
import p335.AbstractC4468;

/* JADX INFO: renamed from: ˈᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2671 extends AbstractC4468 {
    public static final Parcelable.Creator<C2671> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f9585;

    static {
        CREATOR = new C1771(2);
    }

    public C2671(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f9585 = r22;
    }

    @Override // p335.AbstractC4468, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f9585 ? 1 : 0);
    }
}
