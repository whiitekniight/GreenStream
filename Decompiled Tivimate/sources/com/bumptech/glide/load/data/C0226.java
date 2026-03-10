package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0226 extends AbstractC0225 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f1644;

    public /* synthetic */ C0226(ContentResolver r1, Uri r2, int r3) {
        this.f1644 = r3;
        super(1, r2, r1);
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ʼˎ */
    public final Object mo1174(Uri r3, ContentResolver r4) {
        switch(this.f1644) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        AssetFileDescriptor r42 = r4.openAssetFileDescriptor(r3, "r");
        if (r42 == null) goto L9;
        return r42.getParcelFileDescriptor();
    L9:
        throw new FileNotFoundException("FileDescriptor is null for: " + r3);
    L10:
        AssetFileDescriptor r43 = r4.openAssetFileDescriptor(r3, "r");
        if (r43 == null) goto L14;
        return r43;
    L14:
        throw new FileNotFoundException("FileDescriptor is null for: " + r3);
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo1172(Object r2) {
        switch(this.f1644) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ParcelFileDescriptor) r2).close();
        return;
    L6:
        ((AssetFileDescriptor) r2).close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo1170() {
        switch(this.f1644) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return ParcelFileDescriptor.class;
    L6:
        return AssetFileDescriptor.class;
    }
}
