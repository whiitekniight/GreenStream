package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {
    public ApiException(Status r3) {
        int r0 = r3.f1734;
        String r32 = r3.f1736;
        if (r32 != null) goto L6;
        r32 = "";
    L6:
        super(r0 + ": " + r32);
    }
}
