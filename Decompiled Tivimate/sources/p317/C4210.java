package p317;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: ᐧˎ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4210 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4212 f15452;

    public C4210(C4212 r1) {
        this.f15452 = r1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo r3) {
        int r32 = r3.getOverrideNetworkType();
        int r1 = 5;
        if (r32 != 3) goto L5;
    L9:
        boolean r33 = true;
    L10:
        if (r33 == false) goto L12;
        r1 = 10;
    L12:
        this.f15452.m8548(r1);
        return;
    L5:
        if (r32 == 4) goto L9;
        if (r32 == 5) goto L9;
        r33 = false;
        goto L10
    }
}
