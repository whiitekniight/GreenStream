package com.hierynomus.mssmb2;

import com.hierynomus.smbj.common.SMBRuntimeException;
import p045.C1664;
import p296.EnumC4054;

/* JADX INFO: loaded from: classes.dex */
public class SMBApiException extends SMBRuntimeException {

    /* JADX INFO: renamed from: ᴵˊ */
    public final long f3110;

    public SMBApiException(long r1, String r3, Exception r4) {
        super(r3, r4);
        this.f3110 = r1;
    }

    public SMBApiException(C1664 r1, String r2) {
        super(r2);
        this.f3110 = r1.f5522;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long r0 = this.f3110;
        return String.format("%s (0x%08x): %s", new Object[]{EnumC4054.m8237(r0).name(), Long.valueOf(r0), super.getMessage()});
    }
}
