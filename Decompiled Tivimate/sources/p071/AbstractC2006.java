package p071;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p334.C4448;
import p408.C5222;

/* JADX INFO: renamed from: ʾʽ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2006 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String f6942 = null;

    static {
        f6942 = C4448.m8843("NetworkStateTracker");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C5222 m5042(ConnectivityManager r8) {
        String r0 = f6942;
        NetworkInfo r3 = r8.getActiveNetworkInfo();     // Catch: SecurityException -> L8
        if (r3 != null) goto L6;
    L10:
        boolean r4 = false;
    L31:
        NetworkCapabilities r5 = r8.getNetworkCapabilities(r8.getActiveNetwork());     // Catch: SecurityException -> L15
        if (r5 == null) goto L17;
        boolean r52 = r5.hasCapability(16);     // Catch: SecurityException -> L15
    L19:
        boolean r82 = r8.isActiveNetworkMetered();     // Catch: SecurityException -> L8
        if (r3 != null) goto L22;
    L24:
        boolean r32 = false;
    L25:
        return new C5222(r4, r52, r82, r32);
    L22:
        if (r3.isRoaming() == true) goto L24;
        r32 = true;
        goto L25
    L17:
        r52 = false;
    L15:
        e = move-exception;
        C4448.m8842().m8845(r0, "Unable to validate active network", e);     // Catch: SecurityException -> L8
        goto L17
    L6:
        if (r3.isConnected() == false) goto L10;
        r4 = true;
    L8:
        e = move-exception;
        C4448.m8842().m8845(r0, "Unable to get active network state", e);
        return new C5222(false, false, false, true);
    }
}
