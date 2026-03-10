package com.rapid7.client.dcerpc.transport.exceptions;

import java.io.IOException;
import p465.EnumC5851;

/* JADX INFO: loaded from: classes.dex */
public class RPCFaultException extends IOException {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ int f3114 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f3115;

    /* JADX INFO: renamed from: ᴵˊ */
    public final EnumC5851 f3116;

    public RPCFaultException(int r2) {
        this.f3115 = r2;
        EnumC5851 r22 = (EnumC5851) EnumC5851.f21377.get(Integer.valueOf(r2));
        if (r22 != null) goto L5;
        r22 = EnumC5851.f21379;
    L5:
        this.f3116 = r22;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", new Object[]{this.f3116, Integer.valueOf(this.f3115)});
    }
}
