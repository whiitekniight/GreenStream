package p125;

import android.app.Application;
import android.net.NetworkRequest;
import p334.C4448;

/* JADX INFO: renamed from: ˆﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2460 {
    /* JADX INFO: renamed from: ʽ */
    public static boolean m5672(NetworkRequest r0, int r1) {
        return r0.hasCapability(r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public static boolean m5673(NetworkRequest r0, int r1) {
        return r0.hasTransport(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static String m5674() {
        return Application.getProcessName();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C2457 m5675(int[] r13, int[] r14) {
        NetworkRequest.Builder r1 = new NetworkRequest.Builder();
        int r2 = r13.length;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L12;
        int r7 = r13[r4];
        r1.addCapability(r7);     // Catch: IllegalArgumentException -> L8
    L11:
        r4 = r4 + 1;
    L9:
        C4448 r9 = C4448.m8842();
        String r10 = C2457.f8771;
        String r102 = C2457.f8771;
        String r0 = "Ignoring adding capability '" + r7 + '\'';
        if (r9.f16229 > 5) goto L11;
        goto L11
    L12:
        int r22 = 0;
    L14:
        if (r22 >= 3) goto L32;
        int r42 = AbstractC2446.f8748[r22];
        int r72 = r13.length;
        int r8 = 0;
    L16:
        if (r8 >= r72) goto L21;
        if (r42 == r13[r8]) goto L22;
        r8 = r8 + 1;
    L22:
        if (r8 < 0) goto L24;
        boolean r73 = true;
    L25:
        if (r73 == true) goto L31;
        r1.removeCapability(r42);     // Catch: IllegalArgumentException -> L28
    L29:
        C4448 r82 = C4448.m8842();
        String r92 = C2457.f8771;
        String r93 = C2457.f8771;
        String r02 = "Ignoring removing default capability '" + r42 + '\'';
        if (r82.f16229 <= 5) goto L31;
    L31:
        r22 = r22 + 1;
        goto L14
    L24:
        r73 = false;
        goto L25
    L21:
        r8 = -1;
        goto L22
    L32:
        int r132 = r14.length;
    L33:
        if (r3 >= r132) goto L36;
        r1.addTransportType(r14[r3]);
        r3 = r3 + 1;
        goto L33
    L36:
        return new C2457(r1.build());
    }
}
