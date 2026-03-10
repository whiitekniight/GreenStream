package com.rapid7.helper.smbj.p004io;

import java.io.IOException;
import p045.C1664;
import p296.EnumC4054;

/* JADX INFO: loaded from: classes.dex */
public class SMB2Exception extends IOException {

    /* JADX INFO: renamed from: ʾˋ */
    public final EnumC4054 f3117;

    public SMB2Exception(C1664 r7, String r8) {
        super(String.format("%s returned %s (%d/%d): %s", new Object[]{r7.f5525, Long.valueOf(r7.f5522), Long.valueOf(r7.f5522), Long.valueOf(r7.f5522), r8}));
        this.f3117 = EnumC4054.m8237(r7.f5522);
    }
}
