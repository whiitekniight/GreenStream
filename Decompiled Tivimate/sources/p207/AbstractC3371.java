package p207;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p319.AbstractC4223;

/* JADX INFO: renamed from: ˎʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3371 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int f11789 = 0;

    static {
        AbstractC3371.class.getClassLoader();
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m7099(Parcel r0, IInterface r1) {
        if (r1 != null) goto L5;
        r0.writeStrongBinder(null);
        return;
    L5:
        r0.writeStrongBinder(r1.asBinder());
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m7100(Parcel r2) {
        int r22 = r2.dataAvail();
        if (r22 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException(AbstractC4223.m8643(r22, "Parcel data not fully consumed, unread size: "));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Parcelable m7101(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r2.createFromParcel(r1);
    }
}
