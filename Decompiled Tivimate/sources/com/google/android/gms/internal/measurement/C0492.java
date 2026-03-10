package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p133.AbstractC2509;
import p351.AbstractC4711;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public final class C0492 extends AbstractC4711 {
    public static final Parcelable.Creator<C0492> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final boolean f2265;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f2266;

    /* JADX INFO: renamed from: ˈٴ */
    public final Bundle f2267;

    /* JADX INFO: renamed from: ᴵˊ */
    public final long f2268;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final String f2269;

    static {
        CREATOR = new C0324(0);
    }

    public C0492(long r1, long r3, boolean r5, Bundle r6, String r7) {
        this.f2266 = r1;
        this.f2268 = r3;
        this.f2265 = r5;
        this.f2267 = r6;
        this.f2269 = r7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r62 = AbstractC2509.m5769(r5, 20293);
        AbstractC2509.m5756(r5, 1, 8);
        r5.writeLong(this.f2266);
        AbstractC2509.m5756(r5, 2, 8);
        r5.writeLong(this.f2268);
        AbstractC2509.m5756(r5, 3, 4);
        r5.writeInt(this.f2265 ? 1 : 0);
        AbstractC2509.m5754(r5, 7, this.f2267);
        AbstractC2509.m5765(r5, 8, this.f2269);
        AbstractC2509.m5758(r5, r62);
    }
}
