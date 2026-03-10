package p295;

import android.os.Parcel;
import android.os.Parcelable;
import p051.C1771;
import p335.AbstractC4468;

/* JADX INFO: renamed from: ٴˉ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4048 extends AbstractC4468 {
    public static final Parcelable.Creator<C4048> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f14862;

    static {
        CREATOR = new C1771(6);
    }

    public C4048(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L5;
        C4048.class.getClassLoader();
    L5:
        boolean r22 = true;
        if (r1.readInt() == 1) goto L9;
        r22 = false;
    L9:
        this.f14862 = r22;
    }

    @Override // p335.AbstractC4468, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f14862 ? 1 : 0);
    }
}
