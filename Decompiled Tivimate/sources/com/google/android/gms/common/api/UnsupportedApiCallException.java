package com.google.android.gms.common.api;

import p331.C4409;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: ʾˋ */
    public final C4409 f1737;

    public UnsupportedApiCallException(C4409 r1) {
        this.f1737 = r1;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1737));
    }
}
