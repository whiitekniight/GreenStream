package com.google.android.gms.internal.measurement;

import android.content.Context;
import p107.InterfaceC2365;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ⁱʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C0481 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC2365 f2252;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f2253;

    public C0481(Context r1, InterfaceC2365 r2) {
        this.f2253 = r1;
        this.f2252 = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0481) == false) goto L17;
        C0481 r52 = (C0481) r5;
        InterfaceC2365 r1 = r52.f2252;
        if (this.f2253.equals(r52.f2253) == false) goto L17;
        InterfaceC2365 r53 = this.f2252;
        if (r53 != null) goto L14;
        if (r1 != null) goto L17;
    L16:
        return true;
    L14:
        if (r53.equals(r1) == true) goto L16;
    L17:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f2253.hashCode() ^ 1000003;
        InterfaceC2365 r2 = this.f2252;
        if (r2 != null) goto L5;
        int r22 = 0;
    L7:
        return (r0 * 1000003) ^ r22;
    L5:
        r22 = r2.hashCode();
        goto L7
    }

    public final String toString() {
        String r0 = this.f2253.toString();
        int r1 = r0.length();
        String r2 = String.valueOf(this.f2252);
        int r12 = r1 + 45;
        StringBuilder r3 = new StringBuilder((r12 + r2.length()) + 1);
        r3.append("FlagsContext{context=");
        r3.append(r0);
        r3.append(", hermeticFileOverrides=");
        r3.append(r2);
        r3.append("}");
        return r3.toString();
    }
}
