package p051;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p335.AbstractC4468;

/* JADX INFO: renamed from: ʽʽ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1775 extends AbstractC4468 {
    public static final Parcelable.Creator<C1775> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public SparseArray f5929;

    static {
        CREATOR = new C1771(0);
    }

    public C1775(Parcel r6, ClassLoader r7) {
        super(r6, r7);
        int r0 = r6.readInt();
        int[] r1 = new int[r0];
        r6.readIntArray(r1);
        Parcelable[] r62 = r6.readParcelableArray(r7);
        this.f5929 = new SparseArray(r0);
        int r72 = 0;
    L3:
        if (r72 >= r0) goto L5;
        this.f5929.append(r1[r72], r62[r72]);
        r72 = r72 + 1;
        goto L3
    }

    @Override // p335.AbstractC4468, android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        super.writeToParcel(r6, r7);
        SparseArray r0 = this.f5929;
        int r1 = 0;
        if (r0 == null) goto L5;
        int r02 = r0.size();
    L6:
        r6.writeInt(r02);
        int[] r2 = new int[r02];
        Parcelable[] r3 = new Parcelable[r02];
    L7:
        if (r1 >= r02) goto L9;
        r2[r1] = this.f5929.keyAt(r1);
        r3[r1] = (Parcelable) this.f5929.valueAt(r1);
        r1 = r1 + 1;
        goto L7
    L9:
        r6.writeIntArray(r2);
        r6.writeParcelableArray(r3, r7);
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
