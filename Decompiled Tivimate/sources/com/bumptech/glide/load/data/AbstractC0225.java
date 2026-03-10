package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC0235;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225 implements InterfaceC0220 {

    /* JADX INFO: renamed from: ʽʽ */
    public final Comparable f1640;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f1641;

    /* JADX INFO: renamed from: ˈٴ */
    public final Object f1642;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f1643;

    public /* synthetic */ AbstractC0225(int r1, Comparable r2, Object r3) {
        this.f1641 = r1;
        this.f1642 = r3;
        this.f1640 = r2;
    }

    /* JADX INFO: renamed from: ʽ */
    private final void m1175() {
    }

    /* JADX INFO: renamed from: ˈ */
    private final void m1176() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    public final void cancel() {
        int r0 = this.f1641;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public abstract Object mo1174(Uri r1, ContentResolver r2);

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ˑﹳ */
    public final int mo1168() {
        switch(this.f1641) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract void mo1172(Object r1);

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract Object mo1173(AssetManager r1, String r2);

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo1169() {
        switch(this.f1641) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        Object r0 = this.f1643;
        if (r0 == null) goto L19;
        mo1172(r0);     // Catch: IOException -> L13
        return;
    L20:
        return;
    L19:
        return;
    L8:
        Object r02 = this.f1643;
        if (r02 == null) goto L21;
        mo1172(r02);     // Catch: IOException -> L14
        return;
    L22:
        return;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo1171(EnumC0235 r3, InterfaceC0218 r4) {
        switch(this.f1641) {
            case 0: goto L20;
            default: goto L22;
        };
    L20:
        Object r32 = mo1173((AssetManager) this.f1642, (String) this.f1640);     // Catch: IOException -> L14
        this.f1643 = r32;     // Catch: IOException -> L14
        r4.mo1165(r32);     // Catch: IOException -> L14
        return;
    L14:
        e = move-exception;
        if (Log.isLoggable("AssetPathFetcher", 3) == true) goto L18;
    L18:
        r4.mo1164(e);
        return;
    L22:
        Object r33 = mo1174((Uri) this.f1640, (ContentResolver) this.f1642);     // Catch: FileNotFoundException -> L6
        this.f1643 = r33;     // Catch: FileNotFoundException -> L6
        r4.mo1165(r33);     // Catch: FileNotFoundException -> L6
        return;
    L6:
        e = move-exception;
        if (Log.isLoggable("LocalUriFetcher", 3) == true) goto L10;
    L10:
        r4.mo1164(e);
    }
}
