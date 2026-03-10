package p149;

import android.os.Parcel;
import android.os.Parcelable;
import p051.C1771;
import p335.AbstractC4468;

/* JADX INFO: renamed from: ˉˆ.ˊﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C2759 extends AbstractC4468 {
    public static final Parcelable.Creator<C2759> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f9856;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f9857;

    static {
        CREATOR = new C1771(3);
    }

    public C2759(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f9856 = r1.readInt();
        if (r1.readInt() == 0) goto L5;
        boolean r12 = true;
    L6:
        this.f9857 = r12;
        return;
    L5:
        r12 = false;
        goto L6
    }

    @Override // p335.AbstractC4468, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f9856);
        r1.writeInt(this.f9857 ? 1 : 0);
    }
}
