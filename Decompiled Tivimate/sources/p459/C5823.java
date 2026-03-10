package p459;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p133.AbstractC2509;
import p351.AbstractC4711;
import ﹳـ.ᵎﹶ;

/* JADX INFO: renamed from: ﹶﾞ.ⁱʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C5823 extends AbstractC4711 {
    public static final Parcelable.Creator<C5823> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final List f21262;

    static {
        CREATOR = new ᵎﹶ(9);
    }

    public C5823(ArrayList r1) {
        this.f21262 = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = AbstractC2509.m5769(r3, 20293);
        AbstractC2509.m5750(r3, 1, this.f21262);
        AbstractC2509.m5758(r3, r42);
    }
}
