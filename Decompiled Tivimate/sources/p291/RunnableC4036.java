package p291;

import android.content.IntentFilter;
import android.util.Log;
import p099.AbstractC2229;
import ʻـ.ⁱˊ;

/* JADX INFO: renamed from: ٴʽ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4036 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f14842;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C4039 f14843;

    public /* synthetic */ RunnableC4036(C4039 r1, int r2) {
        this.f14842 = r2;
        this.f14843 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f14842) {
            case 0: goto L16;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        boolean r0 = this.f14843.f14846;
        C4039 r1 = this.f14843;
        r1.f14846 = r1.m8210();
        if (r0 != this.f14843.f14846) goto L7;
        return;
    L7:
        if (Log.isLoggable("ConnectivityMonitor", 3) == false) goto L9;
        String r02 = "connectivity changed, isConnected: " + this.f14843.f14846;
    L9:
        C4039 r03 = this.f14843;
        AbstractC2229.m5416().post(new ⁱˊ(2, r03, r03.f14846));
        return;
    L16:
        C4039 r04 = this.f14843;
        r04.f14846 = r04.m8210();
        C4039 r05 = this.f14843;     // Catch: SecurityException -> L19
        r05.f14849.registerReceiver(r05.f14850, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));     // Catch: SecurityException -> L19
        this.f14843.f14847 = true;     // Catch: SecurityException -> L19
        return;
    L21:
        if (Log.isLoggable("ConnectivityMonitor", 5) == true) goto L23;
    L23:
        this.f14843.f14847 = false;
        return;
    L12:
        if (this.f14843.f14847 == false) goto L28;
        this.f14843.f14847 = false;
        C4039 r06 = this.f14843;
        r06.f14849.unregisterReceiver(r06.f14850);
        return;
    }
}
