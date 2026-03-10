package com.google.android.gms.common.internal;

import p331.C4419;

/* JADX INFO: loaded from: classes.dex */
public final class zzaj extends Exception {

    /* JADX INFO: renamed from: ʾˋ */
    public final C4419 f1738;

    public zzaj(C4419 r2) {
        if (r2.f16168 != 0) goto L5;
    L7:
        boolean r0 = false;
    L8:
        if (r0 == false) goto L12;
        this.f1738 = r2;
        return;
    L12:
        throw new IllegalArgumentException("ResolvableConnectionException can only be created with a connection result containing a resolution.");
    L5:
        if (r2.f16165 == null) goto L7;
        r0 = true;
        goto L8
    }
}
