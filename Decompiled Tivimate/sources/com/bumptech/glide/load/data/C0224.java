package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p211.C3387;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C0224 implements InterfaceC0228 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f1639;

    public /* synthetic */ C0224(int r1) {
        this.f1639 = r1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0228
    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC0222 mo1166(Object r2) {
        switch(this.f1639) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C3387((ByteBuffer) r2);
    L7:
        return new C0215((ParcelFileDescriptor) r2);
    L9:
        return new C0215(r2);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0228
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo1167() {
        switch(this.f1639) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return ByteBuffer.class;
    L6:
        return ParcelFileDescriptor.class;
    L9:
        throw new UnsupportedOperationException("Not implemented");
    }
}
