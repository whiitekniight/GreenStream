package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C0221 extends AbstractC0225 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f1637;

    public /* synthetic */ C0221(AssetManager r1, String r2, int r3) {
        this.f1637 = r3;
        super(0, r2, r1);
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo1172(Object r2) {
        switch(this.f1637) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((InputStream) r2).close();
        return;
    L6:
        ((AssetFileDescriptor) r2).close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ᵔᵢ */
    public final Object mo1173(AssetManager r2, String r3) {
        switch(this.f1637) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.open(r3);
    L7:
        return r2.openFd(r3);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo1170() {
        switch(this.f1637) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L6:
        return AssetFileDescriptor.class;
    }
}
