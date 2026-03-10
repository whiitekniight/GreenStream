package p459;

import android.os.Parcel;
import android.os.Parcelable;
import p133.AbstractC2509;
import p351.AbstractC4711;
import ﹳـ.ᵎﹶ;

/* JADX INFO: renamed from: ﹶﾞ.ˎʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C5755 extends AbstractC4711 {
    public static final Parcelable.Creator<C5755> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final int f20845;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f20846;

    /* JADX INFO: renamed from: ᴵˊ */
    public final long f20847;

    static {
        CREATOR = new ᵎﹶ(6);
    }

    public C5755(String r1, long r2, int r4) {
        this.f20846 = r1;
        this.f20847 = r2;
        this.f20845 = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = AbstractC2509.m5769(r3, 20293);
        AbstractC2509.m5765(r3, 1, this.f20846);
        AbstractC2509.m5756(r3, 2, 8);
        r3.writeLong(this.f20847);
        AbstractC2509.m5756(r3, 3, 4);
        r3.writeInt(this.f20845);
        AbstractC2509.m5758(r3, r42);
    }
}
