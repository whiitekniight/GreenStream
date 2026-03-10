package org.apache.commons.lang3.exception;

import p234.C3532;

/* JADX INFO: loaded from: classes.dex */
public class ContextedRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: ʾˋ */
    public final C3532 f4057;

    public ContextedRuntimeException() {
        this.f4057 = new C3532();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String r0 = super.getMessage();
        return this.f4057.m7292(r0);
    }
}
