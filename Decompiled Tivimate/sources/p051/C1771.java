package p051;

import android.os.Parcel;
import android.os.Parcelable;
import p056.C1809;
import p141.C2671;
import p149.C2759;
import p191.C3212;
import p241.C3575;
import p295.C4048;
import p335.AbstractC4468;
import p369.C4829;
import p454.C5680;

/* JADX INFO: renamed from: ʽʽ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1771 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5926;

    public /* synthetic */ C1771(int r1) {
        this.f5926 = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        switch(this.f5926) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L17;
            case 6: goto L15;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new C5680(r3, null);
    L7:
        return new C4829(r3, null);
    L9:
        if (r3.readParcelable(null) != null) goto L13;
        return AbstractC4468.f16296;
    L13:
        throw new IllegalStateException("superState must be null");
    L15:
        return new C4048(r3, null);
    L17:
        return new C3575(r3, null);
    L19:
        return new C3212(r3, null);
    L21:
        return new C2759(r3, null);
    L23:
        return new C2671(r3, null);
    L25:
        return new C1809(r3, null);
    L27:
        return new C1775(r3, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r2, ClassLoader r3) {
        switch(this.f5926) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L17;
            case 6: goto L15;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new C5680(r2, r3);
    L7:
        return new C4829(r2, r3);
    L9:
        if (r2.readParcelable(r3) != null) goto L13;
        return AbstractC4468.f16296;
    L13:
        throw new IllegalStateException("superState must be null");
    L15:
        return new C4048(r2, r3);
    L17:
        return new C3575(r2, r3);
    L19:
        return new C3212(r2, r3);
    L21:
        return new C2759(r2, r3);
    L23:
        return new C2671(r2, r3);
    L25:
        return new C1809(r2, r3);
    L27:
        return new C1775(r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f5926) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new C5680[r2];
    L7:
        return new C4829[r2];
    L9:
        return new AbstractC4468[r2];
    L11:
        return new C4048[r2];
    L13:
        return new C3575[r2];
    L15:
        return new C3212[r2];
    L17:
        return new C2759[r2];
    L19:
        return new C2671[r2];
    L21:
        return new C1809[r2];
    L23:
        return new C1775[r2];
    }
}
